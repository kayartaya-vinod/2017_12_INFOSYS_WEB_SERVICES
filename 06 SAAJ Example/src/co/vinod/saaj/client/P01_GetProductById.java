package co.vinod.saaj.client;

import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPMessage;

/*
<Envelope xmlns="http://schemas.xmlsoap.org/soap/envelope/">
   <Body>
      <m:getById xmlns:m="http://vinod.co/ws">
         <id>81</id>
      </m:getById>
   </Body>
</Envelope> 
  
 */
public class P01_GetProductById {

	public static void main(String[] args) throws Exception {
		MessageFactory factory = MessageFactory.newInstance();
		SOAPMessage msg = factory.createMessage();

		SOAPBody body = msg.getSOAPBody();

		SOAPFactory soapFactory = SOAPFactory.newInstance();
		Name methodElem = soapFactory.createName("getById", "m", "http://vinod.co/ws");

		Name idElem = soapFactory.createName("id");

		SOAPBodyElement bodyElement = body.addBodyElement(methodElem);
		SOAPElement x = bodyElement.addChildElement(idElem);
		x.addTextNode("25");

		// msg.writeTo(System.out);

		SOAPConnectionFactory connFactory = SOAPConnectionFactory.newInstance();
		SOAPConnection conn = connFactory.createConnection();

		String endpointAddress = "http://localhost:8080/infosys.training/ws/product-service";
		SOAPMessage response = conn.call(msg, endpointAddress);
		response.writeTo(System.out);
	}
}
