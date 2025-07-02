/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ragheb.shop.repository;

import com.ragheb.shop.model.Image;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ragheb
 */
public interface ImageRepository extends JpaRepository<Image, Long> {
      List<Image> findByProductId(Long id);
}
