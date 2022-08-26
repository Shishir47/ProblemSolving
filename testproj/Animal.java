package testproj;
import java.util.Scanner;
public class Animal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String animal,animal2,animal3;
		animal=sc.nextLine();
		animal2=sc.nextLine();
		animal3=sc.nextLine();
		if(animal.equals("vertebrado")) {
			if(animal2.equals("ave")) {
				if(animal3.equals("carnivoro")) {
					System.out.println("aguia");
				}
				else if(animal3.equals("onivoro")){
					System.out.println("pomba");
				}
			}
			else if(animal2.equals("mamifero")){
				if(animal3.equals("onivoro")) {
					System.out.println("homem");
				}
				else if(animal3.equals("herbivoro")){
					System.out.println("vaca");
				}
			}
		}
		else if(animal.equals("invertebrado")){
			if(animal2.equals("inseto")) {
				if(animal3.equals("hematofago")) {
					System.out.println("pulga");
					
				}
				else if(animal3.equals("herbivoro")){
					System.out.println("lagarta");
				}
			}
			else if(animal2.equals("anelideo")){
				if(animal3.equals("hematofago")) {
					System.out.println("sanguessuga");
				}
				else if(animal3.equals("onivoro")){
					System.out.println("minhoca");
				}
			}
		}	
sc.close();
	}

}
