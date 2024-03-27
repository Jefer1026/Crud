package org.jog.crud.service;

import org.jog.crud.dto.CategoryDTO;
import org.jog.crud.persistence.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface CategoryService {

    Page<Category> findAll(Pageable pageable);

    Optional<Category> findOneById(Long categoryId);

    Category createOne(CategoryDTO categoryDTO);

    Category UpdateOneById(Long categoryId, CategoryDTO categoryDTO);

    Category disableOneById(Long categoryId);
}
