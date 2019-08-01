package com.example.voizfonica;

import com.example.voizfonica.data.PostPaidRepository;
import com.example.voizfonica.model.PostpaidPlans;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.voizfonica.data")
public class DongleplanApplication {

    public static void main(String[] args) {
        SpringApplication.run(DongleplanApplication.class, args);
    }
    @Bean
    public CommandLineRunner dataLoader(PostPaidRepository repo) {
        return args -> {
            repo.deleteAll();
            repo.save(new PostpaidPlans("₹","Starter Pack","30 days","199","45 GB","100Mbps","30 Days"));
            repo.save(new PostpaidPlans("₹","Best Value","180 days","999","50 GB","360Mbps","30 Days"));
            repo.save(new PostpaidPlans("₹","Power User","60 days","1999","75GB","600Mbps","30 Days"));
        };
    }
}
