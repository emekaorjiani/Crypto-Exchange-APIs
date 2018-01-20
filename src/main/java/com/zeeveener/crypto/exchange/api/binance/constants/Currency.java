package com.zeeveener.crypto.exchange.api.binance.constants;

import java.util.Arrays;
import java.util.Optional;

/**
 * All currencies listed at the Binance Exchange.
 *
 * @author Zac Beemer
 */
public enum Currency {
    ADA("Cardano"),
    ADX("AdEx"),
    AION("AION"),
    AMB("Amber"),
    APPC("AppCoins"),
    ARK("Ark"),
    ARN("Aeron"),
    AST("AirSwap"),
    BAT("Basic Attention Token"),
    BCC("Bitcoin Cash"),
    BCD("Bitcoin Diamond"),
    BCPT("BlockMason Credit Protocol"),
    BCX("BitcoinX"),
    BNB("Binance"),
    BNT("Bancor"),
    BQX("ETHOS"),
    BRD("Bread"),
    BTC("Bitcoin"),
    BTG("Bitcoin Gold"),
    //BTM("Bytom"), -- Delisted
    BTS("BitShares"),
    CDT("CoinDash"),
    CMT("CyberMiles"),
    CND("Cindicator"),
    CTR("Centra"),
    DASH("Dash"),
    DGD("DigixDAO"),
    DLT("Agrello"),
    DNT("district0x"),
    EDO("Eidoo"),
    ELF("aelf"),
    ENG("Enigma"),
    ENJ("EnjinCoin"),
    EOS("EOS"),
    ETC("Ethereum Classic"),
    ETF("ETF"),
    ETH("Ethereum"),
    EVX("Everex"),
    FUEL("Etherparty"),
    FUN("FunFair"),
    GAS("NeoGas"),
    GTO("Gifto"),
    GVT("Genesis Vision"),
    GXS("GXShares"),
    // HCC("HealthCare Chain"), -- Delisted
    HSR("Hshare"),
    ICN("ICONOMI"),
    ICX("ICON"),
    INS("INS Ecosystem"),
    IOTA("MIOTA"),
    KMD("Komodo"),
    KNC("KyberNetwork"),
    LEND("EthLend"),
    LINK("ChainLink"),
    // LLT("LLToken"), -- Delisted
    LRC("Loopring"),
    LSK("Lisk"),
    LTC("Litecoin"),
    LUN("Lunyr"),
    MANA("Decentraland"),
    MCO("MONACO"),
    MDA("Moeda Loyalty Points"),
    MOD("Modum"),
    MTH("Monetha"),
    MTL("Metal"),
    NAV("NAV Coin"),
    NEBL("Neblio"),
    NEO("NEO"),
    NULS("Nuls"),
    OAX("openANX"),
    OMG("OmiseGO"),
    OST("Simple Token"),
    POE("Po.et"),
    POWR("PowerLedger"),
    PPT("Populous"),
    QSP("Quantstamp"),
    QTUM("Qtum"),
    RCN("Ripio Credit Network"),
    RDN("Raiden Network Token"),
    REQ("Request Network"),
    RLC("iExecRLC"),
    SALT("Salt"),
    SBTC("Super Bitcoin"),
    SNGLS("SingularDTV"),
    SNM("SONM"),
    SNT("Status"),
    STORJ("Storj"),
    STRAT("Stratis"),
    SUB("Substratum"),
    TNB("Time New Bank"),
    TNT("Tierion"),
    TRIG("Triggers"),
    TRX("TRON"),
    USDT("TetherUS"),
    VEN("VeChain"),
    VIB("Viberate"),
    VIBE("VIBE"),
    WABI("WaBi"),
    WAVES("Waves"),
    WINGS("WINGS"),
    WTC("Walton"),
    XLM("Stellar Lumens"),
    XMR("Monero"),
    XRP("Ripple"),
    XVG("Verge"),
    XZC("ZCoin"),
    YOYO("YOYOW"),
    ZEC("Zcash"),
    ZRX("0x")
    ;

    private final String name;

    Currency(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    /**
     * Attempts to locate the currency which has the same name as what is given.
     * <br/><br/>
     * If more than one currency has the same name, a random one will be returned.
     * <br/><br/>
     * <strong>Note:</strong> This is <em>not</em> case sensitive.
     * @param name The name of the desired currency
     * @return An Optional containing the currency matching the given name, or an empty Optional if no currency has the given name.
     */
    public static Optional<Currency> getByName(final String name) {
        return Arrays.stream(Currency.values())
                .filter(currency -> currency.getName().equalsIgnoreCase(name))
                .findAny();
    }
}
