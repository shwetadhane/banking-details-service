package com.cg.bankingdetailsservice.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableDiscoveryClient
public class BankindDetailsController {

    @RequestMapping("/bankdetails")
    public String getBankDetails(){
        return "22021989";
    }
}
