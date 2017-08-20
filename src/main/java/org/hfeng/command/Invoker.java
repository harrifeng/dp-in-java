package org.hfeng.command;

public class Invoker {

  public void setCommand(Command command) {
    this.command = command;
  }

  public Command getCommand() {
    return command;
  }

  private Command command;

  public void invoke() {
    command.execute();
  }
}
