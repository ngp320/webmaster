package com.qianfeng.openapi.web.master.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qianfeng.openapi.web.master.mapper.CustomerMapper;
import com.qianfeng.openapi.web.master.pojo.Customer;
import com.qianfeng.openapi.web.master.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;


    public void insertCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    public void updateCustomer(Customer customer) {
        if (customer.getId() != null) {
            customerMapper.updateCustomer(customer);
        } else {
            // TODO 更新都是根据id更新, 所以需要传递id, 如果没有传递, 我们需要提示用户
        }
    }

    public void deleteCustomer(Long id) {
        if (id != null) {
            customerMapper.deleteCustomer(id);
        } else {
            // TODO 删除都是根据id删除, 所以需要传递id, 如果没有传递, 我们需要提示用户
        }
    }

    public Customer getCustomerById(Long id) {
        if (id != null) {
            return customerMapper.getCustomerById(id);
        } else {
            // TODO 删除都是根据id删除, 所以需要传递id, 如果没有传递, 我们需要提示用户
        }
        return null;
    }

    public List<Customer> getAllCustomers() {
        return customerMapper.getAllCustomers();
    }

    public PageInfo<Customer> getAllCustomerByPage(Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Customer> customerList = customerMapper.getAllCustomers();
        return new PageInfo<Customer>(customerList);
    }
}
