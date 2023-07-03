package team.mediasoft.internship.bookkeeping.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import team.mediasoft.internship.bookkeeping.entity.Category;
import team.mediasoft.internship.bookkeeping.entity.Debit;
import team.mediasoft.internship.bookkeeping.exception.EntityNotFoundException;
import team.mediasoft.internship.bookkeeping.repository.DebitRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DebitService {

    private final DebitRepository debitRepository;
    private final CategoryService categoryService;

    public Debit createDebit(Integer categoryId, Double value, LocalDateTime debitTime, String description) {
        Category category = categoryService.getById(categoryId).orElseThrow(() -> new EntityNotFoundException("категория"));

        Debit debit = new Debit();
        debit.setCategory(category);
        debit.setDebitTime(debitTime != null ? debitTime : LocalDateTime.now());
        debit.setValue(value);
        debit.setDescription(description);

        return debitRepository.save(debit);
    }

    public List<Debit> getAllForPeriod(LocalDate dateFrom, LocalDate dateTo) {
        return debitRepository.findAllByDebitTimeBetweenOrderByDebitTime(dateFrom, dateTo);
    }
}
