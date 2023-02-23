package com.app.model;


import javax.persistence.Embeddable;

import lombok.Data;

@Embeddable
@Data
public class semester1 {

	private final Integer  idSem1=1;
	private Integer sem1EnglishMarks;
	private Integer sem1MathsMarks;
	private Integer sem1ScienceMarks;
}
