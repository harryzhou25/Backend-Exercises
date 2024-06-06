package com.web.db_exp_back.entity;

import com.web.db_exp_back.entity.DBcolumn;
import java.util.List;

public class DBtable {
    private String tableName;
    private List<DBcolumn> columns;

    public DBtable(String tableName, List<DBcolumn> columns) {
        this.tableName = tableName;
        this.columns = columns;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<DBcolumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DBcolumn> columns) {
        this.columns = columns;
    }
}
