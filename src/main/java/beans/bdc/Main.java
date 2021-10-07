package beans.bdc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(BDCConfig.class);
        Resource resource = context.getBean("databaseResource", DatabaseResource.class );
        assertEquals("OracleServer", resource.getServerName());
        assertEquals("Oracle",resource.getBrandName() );

        Resource resource2 = context.getBean("messageQueueResource", MessageQueueResource.class );
        assertEquals("MQ Server", resource2.getServerName());

    }
}
