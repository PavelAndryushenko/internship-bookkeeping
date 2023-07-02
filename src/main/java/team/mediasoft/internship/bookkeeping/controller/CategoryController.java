package team.mediasoft.internship.bookkeeping.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.mediasoft.internship.bookkeeping.dto.ResponseDto;
import team.mediasoft.internship.bookkeeping.dto.category.CategoryDto;
import team.mediasoft.internship.bookkeeping.dto.category.CreateCategoryRequestDto;
import team.mediasoft.internship.bookkeeping.factory.ResponseFactory;

import java.util.List;

@RestController
@RequestMapping("/category")
@Validated
public class CategoryController {

    @PutMapping
    public ResponseDto<CategoryDto> createCategory(@RequestBody CreateCategoryRequestDto request) {
        // TODO: Необходимо реализовать логику
        return ResponseFactory.createSuccessfulResponse(new CategoryDto(0, request.getName()));
    }

    @GetMapping("/all")
    public ResponseDto<List<CategoryDto>> getAll() {
        // TODO: Необходимо реализовать логику
        return ResponseFactory.createSuccessfulResponse(List.of());
    }
}
