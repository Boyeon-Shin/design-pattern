package mediator.ex2;

public class Door implements Component {
    private Mediator mediator;
    private String name = "창문";
//    private double temperature;

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void operation(Boolean b) {
        System.out.println(name + (b ? " 열림" : " 닫힘"));
    }
}

