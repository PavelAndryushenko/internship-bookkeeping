package team.mediasoft.internship.bookkeeping.dto.category;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotBlank;

@Getter
@RequiredArgsConstructor
public class CreateCategoryRequestDto {

    @NotBlank(message = "Название категории не может быть пустым")
    private final String name;
}
