package com.qianfeng.openapi.web.master.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qianfeng.openapi.web.master.pojo.Customer;

import java.util.List;

public interface CustomerService {
    void insertCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer getCustomerById(Long id);

    List<Customer> getAllCustomers();

    PageInfo<Customer> getAllCustomerByPage(Integer page, Integer limit);
}
