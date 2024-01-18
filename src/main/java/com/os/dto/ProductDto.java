package com.os.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
    
    @NotNull
	private Integer id;
	@NotNull
	private String name;
    @NotNull
	private String description;
	@NotNull
	private String imageUrl;
    @NotNull
    private double price;
    @NotNull
    private Integer categoryId;
}
