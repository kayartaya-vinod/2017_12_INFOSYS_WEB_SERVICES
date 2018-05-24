package co.vinod.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import co.vinod.dao.DaoException;
import co.vinod.dao.DaoFactory;
import co.vinod.dao.ProductDao;
import co.vinod.entity.Product;

@Path("/products")
public class ProductResource {
	
	private ProductDao dao;
	
	public ProductResource() {
		dao = DaoFactory.getProductDao();
	}
	
	@GET
	@Produces({"application/xml", "application/json"})
	public List<Product> getAll() throws DaoException{
		return dao.getAll();
	}

	@GET
	@Path("/{productId}")
	@Produces({"application/xml", "application/json"})
	public Product getById(@PathParam("productId") Integer id) throws DaoException{
		return dao.get(id);
	}
	
	@POST
	@Produces({"application/xml", "application/json"})
	@Consumes({"application/xml", "application/json"})
	public Product addProduct(Product product) throws DaoException {
		dao.add(product);
		return product;
	}
}








