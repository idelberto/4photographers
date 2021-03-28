package br.com.idelberto.photographers.unitary.controller;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.idelberto.photographers.dtos.photographersSpeciality.PhotographerSpecialityDtoRequest;

@WebMvcTest
@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
public class PhotographerSpecialityControllerTest 
{
	
	//1: define URI.
	private final String PHOTOGRAPHER_SPECIALITY_API = "/api/photographer";
	
	@Test
	@DisplayName("Should Create Photographer Speciality")
	@Disabled
	public void createPhotographerSpeciality() throws JsonProcessingException 
	{
		
		PhotographerSpecialityDtoRequest photographerSpecialityDtoRequest = PhotographerSpecialityDtoRequest
				.builder()
				.description("Sports")
				.build();
		
		String jsonRequest = new ObjectMapper().writeValueAsString(photographerSpecialityDtoRequest);
		
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders
				.post(PHOTOGRAPHER_SPECIALITY_API)
				.contentType(MediaType.APPLICATION_JSON)
				.accept(MediaType.APPLICATION_JSON)
				.content(jsonRequest);		
	}

}
