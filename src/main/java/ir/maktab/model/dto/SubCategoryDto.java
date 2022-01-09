package ir.maktab.model.dto;

import ir.maktab.model.entity.Expert;
import ir.maktab.model.entity.Order;
import ir.maktab.model.entity.Category;

import java.util.List;

/**
 * @author Mahsa Alikhani m-58
 */
public class SubCategoryDto {
    private String title;
    private Double basePrice;
    private String description;
    private List<Expert> experts;
    private Category category;
    private List<Order> orders;
}
