package fi.academy.fullstackprojectweek7back.repository;

import fi.academy.fullstackprojectweek7back.model.Reply;
import org.springframework.data.repository.CrudRepository;

public interface ReplyRepository extends CrudRepository<Reply, Long> {
}
