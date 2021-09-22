package test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.awt.print.Book;
import java.util.UUID;

@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookMapper bookMapper;

    BookEntity bookEntity = BookEntity.builder()
            .id(UUID.randomUUID().toString())
            .title("Cloud-native Java")
            .author("Joshlong")
            .build();
    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            bookRepository.deleteAll();
            BookEntity bookRepositoryFound = bookRepository.save(bookEntity);
            System.out.println(bookEntity);
            BookDTOResponse bookDTOResponse = bookMapper.entityToDto(bookEntity);

            log.info("Debug mapper");
            log.info("DTO response after mapper=> {}",bookDTOResponse);
        };
    }
}
