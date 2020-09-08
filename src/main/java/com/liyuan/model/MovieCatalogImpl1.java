package com.liyuan.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MovieCatalogImpl1 implements MovieCatalog{
    @PostConstruct
    public void init(){
        System.out.println("MovieCatalogImpl1 is called!");
    }
}
