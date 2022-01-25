
package MergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Interval {
  int start;
  int end;
  
  Interval(int x, int y) {
    this.start = x;
    this.end = y;
  }
}

public class MergeInterval {

  public static List<Interval> mergeIntervals(List<Interval> list) {
    if(list.size() == 0) {
      return new ArrayList<>();
    }
    
    List<Interval> result = new ArrayList<>();
   
    
    Collections.sort(list, (a, b) -> Integer.compare(a.start,  b.start));
    
    Iterator<Interval> iterator = list.iterator();
    
    Interval firstInterval = iterator.next();
    int start = firstInterval.start;
    int end = firstInterval.end;
    
    while(iterator.hasNext()) {
      Interval currentInterval = iterator.next();
      
      if(currentInterval.start < end) {
        end = Math.max(end, currentInterval.end);
      } else {
        result.add(new Interval(start, end));
        
        start = currentInterval.start;
        end = currentInterval.end;
      }
    }
    
    result.add(new Interval(start, end));

    return result;
  }
  
  public static void main(String[] args) {
    
    List<Interval> a = new ArrayList<Interval>();
    a.add(new Interval(2, 5));
    a.add(new Interval(4, 10));
    a.add(new Interval(11, 15));
    a.add(new Interval(12, 14));
    
    
    List<Interval> result = mergeIntervals(a);
    
    for(Interval interval : result) {
      System.out.println(interval.start + " " + interval.end);
    }
    
  }

}