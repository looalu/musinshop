package com.shop.musinshop.service;

import java.util.List;
import java.util.Optional;
import com.shop.musinshop.entity.Image;
import com.shop.musinshop.entity.Item;
import org.springframework.web.multipart.MultipartFile;

public interface ImageService {
    List<Image> getAllByItemId(Integer itemId);
    Image save(Image image);
    Optional<Image> getFirstByItemId(Integer itemId);
    void delete(Image image);
    List<Image> uploadImages(List<MultipartFile> images, Item item);

    void deleteAndSaveImages(List<MultipartFile> images, Item oldItem);

}
