package ch02.weather;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    //옵저버의
    public void notifyObservers();
}
