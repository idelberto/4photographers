package br.com.idelberto.photographers.controllers;



import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.idelberto.photographers.dtos.PhotographerDtoRequest;
import br.com.idelberto.photographers.dtos.PhotographerDtoResponse;
import br.com.idelberto.photographers.entities.Photographer;
import br.com.idelberto.photographers.service.PhotographerService;

@WebMvcTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
public class PhotographerControllerTest 
{
	
	static String PHOTOGRAPHER_API = "/api/photographer";
	
	@Autowired
	MockMvc mvc;
	
	@MockBean
	PhotographerService service;
	
	@Test
	@DisplayName("Deve cria um fotografo com sucesso")
	public void createPhotographerTest() throws Exception
	{
		
		
		//Dto Request Mock.
		PhotographerDtoRequest dtoPhotographer = PhotographerDtoRequest
				.builder()
				.name("Idelberto")
				.build();
		
		
		//Instance of class Photographer.
		PhotographerDtoResponse savePhotographer = PhotographerDtoResponse
				.builder()
				.id(0L)
				.name("Idelberto")
				.build();
			
		BDDMockito
			.given(service.save(Mockito.any(PhotographerDtoRequest.class)))
			.willReturn(savePhotographer);
		
		
		String json = new ObjectMapper().writeValueAsString(dtoPhotographer);
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders
				.post(PHOTOGRAPHER_API)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(json);
		
		mvc
			.perform(request)
			.andExpect(MockMvcResultMatchers.status().isCreated())
			.andExpect(MockMvcResultMatchers.jsonPath("id").value(is(not(0))))
			.andExpect(MockMvcResultMatchers.jsonPath("name").value(dtoPhotographer.getName()));						
				
	}
	
	@Test
	@DisplayName("Deve lançar um erro de validação")
	public void createInvalidPhotographerTest()
	{
		
	}
	
}
