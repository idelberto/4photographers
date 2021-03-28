package br.com.idelberto.photographers.unitary.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.idelberto.photographers.entities.Photographer;
import br.com.idelberto.photographers.service.PhotographerService;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
public class PhotographerServiceTest
{
	
	PhotographerService service;
		
	@Test
	@DisplayName("Deve salvar photographer")
	public void savePhotographerTest()
	{
		
		Photographer photographer = Photographer
				.builder()
				.id(1)
				.name("Idelberto")
				.build();
		
		//Photographer save PhotographerService.save();
		
	}
	
}
