package com.sltc.soa.client;

import com.sltc.soa.client.stub.CurrencyConversionWs;
import com.sltc.soa.client.stub.CurrencyConversionWsService;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thilanka<br/>
 * Date: 12/20/2022<br/>
 * Time: 10:31 PM<br/>
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyConversion {
    public static void main(String[] args) {
        CurrencyConversionWsService currencyConversionWsService = new CurrencyConversionWsService();
        CurrencyConversionWs currencyConversionWs = currencyConversionWsService.getCurrencyConversionWsPort();

        Scanner scan = new Scanner(System.in);
        System.out.println("Source Currency: ");
        String source_currency = scan.next();
        System.out.println("Amount: ");
        double amount = scan.nextDouble();
        System.out.println("Target Currency: ");
        String target_currency = scan.next();

        double a = currencyConversionWs.convert(amount,source_currency,target_currency);

        System.out.println("===================");
        System.out.println("Amount = "+a);
        System.out.println("===================");

    }
}