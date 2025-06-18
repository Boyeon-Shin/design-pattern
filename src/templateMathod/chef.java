package templateMathod;

public class chef {
    public static void main(String[] args) {
        HotChicken hotChicken = new HotChicken();
        Teogbokk tong = new Teogbokk();
        BokkEumbab bokkEumbab = new BokkEumbab();

        hotChicken.cooking();
        System.out.println();

        tong.cooking();
        System.out.println();

        bokkEumbab.cooking();
        System.out.println();
    }
}
