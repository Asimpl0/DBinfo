package com.dbinfo.dao;

import com.dbinfo.entity.Column;
import com.dbinfo.entity.Table;

import java.util.List;

public interface InfoDao {
     List getDataBase();

     List<Table> getTables(String database);

     List<Column> getColumns(String database,String table);
}
