import javax.swing.*;
import java.util.*;


	class Store{
		static String sc1,sc2;    
		static int a;

		void movie() {
			JOptionPane.showMessageDialog(null, "Welcome to Movie recommender");
			sc1= JOptionPane.showInputDialog("Enter your name");
			sc2= JOptionPane.showInputDialog("Enter your age");
			a = Integer.parseInt(sc2);
		
		}
		
	}

public class Customer{
	static List<String> FL1 = new ArrayList<String>();
	public static void main(String[] args) {
		Store obj3 = new Store();
		AgeRes.Movies();

		
		obj3.movie();
		if(Store.a <= 10 && Store.a > 0) {
			FL1.addAll(AgeRes.Age5);
		}
		else if(Store.a < 18 && Store.a > 10){
			FL1.addAll(AgeRes.Age10);
		}
		else if(Store.a >= 18){
			FL1.addAll(AgeRes.Age18);
		}
		else {
	
		}
		
		System.out.println(Store.sc1+", Recommended Movies:");
		System.out.println("");
		
		Set<String> mSet = new HashSet<String>(FL1);
		for(String sc1: mSet){
			 if(Collections.frequency(FL1,sc1)==1) {
				 System.out.println(sc1);	
			 }
		}
		System.out.println("");
		System.out.println("Have a great day.");
	
}
}