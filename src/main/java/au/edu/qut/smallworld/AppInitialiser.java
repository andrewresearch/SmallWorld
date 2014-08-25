package au.edu.qut.smallworld;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * AppInitializer used by Tomcat container to start spring-boot
 * Created by andrew on 25/06/2014.
 */
public class AppInitialiser extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

}