package br.com.idelberto.photographers.dtos.photographers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PhotographerDtoResponse {
	
	private Long id;
	
	private String name;

}
