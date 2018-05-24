package co.vinod.ws;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

public class LogMessageHandler implements SOAPHandler<SOAPMessageContext> {

	public LogMessageHandler() {
		System.out.println("New instaceof LogMessageHandler created!");
	}
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		
		boolean isOutbound = (boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		if(isOutbound){
			// returning the response to the client
			System.out.println("From inside of LogMessageHandler.handleMessage(..) returning to the client..");
		}
		else {
			System.out.println("From inside of LogMessageHandler.handleMessage(..) towards the endpoint..");
		}
		
		
		try {
			SOAPMessage msg = context.getMessage();
			msg.writeTo(System.out);
			System.out.println();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		return false;
	}

	@Override
	public void close(MessageContext context) {
		
	}

	@Override
	public Set<QName> getHeaders() {
		return null;
	}

}
