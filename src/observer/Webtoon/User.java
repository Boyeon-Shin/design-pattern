package observer.Webtoon;

public class User implements Subscribe {
    private String name;
    private boolean allowSubscription = true;
    Ppodaejaglyeol ppodaejaglyeol ;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void send() {
        if (allowSubscription == true) {
            System.out.println(name + "님께 알림 전송: " +
                    ppodaejaglyeol.getTitle() + "의 새로운 시리즈가 나왔습니다 - " + ppodaejaglyeol.getNewEpisode());
        }
    }

    public void allowSubscription(boolean allowSubscription) {
        this.allowSubscription = allowSubscription;
    }

}
