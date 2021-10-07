package beans.bdc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Sans utilisation de ComponentScan, on doit identifier les Beans
 */
@Configuration
public class BDCConfig {

    @Bean(name="databaseResource")
    public Resource databaseResource(){
        return new DatabaseResource(new OracleBrand());
    }

    @Bean(name="messageQueueResource")
    public Resource MessageQueueResource(){
        return new MessageQueueResource();
    }
}


/**
 * @ComponentScan identifie automatiquement les beans.
 */
/*
@Configuration
@ComponentScan
public class BDCConfig {

}*/