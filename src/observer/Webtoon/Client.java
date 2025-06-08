package observer.Webtoon;

public class Client {
    public static void main(String[] args) {
        Ppodaejaglyeol webtoon = new Ppodaejaglyeol();

        User boyeon = new User("Boyeon");
        boyeon.ppodaejaglyeol = webtoon;

        User sososo = new User("sososo");
        sososo.ppodaejaglyeol = webtoon;

        User anna = new User("anna");
        anna.ppodaejaglyeol = webtoon;

        boyeon.allowSubscription(true);
        sososo.allowSubscription(false);
        anna.allowSubscription(true);

        webtoon.registerObserver(boyeon);
        webtoon.registerObserver(sososo);
        webtoon.registerObserver(anna);
        webtoon.setNewEpisode("1.다시 태어났더니 내가 강아지??");

        System.out.println();
        webtoon.removeObserver(sososo);
        webtoon.registerObserver(anna);
        webtoon.setNewEpisode("2.강아지로 사랑받다.");



    }

}
