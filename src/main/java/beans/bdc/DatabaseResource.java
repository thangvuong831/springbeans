package beans.bdc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DatabaseResource implements Resource {
    private String serverName = "OracleServer";
    private Brand brand;

    @Autowired
    DatabaseResource(Brand brand){
        this.brand = brand;
    }

    @Override
    public String getServerName() {
        return serverName;
    }

    @Override
    public String getBrandName() {
        return brand.getBrandName();
    }

}
