package jpa_callbacks_and_listeners;

import java.util.Date;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;

public class ArticleListener {

	@PrePersist
	public void beforePersist(Article article){
		article.setDate(new Date());
		System.out.println("Before persist article...");
	}
	
	@PostPersist
	public void afterPersist(Article article){
		System.out.println("After persist article...");
	}
}
