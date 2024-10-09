package com.tutorial.apdemo.spring.boot.database;

import com.tutorial.apdemo.spring.boot.Model.ProductRepository;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
public class Database {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(Database.class);
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
       return new CommandLineRunner() {
           @Override
           public void run(String... args) throws Exception {
               ProductRepository productA = new ProductRepository(1l, "Mac", 2024,24000,"");
               ProductRepository productB = new ProductRepository(2l, "Mac", 2024,24000,"");
              logger.info("insert data: " + productRepository.save(productA));
              logger.info("insert data: " + productRepository.save(productB));
               System.out.println("insert data: " + productRepository.save(productA));
               System.out.println("insert data: " + productRepository.save(productB));
           }
       };
   }
}
