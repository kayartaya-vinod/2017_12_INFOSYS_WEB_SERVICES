package co.vinod.utils;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import co.vinod.ws.Brand;
import co.vinod.ws.Category;
import co.vinod.ws.Product;

public class HibernateUtil {
	static StandardServiceRegistry serviceRegistry;

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		configuration.configure();
		Properties props = configuration.getProperties();
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(props).build();

		configuration.addAnnotatedClass(Brand.class);
		configuration.addAnnotatedClass(Product.class);
		configuration.addAnnotatedClass(Category.class);

		return configuration.buildSessionFactory(serviceRegistry);
	}

}