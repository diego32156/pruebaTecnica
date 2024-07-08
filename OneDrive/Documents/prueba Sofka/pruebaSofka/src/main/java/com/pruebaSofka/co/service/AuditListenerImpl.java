package com.pruebaSofka.co.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pruebaSofka.co.entity.Audit;

@Service
public class AuditListenerImpl implements AuditListener{

	 @Autowired 
	  private IAuditService auditService;
	
	@Override
    @RabbitListener(queues = "auditQueue")
	public void receiveMessage(Audit audit) {
		auditService.save(audit).subscribe();
		
	}

}
