package team.mediasoft.internship.bookkeeping.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "debits")
@NoArgsConstructor
@Getter
@Setter
public class Debit {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column
    private Double value;

    @Column(name = "debit_time")
    private LocalDateTime debitTime;

    @Column
    private String description;
}
