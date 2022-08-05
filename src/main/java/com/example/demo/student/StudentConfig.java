package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student nesta = new Student(
                    3L,
                    "Nesta",
                    "Nesta@gmail.com",

                    LocalDate.of(2002, Month.NOVEMBER, 27));

            Student riley = new Student(
                    1L,
                    "Riley",
                    "Riley@gmail.com",

                    LocalDate.of(2002, Month.NOVEMBER, 29));

            Student fletcher = new Student(
                    2L,
                    "fletcher",
                    "Fletcher@gmail.com",

                    LocalDate.of(2002, Month.NOVEMBER, 28));

            repository.saveAll(List.of(nesta, riley, fletcher));
        };
    }
}
