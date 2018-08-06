package jpa_callbacks_and_listeners;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 

public class App {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal_jpa");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();  
		
		Article article = new Article("Albert Einstein - Relativity");
		
		entityManager.persist(article);
		
		entityManager.getTransaction().commit(); 
		entityManager.close();
		entityManagerFactory.close();
	}

}
