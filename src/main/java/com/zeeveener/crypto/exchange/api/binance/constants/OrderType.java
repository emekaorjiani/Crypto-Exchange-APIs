package com.zeeveener.crypto.exchange.api.binance.constants;

public enum OrderType {
    /**
     * Sell or Buy at the best available price.
     */
    MARKET,
    /**
     * Sell or Buy at a set price and do not execute until that price is met or beat.
     */
    LIMIT
}
