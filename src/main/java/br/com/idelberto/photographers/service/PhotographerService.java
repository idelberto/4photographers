package br.com.idelberto.photographers.service;

import br.com.idelberto.photographers.dtos.PhotographerDtoRequest;
import br.com.idelberto.photographers.dtos.PhotographerDtoResponse;

public interface PhotographerService 
{

	PhotographerDtoResponse save(PhotographerDtoRequest dtoRequestPhotographer);

}
