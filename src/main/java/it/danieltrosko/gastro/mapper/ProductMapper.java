package it.danieltrosko.gastro.mapper;

import it.danieltrosko.gastro.dto.ProductDTO;
import it.danieltrosko.gastro.model.entities.Product;

public class ProductMapper {

    public static Product toEntity(ProductDTO productDTO){
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        product.setSize(productDTO.getSize());
        product.setDescription(productDTO.getDescription());
        product.setCategory(productDTO.getCategory());
        product.setPhoto(productDTO.getPhoto());
        return product;
    }

    public static ProductDTO toDTO(Product product){
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setSize(product.getSize());
        productDTO.setDescription(product.getDescription());
        productDTO.setCategory(product.getCategory());
        productDTO.setPhoto(product.getPhoto());
        return productDTO;
    }
}
