package com.Shivam;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	static EntityManager entityM;
	private static final EntityManagerFactory factory;
	private static final String PERSISTENCE_UNIT_NAME = "BookUnit";

	static {
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	public static void main(String[] args) {
		entityM = factory.createEntityManager();

		entityM.getTransaction().begin();
		Student obj = new Student();
		obj.setid(1);
		obj.setName("Shivam Barekar");
		obj.setCity("Nagpur");
		obj.setContact("7038229942");
		obj.setGraduation_Percentage("78.98%");
		entityM.persist(obj);
		entityM.getTransaction().commit();
		entityM.close();
		factory.close();

	}
}
