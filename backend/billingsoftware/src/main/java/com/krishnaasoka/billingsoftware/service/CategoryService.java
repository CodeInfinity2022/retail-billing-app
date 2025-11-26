package com.krishnaasoka.billingsoftware.service;

import com.krishnaasoka.billingsoftware.io.CategoryRequest;
import com.krishnaasoka.billingsoftware.io.CategoryResponse;

public interface CategoryService {

    CategoryResponse add(CategoryRequest request);

}
