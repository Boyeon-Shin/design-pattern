package observer.WebtoonSubscriptionSystem;

public interface Webtoon {
    void registerObserver(Subscribe subscribe);

    void removeObserver(Subscribe subscribe);

    void notifyObserver();

    String getTitle();

    String getNewEpisode();
}
