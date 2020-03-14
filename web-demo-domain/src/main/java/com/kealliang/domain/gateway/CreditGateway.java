package com.kealliang.domain.gateway;

import com.kealliang.domain.customer.Customer;
import com.kealliang.domain.customer.Credit;

//Assume that the credit info is in antoher distributed Service
public interface CreditGateway {
    public Credit getCredit(String customerId);
}
