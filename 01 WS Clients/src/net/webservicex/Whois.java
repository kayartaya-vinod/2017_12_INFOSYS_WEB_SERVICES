
package net.webservicex;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "whois", targetNamespace = "http://www.webservicex.net", wsdlLocation = "http://www.webservicex.net/whois.asmx?WSDL")
public class Whois
    extends Service
{

    private final static URL WHOIS_WSDL_LOCATION;
    private final static WebServiceException WHOIS_EXCEPTION;
    private final static QName WHOIS_QNAME = new QName("http://www.webservicex.net", "whois");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://www.webservicex.net/whois.asmx?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WHOIS_WSDL_LOCATION = url;
        WHOIS_EXCEPTION = e;
    }

    public Whois() {
        super(__getWsdlLocation(), WHOIS_QNAME);
    }

    public Whois(WebServiceFeature... features) {
        super(__getWsdlLocation(), WHOIS_QNAME, features);
    }

    public Whois(URL wsdlLocation) {
        super(wsdlLocation, WHOIS_QNAME);
    }

    public Whois(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WHOIS_QNAME, features);
    }

    public Whois(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Whois(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WhoisSoap
     */
    @WebEndpoint(name = "whoisSoap")
    public WhoisSoap getWhoisSoap() {
        return super.getPort(new QName("http://www.webservicex.net", "whoisSoap"), WhoisSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WhoisSoap
     */
    @WebEndpoint(name = "whoisSoap")
    public WhoisSoap getWhoisSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.webservicex.net", "whoisSoap"), WhoisSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WHOIS_EXCEPTION!= null) {
            throw WHOIS_EXCEPTION;
        }
        return WHOIS_WSDL_LOCATION;
    }

}
