package com.lti.demo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie>
{
	String movieName;
	private int relYear;
	
	
	public Movie(String movieName, int relYear) 
	{
		this.movieName = movieName;
		this.relYear = relYear;
	}


	public String getMovieName() {
		return movieName;
	}


	public int getRelYear() {
		return relYear;
	}


	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 0;
	}


	
}

public class Colls {

	public static void main(String args[])
	{
		List<Movie> mv=new ArrayList<Movie>();
		mv.add(new Movie("M17",2022));
		mv.add(new Movie("Andhadhun",2019));
		mv.add(new Movie("War",2020));
		
		Collections.sort(mv,new Comparator<Movie>()
		{
			public int compare(Movie o1,Movie o2) 
			{
				return o1.movieName.compareTo(o2.movieName);
			}
			
		});
		for(Movie m:mv)
		{
			System.out.println(m.getMovieName()+" "+m.getRelYear());
		}
		}
}
