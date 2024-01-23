package com.company;
import java.util.ArrayList;
import java.util.Collections;

public class Main  {

    public static void main(String[] args) {
	ArrayList<Jacket> jackets = new ArrayList<Jacket>();
    jackets. add(new Jacket("Guchi", "Spring", 30));
    jackets.add(new Jacket("Chanel", "Winter", 45));
    jackets.add(new Jacket("Bulvari", "Summer", 66));
    jackets.add(new Jacket("Coco", "Autumn", 90));
    Collections.sort(jackets);
    for(Jacket o : jackets){
        System.out.println(o.toString());
    }

    }
}
