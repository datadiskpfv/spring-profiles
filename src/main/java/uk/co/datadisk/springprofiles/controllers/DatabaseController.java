package uk.co.datadisk.springprofiles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import uk.co.datadisk.springprofiles.services.DatabaseService;

@Controller
public class DatabaseController {

    private DatabaseService database;

    // trying adding @Qualifier("<qualifier_name>") to the arguments of the constructor
    @Autowired
    public DatabaseController(DatabaseService database) {
        this.database = database;
    }

    public String getDbConnectionDetails() {
        return database.getDBInfo();
    }
}