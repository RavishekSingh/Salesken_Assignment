package com.app.model;



import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(indexName="student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	private Integer studentId;
	private String studentName;
	private Integer mathematics;
	private Integer science;
	private Integer english;
	private Integer semester;
	
	
	
}
