package com.liyuan.model;

import com.liyuan.dao.CustomerPreferenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class MovieRecommender {


    @Autowired(required = false)
    private NotAAutowiredBean notAAutowiredBean;
    @Autowired
    private Map<String, MovieCatalog> movieCatalogMap;

//    @Autowired
    private Optional<MovieCatalog> movieCatalogOptional ;

//    @Autowired
    public void setMovieCatalogOptional(Optional<MovieCatalog> movieCatalogOptional) {
        this.movieCatalogOptional = movieCatalogOptional;
    }

    private MovieCatalog[] movieCatalog;
    private CustomerPreferenceDao customerPreferenceDao;

    @Autowired(required = false)
    public void prepare(MovieCatalog[] movieCatalog,
                        CustomerPreferenceDao customerPreferenceDao) {
        this.movieCatalog = movieCatalog;
        this.customerPreferenceDao = customerPreferenceDao;
    }

    @Override
    public String toString() {
        return "MovieRecommender{" +
                "notAAutowiredBean=" + notAAutowiredBean +
                ", movieCatalogMap=" + movieCatalogMap +
                ", movieCatalogOptional=" + movieCatalogOptional +
                ", movieCatalog=" + Arrays.toString(movieCatalog) +
                ", customerPreferenceDao=" + customerPreferenceDao +
                '}';
    }
}
