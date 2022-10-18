package fr.traning.book.repository;

import fr.traning.book.repository.entity.Role;
import fr.traning.book.repository.entity.RoleEnum;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByName(RoleEnum role);
}
