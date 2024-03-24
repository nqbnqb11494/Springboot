package com.example.springbootmysqlrestful.controller;

import com.example.springbootmysqlrestful.entities.Customer;
import com.example.springbootmysqlrestful.service.CustomerService;
import com.example.springbootmysqlrestful.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    /* ---------------- GET ALL CUSTOMER ------------------------ */
//    @GetMapping("/customers")
//    public ResponseEntity<ServiceResult> findAllCustomer() {
//        return new ResponseEntity<ServiceResult>(customerService.findAll(), HttpStatus.OK);
//    }

    @GetMapping("/customers")
    public ResponseEntity<ServiceResult> findAllOrderByNameDesc() {
        return new ResponseEntity<ServiceResult>(customerService.findAllOrderByNameDesc(), HttpStatus.OK);
    }

    /* ---------------- GET CUSTOMER BY ID ------------------------ */
    @GetMapping("/customers/{id}")
    public ResponseEntity<ServiceResult> findById(@PathVariable int id) {
        return new ResponseEntity<ServiceResult>(customerService.findById(id), HttpStatus.OK);
    }
    /* ---------------- CREATE NEW CUSTOMER ------------------------ */
    @PostMapping("/customers")
    public ResponseEntity<ServiceResult> create(@RequestBody Customer customer) {
        return new ResponseEntity<ServiceResult>(customerService.create(customer), HttpStatus.OK);
    }

    /* ---------------- UPDATE CUSTOMER ------------------------ */
    @PutMapping("/customers")
    public ResponseEntity<ServiceResult> update(@RequestBody Customer customer) {
        return new ResponseEntity<ServiceResult>(customerService.update(customer), HttpStatus.OK);
    }
    @DeleteMapping("/customers")
    public ResponseEntity<ServiceResult> delete(@RequestBody DeleteCustomerRequest request) {
        return new ResponseEntity<ServiceResult>(customerService.delete(request.getId()), HttpStatus.OK);
    }
}
