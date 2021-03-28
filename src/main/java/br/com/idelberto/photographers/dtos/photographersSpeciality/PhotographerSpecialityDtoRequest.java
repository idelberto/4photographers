package br.com.idelberto.photographers.dtos.photographersSpeciality;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PhotographerSpecialityDtoRequest 
{
	
	private String description;

}
