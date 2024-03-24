package com.example.springbootmysqlrestful.repository;

import com.example.springbootmysqlrestful.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
//    @Query("SELECT e FROM Customer e ORDER BY e.name DESC")
    @Query("SELECT e FROM Customer e WHERE e.name='hoa'")
    List<Customer> findAllOrderByNameDesc();
}
