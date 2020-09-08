package com.qianfeng.openapi.web.master.mapper;

import com.qianfeng.openapi.web.master.pojo.Customer;

import java.util.List;

public interface CustomerMapper {
    void insertCustomer(Customer customer);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long id);

    Customer getCustomerById(Long id);

    /**
     * 查询所有的客户
     * @return
     */
    List<Customer> getAllCustomers();
}
