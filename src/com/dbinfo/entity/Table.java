package com.dbinfo.entity;

public class Table {
    private String TABLE_CATALOG;
    private String TABLE_SCHEMA;
    private String TABLE_NAME;
    private String TABLE_TYPE;
    private String ENGINE;
    private String VERSION;
    private String ROW_FORMAT;
    private String TABLE_ROWS;
    private String AVG_ROW_LENGTH;
    private String DATA_LENGTH;
    private String MAX_DATA_LENGTH;
    private String INDEX_LENGTH;
    private String DATA_FREE;
    private String AUTO_INCREMENT;
    private String CREATE_TIME;
    private String UPDATE_TIME;
    private String CHECK_TIME;
    private String TABLE_COLLATION;
    private String CHECKSUM;
    private String CREATE_OPTIONS;
    private String TABLE_COMMENT;

        public void setTABLE_CATALOG(String TABLE_CATALOG) {
                this.TABLE_CATALOG = TABLE_CATALOG;
        }

        public void setTABLE_SCHEMA(String TABLE_SCHEMA) {
                this.TABLE_SCHEMA = TABLE_SCHEMA;
        }

        public void setTABLE_NAME(String TABLE_NAME) {
                this.TABLE_NAME = TABLE_NAME;
        }

        public void setTABLE_TYPE(String TABLE_TYPE) {
                this.TABLE_TYPE = TABLE_TYPE;
        }

        public void setENGINE(String ENGINE) {
                this.ENGINE = ENGINE;
        }

        public void setVERSION(String VERSION) {
                this.VERSION = VERSION;
        }

        public void setROW_FORMAT(String ROW_FORMAT) {
                this.ROW_FORMAT = ROW_FORMAT;
        }

        public void setTABLE_ROWS(String TABLE_ROWS) {
                this.TABLE_ROWS = TABLE_ROWS;
        }

        public void setAVG_ROW_LENGTH(String AVG_ROW_LENGTH) {
                this.AVG_ROW_LENGTH = AVG_ROW_LENGTH;
        }

        public void setDATA_LENGTH(String DATA_LENGTH) {
                this.DATA_LENGTH = DATA_LENGTH;
        }

        public void setMAX_DATA_LENGTH(String MAX_DATA_LENGTH) {
                this.MAX_DATA_LENGTH = MAX_DATA_LENGTH;
        }

        public void setINDEX_LENGTH(String INDEX_LENGTH) {
                this.INDEX_LENGTH = INDEX_LENGTH;
        }

        public void setDATA_FREE(String DATA_FREE) {
                this.DATA_FREE = DATA_FREE;
        }

        public void setAUTO_INCREMENT(String AUTO_INCREMENT) {
                this.AUTO_INCREMENT = AUTO_INCREMENT;
        }

        @Override
        public String toString() {
                return "Table{" +
                        "TABLE_NAME='" + TABLE_NAME + '\'' +
                        ", UPDATE_TIME='" + UPDATE_TIME + '\'' +
                        '}';
        }

        public void setCREATE_TIME(String CREATE_TIME) {
                this.CREATE_TIME = CREATE_TIME;
        }

        public void setUPDATE_TIME(String UPDATE_TIME) {
                this.UPDATE_TIME = UPDATE_TIME;
        }

        public void setCHECK_TIME(String CHECK_TIME) {
                this.CHECK_TIME = CHECK_TIME;
        }

        public void setTABLE_COLLATION(String TABLE_COLLATION) {
                this.TABLE_COLLATION = TABLE_COLLATION;
        }

        public void setCHECKSUM(String CHECKSUM) {
                this.CHECKSUM = CHECKSUM;
        }

        public void setCREATE_OPTIONS(String CREATE_OPTIONS) {
                this.CREATE_OPTIONS = CREATE_OPTIONS;
        }

        public void setTABLE_COMMENT(String TABLE_COMMENT) {
                this.TABLE_COMMENT = TABLE_COMMENT;
        }
}
