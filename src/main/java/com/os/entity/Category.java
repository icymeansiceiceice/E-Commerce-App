package com.os.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category {
    
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "category_name")
	@NotBlank
	private String categoryName;
    @NotBlank
	private String description;
	@NotBlank
	private String imageUrl;
}
