package org.hfeng.iterator;

public class ConcreteAggregator implements Aggregator {

  public String[] getNames() {
    return names;
  }

  private String names[] = {"Alice", "Bell", "Carl"};

  @Override
  public Iterator getIterator() {
    return new ConcreteIterator(this);
  }
}
