package co.vinod.ws.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import co.vinod.dao.DaoException;
import co.vinod.dao.DaoFactory;
import co.vinod.dao.ProductDao;
import co.vinod.ws.Product;
import co.vinod.ws.ProductServiceSoap;

@WebService(name = "ProductServiceSoap", targetNamespace = "http://vinod.co/ws")
public class ProductServiceEndpoint implements ProductServiceSoap {
	ProductDao dao;

	public ProductServiceEndpoint() {
		dao = DaoFactory.getProductDao();
	}

	@Override
	@WebMethod
	@WebResult(name = "product", targetNamespace = "")
	@RequestWrapper(localName = "getById", targetNamespace = "http://vinod.co/ws", className = "co.vinod.ws.GetById")
	@ResponseWrapper(localName = "getByIdResponse", targetNamespace = "http://vinod.co/ws", className = "co.vinod.ws.GetByIdResponse")
	public Product getById(@WebParam(name = "id", targetNamespace = "") int id) {

		try {
			return dao.get(id);
		} catch (DaoException e) {
			e.printStackTrace();
			return null;
		}
	}

}
