package com.pruebaSofka.co.service;

import com.pruebaSofka.co.entity.Audit;

import reactor.core.publisher.Mono;

public interface IAuditService {
	
	
	Mono<Audit> save(Audit audit);
	Mono<Audit> findById(String id);

}
