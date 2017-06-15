package com.cxf.ws.saop.client;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;

public class PasswordCallBackHandler implements CallbackHandler {

	@Override
	public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
		for (Callback callback : callbacks) {
			WSPasswordCallback passwordcallback = (WSPasswordCallback) callback;
			
			if (passwordcallback.getIdentifier().equals("baba")) {
				passwordcallback.setPassword("prakash");
			}
		}
	}
}
