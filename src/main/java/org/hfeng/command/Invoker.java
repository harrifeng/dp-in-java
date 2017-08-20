package org.hfeng.command;

import java.util.ArrayList;
import java.util.List;

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
