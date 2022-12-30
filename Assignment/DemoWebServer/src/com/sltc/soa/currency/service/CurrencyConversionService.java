package com.sltc.soa.currency.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thilanka<br/>
 * Date: 12/21/2022<br/>
 * Time: 9:24 AM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyConversionService {

    private static Map<String, Double> rates = new HashMap<>();

    private static final String baseCurrency = "USD";

    static {
        init();
    }

    private static void init() {
        rates.put("AED", 3.6732);
        rates.put("SGD", 1.33976);
        rates.put("USD", 1.0);
        rates.put("AFN", 77.050008);
        rates.put("ALL", 103.68506);
        rates.put("AMD", 481.616228);
        rates.put("ANG",1.795336);
        rates.put("AOA", 654.817);
        rates.put("ARS", 81.308621);
        rates.put("AUD", 1.35885);
        rates.put("AWG", 1.8);
        rates.put("AZN", 1.7025);
        rates.put("BAM", 1.63183);
        rates.put("BBD", 2.0);
        rates.put("BDT", 84.820901);
        rates.put("BGN", 1.638754);
        rates.put("BHD", 0.377047);
        rates.put("BIF", 1942.067684);
        rates.put("BMD", 1.0);
        rates.put("BND", 1.337283);
        rates.put("BOB", 6.896333);
        rates.put("BRL", 5.3326);
        rates.put("BSD",1.0);
        rates.put("BTC", 0.000050883602);
        rates.put("BTN", 73.955366);
        rates.put("BWP", 11.045764);
        rates.put("BYN", 2.590297);
        rates.put("BZD", 2.016103);
        rates.put("CAD", 1.299149);
        rates.put("CDF", 1967.998483);
        rates.put("CHF", 0.908343);
        rates.put("CLF", 0.027612);
        rates.put("CLP", 761.901298);
        rates.put("CNH", 6.579093);
        rates.put("CNY", 6.5789);
        rates.put("COP", 3622.097235);
        rates.put("CRC", 603.954355);
        rates.put("CUC", 1.000209);
        rates.put("CUP", 25.75);
        rates.put("CVE", 92.25);
        rates.put("CZK", 22.0117);
        rates.put("DJF", 178.04543);
        rates.put("DKK", 6.235367);
        rates.put("DOP", 58.126556);
        rates.put("DZD", 129.204088);
        rates.put("EGP", 15.6547);
        rates.put("ERN", 14.999872);
        rates.put("ETB", 38.159345);
        rates.put("EUR", 0.8377);
        rates.put("FJD", 2.07515);
        rates.put("FKP", 0.749906);
        rates.put("GBP", 0.749906);
        rates.put("GEL", 3.335);
        rates.put("GGP", 0.749906);
        rates.put("GHS", 5.861083);
        rates.put("GIP", 0.749906);
        rates.put("GMD", 51.8);
        rates.put("GNF", 9835.268744);
        rates.put("GTQ", 7.818948);
        rates.put("GYD", 209.569954);
        rates.put("HKD", 7.75142);
        rates.put("HNL", 24.261522);
        rates.put("HRK", 6.3283);
        rates.put("HTG", 66.179967);
        rates.put("HUF", 300.77);
        rates.put("IDR", 14105.403438);
        rates.put("ILS", 3.305165);
        rates.put("IMP", 0.749906);
        rates.put("INR", 74.000545);
        rates.put("IQD", 1192.820675);
        rates.put("IRR", 42105.0);
        rates.put("ISK", 133.03);
        rates.put("JEP", 0.749906);
        rates.put("JMD", 146.642194);
        rates.put("JOD", 0.709);
        rates.put("JPY", 104.307);
        rates.put("KES", 110.1);
        rates.put("KGS", 84.7986);
        rates.put("KHR", 4061.970289);
        rates.put("KMF", 412.250037);
        rates.put("KPW", 900.0);
        rates.put("KRW", 1110.01);
        rates.put("KWD", 0.305399);
        rates.put("KYD", 0.833507);
        rates.put("KZT", 425.772953);
        rates.put("LAK", 9275.558309);
        rates.put("LBP", 1515.335981);
        rates.put("LKR", 365.60);
        rates.put("LRD", 157.499967);
        rates.put("LSL", 15.389181);
        rates.put("LYD", 1.355);
        rates.put("MAD", 9.083784);
        rates.put("MDL", 17.195519);
        rates.put("MGA", 3783.43811);
        rates.put("MKD", 51.645807);
        rates.put("MMK", 1315.248254);
        rates.put("MNT", 2854.831181);
        rates.put("MOP", 7.985649);
        rates.put("MRO", 357.00);
        rates.put("MRU", 37.16);
        rates.put("MUR", 39.849215);
        rates.put("MVR", 15.41);
        rates.put("MWK", 763.604016);
        rates.put("MXN", 20.163212);
        rates.put("MYR", 4.074);
        rates.put("MZN", 74.231998);
        rates.put("NAD", 15.43);
        rates.put("NGN", 383.278728);
        rates.put("NIO", 34.853771);
        rates.put("NOK", 8.8847);
        rates.put("NPR", 118.328789);
        rates.put("NZD", 1.424685);
        rates.put("OMR", 0.38501);
        rates.put("PAB", 1.000);
        rates.put("PEN", 3.60376);
        rates.put("PGK", 3.520701);
        rates.put("PHP", 48.109536);
        rates.put("PKR", 159.457928);
        rates.put("PLN", 3.752342);
        rates.put("PYG", 7050.860811);
        rates.put("QAR", 3.64075);
        rates.put("RON", 4.0835);
        rates.put("RSD", 98.49);
        rates.put("RUB", 76.44);
        rates.put("RWF", 988.881865);
        rates.put("SAR", 3.750733);
        rates.put("SBD", 8.066615);
        rates.put("SCR", 20.810052);
        rates.put("SDG", 55.325);
        rates.put("SEK", 8.5735);
        rates.put("SHP", 0.749906);
        rates.put("SLL", 10131.136388);
        rates.put("SOS", 580.369719);
        rates.put("SRD", 14.154);
        rates.put("SSP", 130.26);
        rates.put("STD", 20900.544238);
        rates.put("STN", 20.67);
        rates.put("SVC", 8.752242);
        rates.put("SYP", 512.847186);
        rates.put("SZL", 15.281883);
        rates.put("THB", 30.27);
        rates.put("TJS", 11.329606);
        rates.put("TMT", 3.51);
        rates.put("TND", 2.734);
        rates.put("TOP", 2.287117);
        rates.put("TRY", 7.8277);
        rates.put("TTD", 6.794794);
        rates.put("TWD", 28.533199);
        rates.put("TZS", 2319.433675);
        rates.put("UAH", 28.500356);
        rates.put("UGX", 3703.733059);
        rates.put("UYU", 42.640694);
        rates.put("UZS", 10389.69954);
        rates.put("VEF", 248487.642241);
        rates.put("VES", 915980.365);
        rates.put("VND", 23239.023071);
        rates.put("VUV", 111.887732);
        rates.put("WST", 2.571605);
        rates.put("XAF", 549.495179);
        rates.put("XAG", 0.04412479);
        rates.put("XAU", 0.00056218);
        rates.put("XCD", 2.70255);
        rates.put("XDR", 0.70051);
        rates.put("XOF", 549.495179);
        rates.put("XPD", 0.00042075);
        rates.put("XPF", 99.9642);
        rates.put("XPT", 0.00102984);
        rates.put("YER", 250.349961);
        rates.put("ZAR", 15.441171);
        rates.put("ZMW", 21.003963);
        rates.put("ZWL", 322.00);

    }

    public double convert(double amountInSourceCurrency, String sourceCurrency, String targetCurrency) {
        double targetCurrencyRate = rates.get(targetCurrency);
        double sourceCurrencyRate = rates.get(sourceCurrency);

        return (amountInSourceCurrency * targetCurrencyRate) / sourceCurrencyRate;
    }
}