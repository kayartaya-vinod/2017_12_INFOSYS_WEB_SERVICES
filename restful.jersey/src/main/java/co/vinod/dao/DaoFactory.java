package co.vinod.dao;

import org.hibernate.SessionFactory;

import co.vinod.dao.impl.ProductDaoHibernateImpl;
import co.vinod.utils.HibernateUtil;

public final class DaoFactory {
	private static SessionFactory factory = null;

	private DaoFactory() {
	}

	public static ProductDao getProductDao() {
		factory = HibernateUtil.getSessionFactory();
		return new ProductDaoHibernateImpl(factory);
	}

	public static void releaseResources() {
		if (factory != null) {
			factory.close();
		}
	}
}
