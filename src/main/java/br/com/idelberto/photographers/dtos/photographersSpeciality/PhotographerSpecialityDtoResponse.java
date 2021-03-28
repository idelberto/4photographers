package br.com.idelberto.photographers.dtos.photographersSpeciality;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PhotographerSpecialityDtoResponse 
{
	private Integer id;
	private String description;
	
}
