package com.codingdojo.java.spring.group_project.repositories;


import com.codingdojo.java.spring.group_project.models.SubCategory;
import com.codingdojo.java.spring.group_project.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findByEmail(String email);
    Optional<User> findById(Long id);
    User findUserById(Long id);
    List<User> findAll();
    @Query(value = "SELECT u FROM User u,City c,Address a,Category ca ,SubCategory sub WHERE u.a.c.name =?1 and u.ca.sub.id = ?2.id",nativeQuery=true)
    List<User> getRelatedUser(String city, SubCategory sub);
    List<User> findByApproveEquals(boolean status);
}
