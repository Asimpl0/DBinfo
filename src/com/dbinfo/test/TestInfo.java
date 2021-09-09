package com.dbinfo.test;

import com.dbinfo.service.InfoService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInfo {
    @Test
    public void testInfo(){
        ApplicationContext context = new
                ClassPathXmlApplicationContext("bean.xml");
        InfoService infoService = context.getBean("infoService",InfoService.class);
        infoService.showDataBase();
        infoService.showTable("information_schema");
        infoService.showColumn("information_schema","COLUMNS");
    }
}
