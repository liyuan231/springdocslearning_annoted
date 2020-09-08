package com.liyuan.beans;

import com.liyuan.model.MovieCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class PrimaryAnnotationTest {
    @Autowired
    @Qualifier("movieCatalogImpl1")
    MovieCatalog movieCatalogImpl1;

    @Autowired
    MovieCatalog[] movieCatalogs;

    @Bean
    public MovieCatalog[] catalogs() {
        return movieCatalogs;
    }

    @Override
    public String toString() {
        return "PrimaryAnnotationTest{" +
                "movieCatalogImpl1=" + movieCatalogImpl1 +
                ", movieCatalog=" + Arrays.toString(movieCatalogs) +
                '}';
    }
}
