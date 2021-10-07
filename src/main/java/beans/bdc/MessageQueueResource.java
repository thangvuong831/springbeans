package beans.bdc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageQueueResource implements Resource {
    private String serverName =  "MQ Server";



    @Override
    public String getServerName() {
        return serverName;
    }


    @Override
    public String getBrandName(){
        return "MQBrand";
    }
}
