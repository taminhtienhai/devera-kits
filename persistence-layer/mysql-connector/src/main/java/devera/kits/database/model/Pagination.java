package devera.kits.database.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import jakarta.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pagination {
    @Min(0)
    private int limit = 10;
    @Min(1)
    private int page = 1;

    @JsonAlias(value = "sort_by")
    private String sortBy = "createdDate";
}
