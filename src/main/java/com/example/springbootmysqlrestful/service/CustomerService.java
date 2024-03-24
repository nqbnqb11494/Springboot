package com.example.springbootmysqlrestful.service;

import com.example.springbootmysqlrestful.entities.Customer;
import com.example.springbootmysqlrestful.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepo;
    public ServiceResult findAllOrderByNameDesc() {
        ServiceResult result = new ServiceResult();
//        result.setData(customerRepo.findAll());
        result.setData(customerRepo.findAllOrderByNameDesc());

        return result;
    }
    public ServiceResult findById(int id) {
        ServiceResult result = new ServiceResult();
        Customer customer = customerRepo.findById(id).orElse(null);
        result.setData(customer);
        return result;
    }
    public ServiceResult create(Customer customer) {
        ServiceResult result = new ServiceResult();
        result.setData(customerRepo.save(customer));
        return result;
    }
    public ServiceResult update(Customer customer) {
        ServiceResult result = new ServiceResult();
        if (!customerRepo.findById(customer.getId()).isPresent()) {
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("Customer Not Found");
        } else {
            result.setData(customerRepo.save(customer));
        }
        return result;
    }
    public ServiceResult delete(int id) {
        ServiceResult result = new ServiceResult();
        Customer customer = customerRepo.findById(id).orElse(null);
        if (customer == null) {
            result.setStatus(ServiceResult.Status.FAILED);
            result.setMessage("Customer Not Found");
        } else {
            customerRepo.delete(customer);
            result.setMessage("success");
        }
        return result;
    }
}
