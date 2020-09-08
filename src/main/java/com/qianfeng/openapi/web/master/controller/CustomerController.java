package com.qianfeng.openapi.web.master.controller;

import com.github.pagehelper.PageInfo;
import com.qianfeng.openapi.web.master.bean.AjaxMessage;
import com.qianfeng.openapi.web.master.bean.TableData;
import com.qianfeng.openapi.web.master.pojo.Customer;
import com.qianfeng.openapi.web.master.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sys/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/del")
    public AjaxMessage deleteCustomer(Long id) {
        try {
            System.out.println("################id" + id);
            customerService.deleteCustomer(id);
            return new AjaxMessage(true, "删除成功");
        } catch (Exception e) {
            return new AjaxMessage(false, "删除失败");
        }

    }
    @PostMapping("/update")
    public AjaxMessage updateCustomer(Customer customer) {
        try {
            customerService.updateCustomer(customer);
            return new AjaxMessage(true, "修改成功");
        } catch (Exception e) {
            return new AjaxMessage(false, "修改失败");
        }

    }

    @PostMapping("/add")
    public AjaxMessage addCustomer(Customer customer) {
        try {
            customerService.insertCustomer(customer);
            return new AjaxMessage(true, "添加成功");
        } catch (Exception e) {
            return new AjaxMessage(false, "添加失败");
        }

    }

    @GetMapping("/table")
    public TableData<Customer> table(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "2") Integer limit) {
        TableData<Customer> customerTableData = new TableData<Customer>();
        PageInfo<Customer> pageInfo = customerService.getAllCustomerByPage(page, limit);
        customerTableData.setCount(pageInfo.getTotal());
        customerTableData.setData(pageInfo.getList());
        return customerTableData;
    }

}
