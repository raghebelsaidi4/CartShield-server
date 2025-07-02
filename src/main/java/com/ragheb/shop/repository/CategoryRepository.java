package com.ragheb.shop.repository;

import com.ragheb.shop.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Ragheb
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByName(String name);

    boolean existsByName(String name);
}
