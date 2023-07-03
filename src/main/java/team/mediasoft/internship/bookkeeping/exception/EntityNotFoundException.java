package team.mediasoft.internship.bookkeeping.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String entityType) {
        super(String.format("Сущность %s не найдена", entityType));
    }
}
