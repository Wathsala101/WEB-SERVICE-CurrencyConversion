package com.sltc.soa.currency.ws;

import com.sltc.soa.currency.service.CurrencyConversionService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

/**
 * Created by IntelliJ IDEA.<br/>
 * User: Thilanka<br/>
 * Date: 12/20/2022<br/>
 * Time: 9:57 PM<br/>
 * To change this template use File | Settings | File Templates.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class CurrencyConversionWs {

    @WebMethod
    public double convert(double amountInSourceCurrency, String sourceCurrency, String targetCurrency) {
        CurrencyConversionService service = new CurrencyConversionService();
        return service.convert(amountInSourceCurrency, sourceCurrency, targetCurrency);
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8888/CurrencyConversionService", new CurrencyConversionWs());
    }
}