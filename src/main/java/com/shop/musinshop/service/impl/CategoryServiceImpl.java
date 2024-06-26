package com.shop.musinshop.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.musinshop.entity.Category;
import com.shop.musinshop.repository.CategoryRepository;
import com.shop.musinshop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAll() {
        return categoryRepository.findAll();
    }
    @Override
    public Category save(Category category) {
        if(categoryRepository.existsByName(category.getName())){
            return null;
        }
        else {
            return categoryRepository.save(category);
        }
    }

    @Override
    public Optional<Category> getCategoryByCategoryName(String name) {
        Optional<Category> categoryOpt = categoryRepository.findFirstByName(name);
        if(categoryOpt.isPresent()) {
            return categoryOpt;
        }
        else {
            return Optional.empty();
        }
    }

    @Override
    public boolean existedById(Integer id) {
        Optional<Category> categoryOpt = categoryRepository.findById(id);
        return categoryOpt.isPresent();
    }

    @Override
    public void deteleById(Integer id) {
        categoryRepository.deleteById(id);
    }
}
