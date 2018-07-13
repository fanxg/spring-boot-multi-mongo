package com.marcosbarbero.wd.multiplemongo.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrimaryRepository extends MongoRepository<PrimaryModel, String> {
}
