package beans.bdc;

import org.springframework.stereotype.Component;

@Component
public class OracleBrand implements Brand {
    @Override
    public String getBrandName() {
        return "Oracle";
    }
}
