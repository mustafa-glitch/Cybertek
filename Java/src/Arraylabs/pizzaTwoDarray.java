package Arraylabs;

import java.util.Arrays;

public class pizzaTwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pizzas[][] = {
				       {"pinapple","tomato", "mushroom"},
		
		               {"olive","soy sauce"},
		               {"anchoves","four cheese"},
		               {"chicken","meat"}
		};
		
		
		for(int i =0; i<pizzas.length; i++) {
			for(int j=0; j<pizzas[i].length; j++) {
				System.out.println(pizzas[i][j]);
			}
		}
		
		System.out.println("-----------------------------");
		for(String[] pizza1: pizzas) {
			System.out.println(pizzas.length+"-");
			System.out.println(Arrays.toString(pizza1));
		}
	}

}
