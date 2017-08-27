package net.nonego.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("net.nonego.blog.inter")
public class BlogServer {
	public static void main(String[] args) {
		SpringApplication.run(BlogServer.class, args);
	}
}
