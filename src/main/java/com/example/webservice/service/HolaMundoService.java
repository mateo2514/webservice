package com.example.webservice.service;

import javax.jws.WebService;

@WebService
public interface HolaMundoService {
	String saluda(String text);
}
