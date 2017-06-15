package com.cxf.ws.saop.client;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JInInterceptor;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import com.java.cxf.soap.ws.Amount;
import com.java.cxf.soap.ws.AmountServiceImplService;

public class AmountServiceClient {

	public static void main(String[] args) {
		
		try {
			AmountServiceImplService amountService = new AmountServiceImplService(new URL("http://localhost:8080/cxfsoapws/services/amountservice?wsdl"));
			Amount amountServiceImplPort = amountService.getAmountServiceImplPort();
			Client client = ClientProxy.getClient(amountServiceImplPort);
			org.apache.cxf.endpoint.Endpoint endpoint = client.getEndpoint();
			
			Map<String, Object> properties = new HashMap<>();
			
			properties.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
			properties.put(WSHandlerConstants.USER, "baba");
			properties.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
			properties.put(WSHandlerConstants.PW_CALLBACK_CLASS, PasswordCallBackHandler.class.getName());
			
			
			WSS4JOutInterceptor wss4jOutInterceptor = new WSS4JOutInterceptor(properties);
			
			endpoint.getOutInterceptors().add(wss4jOutInterceptor);
			Integer addAmount = amountServiceImplPort.addAmount(12);
			System.out.println(addAmount);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
