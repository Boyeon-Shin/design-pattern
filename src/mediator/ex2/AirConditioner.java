package mediator.ex2;



public class AirConditioner implements Component {
    private Mediator mediator;
    private String name = "에어컨";

    @Override
    public void setMediator(final Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void operation(Boolean b) {
        System.out.println(name + (b ? " 킴" : " 끔"));
    }
}
