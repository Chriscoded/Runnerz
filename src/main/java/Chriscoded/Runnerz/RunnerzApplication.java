package Chriscoded.Runnerz;


import Chriscoded.Runnerz.user.User;
import Chriscoded.Runnerz.user.UserRestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class RunnerzApplication {
	private static final Logger log =  LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
		//log.info("Application has started successfully");
	}

//	//Command line runner runs after the application have started
	@Bean
    CommandLineRunner runner (UserRestClient client){
		return args -> {

            List<User> users = client.findAll();
            System.out.println(users);
            log.info("Users {}", users);
            
            User user = client.findById(1);
            System.out.println(user);
            log.info("User {}", user);


//			log.info("Application started");
//			Run run = new Run(1,"First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR );
//			log.info("Run " + run);
//
//			runRepository.create(run);
		};
	}


}
