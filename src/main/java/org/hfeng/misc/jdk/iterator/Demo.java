package org.hfeng.misc.jdk.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    List l = new ArrayList<String>();
    l.add("Alice");
    l.add("Bell");
    l.add("Carl");

    for (Iterator iterator = l.iterator(); iterator.hasNext(); ) {
      System.out.println(iterator.next());
    }
  }
}
