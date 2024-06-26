package com.shop.musinshop.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import com.shop.musinshop.dto.BrandRequestDTO;
import com.shop.musinshop.entity.Brand;

public interface BrandService {
    List<Brand> getAll();
    Brand save(Brand brand);
    Optional<Brand> getBrandByBrandName(String brandName);

    Optional<Brand> getBrandById(Integer id);

    Brand updateBrand(Integer id, BrandRequestDTO brandRequestDTO) throws IOException;
    Brand addNewBrand(BrandRequestDTO brandRequestDTO) throws IOException;
}
