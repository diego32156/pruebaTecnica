package com.pruebaSofka.co.service;

import com.pruebaSofka.co.entity.Audit;

public interface AuditListener {
	
	 public void receiveMessage(Audit audit);

}
