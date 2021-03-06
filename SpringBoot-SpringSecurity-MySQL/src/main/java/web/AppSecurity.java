package web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("web.mapper")
@SpringBootApplication
public class AppSecurity {
	public static void main(String[] args) {
		SpringApplication.run(AppSecurity.class, args);
	}
}
