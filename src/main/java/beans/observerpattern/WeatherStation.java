package beans.observerpattern;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WeatherStation implements Observable {
    List<Observer> observerList = new ArrayList<>();

    @Override
    public void add(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void remove(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObserver() {
        System.out.println("notify : ");
        for (Observer obs : observerList) {
            obs.update();
        }
    }

    public double getTemperature() {
        return -40 + Math.random()*100  % 80;
    }

    ;

}
