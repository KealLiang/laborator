package com.kealliang.service;

import com.alibaba.cola.command.CommandBusI;
import com.alibaba.cola.dto.MultiResponse;
import com.alibaba.cola.dto.Response;
import com.kealliang.api.CustomerServiceI;
import com.kealliang.dto.CustomerAddCmd;
import com.kealliang.dto.CustomerListByNameQry;
import com.kealliang.dto.domainmodel.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements CustomerServiceI {

    @Autowired
    private CommandBusI commandBus;

    @Override
    public Response addCustomer(CustomerAddCmd customerAddCmd) {
        return (Response)commandBus.send(customerAddCmd);
    }

    @Override
    public MultiResponse<Customer> listByName(CustomerListByNameQry customerListByNameQry) {
        return (MultiResponse<Customer>)commandBus.send(customerListByNameQry);
    }

}
