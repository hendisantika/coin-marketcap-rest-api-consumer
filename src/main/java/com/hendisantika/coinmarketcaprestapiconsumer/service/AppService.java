package com.hendisantika.coinmarketcaprestapiconsumer.service;

import com.hendisantika.coinmarketcaprestapiconsumer.domain.Coin;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : coin-marketcap-rest-api-consumer
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-06-13
 * Time: 06:58
 */
public interface AppService {

    List<Coin> getAllCoins();
}
