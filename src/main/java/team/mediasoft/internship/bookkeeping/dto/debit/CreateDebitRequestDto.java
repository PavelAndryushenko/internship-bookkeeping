package team.mediasoft.internship.bookkeeping.dto.debit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class CreateDebitRequestDto {

    @NotNull(message = "Необходимо указать категорию расхода")
    private final Integer categoryId;

    @NotNull(message = "Необходимо указать сумму расхода")
    @Positive(message = "Размер расхода должен быть больше 0")
    private final Double value;

    private final String description;

    private final LocalDateTime debitTime;
}
