package com.spring.crud.demo.model;


import lombok.Builder;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

public class Member implements Serializable {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String position;
	private int age;
	private boolean isPlaying;
	
}
