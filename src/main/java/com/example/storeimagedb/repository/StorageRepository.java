package com.example.storeimagedb.repository;

import com.example.storeimagedb.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData, Long> {

    Optional<ImageData> findByName(String fileName);
}
