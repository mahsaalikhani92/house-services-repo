package ir.maktab.service;

import ir.maktab.config.SpringConfig;
import ir.maktab.exception.NotFoundException;
import ir.maktab.model.dto.CategoryDto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author Mahsa Alikhani m-58
 */
public class RemoveCategoryTest {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
    CategoryServiceImpl categoryServiceImpl = context.getBean(CategoryServiceImpl.class);
    CategoryDto categoryDto;

    @BeforeEach
    void init(){
        categoryDto = CategoryDto.builder()
                .title("house facility")
                .build();
    }

    @Test
    void give_Service_when_Remove_Calls_Then_Exception_Return(){
        NotFoundException result = assertThrows(NotFoundException.class, ()->
                categoryServiceImpl.update(categoryDto));
        assertEquals("service not found!", result.getMessage());
    }
}
