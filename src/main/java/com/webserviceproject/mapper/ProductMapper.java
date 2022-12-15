package com.webserviceproject.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import com.webserviceproject.entities.Product;
import com.webserviceproject.request.ProductPostRequestBody;
import com.webserviceproject.request.ProductPutRequestBody;

@Mapper(componentModel = "spring")
public abstract class ProductMapper {
	
	public static ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);
	
	public abstract Product toProduct(ProductPostRequestBody productPostRequestBody);
	
	public abstract Product updateProduct(ProductPutRequestBody productPutRequestBody, @MappingTarget Product product);
}
