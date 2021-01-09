package com.lti.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

class Interval
{
	int start,end;
	Interval(int start,int end)
	{
		this.start=start;
		this.end=end;
	}
}

 class Coding 
 {
 

List<Interval> mergeIntervals(Interval [] intervals )
 {
		/* if(intervals == null || intervals.length<=1)
		 {
			 return intervals;
		 }
		*/
		 List<Interval> result = new ArrayList<>();
		// Collections.sort(intervals, Comparator.comparing(interval it-> it.start));
		 //Collections.sort(intervals,Comparator.comparing((Interval itl)->itl.start));
		 Interval t = intervals[0];
		 for(int i=1; i<intervals.length; i++){
		 Interval c = intervals[i];
		 if(c.start <= t.end){
		 t.end = Math.max(t.end, c.end);
		 }else{
		 result.add(t);
		 t = c;
		 }
		 }
		 result.add(t);
		 return result;
		 }
	 


 
 public static void main(String args[])
 {
	 Interval input[]=new Interval[4];
	 input[0]=new Interval(6,8);
	 input[0]=new Interval(1,9);
	 input[0]=new Interval(2,4);
	 input[0]=new Interval(4,7);
	 Interval res=(Interval) new Coding().mergeIntervals(input);
 }
}
