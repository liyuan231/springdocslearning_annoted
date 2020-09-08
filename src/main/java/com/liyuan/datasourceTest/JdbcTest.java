package com.liyuan.datasourceTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import javax.sql.DataSource;

@Repository
@Description("正如你所看到的，这是DAO层，用于测试与数据库的连接是否顺利")
public class JdbcTest {
    @Autowired
    DataSource dataSource;

    public  void test(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute("create table test(id int not null,name varchar(255) not null)");

    }
}
