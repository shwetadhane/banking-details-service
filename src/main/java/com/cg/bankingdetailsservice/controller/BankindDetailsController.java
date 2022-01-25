package com.cg.bankingdetailsservice.controller;

import com.cg.bankingdetailsservice.model.BankAccount;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankindDetailsController {

    @RequestMapping("/bankdetails")
    public BankAccount getBankDetails(){
        return new BankAccount("Shweta","123456789000");
    }
}
