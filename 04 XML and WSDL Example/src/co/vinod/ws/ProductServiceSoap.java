
package co.vinod.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductServiceSoap", targetNamespace = "http://vinod.co/ws")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductServiceSoap {


    /**
     * 
     * @param id
     * @return
     *     returns co.vinod.ws.Product
     */
    @WebMethod
    @WebResult(name = "product", targetNamespace = "")
    @RequestWrapper(localName = "getById", targetNamespace = "http://vinod.co/ws", className = "co.vinod.ws.GetById")
    @ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://vinod.co/ws", className = "co.vinod.ws.GetByIdResponse")
    public Product getById(
        @WebParam(name = "id", targetNamespace = "")
        int id);

}
