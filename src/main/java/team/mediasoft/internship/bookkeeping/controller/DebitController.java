package team.mediasoft.internship.bookkeeping.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.mediasoft.internship.bookkeeping.dto.ResponseDto;
import team.mediasoft.internship.bookkeeping.dto.category.CategoryDto;
import team.mediasoft.internship.bookkeeping.dto.debit.CreateDebitRequestDto;
import team.mediasoft.internship.bookkeeping.dto.debit.DebitDto;
import team.mediasoft.internship.bookkeeping.dto.debit.DebitStatisticRequestDto;
import team.mediasoft.internship.bookkeeping.dto.debit.DebitStatisticResponseDto;
import team.mediasoft.internship.bookkeeping.factory.ResponseFactory;

import java.util.List;

@RestController
@RequestMapping("/debit")
@Validated
public class DebitController {

    @PutMapping
    public ResponseDto<DebitDto> createDebit(@RequestBody CreateDebitRequestDto request) {
        // TODO: Реализовать логику
        return ResponseFactory.createSuccessfulResponse(new DebitDto(0L, new CategoryDto(0, null),
                request.getValue(), request.getDebitTime(), request.getDescription()));
    }

    @PostMapping("/statistic")
    public ResponseDto<DebitStatisticResponseDto> generateStatistic(@RequestBody DebitStatisticRequestDto request) {
        // TODO: Реализовать логику
        return ResponseFactory.createSuccessfulResponse(new DebitStatisticResponseDto(List.of(), 0D));
    }
}
