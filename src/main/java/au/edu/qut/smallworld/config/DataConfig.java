package au.edu.qut.smallworld.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import java.util.Properties;

/**
 * Setup Data Persistence for this app
 * Created by andrew on 25/06/2014.
 */
@Configuration
public class DataConfig {

    /*
    Embedded database config (H2)
     */
    @Bean
    public JdbcTemplate jdbcTemplate() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.h2.Driver.class);
        Properties dbProps =  new Properties();
        dbProps.setProperty("MODE","MySQL");
        dataSource.setConnectionProperties(dbProps);
        dataSource.setUrl("jdbc:h2:mem");
        dataSource.setUsername("qut");
        dataSource.setPassword("");

        return new JdbcTemplate(dataSource);
    }


}
