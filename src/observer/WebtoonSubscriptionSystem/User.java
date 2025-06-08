package observer.WebtoonSubscriptionSystem;

public class User implements Subscribe{
    private String name;
    private boolean allowSubscription = true;
    Webtoon webtoon;

    public void setWebtoon(final Webtoon webtoon) {
        this.webtoon = webtoon;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public void send() {
        if (allowSubscription == true) {
            System.out.println(name + "님께 알림 전송: " +
                    webtoon.getTitle() + "의 새로운 시리즈가 나왔습니다 - " + webtoon.getNewEpisode());
        }
    }

    public void allowSubscription(boolean allowSubscription) {
        this.allowSubscription = allowSubscription;
    }

}
