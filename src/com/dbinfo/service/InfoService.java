package com.dbinfo.service;

import com.dbinfo.dao.InfoDao;
import com.dbinfo.entity.Column;
import com.dbinfo.entity.Schemata;
import com.dbinfo.entity.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService {
    @Autowired
    private InfoDao infoDao;

    public void showDataBase(){
        List<Schemata> schemataList = infoDao.getDataBase();
        for(Schemata schemata:schemataList){
            System.out.println(schemata);
        }
    }
    public void showTable(String database){
        List<Table> tables = infoDao.getTables(database);
        for(Table table:tables){
            System.out.println(table);
        }
    }
    public void showColumn(String database,String table){
        List<Column> columns = infoDao.getColumns(database,table);
        for(Column colum:columns){
            System.out.println(colum);
        }
    }
}
