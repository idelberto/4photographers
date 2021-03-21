package br.com.idelberto.photographers.service;

import br.com.idelberto.photographers.dtos.photographers.PhotographerDtoRequest;
import br.com.idelberto.photographers.dtos.photographers.PhotographerDtoResponse;

public interface PhotographerService 
{
	PhotographerDtoResponse save(PhotographerDtoRequest dtoRequestPhotographer);
}
