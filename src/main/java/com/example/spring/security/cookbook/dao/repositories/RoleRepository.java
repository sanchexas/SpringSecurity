package com.example.spring.security.cookbook.dao.repositories;

import com.example.spring.security.cookbook.dao.entities.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
