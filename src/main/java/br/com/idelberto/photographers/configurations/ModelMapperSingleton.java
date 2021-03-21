package br.com.idelberto.photographers.configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperSingleton 
{
	
	@Bean 
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}

}
