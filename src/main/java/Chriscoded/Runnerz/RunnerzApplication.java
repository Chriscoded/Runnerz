package Chriscoded.Runnerz;


import Chriscoded.Runnerz.run.Location;
import Chriscoded.Runnerz.run.Run;
import Chriscoded.Runnerz.run.RunRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@SpringBootApplication
public class RunnerzApplication {
	private static final Logger log =  LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
		//log.info("Application has started successfully");
	}

//	//Command line runner runs after the application have started
//	@Bean
//	CommandLineRunner runner (RunRepository runRepository){
//		return args -> {
//			log.info("Application started");
//			Run run = new Run(1,"First Run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 3, Location.OUTDOOR );
//			log.info("Run " + run);
//
//			runRepository.create(run);
//		};
//	}


}
