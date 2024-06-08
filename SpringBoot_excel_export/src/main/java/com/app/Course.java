package com.app;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="COURSE_DTLS")
public class Course {
	
	@Id
	private Integer cid;
	private String cname;
	private Double price;

}
