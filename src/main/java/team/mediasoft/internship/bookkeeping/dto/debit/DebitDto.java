package team.mediasoft.internship.bookkeeping.dto.debit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import team.mediasoft.internship.bookkeeping.dto.category.CategoryDto;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class DebitDto {

    private final Long id;
    private final CategoryDto category;
    private final Double value;
    private final LocalDateTime debitTime;
    private final String description;
}
