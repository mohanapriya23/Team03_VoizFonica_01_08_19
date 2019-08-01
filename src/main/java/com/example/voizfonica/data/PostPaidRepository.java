package com.example.voizfonica.data;

import com.example.voizfonica.model.PostpaidPlans;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostPaidRepository extends MongoRepository<PostpaidPlans, String> {

}
