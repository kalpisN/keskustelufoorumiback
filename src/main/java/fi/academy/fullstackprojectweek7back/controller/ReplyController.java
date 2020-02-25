package fi.academy.fullstackprojectweek7back.controller;

import fi.academy.fullstackprojectweek7back.model.Post;
import fi.academy.fullstackprojectweek7back.model.Reply;
import fi.academy.fullstackprojectweek7back.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;


@RestController
@RequestMapping("/api/reply/")
public class ReplyController {

    @Autowired
    ReplyRepository replyRepository;

    @GetMapping
    public Iterable<?> findAll() {
        return replyRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<?> findById(@PathVariable(name="id") Long id){
        return replyRepository.findById(id);
    }

    @PostMapping
    public void savePost(@Valid @RequestBody Reply reply) {
        replyRepository.save(reply);
    }
}
