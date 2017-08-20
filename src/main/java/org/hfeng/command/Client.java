package org.hfeng.command;

public class Client {

  public static void main(String[] args) {
    Invoker invoker = new Invoker();
    Receiver receiver = new Receiver();
    Command makeItTrue = new ConcreteCommandA(receiver);
    Command makeItFalse = new ConcreteCommandB(receiver);

    invoker.setCommand(makeItTrue);
    invoker.invoke();

    invoker.setCommand(makeItFalse);
    invoker.invoke();
  }
}
