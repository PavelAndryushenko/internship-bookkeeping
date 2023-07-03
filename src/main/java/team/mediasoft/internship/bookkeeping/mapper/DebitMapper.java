package team.mediasoft.internship.bookkeeping.mapper;

import org.mapstruct.Mapper;
import team.mediasoft.internship.bookkeeping.dto.debit.DebitDto;
import team.mediasoft.internship.bookkeeping.entity.Debit;

@Mapper(config = MapStructConfig.class)
public interface DebitMapper {

    DebitDto toDto(Debit debit);
}
