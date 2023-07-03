package team.mediasoft.internship.bookkeeping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import team.mediasoft.internship.bookkeeping.entity.Debit;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface DebitRepository extends CrudRepository<Debit, Long> {

    List<Debit> findAllByDebitTimeBetweenOrderByDebitTime(LocalDate dateFrom, LocalDate dateTo);
}
