package org.hfeng.iterator;

public class ConcreteIterator implements Iterator {

  private ConcreteAggregator concreteAggregator;
  private int index;

  public ConcreteIterator(ConcreteAggregator concreteAggregator) {
    this.concreteAggregator = concreteAggregator;
  }

  @Override
  public String next() {
    if (this.hasNext()) {
      return concreteAggregator.getNames()[index++];
    }
    return null;
  }

  @Override
  public boolean hasNext() {
    return (index < concreteAggregator.getNames().length);
  }
}


