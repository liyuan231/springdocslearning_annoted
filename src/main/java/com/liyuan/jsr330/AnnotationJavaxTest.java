package com.liyuan.jsr330;

import com.liyuan.model.MovieCatalog;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;

@Component
public class AnnotationJavaxTest {
    @Named("movieCatalogImpl1")
    @Inject
    private MovieCatalog movieCatalog;

    @Override
    public String toString() {
        return "AnnotationJavaxTest{" +
                "movieCatalog=" + movieCatalog +
                '}';
    }
}
