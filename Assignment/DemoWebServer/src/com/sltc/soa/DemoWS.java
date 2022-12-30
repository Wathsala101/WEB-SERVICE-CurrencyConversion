package com.sltc.soa;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class DemoWS
{

    @WebMethod
    public int addition(int a, int b){
        int result = a + b;
        System.out.println( a + " + " + b + " = " + result);
        return result;
    }
    @WebMethod
    public int substraction(int a, int b){
        int result = a - b;
        System.out.println( a + " - " + b + " = " + result);
        return result;
    }

    public static void main(String[] args){
        Endpoint.publish("http://localhost:8888/DemoWebService", new DemoWS());
    }
}
