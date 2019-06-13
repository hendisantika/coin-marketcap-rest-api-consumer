package com.hendisantika.coinmarketcaprestapiconsumer.service;

import com.hendisantika.coinmarketcaprestapiconsumer.domain.Coin;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : coin-marketcap-rest-api-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-13
 * Time: 07:05
 */
@Service
public class AppServiceImpl implements AppService {

    RestTemplate restTemplate = new RestTemplate();

    @Override
    public List<Coin> getAllCoins() {
        Coin[] coins = restTemplate.getForObject("https://api.coinmarketcap.com/v1/ticker/", Coin[].class);
        return Arrays.asList(coins);
    }
}