# coin-marketcap-rest-api-consumer

An example of how to consume a restfull web service with Spring RestTemplate. The project is constructed with gradle. All Spring, Springboot and jackson dependencies are handled by gradle. There are two application classes, one of which has a simple main method where you can initialize and see the results of what you consumed. The other app class is based on spring boot and we managed all lifecycle with spring boot.

By 28 Dec 2017 ==> The controller and Service layers added in order to serve as a rest api. The Coinmarketcap api is consumed via service layer by using spring rest template. There are two controllers, one of which is a rest controller for consuming coinmarketcap api via service layer. The other one is home controller which is just for redirecting the get request to index html.

The index.html contains an angular app object which is making a rest call to http://localhost:8080/ and gets the json string and shows it in an html table.

## Things to do
1. Clone this repo: `git clone https://github.com/hendisantika/coin-marketcap-rest-api-consumer.git`
2. Go to the folder: `cd coin-marketcap-rest-api-consumer`
3. Run this app: `./mvnw clean spring-boot:run`
4. Go to your favorite browser: http://localhost:8080/ or http://localhost:8080/home

Sample Response:
```
// 20190613072509
// http://localhost:8080/

[
  {
    "id": "bitcoin",
    "name": "Bitcoin",
    "price_usd": "8158.64430455"
  },
  {
    "id": "ethereum",
    "name": "Ethereum",
    "price_usd": "261.597030852"
  },
  {
    "id": "ripple",
    "name": "XRP",
    "price_usd": "0.4008219382"
  },
  {
    "id": "litecoin",
    "name": "Litecoin",
    "price_usd": "135.461252109"
  },
  {
    "id": "bitcoin-cash",
    "name": "Bitcoin Cash",
    "price_usd": "396.431284962"
  },
  {
    "id": "eos",
    "name": "EOS",
    "price_usd": "6.4470148215"
  },
  {
    "id": "binance-coin",
    "name": "Binance Coin",
    "price_usd": "34.7456849615"
  },
  {
    "id": "bitcoin-sv",
    "name": "Bitcoin SV",
    "price_usd": "189.741557381"
  },
  {
    "id": "tether",
    "name": "Tether",
    "price_usd": "1.0055385643"
  },
  {
    "id": "cardano",
    "name": "Cardano",
    "price_usd": "0.096077691"
  },
  {
    "id": "stellar",
    "name": "Stellar",
    "price_usd": "0.1266240114"
  },
  {
    "id": "tron",
    "name": "TRON",
    "price_usd": "0.0334913478"
  },
  {
    "id": "monero",
    "name": "Monero",
    "price_usd": "90.3838303021"
  },
  {
    "id": "dash",
    "name": "Dash",
    "price_usd": "155.770064581"
  },
  {
    "id": "iota",
    "name": "IOTA",
    "price_usd": "0.4373886884"
  },
  {
    "id": "cosmos",
    "name": "Cosmos",
    "price_usd": "6.1276752232"
  },
  {
    "id": "ethereum-classic",
    "name": "Ethereum Classic",
    "price_usd": "8.5468118728"
  },
  {
    "id": "neo",
    "name": "NEO",
    "price_usd": "12.9131668581"
  },
  {
    "id": "tezos",
    "name": "Tezos",
    "price_usd": "1.2721293397"
  },
  {
    "id": "nem",
    "name": "NEM",
    "price_usd": "0.0866357503"
  },
  {
    "id": "maker",
    "name": "Maker",
    "price_usd": "746.478962189"
  },
  {
    "id": "ontology",
    "name": "Ontology",
    "price_usd": "1.4220978213"
  },
  {
    "id": "zcash",
    "name": "Zcash",
    "price_usd": "90.8886715095"
  },
  {
    "id": "crypto-com-chain",
    "name": "Crypto.com Chain",
    "price_usd": "0.0701979537"
  },
  {
    "id": "bitcoin-gold",
    "name": "Bitcoin Gold",
    "price_usd": "26.2382418362"
  },
  {
    "id": "basic-attention-token",
    "name": "Basic Attention Token",
    "price_usd": "0.3340423406"
  },
  {
    "id": "vechain",
    "name": "VeChain",
    "price_usd": "0.0075804686"
  },
  {
    "id": "chainlink",
    "name": "Chainlink",
    "price_usd": "1.1485324391"
  },
  {
    "id": "dogecoin",
    "name": "Dogecoin",
    "price_usd": "0.0030713279"
  },
  {
    "id": "usd-coin",
    "name": "USD Coin",
    "price_usd": "1.0001747273"
  },
  {
    "id": "qtum",
    "name": "Qtum",
    "price_usd": "3.2267835186"
  },
  {
    "id": "aurora",
    "name": "Aurora",
    "price_usd": "0.045061354"
  },
  {
    "id": "omisego",
    "name": "OmiseGO",
    "price_usd": "2.0223302784"
  },
  {
    "id": "decred",
    "name": "Decred",
    "price_usd": "28.1980542722"
  },
  {
    "id": "bittorrent",
    "name": "BitTorrent",
    "price_usd": "0.0012513435"
  },
  {
    "id": "holo",
    "name": "Holo",
    "price_usd": "0.0018968981"
  },
  {
    "id": "trueusd",
    "name": "TrueUSD",
    "price_usd": "0.9999194179"
  },
  {
    "id": "ravencoin",
    "name": "Ravencoin",
    "price_usd": "0.0653350024"
  },
  {
    "id": "waves",
    "name": "Waves",
    "price_usd": "2.4440297571"
  },
  {
    "id": "lisk",
    "name": "Lisk",
    "price_usd": "2.0762853198"
  },
  {
    "id": "bitcoin-diamond",
    "name": "Bitcoin Diamond",
    "price_usd": "1.245433865"
  },
  {
    "id": "nano",
    "name": "Nano",
    "price_usd": "1.5974726776"
  },
  {
    "id": "augur",
    "name": "Augur",
    "price_usd": "18.7012560536"
  },
  {
    "id": "pundi-x",
    "name": "Pundi X",
    "price_usd": "0.0008679598"
  },
  {
    "id": "zilliqa",
    "name": "Zilliqa",
    "price_usd": "0.023245721"
  },
  {
    "id": "0x",
    "name": "0x",
    "price_usd": "0.3323888779"
  },
  {
    "id": "komodo",
    "name": "Komodo",
    "price_usd": "1.6456027295"
  },
  {
    "id": "icon",
    "name": "ICON",
    "price_usd": "0.3972470229"
  },
  {
    "id": "paxos-standard-token",
    "name": "Paxos Standard Token",
    "price_usd": "1.0026167556"
  },
  {
    "id": "bytecoin-bcn",
    "name": "Bytecoin",
    "price_usd": "0.000957594"
  },
  {
    "id": "huobi-token",
    "name": "Huobi Token",
    "price_usd": "3.3893312836"
  },
  {
    "id": "bitshares",
    "name": "BitShares",
    "price_usd": "0.0620588792"
  },
  {
    "id": "digibyte",
    "name": "DigiByte",
    "price_usd": "0.012674281"
  },
  {
    "id": "verge",
    "name": "Verge",
    "price_usd": "0.0092523356"
  },
  {
    "id": "qubitica",
    "name": "Qubitica",
    "price_usd": "51.0835006078"
  },
  {
    "id": "bytom",
    "name": "Bytom",
    "price_usd": "0.1406396088"
  },
  {
    "id": "gxchain",
    "name": "GXChain",
    "price_usd": "2.3264412854"
  },
  {
    "id": "iostoken",
    "name": "IOST",
    "price_usd": "0.0114611866"
  },
  {
    "id": "aeternity",
    "name": "Aeternity",
    "price_usd": "0.5108036406"
  },
  {
    "id": "dent",
    "name": "Dent",
    "price_usd": "0.0018918919"
  },
  {
    "id": "steem",
    "name": "Steem",
    "price_usd": "0.4291881504"
  },
  {
    "id": "monacoin",
    "name": "MonaCoin",
    "price_usd": "2.0629993689"
  },
  {
    "id": "siacoin",
    "name": "Siacoin",
    "price_usd": "0.0032535883"
  },
  {
    "id": "metaverse",
    "name": "Metaverse ETP",
    "price_usd": "1.8250283815"
  },
  {
    "id": "solve",
    "name": "SOLVE",
    "price_usd": "0.3883871918"
  },
  {
    "id": "enjin-coin",
    "name": "Enjin Coin",
    "price_usd": "0.157694899"
  },
  {
    "id": "theta",
    "name": "THETA",
    "price_usd": "0.1388594259"
  },
  {
    "id": "maximine-coin",
    "name": "Maximine Coin",
    "price_usd": "0.0714390584"
  },
  {
    "id": "kucoin-shares",
    "name": "KuCoin Shares",
    "price_usd": "1.2707727474"
  },
  {
    "id": "thorecoin",
    "name": "ThoreCoin",
    "price_usd": "1237.63808935"
  },
  {
    "id": "ardor",
    "name": "Ardor",
    "price_usd": "0.1073072572"
  },
  {
    "id": "wax",
    "name": "WAX",
    "price_usd": "0.1121572913"
  },
  {
    "id": "status",
    "name": "Status",
    "price_usd": "0.0302414168"
  },
  {
    "id": "crypto-com",
    "name": "Crypto.com",
    "price_usd": "6.6392507698"
  },
  {
    "id": "golem-network-tokens",
    "name": "Golem",
    "price_usd": "0.1069664798"
  },
  {
    "id": "abbc-coin",
    "name": "ABBC Coin",
    "price_usd": "0.199690722"
  },
  {
    "id": "aelf",
    "name": "aelf",
    "price_usd": "0.2002725277"
  },
  {
    "id": "hypercash",
    "name": "HyperCash",
    "price_usd": "2.2632734045"
  },
  {
    "id": "stratis",
    "name": "Stratis",
    "price_usd": "0.9730479932"
  },
  {
    "id": "hedgetrade",
    "name": "HedgeTrade",
    "price_usd": "0.3358679648"
  },
  {
    "id": "zcoin",
    "name": "Zcoin",
    "price_usd": "12.5256208806"
  },
  {
    "id": "waltonchain",
    "name": "Waltonchain",
    "price_usd": "2.1461000282"
  },
  {
    "id": "maidsafecoin",
    "name": "MaidSafeCoin",
    "price_usd": "0.1954086842"
  },
  {
    "id": "insight-chain",
    "name": "Insight Chain",
    "price_usd": "0.2511079988"
  },
  {
    "id": "mixin",
    "name": "Mixin",
    "price_usd": "186.615664787"
  },
  {
    "id": "truechain",
    "name": "TrueChain",
    "price_usd": "1.0489573917"
  },
  {
    "id": "dai",
    "name": "Dai",
    "price_usd": "1.0025917266"
  },
  {
    "id": "cryptonex",
    "name": "Cryptonex",
    "price_usd": "1.4873989402"
  },
  {
    "id": "vestchain",
    "name": "VestChain",
    "price_usd": "0.0115420956"
  },
  {
    "id": "nebulas-token",
    "name": "Nebulas",
    "price_usd": "1.6585463954"
  },
  {
    "id": "egretia",
    "name": "Egretia",
    "price_usd": "0.0194496904"
  },
  {
    "id": "project-pai",
    "name": "Project Pai",
    "price_usd": "0.050156875"
  },
  {
    "id": "zencash",
    "name": "Horizen",
    "price_usd": "10.9049995812"
  },
  {
    "id": "loom-network",
    "name": "Loom Network",
    "price_usd": "0.0886616961"
  },
  {
    "id": "ark",
    "name": "Ark",
    "price_usd": "0.6138936569"
  },
  {
    "id": "digixdao",
    "name": "DigixDAO",
    "price_usd": "33.1317962998"
  },
  {
    "id": "nuls",
    "name": "NULS",
    "price_usd": "0.8888037358"
  },
  {
    "id": "thunder-token",
    "name": "Thunder Token",
    "price_usd": "0.0214899041"
  },
  {
    "id": "loopring",
    "name": "Loopring",
    "price_usd": "0.065953829"
  },
  {
    "id": "populous",
    "name": "Populous",
    "price_usd": "1.1516245637"
  }
]
``` 