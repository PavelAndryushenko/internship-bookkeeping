package team.mediasoft.internship.bookkeeping.controller;

import lombok.RequiredArgsConstructor;
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
import team.mediasoft.internship.bookkeeping.mapper.CategoryMapper;
import team.mediasoft.internship.bookkeeping.service.CategoryService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/category")
@Validated
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;

    @PutMapping
    public ResponseDto<CategoryDto> createCategory(@RequestBody CreateCategoryRequestDto request) {
        return ResponseFactory.createSuccessfulResponse(categoryMapper.toDto(categoryService.createCategory(request.getName())));
    }

    @GetMapping("/all")
    public ResponseDto<List<CategoryDto>> getAll() {
        return ResponseFactory.createSuccessfulResponse(categoryService.getAllCategories().stream()
                .map(categoryMapper::toDto)
                .collect(Collectors.toList()));
    }
}
