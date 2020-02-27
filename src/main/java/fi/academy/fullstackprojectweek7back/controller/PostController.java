package fi.academy.fullstackprojectweek7back.controller;

import fi.academy.fullstackprojectweek7back.model.Post;
import fi.academy.fullstackprojectweek7back.repository.PostRepository;
import fi.academy.fullstackprojectweek7back.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController
@RequestMapping("/api/post/")
public class PostController {

    @Autowired
    PostRepository postRepository;
    TopicRepository topicRepository;

    @GetMapping
    public Iterable<Post> findAll() {
        return postRepository.findAllByOrderByCreatedDesc();
    }

    @GetMapping("{id}")
    public Optional<?> findById(@PathVariable(name="id") Long id) {
        return postRepository.findById(id);
    }
    @PostMapping
    public void savePost(@Valid @RequestBody Post post) {
        System.out.println(post);
        postRepository.save(post);
    }
    @PutMapping
    public void updatePost(@RequestBody Post post) {
        postRepository.save(post);
    }

}
