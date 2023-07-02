package team.mediasoft.internship.bookkeeping.controller;

import org.springframework.web.bind.annotation.*;
import team.mediasoft.internship.bookkeeping.dto.ResponseDto;
import team.mediasoft.internship.bookkeeping.dto.category.CategoryDto;
import team.mediasoft.internship.bookkeeping.dto.category.CreateCategoryRequestDto;
import team.mediasoft.internship.bookkeeping.factory.ResponseFactory;

import java.util.List;

@RestController
@RequestMapping("/category")
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
