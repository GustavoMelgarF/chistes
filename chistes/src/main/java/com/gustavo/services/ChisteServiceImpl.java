package com.gustavo.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;


@Service
public class ChisteServiceImpl implements ChisteApp{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
	
	public ChisteServiceImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}


	@Override
	public String obtenerChiste() {
		return chuckNorrisQuotes.getRandomQuote();
	}
	
	

}
