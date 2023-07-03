package team.mediasoft.internship.bookkeeping.mapper;

import org.mapstruct.Mapper;
import team.mediasoft.internship.bookkeeping.dto.category.CategoryDto;
import team.mediasoft.internship.bookkeeping.entity.Category;

@Mapper(config = MapStructConfig.class)
public interface CategoryMapper {

    CategoryDto toDto(Category category);
}
