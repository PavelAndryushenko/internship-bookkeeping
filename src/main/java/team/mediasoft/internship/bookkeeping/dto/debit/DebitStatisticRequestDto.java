package team.mediasoft.internship.bookkeeping.dto.debit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
@RequiredArgsConstructor
public class DebitStatisticRequestDto {

    @NotNull(message = "Необходимо указать дату начала периода")
    private final LocalDate dateFrom;

    @NotNull(message = "Необходимо указать дату окончания периода")
    private final LocalDate dateTo;
}
