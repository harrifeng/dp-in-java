package org.hfeng.command;

public class ConcreteCommandA implements Command {

  private Receiver receiver;

  public ConcreteCommandA(Receiver abcStock) {
    this.receiver = abcStock;
  }

  @Override
  public void execute() {
    receiver.makeTrue();
  }
}
