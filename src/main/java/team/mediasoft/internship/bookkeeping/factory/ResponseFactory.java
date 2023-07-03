package team.mediasoft.internship.bookkeeping.factory;

import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;
import team.mediasoft.internship.bookkeeping.dto.ResponseDto;

@UtilityClass
public class ResponseFactory {

    public static <T> ResponseDto<T> createSuccessfulResponse(T payload) {
        return new ResponseDto<>(HttpStatus.OK.value(), null, payload);
    }

    public static ResponseDto<Void> createFailedResponse(HttpStatus status, String description) {
        return new ResponseDto<>(status.value(), description, null);
    }
}
