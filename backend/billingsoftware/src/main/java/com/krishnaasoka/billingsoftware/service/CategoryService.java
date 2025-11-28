package com.krishnaasoka.billingsoftware.service;

import java.util.List;

import com.krishnaasoka.billingsoftware.io.CategoryRequest;
import com.krishnaasoka.billingsoftware.io.CategoryResponse;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request);

    List<CategoryResponse> read();

}
