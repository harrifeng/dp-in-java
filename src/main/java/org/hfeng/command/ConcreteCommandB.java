package org.hfeng.command;

public class ConcreteCommandB implements Command {

  private Receiver receiver;

  public ConcreteCommandB(Receiver abcStock) {
    this.receiver = abcStock;
  }

  @Override
  public void execute() {
    receiver.makeFalse();
  }
}
