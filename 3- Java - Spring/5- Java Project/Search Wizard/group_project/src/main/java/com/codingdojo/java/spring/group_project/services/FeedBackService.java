package com.codingdojo.java.spring.group_project.services;

import com.codingdojo.java.spring.group_project.models.Feedback;
import com.codingdojo.java.spring.group_project.repositories.FeedBacksRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedBackService {
    private final FeedBacksRepository feedRepo;

    public FeedBackService(FeedBacksRepository feedRepo) {
        this.feedRepo = feedRepo;
    }

    public List<Feedback> allComments() {
        return feedRepo.findAll();
    }

    public Feedback createComment(Feedback feedback) {
        return feedRepo.save(feedback);
    }
}
