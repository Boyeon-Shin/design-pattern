package observer.Webtoon;

public interface Webtoon {
    void registerObserver(Subscribe subscribe);

    void removeObserver(Subscribe subscribe);

    void notifyObserver();
}
