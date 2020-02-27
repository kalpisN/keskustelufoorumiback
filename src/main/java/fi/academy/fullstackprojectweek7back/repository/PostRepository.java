package fi.academy.fullstackprojectweek7back.repository;

import fi.academy.fullstackprojectweek7back.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {
    List<Post> findAllByOrderByCreatedDesc();
}
