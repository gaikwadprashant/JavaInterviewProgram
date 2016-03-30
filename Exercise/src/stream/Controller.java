package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import stream.Fruit;

public class Controller {

	public static void main(String[] args) {
		//sortByCalories();
		//sortByFruitColor();
		//Stream<News> fruitStream  = Controller.getFruit().stream();
		//int transactionIdList = Controller.getNews().stream().reduce(0, Integer::sum);
				//.map(News::getNewsId)
				//.collect(Collectors.toList());	
		//System.out.println("List of news is "+transactionIdList);
		
	}

	public static void sortByFruitColor() {
		java.util.Map<String, List<Fruit>> groupByColor =  Controller.getFruit()
	            .stream().sorted(Comparator.comparing(Fruit :: getColor).reversed()).collect(Collectors.groupingBy(Fruit::getColor));

		System.out.println("Group by color "+groupByColor);
	}

	public static void sortByCalories() {
		Stream<Fruit> fruitStream  = Controller.getFruit().stream();
		Predicate<Fruit> predicate = (Fruit f) -> f.getCalories() < 100;
		List<Fruit> listFruitByCal = (List<Fruit>) fruitStream.filter(predicate).sorted(Comparator.comparing(Fruit :: getCalories)).collect(Collectors.toList());
		System.out.println("Sorted by calories "+listFruitByCal);
	}

	public static List<Fruit> getFruit(){
		List<Fruit> listFruits = new ArrayList<Fruit>();
		listFruits.add(new Fruit("Apple", 200, 100, "Red"));
		listFruits.add(new Fruit("Banana", 100, 50, "Yellow"));
		listFruits.add(new Fruit("Watermelon", 400, 200, "Green"));
		listFruits.add(new Fruit("Grapes", 50, 90, "Dark Brown"));
		listFruits.add(new Fruit("PineApple", 1500, 300, "Greenish"));
		listFruits.add(new Fruit("Mango", 800, 1000, "Yellowish"));
		listFruits.add(new Fruit("Mango123", 80, 1000, "Yellowish"));
		return listFruits;
	}
	
	public static List<News> getNews(){
		List<News> listNews = new ArrayList<News>();
		listNews.add(new News(1, "BBC", "IndianUser", "First comment"));
		listNews.add(new News(2, "ABP", "IndianUserABP", "First comment IndianUser1"));
		listNews.add(new News(3,"IE", "IndianUserIE", "First comment IndianUserIE"));
		listNews.add(new News(4, "HT", "IndianUserHT", "First comment IndianUserHT"));
		listNews.add(new News(5, "LokSatta", "IndianUserLokSatta", "First comment LokSatta"));
		listNews.add(new News(6, "LokSatta", "IndianUserLokSatta1", "Second comment LokSatta"));
		listNews.add(new News(7, "BBC", "IndianUser", "First comment"));
		listNews.add(new News(8, "BBC", "IndianUser", "First comment"));
		return listNews;
	}
}
