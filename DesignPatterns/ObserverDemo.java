package DesignPatterns;

import java.util.ArrayList;

interface  Subject
{
    void registerObserve(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}


interface  Observer
{
    void update(float temprature);
}


class weatherStation implements Subject
{
    private  ArrayList<Observer> list = new ArrayList<>();

    public float getTemprature() {
        return temprature;
    }

    public void setTemprature(float temprature) {
        this.temprature = temprature;
    }

    private float temprature;
    @Override
    public void registerObserve(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {

        for(Observer o : list)
        {
            o.update(temprature);
        }
    }
}

class PhoneUser implements Observer
{

    @Override
    public void update(float temprature) {
        System.out.println("temprature  changes  "+ temprature+"°C");
    }
}
class WindowsUser implements Observer
{

    @Override
    public void update(float temprature) {
        System.out.println("temprature  changes  "+ temprature+"°C");
    }
}
public class ObserverDemo {
    public static void main(String[] args) {
        Observer phoneUser = new PhoneUser();
        Observer windowsUser = new WindowsUser();

        weatherStation station = new weatherStation();
        station.registerObserve(phoneUser);
        station.registerObserve(windowsUser);

        station.setTemprature(89.7f);
        station.notifyObserver();
    }
}
