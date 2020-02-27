package fi.academy.fullstackprojectweek7back.controller;

import fi.academy.fullstackprojectweek7back.model.Post;
import fi.academy.fullstackprojectweek7back.model.Reply;
import fi.academy.fullstackprojectweek7back.model.Topic;
import fi.academy.fullstackprojectweek7back.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;


@RestController
@RequestMapping("/api/topic/")
public class TopicController {
    @Autowired
    TopicRepository topicRepository;

    @GetMapping
    public Iterable<Topic> findAll() {
        return topicRepository.findAll();
    }
    @GetMapping("{id}")
    public Optional<?> findById(@PathVariable(name="id") Long id) {
        return topicRepository.findById(id);
    }
    @PostMapping("{id}")
    public void savePost(@PathVariable(name="id") Long id, @Valid @RequestBody Post post) {
        System.out.println(post);
        Topic topic = topicRepository.findById(id).get();
        post.setCreated(LocalDateTime.now());
        topic.addPost(post);
        topicRepository.save(topic);
    }
}
