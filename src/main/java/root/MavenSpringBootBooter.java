package root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import root.maven.repositories.PersonRepo;
@EnableCaching
@SpringBootApplication
public class MavenSpringBootBooter implements CommandLineRunner {

	@Autowired
	private PersonRepo personRepo;
	
	public static void main(String[] args) {
		System.out.println("------------------>>>>>main");
		SpringApplication.run(MavenSpringBootBooter.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("--------------->>>>>>>>>run");
		System.out.println(personRepo.getByName("name1"));
		System.out.println(personRepo.getByName("name1"));
		System.out.println(personRepo.getByName("name1"));
		System.out.println(personRepo.getByName("name2"));
		System.out.println(personRepo.getByName("name5"));*/
	}
}