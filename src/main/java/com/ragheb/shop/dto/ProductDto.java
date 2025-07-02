package com.ragheb.shop.dto;

import com.ragheb.shop.model.Category;
import java.math.BigDecimal;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Ragheb
 */
@Data
public class ProductDto {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;
    private List<ImageDto> images;
    
}
