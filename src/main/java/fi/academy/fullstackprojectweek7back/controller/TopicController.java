package fi.academy.fullstackprojectweek7back.controller;

import fi.academy.fullstackprojectweek7back.model.Reply;
import fi.academy.fullstackprojectweek7back.model.Topic;
import fi.academy.fullstackprojectweek7back.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    @PostMapping
    public void savePost(@Valid @RequestBody Topic topic) {
        topicRepository.save(topic);
    }
}
