package test;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTOResponse entityToDto(BookEntity bookEntity);
}
