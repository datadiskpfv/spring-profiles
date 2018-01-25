package uk.co.datadisk.springprofiles.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service()
@Qualifier("oracle")
@Profile("oracle")
public class OracleDatabaseServiceImpl implements DatabaseService {

    @Value("${oracle.database.host}")
    private String database_host;

    @Value("${oracle.database.port}")
    private String database_port;

    @Override
    public String getDBInfo() {
        return database_host + ":" + database_port;
    }
}
