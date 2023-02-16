package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;

import com.google.common.collect.Streams;

public class javastream {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("gmh");
		names.add("bcd");
		names.add("cde");
		names.add("fih");
		names.add("fov");
		int count = 0;
		for(int i = 0; i < names.size(); i++)
		{
			String actual = names.get(i);
			if(actual.startsWith("f"))
			{
				count ++;
				//System.out.println(count);
			}
		}
		System.out.println(count);
		streamfilter();
		streammap();
	}
	public static void streamfilter()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("gmh");
		names.add("bcd");
		names.add("cde");
		names.add("fihddd");
		names.add("fovbbb");
		Long c = names.stream().filter(s->s.startsWith("f")).count();  //data  type of count is long in javastream
		System.out.println(c);	//filter - intermediate operation //count - terminal operation
		//no life for intermediate operation if there is no terminal operation..
		//terminal operation will execute only if intermediate operation returns true..
		long d = Stream.of("rahul","ajay","gokul","krishi").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		System.out.println(d);  
		//print all the names in arraylist
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		//limit is used to limit the results
	}
	public static void streammap()
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("gmh");
		names.add("bcd");
		names.add("cde");
		names.add("fih");
		names.add("fov");
		Stream.of("rahuli","ajay","gokul","krishi").filter(s->s.endsWith("i")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s)); //for some modification use map method
		List<String> namesn = Arrays.asList("rahuli","ajay","akul","akrishi");
		namesn.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//merging 2 different list
		Stream<String> newStream = Streams.concat(names.stream(),names.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("ajay"));
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
}


