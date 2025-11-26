package com.krishnaasoka.billingsoftware.service.impl;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.krishnaasoka.billingsoftware.entity.CategoryEntity;
import com.krishnaasoka.billingsoftware.io.CategoryRequest;
import com.krishnaasoka.billingsoftware.io.CategoryResponse;
import com.krishnaasoka.billingsoftware.repository.CategoryRepository;
import com.krishnaasoka.billingsoftware.service.CategoryService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public CategoryResponse add(CategoryRequest request) {
        CategoryEntity newCategory = convertToEntity(request);
        newCategory = categoryRepository.save(newCategory);
        return convertToResponse(newCategory);
    }

    // to convert the request to entity - helper method
    // use builder pattern to copy all the values to category entity
    private CategoryEntity convertToEntity(CategoryRequest request) {
        return CategoryEntity.builder()
                .categoryId(UUID.randomUUID().toString())
                .name(request.getName())
                .description(request.getDescription())
                .bgColor(request.getBgColor())
                .build();

    }

    private CategoryResponse convertToResponse(CategoryEntity newCategory) {
        return CategoryResponse.builder()
                .categoryId(newCategory.getCategoryId())
                .name(newCategory.getName())
                .description(newCategory.getDescription())
                .bgColor(newCategory.getBgColor())
                .imgUrl(newCategory.getImgUrl())
                .createdAt(newCategory.getCreatedAt())
                .updatedAt(newCategory.getUpdatedAt())
                .build();
    }

}
