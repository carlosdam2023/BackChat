package edu.carlos.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"edu.carlos.chat.config",
		"edu.carlos.chat.controller",
		"edu.carlos.chat.models",
		"edu.carlos.chat.services",
})
@EnableMongoRepositories(basePackages = "edu.carlos.chat.repositories")
public class ChatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}

}
