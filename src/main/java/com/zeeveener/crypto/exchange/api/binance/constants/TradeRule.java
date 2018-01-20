package com.zeeveener.crypto.exchange.api.binance.constants;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Represents minimum amounts and values of trades for certain {@link Book}s.
 * <br/><br/>
 * As defined <a href="https://support.binance.com/hc/en-us/articles/115000594711-Trading-Rule">Here</a>
 *
 * @author Zac Beemer
 */
public enum TradeRule {
    ADX_BNB(Book.ADX_BNB, 0.01, 0.00001, 1),
    AION_BNB(Book.AION_BNB, 0.01, 0.00001, 1),
    AMB_BNB(Book.AMB_BNB, 0.01, 0.00001, 1),
    APPC_BNB(Book.APPC_BNB, 0.01, 0.00001, 1),
    BAT_BNB(Book.BAT_BNB, 0.01, 0.00001, 1),
    BCC_BNB(Book.BCC_BNB, 0.00001, 0.01, 1),
    BCPT_BNB(Book.BCPT_BNB, 0.01, 0.00001, 1),
    BRD_BNB(Book.BRD_BNB, 0.01, 0.00001, 1),
    BTS_BNB(Book.BTS_BNB, 0.01, 0.00001, 1),
    CMT_BNB(Book.CMT_BNB, 0.01, 0.00001, 1),
    CND_BNB(Book.CND_BNB, 0.01, 0.00001, 1),
    DLT_BNB(Book.DLT_BNB, 0.01, 0.00001, 1),
    GTO_BNB(Book.GTO_BNB, 0.01, 0.00001, 1),
    ICX_BNB(Book.ICX_BNB, 0.01, 0.00001, 1),
    IOTA_BNB(Book.IOTA_BNB, 0.01, 0.00001, 1),
    LSK_BNB(Book.LSK_BNB, 0.001, 0.0001, 1),
    LTC_BNB(Book.LTC_BNB, 0.00001, 0.01, 1),
    MCO_BNB(Book.MCO_BNB, 0.01, 0.00001, 1),
    NAV_BNB(Book.NAV_BNB, 0.01, 0.00001, 1),
    NEBL_BNB(Book.NEBL_BNB, 0.01, 0.00001, 1),
    NEO_BNB(Book.NEO_BNB, 0.001, 0.001, 1),
    NULS_BNB(Book.NULS_BNB, 0.01, 0.00001, 1),
    OST_BNB(Book.OST_BNB, 0.01, 0.00001, 1),
    POWR_BNB(Book.POWR_BNB, 0.01, 0.0001, 1),
    QSP_BNB(Book.QSP_BNB, 0.01, 0.00001, 1),
    RCN_BNB(Book.RCN_BNB, 0.01, 0.00001, 1),
    RDN_BNB(Book.RDN_BNB, 0.01, 0.00001, 1),
    RLC_BNB(Book.RLC_BNB, 0.01, 0.00001, 1),
    TRIG_BNB(Book.TRIG_BNB, 0.01, 0.00001, 1),
    VEN_BNB(Book.VEN_BNB, 0.01, 0.0001, 1.0),
    WABI_BNB(Book.WABI_BNB, 0.01, 0.00001, 1),
    WAVES_BNB(Book.WAVES_BNB, 0.01, 0.0001, 1),
    WTC_BNB(Book.WTC_BNB, 0.01, 0.00001, 1),
    XLM_BNB(Book.XLM_BNB, 0.01, 0.00001, 1),
    XZC_BNB(Book.XZC_BNB, 0.001, 0.001, 1),
    YOYO_BNB(Book.YOYO_BNB, 0.01, 0.00001, 1),
    ADA_BTC(Book.ADA_BTC, 1, 0.00000001, 0.002),
    ADX_BTC(Book.ADX_BTC, 1, 0.00000001, 0.002),
    AION_BTC(Book.AION_BTC, 1, 0.0000001, 0.002),
    AMB_BTC(Book.AMB_BTC, 0.001, 0.00000001, 0.002),
    APPC_BTC(Book.APPC_BTC, 1, 0.00000001, 0.002),
    ARK_BTC(Book.ARK_BTC, 0.01, 0.0000001, 0.002),
    ARN_BTC(Book.ARN_BTC, 1, 0.00000001, 0.002),
    AST_BTC(Book.AST_BTC, 1, 0.00000001, 0.002),
    BAT_BTC(Book.BAT_BTC, 1, 0.00000001, 0.002),
    BCC_BTC(Book.BCC_BTC, 0.001, 0.000001, 0.002),
    BCD_BTC(Book.BCD_BTC, 0.001, 0.000001, 0.002),
    BCPT_BTC(Book.BCPT_BTC, 1, 0.00000001, 0.002),
    BNB_BTC(Book.BNB_BTC, 1, 0.00000001, 0.002),
    BNT_BTC(Book.BNT_BTC, 1, 0.00000001, 0.002),
    BQX_BTC(Book.BQX_BTC, 1, 0.00000001, 0.002),
    BRD_BTC(Book.BRD_BTC, 1, 0.00000001, 0.002),
    BTG_BTC(Book.BTG_BTC, 0.01, 0.000001, 0.002),
    BTS_BTC(Book.BTS_BTC, 1, 0.00000001, 0.002),
    CDT_BTC(Book.CDT_BTC, 1, 0.00000001, 0.002),
    CMT_BTC(Book.CMT_BTC, 1, 0.00000001, 0.002),
    CND_BTC(Book.CND_BTC, 1, 0.00000001, 0.002),
    CTR_BTC(Book.CTR_BTC, 1, 0.00000001, 0.002),
    DASH_BTC(Book.DASH_BTC, 0.001, 0.000001, 0.002),
    DGD_BTC(Book.DGD_BTC, 0.001, 0.000001, 0.002),
    DLT_BTC(Book.DLT_BTC, 0.001, 0.00000001, 0.002),
    DNT_BTC(Book.DNT_BTC, 1, 0.00000001, 0.002),
    EDO_BTC(Book.EDO_BTC, 1, 0.0000001, 0.002),
    ELF_BTC(Book.ELF_BTC, 1, 0.00000001, 0.002),
    ENG_BTC(Book.ENG_BTC, 1, 0.00000001, 0.002),
    ENJ_BTC(Book.ENJ_BTC, 1, 0.00000001, 0.002),
    EOS_BTC(Book.EOS_BTC, 1, 0.00000001, 0.002),
    ETC_BTC(Book.ETC_BTC, 0.01, 0.000001, 0.002),
    ETH_BTC(Book.ETH_BTC, 0.001, 0.000001, 0.002),
    EVX_BTC(Book.EVX_BTC, 1, 0.00000001, 0.002),
    FUEL_BTC(Book.FUEL_BTC, 1, 0.00000001, 0.002),
    FUN_BTC(Book.FUN_BTC, 1, 0.00000001, 0.002),
    GAS_BTC(Book.GAS_BTC, 0.01, 0.000001, 0.002),
    GTO_BTC(Book.GTO_BTC, 1, 0.00000001, 0.002),
    GVT_BTC(Book.GVT_BTC, 0.01, 0.0000001, 0.002),
    GXS_BTC(Book.GXS_BTC, 0.01, 0.0000001, 0.002),
    HSR_BTC(Book.HSR_BTC, 1, 0.000001, 0.002),
    ICN_BTC(Book.ICN_BTC, 1, 0.00000001, 0.002),
    ICX_BTC(Book.ICX_BTC, 0.01, 0.0000001, 0.002),
    INS_BTC(Book.INS_BTC, 1, 0.0000001, 0.002),
    IOTA_BTC(Book.IOTA_BTC, 1, 0.00000001, 0.002),
    KMD_BTC(Book.KMD_BTC, 1, 0.0000001, 0.002),
    KNC_BTC(Book.KNC_BTC, 1, 0.00000001, 0.002),
    LEND_BTC(Book.LEND_BTC, 1, 0.00000001, 0.002),
    LINK_BTC(Book.LINK_BTC, 1, 0.00000001, 0.002),
    LRC_BTC(Book.LRC_BTC, 1, 0.00000001, 0.002),
    LSK_BTC(Book.LSK_BTC, 0.01, 0.0000001, 0.002),
    LTC_BTC(Book.LTC_BTC, 0.01, 0.000001, 0.002),
    LUN_BTC(Book.LUN_BTC, 1, 0.0000001, 0.002),
    MANA_BTC(Book.MANA_BTC, 1, 0.00000001, 0.002),
    MCO_BTC(Book.MCO_BTC, 0.01, 0.000001, 0.002),
    MDA_BTC(Book.MDA_BTC, 1, 0.00000001, 0.002),
    MOD_BTC(Book.MOD_BTC, 1, 0.0000001, 0.002),
    MTH_BTC(Book.MTH_BTC, 1, 0.00000001, 0.002),
    MTL_BTC(Book.MTL_BTC, 1, 0.000001, 0.002),
    NAV_BTC(Book.NAV_BTC, 1, 0.0000001, 0.002),
    NEBL_BTC(Book.NEBL_BTC, 1, 0.0000001, 0.002),
    NEO_BTC(Book.NEO_BTC, 0.01, 0.000001, 0.002),
    NULS_BTC(Book.NULS_BTC, 1, 0.00000001, 0.002),
    OAX_BTC(Book.OAX_BTC, 1, 0.00000001, 0.002),
    OMG_BTC(Book.OMG_BTC, 0.01, 0.000001, 0.002),
    OST_BTC(Book.OST_BTC, 1, 0.00000001, 0.002),
    POE_BTC(Book.POE_BTC, 1, 0.00000001, 0.002),
    POWR_BTC(Book.POWR_BTC, 1, 0.00000001, 0.002),
    PPT_BTC(Book.PPT_BTC, 0.01, 0.0000001, 0.002),
    QSP_BTC(Book.QSP_BTC, 1, 0.00000001, 0.002),
    QTUM_BTC(Book.QTUM_BTC, 0.01, 0.000001, 0.002),
    RCN_BTC(Book.RCN_BTC, 1, 0.00000001, 0.002),
    RDN_BTC(Book.RDN_BTC, 1, 0.00000001, 0.002),
    REQ_BTC(Book.REQ_BTC, 1, 0.00000001, 0.002),
    RLC_BTC(Book.RLC_BTC, 1, 0.0000001, 0.002),
    SALT_BTC(Book.SALT_BTC, 0.01, 0.000001, 0.002),
    SNGLS_BTC(Book.SNGLS_BTC, 1, 0.00000001, 0.002),
    SNM_BTC(Book.SNM_BTC, 1, 0.00000001, 0.002),
    SNT_BTC(Book.SNT_BTC, 1, 0.00000001, 0.002),
    STORJ_BTC(Book.STORJ_BTC, 1, 0.00000001, 0.002),
    STRAT_BTC(Book.STRAT_BTC, 0.01, 0.000001, 0.002),
    SUB_BTC(Book.SUB_BTC, 1, 0.00000001, 0.002),
    TNB_BTC(Book.TNB_BTC, 1, 0.00000001, 0.002),
    TNT_BTC(Book.TNT_BTC, 1, 0.00000001, 0.002),
    TRIG_BTC(Book.TRIG_BTC, 1, 0.0000001, 0.002),
    TRX_BTC(Book.TRX_BTC, 1, 0.00000001, 0.002),
    VEN_BTC(Book.VEN_BTC, 1, 0.00000001, 0.002),
    VIB_BTC(Book.VIB_BTC, 1, 0.00000001, 0.002),
    VIBE_BTC(Book.VIBE_BTC, 1, 0.00000001, 0.002),
    WABI_BTC(Book.WABI_BTC, 1, 0.00000001, 0.002),
    WAVES_BTC(Book.WAVES_BTC, 0.01, 0.000001, 0.002),
    WINGS_BTC(Book.WINGS_BTC, 1, 0.00000001, 0.002),
    WTC_BTC(Book.WTC_BTC, 1, 0.00000001, 0.002),
    XLM_BTC(Book.XLM_BTC, 1, 0.00000001, 0.002),
    XMR_BTC(Book.XMR_BTC, 0.001, 0.000001, 0.002),
    XRP_BTC(Book.XRP_BTC, 1, 0.00000001, 0.002),
    XVG_BTC(Book.XVG_BTC, 1, 0.00000001, 0.002),
    XZC_BTC(Book.XZC_BTC, 0.01, 0.000001, 0.002),
    YOYO_BTC(Book.YOYO_BTC, 1, 0.00000001, 0.002),
    ZEC_BTC(Book.ZEC_BTC, 0.001, 0.000001, 0.002),
    ZRX_BTC(Book.ZRX_BTC, 1, 0.00000001, 0.002),
    ADA_ETH(Book.ADA_ETH, 1, 0.00000001, 0.02),
    ADX_ETH(Book.ADX_ETH, 1, 0.0000001, 0.02),
    AION_ETH(Book.AION_ETH, 1, 0.000001, 0.02),
    AMB_ETH(Book.AMB_ETH, 1, 0.00000001, 0.02),
    APPC_ETH(Book.APPC_ETH, 1, 0.0000001, 0.02),
    ARK_ETH(Book.ARK_ETH, 0.01, 0.000001, 0.02),
    ARN_ETH(Book.ARN_ETH, 1, 0.00000001, 0.02),
    AST_ETH(Book.AST_ETH, 1, 0.0000001, 0.02),
    BAT_ETH(Book.BAT_ETH, 1, 0.00000001, 0.02),
    BCC_ETH(Book.BCC_ETH, 1, 0.00001, 0.02),
    BCD_ETH(Book.BCD_ETH, 0.001, 0.00001, 0.02),
    BCPT_ETH(Book.BCPT_ETH, 1, 0.00000001, 0.02),
    BNB_ETH(Book.BNB_ETH, 1, 0.00000001, 0.02),
    BNT_ETH(Book.BNT_ETH, 0.01, 0.000001, 0.02),
    BQX_ETH(Book.BQX_ETH, 1, 0.0000001, 0.02),
    BRD_ETH(Book.BRD_ETH, 1, 0.0000001, 0.02),
    BTG_ETH(Book.BTG_ETH, 0.01, 0.000001, 0.02),
    BTS_ETH(Book.BTS_ETH, 1, 0.00000001, 0.02),
    CDT_ETH(Book.CDT_ETH, 1, 0.00000001, 0.02),
    CMT_ETH(Book.CMT_ETH, 1, 0.00000001, 0.02),
    CND_ETH(Book.CND_ETH, 1, 0.00000001, 0.02),
    CTR_ETH(Book.CTR_ETH, 1, 0.0000001, 0.02),
    DASH_ETH(Book.DASH_ETH, 0.001, 0.00001, 0.02),
    DGD_ETH(Book.DGD_ETH, 0.001, 0.00001, 0.02),
    DLT_ETH(Book.DLT_ETH, 1, 0.00000001, 0.02),
    DNT_ETH(Book.DNT_ETH, 1, 0.00000001, 0.02),
    EDO_ETH(Book.EDO_ETH, 1, 0.000001, 0.02),
    ELF_ETH(Book.ELF_ETH, 1, 0.00000001, 0.02),
    ENG_ETH(Book.ENG_ETH, 1, 0.0000001, 0.02),
    ENJ_ETH(Book.ENJ_ETH, 1, 0.00000001, 0.02),
    EOS_ETH(Book.EOS_ETH, 0.01, 0.000001, 0.02),
    ETC_ETH(Book.ETC_ETH, 0.01, 0.000001, 0.02),
    EVX_ETH(Book.EVX_ETH, 1, 0.0000001, 0.02),
    FUEL_ETH(Book.FUEL_ETH, 1, 0.00000001, 0.02),
    FUN_ETH(Book.FUN_ETH, 1, 0.00000001, 0.02),
    GTO_ETH(Book.GTO_ETH, 1, 0.00000001, 0.02),
    GVT_ETH(Book.GVT_ETH, 0.01, 0.000001, 0.02),
    GXS_ETH(Book.GXS_ETH, 0.01, 0.000001, 0.02),
    HSR_ETH(Book.HSR_ETH, 0.01, 0.000001, 0.02),
    ICN_ETH(Book.ICN_ETH, 1, 0.0000001, 0.02),
    ICX_ETH(Book.ICX_ETH, 0.01, 0.000001, 0.02),
    INS_ETH(Book.INS_ETH, 1, 0.000001, 0.02),
    IOTA_ETH(Book.IOTA_ETH, 1, 0.00000001, 0.02),
    KMD_ETH(Book.KMD_ETH, 1, 0.000001, 0.02),
    KNC_ETH(Book.KNC_ETH, 1, 0.0000001, 0.02),
    LEND_ETH(Book.LEND_ETH, 1, 0.00000001, 0.02),
    LINK_ETH(Book.LINK_ETH, 1, 0.00000001, 0.02),
    LRC_ETH(Book.LRC_ETH, 1, 0.00000001, 0.02),
    LSK_ETH(Book.LSK_ETH, 0.01, 0.000001, 0.02),
    LTC_ETH(Book.LTC_ETH, 0.001, 0.00001, 0.02),
    LUN_ETH(Book.LUN_ETH, 1, 0.000001, 0.02),
    MANA_ETH(Book.MANA_ETH, 1, 0.00000001, 0.02),
    MCO_ETH(Book.MCO_ETH, 0.01, 0.000001, 0.02),
    MDA_ETH(Book.MDA_ETH, 1, 0.0000001, 0.02),
    MOD_ETH(Book.MOD_ETH, 1, 0.000001, 0.02),
    MTH_ETH(Book.MTH_ETH, 1, 0.00000001, 0.02),
    MTL_ETH(Book.MTL_ETH, 1, 0.000001, 0.02),
    NAV_ETH(Book.NAV_ETH, 1, 0.000001, 0.02),
    NEBL_ETH(Book.NEBL_ETH, 1, 0.000001, 0.02),
    NEO_ETH(Book.NEO_ETH, 0.01, 0.00000001, 0.02),
    NULS_ETH(Book.NULS_ETH, 1, 0.00000001, 0.02),
    OAX_ETH(Book.OAX_ETH, 1, 0.0000001, 0.02),
    OMG_ETH(Book.OMG_ETH, 0.01, 0.000001, 0.02),
    OST_ETH(Book.OST_ETH, 1, 0.00000001, 0.02),
    POE_ETH(Book.POE_ETH, 1, 0.00000001, 0.02),
    POWR_ETH(Book.POWR_ETH, 1, 0.00000001, 0.02),
    PPT_ETH(Book.PPT_ETH, 1, 0.000001, 0.02),
    QSP_ETH(Book.QSP_ETH, 1, 0.00000001, 0.02),
    QTUM_ETH(Book.QTUM_ETH, 0.01, 0.000001, 0.02),
    RCN_ETH(Book.RCN_ETH, 1, 0.00000001, 0.02),
    RDN_ETH(Book.RDN_ETH, 1, 0.0000001, 0.02),
    REQ_ETH(Book.REQ_ETH, 1, 0.00000001, 0.02),
    RLC_ETH(Book.RLC_ETH, 1, 0.000001, 0.02),
    SALT_ETH(Book.SALT_ETH, 0.01, 0.000001, 0.02),
    SNGLS_ETH(Book.SNGLS_ETH, 1, 0.00000001, 0.02),
    SNM_ETH(Book.SNM_ETH, 1, 0.00000001, 0.02),
    SNT_ETH(Book.SNT_ETH, 1, 0.00000001, 0.02),
    STORJ_ETH(Book.STORJ_ETH, 1, 0.0000001, 0.02),
    STRAT_ETH(Book.STRAT_ETH, 0.01, 0.000001, 0.02),
    SUB_ETH(Book.SUB_ETH, 1, 0.00000001, 0.02),
    TNB_ETH(Book.TNB_ETH, 1, 0.00000001, 0.02),
    TNT_ETH(Book.TNT_ETH, 1, 0.00000001, 0.02),
    TRIG_ETH(Book.TRIG_ETH, 1, 0.000001, 0.02),
    TRX_ETH(Book.TRX_ETH, 1, 0.00000001, 0.02),
    VEN_ETH(Book.VEN_ETH, 1, 0.00000001, 0.02),
    VIB_ETH(Book.VIB_ETH, 1, 0.00000001, 0.02),
    VIBE_ETH(Book.VIBE_ETH, 1, 0.0000001, 0.02),
    WABI_ETH(Book.WABI_ETH, 1, 0.00000001, 0.02),
    WAVES_ETH(Book.WAVES_ETH, 0.01, 0.000001, 0.02),
    WINGS_ETH(Book.WINGS_ETH, 1, 0.0000001, 0.02),
    WTC_ETH(Book.WTC_ETH, 0.01, 0.000001, 0.02),
    XLM_ETH(Book.XLM_ETH, 1, 0.00000001, 0.02),
    XMR_ETH(Book.XMR_ETH, 1, 0.00001, 0.02),
    XRP_ETH(Book.XRP_ETH, 1, 0.00000001, 0.02),
    XVG_ETH(Book.XVG_ETH, 1, 0.00000001, 0.02),
    XZC_ETH(Book.XZC_ETH, 0.01, 0.000001, 0.02),
    YOYO_ETH(Book.YOYO_ETH, 1, 0.00000001, 0.02),
    ZEC_ETH(Book.ZEC_ETH, 0.001, 0.00001, 0.02),
    ZRX_ETH(Book.ZRX_ETH, 1, 0.00000001, 0.02),
    BCC_USDT(Book.BCC_USDT, 0.000001, 0.01, 20),
    BNB_USDT(Book.BNB_USDT, 0.01, 0.0001, 20),
    BTC_USDT(Book.BTC_USDT, 0.00001, 0.01, 20),
    ETH_USDT(Book.ETH_USDT, 0.00001, 0.01, 20),
    LTC_USDT(Book.LTC_USDT, 0.00001, 0.01, 20),
    NEO_USDT(Book.NEO_USDT, 0.001, 0.001, 20),;

    private final Book book;
    private final double minMajorQty;
    private final double minMinorQty;
    private final double minOrderValue;

    TradeRule(final Book book, final double minMajorQty, final double minMinorQty, final double minOrderValue) {
        this.book = book;
        this.minMajorQty = minMajorQty;
        this.minMinorQty = minMinorQty;
        this.minOrderValue = minOrderValue;
    }

    public Book getBook() {
        return this.book;
    }

    /**
     * @return The minimum amount of the {@code major} currency which must be traded per order.
     */
    public double getMinMajorQty() {
        return this.minMajorQty;
    }

    /**
     * @return The minimum amount of the {@code minor} currency which must be traded per order.
     */
    public double getMinMinorQty() {
        return this.minMinorQty;
    }

    /**
     * Equivalent to {@code (MINOR_QTY)/(MAJOR_QTY)}.
     * <br/>
     * Units measured in the {@code minor} currency.
     */
    public double getMinOrderValue() {
        return this.minOrderValue;
    }

    @Override public String toString() {
        return this.name() + "["
                + "Min_Major_QTY:" + getMinMajorQty()
                + "Min_Minor_QTY:" + getMinMinorQty()
                + "Min_Order_VAL:" + getMinOrderValue()
                + "]";
    }

    public static List<TradeRule> forMinorCurrency(final Currency minor) {
        return Arrays.stream(TradeRule.values())
            .filter(tradeRule -> tradeRule.getBook().getMinor().equals(minor))
            .collect(Collectors.toList());
    }

    public static List<TradeRule> forMajorCurrency(final Currency major) {
        return Arrays.stream(TradeRule.values())
                .filter(tradeRule -> tradeRule.getBook().getMajor().equals(major))
                .collect(Collectors.toList());
    }

    public static Optional<TradeRule> forBook(final Book book) {
        return Arrays.stream(TradeRule.values())
                .filter(tradeRule -> tradeRule.getBook().equals(book))
                .findAny();
    }
}
