package team.mediasoft.internship.bookkeeping.util;

import lombok.experimental.UtilityClass;
import team.mediasoft.internship.bookkeeping.entity.Category;

import java.util.Comparator;

@UtilityClass
public class CategoryHelper {

    public static Comparator<Category> getCategoryComparator() {
        return Comparator.comparing(Category::getId);
    }
}
