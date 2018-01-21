package com.zeeveener.crypto.exchange.api.binance.constants;

/**
 * Reference Site: <a href="https://www.investopedia.com/terms/t/timeinforce.asp">Investopedia</a>
 */
public enum TimeInForce {
    GOOD_UNTIL_CANCELLED("GTC"),
    IMMEDIATE_OR_CANCEL("IOC");

    private final String symbol;

    TimeInForce(final String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return this.symbol;
    }
}
