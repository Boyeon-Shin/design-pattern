package mediator.ex1.components;

import mediator.ex1.mediator.Mediator;

public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
