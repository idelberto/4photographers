package br.com.idelberto.photographers.service;

import org.springframework.stereotype.Service;

import br.com.idelberto.photographers.dtos.photographers.PhotographerDtoRequest;
import br.com.idelberto.photographers.dtos.photographers.PhotographerDtoResponse;

@Service
public class PhotographerService 
{
	public PhotographerDtoResponse save(PhotographerDtoRequest dtoRequestPhotographer) 
	{
		PhotographerDtoResponse photographerDtoResponse = PhotographerDtoResponse
				.builder()
				.id(1L)
				.name(dtoRequestPhotographer.getName())
				.build();
		 
		 return photographerDtoResponse;
	}
}
