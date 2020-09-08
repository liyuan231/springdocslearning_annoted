package com.liyuan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
//import javax.inject.Provider;

@Component
public class SimpleMovieLister {
    private NotAAutowiredBean notAAutowiredBean;
    //    @Autowired
    ApplicationContext applicationContext;

    //    @Autowired
    private MovieFinder movieFinder;

    //    @Autowired
//    public void setMovieFinder(MovieFinder movieFinder) {
//        this.movieFinder = movieFinder;
//    }


    @Autowired(required = false)
    public SimpleMovieLister(ApplicationContext applicationContext,
                             MovieFinder movieFinder) {
        this.applicationContext = applicationContext;
        this.movieFinder = movieFinder;
    }


    @Autowired(required = false)
    public SimpleMovieLister() {
    }

    @Autowired(required = false)
    public SimpleMovieLister(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Autowired(required = false)
    public SimpleMovieLister(NotAAutowiredBean notAAutowiredBean,
                             ApplicationContext applicationContext,
                             MovieFinder movieFinder) {
        this.notAAutowiredBean = notAAutowiredBean;
        this.applicationContext = applicationContext;
        this.movieFinder = movieFinder;
    }

//    @Inject
//    public void setMovieFinderProvider(Provider<MovieFinder> movieFinderProvider) {
//        this.movieFinderProvider = movieFinderProvider;
//    }

    @Override
    public String toString() {
        return "SimpleMovieLister{" +
                "notAAutowiredBean=" + notAAutowiredBean +
                ", applicationContext=" + applicationContext +
                ", movieFinder=" + movieFinder +
                '}';
    }

    public void show() {
        System.out.println("Service+==============");
        System.out.println(applicationContext.toString());
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

//    private Provider<MovieFinder> movieFinderProvider;



//    public Provider<MovieFinder> getMovieFinderProvider() {
//        return movieFinderProvider;
//    }
}
