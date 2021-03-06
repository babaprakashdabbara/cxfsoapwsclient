package com.java.cxf.soap.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2017-06-15T07:30:05.834+02:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://ws.soap.cxf.java.com/", name = "Amount")
@XmlSeeAlso({ObjectFactory.class})
public interface Amount {

    @WebMethod
    @RequestWrapper(localName = "substractAmount", targetNamespace = "http://ws.soap.cxf.java.com/", className = "com.java.cxf.soap.ws.SubstractAmount")
    @ResponseWrapper(localName = "substractAmountResponse", targetNamespace = "http://ws.soap.cxf.java.com/", className = "com.java.cxf.soap.ws.SubstractAmountResponse")
    @WebResult(name = "totalAmount", targetNamespace = "")
    public java.lang.Integer substractAmount(
        @WebParam(name = "amountToSubstract", targetNamespace = "")
        java.lang.Integer amountToSubstract
    );

    @WebMethod
    @RequestWrapper(localName = "addAmount", targetNamespace = "http://ws.soap.cxf.java.com/", className = "com.java.cxf.soap.ws.AddAmount")
    @ResponseWrapper(localName = "addAmountResponse", targetNamespace = "http://ws.soap.cxf.java.com/", className = "com.java.cxf.soap.ws.AddAmountResponse")
    @WebResult(name = "totalAmount", targetNamespace = "")
    public java.lang.Integer addAmount(
        @WebParam(name = "amountToAdd", targetNamespace = "")
        java.lang.Integer amountToAdd
    );
}
