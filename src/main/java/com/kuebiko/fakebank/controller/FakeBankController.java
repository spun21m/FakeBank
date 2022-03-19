package com.kuebiko.fakebank.controller;

import com.kuebiko.fakebank.models.BalanceChecker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fakebank")
public class FakeBankController {

    Logger logger = LoggerFactory.getLogger(this.getClass());//or FakeBankController.class

    @RequestMapping(value = "/checkbalance", method = RequestMethod.GET)//input here is object of class BalnaceChecker
    public BalanceChecker checkBalance(@RequestBody BalanceChecker payload){//balancechecker class object instread of String, int
        logger.info("received a request.");
        logger.info("Request: " + payload.toString());

        return payload;
    }

}
