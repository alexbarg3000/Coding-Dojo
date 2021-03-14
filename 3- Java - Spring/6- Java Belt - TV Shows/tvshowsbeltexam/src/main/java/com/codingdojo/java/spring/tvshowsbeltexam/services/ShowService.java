package com.codingdojo.java.spring.tvshowsbeltexam.services;


import java.util.List;
import java.util.Optional;


import com.codingdojo.java.spring.tvshowsbeltexam.models.Review;
import com.codingdojo.java.spring.tvshowsbeltexam.models.Show;
import com.codingdojo.java.spring.tvshowsbeltexam.repositories.ReviewRepository;
import com.codingdojo.java.spring.tvshowsbeltexam.repositories.ShowRepository;
import org.springframework.stereotype.Service;


@Service
public class ShowService {

    private final ShowRepository showRepo;
    private final ReviewRepository reviewRepo;

    public ShowService(ShowRepository showRepo, ReviewRepository reviewRepo) {
        this.showRepo = showRepo;
        this.reviewRepo = reviewRepo;
    }

    public Show create(Show newShow) {
        return showRepo.save(newShow);
    }

    public Review create(Review newReview) {
        List<Review> matchingReviews = reviewRepo.matchingReviews(
                newReview.getUser().getId(),
                newReview.getShow().getId());
        if(matchingReviews.size() > 0) {
            return null;
        }
        newReview.setId(null);
        return reviewRepo.save(newReview);
    }

    public List<Show> getShows() {
        return (List<Show>) showRepo.findAll();
    }

    public List<Review> getReviews() {
        return (List<Review>) reviewRepo.findAll();
    }

    public Show getShow(Long id) {
        Optional<Show> optionalShow = showRepo.findById(id);
        return optionalShow.isPresent() ? optionalShow.get() : null;
    }

    public Review getReview(Long id) {
        Optional<Review> optionalReview = reviewRepo.findById(id);
        return optionalReview.isPresent() ? optionalReview.get() : null;
    }

    public Show updateShow(Show updatedShow, Long id) {
        return showRepo.save(updatedShow);
    }

    public void deleteShow(Long id) {
        showRepo.deleteById(id);
    }

}
