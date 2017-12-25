package com.iotimc.watermeter.client.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ReportController
 *
 * @author LanLonbo
 * @create 2017/12/25
 **/
@RestController
public class ReportController {

    private Logger logger = LoggerFactory.getLogger(ReportController.class);

    @RequestMapping(value = "/getAccount", method= RequestMethod.GET)
    public String index() {
        logger.info("in getAccount");
        return "this is getAccount";
    }

}
