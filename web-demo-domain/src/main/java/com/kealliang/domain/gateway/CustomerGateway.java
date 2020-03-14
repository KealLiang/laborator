package com.kealliang.domain.gateway;

import com.kealliang.domain.customer.Customer;

public interface CustomerGateway {
    public Customer getByById(String customerId);
}
