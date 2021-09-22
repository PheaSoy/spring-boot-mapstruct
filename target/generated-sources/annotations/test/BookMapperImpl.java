package test;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.10 (Oracle Corporation)"
)
@Component
public class BookMapperImpl implements BookMapper {

    @Override
    public BookDTOResponse entityToDto(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        BookDTOResponse bookDTOResponse = new BookDTOResponse();

        bookDTOResponse.setTitle( bookEntity.getTitle() );
        bookDTOResponse.setAuthor( bookEntity.getAuthor() );

        return bookDTOResponse;
    }
}
