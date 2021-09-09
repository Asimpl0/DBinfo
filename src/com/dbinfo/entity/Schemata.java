package com.dbinfo.entity;

public class Schemata {
    private String CATALOG_NAME;
    private String SCHEMA_NAME;
    private String DEFAULT_CHARACTER_SET_NAME;
    private String DEFAULT_COLLATION_NAME;
    private String SQL_PATH;
    private String DEFAULT_ENCRYPTION;

    public String getSCHEMA_NAME() {
        return SCHEMA_NAME;
    }

    public void setCATALOG_NAME(String CATALOG_NAME) {
        this.CATALOG_NAME = CATALOG_NAME;
    }

    public void setSCHEMA_NAME(String SCHEMA_NAME) {
        this.SCHEMA_NAME = SCHEMA_NAME;
    }

    public void setDEFAULT_CHARACTER_SET_NAME(String DEFAULT_CHARACTER_SET_NAME) {
        this.DEFAULT_CHARACTER_SET_NAME = DEFAULT_CHARACTER_SET_NAME;
    }

    public void setDEFAULT_COLLATION_NAME(String DEFAULT_COLLATION_NAME) {
        this.DEFAULT_COLLATION_NAME = DEFAULT_COLLATION_NAME;
    }

    @Override
    public String toString() {
        return "Schemata{" +
                "SCHEMA_NAME='" + SCHEMA_NAME + '\'' +
                '}';
    }

    public void setSQL_PATH(String SQL_PATH) {
        this.SQL_PATH = SQL_PATH;
    }

    public void setDEFAULT_ENCRYPTION(String DEFAULT_ENCRYPTION) {
        this.DEFAULT_ENCRYPTION = DEFAULT_ENCRYPTION;
    }

}
