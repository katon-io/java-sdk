package io.katon.api.common.coins;

public class Coin {
    static String contextNetworkId(KatonContext context, Coins coin) {
        switch(coin) {
            case EGLD:
                return Coins.EGLD.getLabel();
            case KTON:
                return context.isProduction ? "KTON-e1626e" : "KTON-2d3372";
            default:
                throw new IllegalArgumentException("The coin given in argument does not exist")
        }
    }
}
