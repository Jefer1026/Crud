package org.jog.crud.service;

import org.jog.crud.dto.ProductDTO;
import org.jog.crud.persistence.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ProductService {

    Page<Product> findAll(Pageable pageable);

    Optional<Product> findOneById(Long productId);

    Product createOne(ProductDTO productDTO);

    Product UpdateOneById(Long productId, ProductDTO productDTO);

    Product disableOneById(Long productId);
}
