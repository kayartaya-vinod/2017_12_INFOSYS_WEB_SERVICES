package co.vinod.ws.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import co.vinod.ws.Brand;
import co.vinod.ws.Product;
import co.vinod.ws.ProductServiceSoap;

@WebService(name = "ProductServiceSoap", targetNamespace = "http://vinod.co/ws")
public class ProductServiceEndpoint implements ProductServiceSoap {

	@Override
	@WebMethod
    @WebResult(name = "product", targetNamespace = "")
    @RequestWrapper(localName = "getById", targetNamespace = "http://vinod.co/ws", className = "co.vinod.ws.GetById")
    @ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://vinod.co/ws", className = "co.vinod.ws.GetByIdResponse")
    public Product getById(
        @WebParam(name = "id", targetNamespace = "")
        int id) {
	
		// later we will get the data from the db and return the product
		// for the time being return a new product instance
		
		Product p = new Product();
		p.setId(id);
		p.setName("Test name");
		p.setDescription("Test desc");
		p.setBrand(new Brand());
		p.getBrand().setId(1);
		p.getBrand().setName("Test Brand");
		p.setUnitPrice(12.34);
		p.setDiscount(0.0);
		p.setQuantityPerUnit("Test QPU");
		
		
		return p;
	}

}
