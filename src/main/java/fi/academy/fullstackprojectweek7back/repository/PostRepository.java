package fi.academy.fullstackprojectweek7back.repository;

import fi.academy.fullstackprojectweek7back.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
}
