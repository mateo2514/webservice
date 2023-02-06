package com.example.webservice.service.impl;

import javax.jws.WebService;

import com.example.webservice.service.HolaMundoService;

@WebService(endpointInterface = "com.example.webservice.service.HolaMundoService")
public class HolaMundoServiceImpl implements HolaMundoService {

	@Override
	public String saluda(String text) {
		String string = "Hola:: " + text;
		System.out.println(string);
		return string;
	}

}
