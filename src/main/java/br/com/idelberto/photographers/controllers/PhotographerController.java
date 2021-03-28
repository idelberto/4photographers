package br.com.idelberto.photographers.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.idelberto.photographers.dtos.photographers.PhotographerDtoRequest;
import br.com.idelberto.photographers.dtos.photographers.PhotographerDtoResponse;
import br.com.idelberto.photographers.service.PhotographerService;

@RestController
@RequestMapping("/api/photographer")
public class PhotographerController 
{
	
	@Autowired
	private PhotographerService servicePhotographer;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PhotographerDtoResponse create(@RequestBody PhotographerDtoRequest dtoRequestPhotographer)
	{
		return servicePhotographer.save(dtoRequestPhotographer);
	}
	
	@GetMapping
	public List<PhotographerDtoResponse> list()
	{
		
		List<PhotographerDtoResponse> list = new ArrayList<PhotographerDtoResponse>();					
		return list;
		
	}
	
}
