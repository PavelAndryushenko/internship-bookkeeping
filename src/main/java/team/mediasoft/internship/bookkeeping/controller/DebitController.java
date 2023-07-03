package team.mediasoft.internship.bookkeeping.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.mediasoft.internship.bookkeeping.dto.ResponseDto;
import team.mediasoft.internship.bookkeeping.dto.debit.CreateDebitRequestDto;
import team.mediasoft.internship.bookkeeping.dto.debit.DebitDto;
import team.mediasoft.internship.bookkeeping.dto.debit.DebitStatisticRequestDto;
import team.mediasoft.internship.bookkeeping.dto.debit.DebitStatisticResponseDto;
import team.mediasoft.internship.bookkeeping.factory.ResponseFactory;
import team.mediasoft.internship.bookkeeping.mapper.DebitMapper;
import team.mediasoft.internship.bookkeeping.service.DebitService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/debit")
@Validated
@RequiredArgsConstructor
public class DebitController {

    private final DebitService debitService;
    private final DebitMapper debitMapper;

    @PutMapping
    public ResponseDto<DebitDto> createDebit(@RequestBody CreateDebitRequestDto request) {
        return ResponseFactory.createSuccessfulResponse(debitMapper.toDto(debitService.createDebit(
                request.getCategoryId(), request.getValue(), request.getDebitTime(), request.getDescription())));
    }

    @PostMapping("/statistic")
    public ResponseDto<DebitStatisticResponseDto> generateStatistic(@RequestBody DebitStatisticRequestDto request) {
        List<DebitDto> debits = debitService.getAllForPeriod(request.getDateFrom(), request.getDateTo()).stream()
                .map(debitMapper::toDto)
                .collect(Collectors.toList());
        return ResponseFactory.createSuccessfulResponse(new DebitStatisticResponseDto(
                debits,
                debits.stream().map(DebitDto::getValue).reduce(0D, Double::sum)));
    }
}
