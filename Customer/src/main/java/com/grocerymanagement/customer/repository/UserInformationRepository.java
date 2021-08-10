package com.grocerymanagement.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grocerymanagement.customer.entities.User;

@Repository
public interface UserInformationRepository extends JpaRepository<User, Long> {

}
