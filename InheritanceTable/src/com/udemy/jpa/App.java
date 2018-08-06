package com.udemy.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("personal_jpa");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		
		TypedQuery<Person> query = entityManager.createNamedQuery("person.getPersonByName", Person.class);
		query.setParameter("name", "Adam");
		
		List<Person> people = query.getResultList();
		
		for(Person p : people){
			System.out.println(p);
		}

//		Query query = entityManager.createNativeQuery("SELECT * FROM PERSON_TABLE WHERE age BETWEEN 20 AND 30", Person.class);
//		
//		List<Person> people = (List<Person>) query.getResultList();
//		
//		for(Person p : people){
//			System.out.println(p);
//		}

		entityManager.close();
		entityManagerFactory.close();

	}
}
