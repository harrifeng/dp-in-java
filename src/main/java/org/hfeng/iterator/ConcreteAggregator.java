package org.hfeng.iterator;

public class ConcreteAggregator implements Aggregator {

  public String names[] = {"Alice", "Bell", "Carl"};

  @Override
  public Iterator getIterator() {
    return new ConcreteIterator();
  }

  class ConcreteIterator implements Iterator {

    private int index;

    @Override
    public String next() {
      if (this.hasNext()) {
        return names[index++];
      }
      return null;
    }

    @Override
    public boolean hasNext() {
      return (index < names.length);


    }
  }
}
