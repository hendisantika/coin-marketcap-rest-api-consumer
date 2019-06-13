package com.hendisantika.coinmarketcaprestapiconsumer.controller;

import com.hendisantika.coinmarketcaprestapiconsumer.domain.Coin;
import com.hendisantika.coinmarketcaprestapiconsumer.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : coin-marketcap-rest-api-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-13
 * Time: 07:10
 */
@RestController
public class AppController {

    @Autowired
    private AppService service;

    @GetMapping("/")
    public List<Coin> getAllCoins() {
        return service.getAllCoins();
    }

}