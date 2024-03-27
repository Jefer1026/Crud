package org.jog.crud.service.impl;

import lombok.RequiredArgsConstructor;
import org.jog.crud.dto.CategoryDTO;
import org.jog.crud.exception.ObjectNotFoundException;
import org.jog.crud.persistence.entity.Category;
import org.jog.crud.persistence.repository.CategoryRepository;
import org.jog.crud.service.CategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable);
    }

    @Override
    public Optional<Category> findOneById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    @Override
    public Category createOne(CategoryDTO categoryDTO) {

        Category category = new Category();
        category.setName(categoryDTO.getName());
        category.setStatus(Category.CategoryStatus.ENABLED);

        return categoryRepository.save(category);
    }

    @Override
    public Category UpdateOneById(Long categoryId, CategoryDTO categoryDTO) {

        Category categoryFromDb = getCategoryNotFound(categoryId);

        categoryFromDb.setName(categoryDTO.getName());

        return categoryRepository.save(categoryFromDb);
    }

    @Override
    public Category disableOneById(Long categoryId) {

        Category categoryFromDb = getCategoryNotFound(categoryId);

        categoryFromDb.setStatus(Category.CategoryStatus.DISABLED);

        return categoryRepository.save(categoryFromDb);
    }

    private Category getCategoryNotFound(Long categoryId) {
        return categoryRepository.findById(categoryId)
                .orElseThrow(() -> new ObjectNotFoundException("Category not found"));
    }
}
