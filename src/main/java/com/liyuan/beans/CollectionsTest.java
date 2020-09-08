package com.liyuan.beans;

import com.liyuan.model.MovieCatalog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.Arrays;

@Component
public class CollectionsTest {

    @Resource
    public MovieCatalog[] catalogs;
}
