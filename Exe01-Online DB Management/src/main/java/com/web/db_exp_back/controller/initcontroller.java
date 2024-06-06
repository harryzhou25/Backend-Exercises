package com.web.db_exp_back.controller;

import com.web.db_exp_back.entity.DBcolumn;
import com.web.db_exp_back.util.dbinfo;
import com.web.db_exp_back.entity.DBtable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class initcontroller {
    private List<DBtable> tables;
    public initcontroller() {
        List<String> tableNames = dbinfo.getTableNames();
        for (String tableName : tableNames) {
            List<String> names = dbinfo.getColumnNames(tableName);
            List<String> types =  dbinfo.getColumnNames(tableName);
            List<DBcolumn> columns = new ArrayList<DBcolumn>();
            for(int i = 0; i < names.size(); i++) {
                columns.add(new DBcolumn(names.get(i), types.get(i)));
            }
            tables.add(new DBtable(tableName, columns));
        }
    }

    @GetMapping("/init")
    public List<DBtable> initHandler() {
        return tables;
    }
}
