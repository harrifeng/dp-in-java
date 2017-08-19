package org.hfeng.iterator;

public class Demo {

  public static void main(String[] args) {
    ConcreteAggregator concreteAggregator = new ConcreteAggregator();
    for (Iterator iterator = concreteAggregator.getIterator(); iterator.hasNext(); ) {
      System.out.println("Name: " + iterator.next());
    }
  }
}
