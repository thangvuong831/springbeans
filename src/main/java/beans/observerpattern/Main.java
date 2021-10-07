package beans.observerpattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

      
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ObserverConfig.class);
        Observable observable = applicationContext.getBean("weatherStation", WeatherStation.class);
        Observer observer = applicationContext.getBean("phoneDisplay", PhoneDisplay.class);

        observable.add(observer);
        observable.notifyObserver();



    }

}
