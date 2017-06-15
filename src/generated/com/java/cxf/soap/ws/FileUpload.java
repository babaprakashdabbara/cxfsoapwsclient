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
 * 2017-06-15T06:13:19.219+02:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://ws.soap.cxf.java.com/", name = "FileUpload")
@XmlSeeAlso({ObjectFactory.class})
public interface FileUpload {

    @WebMethod
    @RequestWrapper(localName = "downloadFile", targetNamespace = "http://ws.soap.cxf.java.com/", className = "com.java.cxf.soap.ws.DownloadFile")
    @ResponseWrapper(localName = "downloadFileResponse", targetNamespace = "http://ws.soap.cxf.java.com/", className = "com.java.cxf.soap.ws.DownloadFileResponse")
    @WebResult(name = "return", targetNamespace = "")
    public byte[] downloadFile();

    @WebMethod
    @RequestWrapper(localName = "uploadFile", targetNamespace = "http://ws.soap.cxf.java.com/", className = "com.java.cxf.soap.ws.UploadFile")
    @ResponseWrapper(localName = "uploadFileResponse", targetNamespace = "http://ws.soap.cxf.java.com/", className = "com.java.cxf.soap.ws.UploadFileResponse")
    public void uploadFile(
        @WebParam(name = "arg0", targetNamespace = "")
        byte[] arg0
    );
}
