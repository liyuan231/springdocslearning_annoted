package com.liyuan.model;

import com.liyuan.dao.CustomerDao;
import com.liyuan.dao.CustomerPreferenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Component
public class MovieFinder {
    @Autowired
    CustomerPreferenceDao customerPreferenceDao;

//    @Autowired
    CustomerDao customerDao;

    @Inject
    public void setCustomerDao(@Nullable CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public String toString() {
        return "MovieFinder{" +
                "customerPreferenceDao=" + customerPreferenceDao +
                ", customerDao=" + customerDao +
                '}';
    }
}
