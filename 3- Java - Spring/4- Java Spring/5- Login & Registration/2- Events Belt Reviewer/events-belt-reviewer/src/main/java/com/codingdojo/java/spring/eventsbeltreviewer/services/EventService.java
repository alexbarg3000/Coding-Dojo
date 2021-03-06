package com.codingdojo.java.spring.eventsbeltreviewer.services;

import java.util.List;
import java.util.Optional;

import com.codingdojo.java.spring.eventsbeltreviewer.models.Comment;
import com.codingdojo.java.spring.eventsbeltreviewer.models.Event;
import com.codingdojo.java.spring.eventsbeltreviewer.models.User;
import com.codingdojo.java.spring.eventsbeltreviewer.repositories.CommentRepository;
import com.codingdojo.java.spring.eventsbeltreviewer.repositories.EventRepository;
import com.codingdojo.java.spring.eventsbeltreviewer.repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Service;



@Service
public class EventService {
    private final UserRepository userRepository;
    private final EventRepository eventRepository;
    private final CommentRepository commentRepository;

    public EventService(UserRepository userRepository, EventRepository eventRepository,
                        CommentRepository commentRepository) {
        this.userRepository = userRepository;
        this.eventRepository = eventRepository;
        this.commentRepository = commentRepository;
    }

    public User registerUser(User user) {
        String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
        user.setPassword(hashed);
        return userRepository.save(user);
    }

    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public User findUserById(Long id) {
        Optional<User> u = userRepository.findById(id);

        if(u.isPresent()) {
            return u.get();
        }
        else {
            return null;
        }
    }

    public boolean authenticateUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user == null) {
            return false;
        }
        else {
            if(BCrypt.checkpw(password, user.getPassword())) {
                return true;
            }
            else {
                return false;
            }
        }
    }

    public List <User> allUser() {
        return userRepository.findAll();
    }

    public List <Event> allEvents() {
        return eventRepository.findAll();
    }

    public List <Comment> allComments() {
        return commentRepository.findAll();
    }

    public Event findEvent(Long id) {
        Optional<Event> event = eventRepository.findById(id);

        if(event.isPresent()) {
            return event.get();
        }
        else {
            return null;
        }
    }

    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public void deleteEvent(Event event) {
        eventRepository.delete(event);
    }
}
