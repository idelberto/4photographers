package br.com.idelberto.photographers.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Photographer implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column
	private Integer id;

	@NotNull
	@Column(length = 100)
	private String name;
		
	
}
