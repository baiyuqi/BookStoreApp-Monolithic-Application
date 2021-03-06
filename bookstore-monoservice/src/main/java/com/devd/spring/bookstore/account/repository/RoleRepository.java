package com.devd.spring.bookstore.account.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.devd.spring.bookstore.account.repository.dao.Role;

/**
 * @author: Devaraj Reddy, Date : 2019-05-17
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

  Optional<Role> findByRoleName(String name);

  Boolean existsByRoleName(String roleName);

  @Override
  List<Role> findAll();
}
