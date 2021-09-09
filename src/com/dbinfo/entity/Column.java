package com.dbinfo.entity;

public class Column {
    private String TABLE_CATALOG;
    private String TABLE_SCHEMA;
    private String TABLE_NAME;
    private String COLUMN_NAME;
    private String ORDINAL_POSITION;
    private String COLUMN_DEFAULT;
    private String IS_NULLABLE;
    private String DATA_TYPE;
    private String CHARACTER_MAXIMUM_LENGTH;
    private String NUMERIC_PRECISION;

    @Override
    public String toString() {
        return "Column{" +
                "COLUMN_NAME='" + COLUMN_NAME + '\'' +
                ", IS_NULLABLE='" + IS_NULLABLE + '\'' +
                ", DATA_TYPE='" + DATA_TYPE + '\'' +
                '}';
    }

    private String NUMERIC_SCALE;
    private String DATETIME_PRECISION;
    private String CHARACTER_SET_NAME;
    private String COLLATION_NAME;
    private String COLUMN_TYPE;
    private String COLUMN_KEY;
    private String EXTRA;
    private String PRIVILEGES;
    private String COLUMN_COMMENT;
    private String GENERATION_EXPRESSION;
    private String SRS_ID;

    public void setTABLE_CATALOG(String TABLE_CATALOG) {
        this.TABLE_CATALOG = TABLE_CATALOG;
    }

    public void setTABLE_SCHEMA(String TABLE_SCHEMA) {
        this.TABLE_SCHEMA = TABLE_SCHEMA;
    }

    public void setTABLE_NAME(String TABLE_NAME) {
        this.TABLE_NAME = TABLE_NAME;
    }

    public void setCOLUMN_NAME(String COLUMN_NAME) {
        this.COLUMN_NAME = COLUMN_NAME;
    }

    public void setORDINAL_POSITION(String ORDINAL_POSITION) {
        this.ORDINAL_POSITION = ORDINAL_POSITION;
    }

    public void setCOLUMN_DEFAULT(String COLUMN_DEFAULT) {
        this.COLUMN_DEFAULT = COLUMN_DEFAULT;
    }

    public void setIS_NULLABLE(String IS_NULLABLE) {
        this.IS_NULLABLE = IS_NULLABLE;
    }

    public void setDATA_TYPE(String DATA_TYPE) {
        this.DATA_TYPE = DATA_TYPE;
    }

    public void setCHARACTER_MAXIMUM_LENGTH(String CHARACTER_MAXIMUM_LENGTH) {
        this.CHARACTER_MAXIMUM_LENGTH = CHARACTER_MAXIMUM_LENGTH;
    }

    public void setNUMERIC_PRECISION(String NUMERIC_PRECISION) {
        this.NUMERIC_PRECISION = NUMERIC_PRECISION;
    }

    public void setNUMERIC_SCALE(String NUMERIC_SCALE) {
        this.NUMERIC_SCALE = NUMERIC_SCALE;
    }

    public void setDATETIME_PRECISION(String DATETIME_PRECISION) {
        this.DATETIME_PRECISION = DATETIME_PRECISION;
    }

    public void setCHARACTER_SET_NAME(String CHARACTER_SET_NAME) {
        this.CHARACTER_SET_NAME = CHARACTER_SET_NAME;
    }

    public void setCOLLATION_NAME(String COLLATION_NAME) {
        this.COLLATION_NAME = COLLATION_NAME;
    }

    public void setCOLUMN_TYPE(String COLUMN_TYPE) {
        this.COLUMN_TYPE = COLUMN_TYPE;
    }

    public void setCOLUMN_KEY(String COLUMN_KEY) {
        this.COLUMN_KEY = COLUMN_KEY;
    }

    public void setEXTRA(String EXTRA) {
        this.EXTRA = EXTRA;
    }

    public void setPRIVILEGES(String PRIVILEGES) {
        this.PRIVILEGES = PRIVILEGES;
    }

    public void setCOLUMN_COMMENT(String COLUMN_COMMENT) {
        this.COLUMN_COMMENT = COLUMN_COMMENT;
    }

    public void setGENERATION_EXPRESSION(String GENERATION_EXPRESSION) {
        this.GENERATION_EXPRESSION = GENERATION_EXPRESSION;
    }

    public void setSRS_ID(String SRS_ID) {
        this.SRS_ID = SRS_ID;
    }
}
