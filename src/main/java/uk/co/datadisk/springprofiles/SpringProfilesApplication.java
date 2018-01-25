package uk.co.datadisk.springprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import uk.co.datadisk.springprofiles.controllers.DatabaseController;

@SpringBootApplication
public class SpringProfilesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringProfilesApplication.class, args);

		System.out.println(ctx.getBean(DatabaseController.class).getDbConnectionDetails());
	}
}