package ch02.weatherpull;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    //옵저버의
    public void notifyObservers();
}
