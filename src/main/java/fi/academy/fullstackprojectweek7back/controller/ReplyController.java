package fi.academy.fullstackprojectweek7back.controller;

import fi.academy.fullstackprojectweek7back.repository.ReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
