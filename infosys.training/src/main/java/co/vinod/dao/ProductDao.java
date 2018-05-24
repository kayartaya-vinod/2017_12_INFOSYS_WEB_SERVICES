package co.vinod.dao;

import java.util.List;

import co.vinod.ws.Product;

public interface ProductDao {
	public Integer add(Product product) throws DaoException;

	public Product get(Integer id) throws DaoException;

	public Product update(Product product) throws DaoException;

	public void delete(Integer id) throws DaoException;

	public List<Product> getAll() throws DaoException;

	public List<Product> getByPrice(Double min, Double max) throws DaoException;

	public List<Product> getByBrand(String brand) throws DaoException;

	public List<Product> getByCategory(String category) throws DaoException;

}
