package org.hfeng.command;

public class Receiver {

  private boolean status;

  public void makeTrue() {
    this.status = true;
    System.out.println("status is true now");
  }

  public void makeFalse() {
    this.status = false;
    System.out.println("status is false now");
  }
}
