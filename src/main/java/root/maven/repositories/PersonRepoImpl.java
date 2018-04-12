package root.maven.repositories;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import root.maven.models.Person;

@Component
public class PersonRepoImpl implements PersonRepo {

	@Override
	@Cacheable(
			value ="personByName"
			//,key ="#name" // optional
			, unless = "#result == null" // this is to cache only those whose getByName is not null
			)
	public Person getByName(String name) {
		delay();
		/*
		 * This condition is place here 
		 * to check cache does not cache if getByName returns null
		 * -- using unless decorator of @Cacheable
		 * -- #result == null , it is spring expression language notifified by #result 
		 * -- #result is return value of below method
		 * 
		 */
		if(Integer.parseInt(name) %2 ==0) {
			System.out.println("not cached");
			return null;
		}else {
			return new Person(name,"dataaaaaa");
		}
	}
	
	
	
	@Override
	@CachePut(value ="personByName")
	public Person update(String name) {
		System.out.println("update-start");
		delay();
		System.out.println("delete-end");
		return null;
	}

	@Override
	@CacheEvict(value ="personByName")
	public void delete(String name) {
		System.out.println("delete-start");
		delay();
		System.out.println("delete-end");
	}



	private void delay() {
		System.out.println("delay- start");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("delay- end");
	}
	
	

}
