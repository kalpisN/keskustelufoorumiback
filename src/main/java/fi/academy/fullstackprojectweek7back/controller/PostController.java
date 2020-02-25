package fi.academy.fullstackprojectweek7back.controller;

import fi.academy.fullstackprojectweek7back.model.Post;
import fi.academy.fullstackprojectweek7back.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/post/")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @GetMapping
    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<?> findById(@PathVariable(name="id") Long id) {
        return postRepository.findById(id);
    }

}
