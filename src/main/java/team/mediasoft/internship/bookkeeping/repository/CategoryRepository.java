package team.mediasoft.internship.bookkeeping.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import team.mediasoft.internship.bookkeeping.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
