package Main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {
	
	   public static void main(String[] args) {
	        SpringApplication.run(Application.class, args);
	    }
	   
	   @Bean
		public CommandLineRunner demo(ContactRepository repository) {
			return (args) -> {
				// save a couple of contact(insert into)
				repository.save(new Contact("Antoine", "BOUDINOT", "0666666666", "boudinot.baleine@boudine.com"));
			};
		}
}
