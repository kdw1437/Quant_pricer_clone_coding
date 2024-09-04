package com.quant.pricer.service.pricer;

public class PricingFactory {

    //static method
    public static AbstractPricerFactory getPricer(String priceId) {

        switch (priceId) {
            case "StepDown":
                return new StepDownPricingFactory();
            default:
                return null;
        }
    }
}
