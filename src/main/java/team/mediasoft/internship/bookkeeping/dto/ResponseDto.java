package team.mediasoft.internship.bookkeeping.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class ResponseDto<T> {

    private final Integer code;
    private final String description;
    private final T payload;
}
