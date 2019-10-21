package cn.mikulove.akane;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class AkaneApplication {

	public static void main(String[] args) {
		SpringApplication.run(AkaneApplication.class, args);
	}

}
