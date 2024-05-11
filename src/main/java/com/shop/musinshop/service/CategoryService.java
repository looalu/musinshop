package com.shop.musinshop.service;

import java.util.List;
import java.util.Optional;
import com.shop.musinshop.entity.Category;

public interface CategoryService {
    List<Category> getAll();
    Category save(Category category);
    Optional<Category> getCategoryByCategoryName(String name);

    boolean existedById(Integer id);
    void deteleById(Integer id);
}
