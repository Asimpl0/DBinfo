package com.dbinfo.dao;


import com.dbinfo.entity.Column;
import com.dbinfo.entity.Schemata;
import com.dbinfo.entity.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class InfoDaoImpl implements InfoDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List getDataBase(){
        String sql = "SELECT * FROM `SCHEMATA`";
        List<Schemata> shemataList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Schemata>(Schemata.class));
        return shemataList;
    }
    @Override
    public List<Table> getTables(String database){

        String sql = "SELECT * FROM `TABLES` WHERE TABLE_SCHEMA = ?";
        List<Table> tableList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Table>(Table.class),database);
        //System.out.println(tableList.toString());
        return tableList;
    }
    @Override
    public List<Column> getColumns(String database,String table){
        String sql = "SELECT * FROM `COLUMNS` WHERE TABLE_NAME = ? AND TABLE_SCHEMA = ?";
        List<Column> columnList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Column>(Column.class),table,database);
        //System.out.println(columnList.toString());
        return columnList;
    }
}
