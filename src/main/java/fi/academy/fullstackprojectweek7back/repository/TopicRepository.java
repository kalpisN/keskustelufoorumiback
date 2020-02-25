package fi.academy.fullstackprojectweek7back.repository;

import fi.academy.fullstackprojectweek7back.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, Long> {
}
