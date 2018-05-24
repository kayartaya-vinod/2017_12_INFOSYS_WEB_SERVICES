package co.vinod.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import co.vinod.dao.DaoException;
import co.vinod.dao.ProductDao;
import co.vinod.ws.Product;

@SuppressWarnings("unchecked")
public class ProductDaoHibernateImpl implements ProductDao {

	private SessionFactory factory;

	public ProductDaoHibernateImpl(SessionFactory factory) {
		this.factory = factory;
	}

	@Override
	public Integer add(Product product) throws DaoException {
		try {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.persist(product);
			tx.commit();
			session.close();
			return product.getId();
		} catch (Exception e) {
			throw new DaoException(e);
		}

	}

	@Override
	public Product get(Integer id) throws DaoException {
		try {
			Session session = factory.openSession();
			Product product = (Product) session.get(Product.class, id);
			session.close();
			return product;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public Product update(Product product) throws DaoException {
		try {
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			session.merge(product);
			tx.commit();
			session.close();
			return product;
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public void delete(Integer id) throws DaoException {
		try {
			Session session = factory.openSession();
			Product product = (Product) session.get(Product.class, id);
			if (product != null) {
				Transaction tx = session.beginTransaction();
				session.delete(product);
				tx.commit();
				session.close();
			} else {
				session.close();
				throw new DaoException("Invalid product id!");
			}
		} catch (Exception e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getAll() throws DaoException {
		try {
			Session session = factory.openSession();
			String hql = "from Product";
			Query qry = session.createQuery(hql);
			List<Product> list = qry.list();
			session.close();
			return list;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getByPrice(Double min, Double max) throws DaoException {
		try {
			Session session = factory.openSession();
			String hql = "from Product where unitPrice between :min and :max";
			Query qry = session.createQuery(hql);
			qry.setParameter("min", min);
			qry.setParameter("max", max);
			List<Product> list = qry.list();
			session.close();
			return list;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getByBrand(String brand) throws DaoException {
		try {
			Session session = factory.openSession();
			String hql = "from Product where brand.name = :brand";
			Query qry = session.createQuery(hql);
			qry.setParameter("brand", brand);
			List<Product> list = qry.list();
			session.close();
			return list;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public List<Product> getByCategory(String category) throws DaoException {
		try {
			Session session = factory.openSession();
			String hql = "from Product where category.name = :category";
			Query qry = session.createQuery(hql);
			qry.setParameter("category", category);

			List<Product> list = qry.list();
			session.close();
			return list;
		} catch (HibernateException e) {
			throw new DaoException(e);
		}
	}

}
