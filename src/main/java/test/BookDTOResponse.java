package test;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.mapstruct.Mappings;
import org.springframework.web.bind.annotation.Mapping;

@Data
public class BookDTOResponse {

    String title;
    String author;
}
