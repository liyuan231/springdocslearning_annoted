package com.liyuan.beans;

import com.liyuan.model.MovieCatalog;
import com.liyuan.myqualifier.Offline;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.annotation.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

//@Named
@ManagedBean("movieRecommender2")
public class MovieRecommender {
    @Named("movieCatalogImpl1")
    @Inject
    @Nullable
//    @Offline
    private MovieCatalog offlineCatalog;

    @Autowired
    private ObjectFactory objectFactory;
}
