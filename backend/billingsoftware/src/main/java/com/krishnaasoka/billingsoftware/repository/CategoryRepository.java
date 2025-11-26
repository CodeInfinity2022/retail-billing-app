package com.krishnaasoka.billingsoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.krishnaasoka.billingsoftware.entity.CategoryEntity;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Long>{

}
