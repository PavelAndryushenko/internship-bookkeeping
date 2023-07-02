package team.mediasoft.internship.bookkeeping.dto.debit;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Getter
@RequiredArgsConstructor
public class DebitStatisticResponseDto {

    private final List<DebitDto> debits;
    private final Double debitSummary;
}
