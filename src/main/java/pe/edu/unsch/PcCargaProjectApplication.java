package pe.edu.unsch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("pe.edu.unsch")
@EnableAutoConfiguration
public class PcCargaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcCargaProjectApplication.class, args);
	}

}
