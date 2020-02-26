package fi.academy.fullstackprojectweek7back.repository;


import fi.academy.fullstackprojectweek7back.model.Role;
import fi.academy.fullstackprojectweek7back.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}