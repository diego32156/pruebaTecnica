package com.pruebaSofka.co.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaSofka.co.dao.AuditRepository;
import com.pruebaSofka.co.entity.Audit;

import reactor.core.publisher.Mono;

@Service
public class AuditServiceImpl implements IAuditService {
	
	@Autowired
	private AuditRepository auditRepository;

	@Override
	public Mono<Audit> save(Audit audit) {
		return auditRepository.save(audit);
	}

	@Override
	public Mono<Audit> findById(String id) {
		return auditRepository.findById(id);   
	}

}
