package com.app.model;

import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class semester2 {

	private final Integer  idSem2=2;
	private Integer sem2EnglishMarks;
	private Integer sem2MathsMarks;
	private Integer sem2ScienceMarks;
}
