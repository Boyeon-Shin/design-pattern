package observer.WebtoonSubscriptionSystem;

import java.util.ArrayList;
import java.util.List;

public class Ppodaejaglyeol implements Webtoon{
    private List<Subscribe> subscribes = new ArrayList<>();
    private String title = "ppodaejaglyeol";
    private String newEpisode = "";


    @Override
    public void registerObserver(final Subscribe subscribe) {
        subscribes.add(subscribe);
    }

    @Override
    public void removeObserver(final Subscribe subscribe) {
        subscribes.remove(subscribe);
    }

    @Override
    public void notifyObserver() {
        for(Subscribe subscribe : subscribes) {
                subscribe.send();
        }
    }

    public void setNewEpisode(String newEpisode) {
        this.newEpisode = newEpisode;
        notifyObserver();
    }

    public String getNewEpisode() {
        return newEpisode;
    }

    public String getTitle() {
        return title;
    }
}
