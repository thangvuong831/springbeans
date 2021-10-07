package beans.observerpattern;

import org.springframework.stereotype.Component;

@Component
public class PhoneDisplay implements Display, Observer   {
    private WeatherStation weatherStation;

    public PhoneDisplay(WeatherStation weatherStation){
        this.weatherStation = weatherStation;

    };


    @Override
    public void display() {
        System.out.println("Phone Display");
    }


    @Override
    public void update() {
        System.out.println("update: " + weatherStation.getTemperature() ) ;
    }


}
