package com.clementlee.contentcalendar;

import com.clementlee.contentcalendar.model.Content;
import com.clementlee.contentcalendar.model.Status;
import com.clementlee.contentcalendar.model.Type;
import com.clementlee.contentcalendar.respository.ContentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	// "CommandLineRunner" runs after dependency injection as the application started
	// Suitable for data loading
	@Bean
	CommandLineRunner commandLineRunner(ContentRepository repository){
		return args -> {
			// insert data into database after SpringBoot application started
			Content content = new Content (null,
					"Hello Chat GPT",
					"All about Chat GPT",
					Status.IDEA,
					Type.VIDEO,
					LocalDateTime.now(),
					null,
					"");

			repository.save(content);
		};
	}

}
