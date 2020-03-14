package com.kealliang.dto;

import com.alibaba.cola.dto.Command;
import com.kealliang.dto.domainmodel.Customer;
import lombok.Data;

@Data
public class CustomerAddCmd extends Command{

    private Customer customer;

}
