package com.pruebaSofka.co.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.pruebaSofka.co.entity.Audit;

public interface AuditRepository extends ReactiveMongoRepository<Audit, String> {

} 

