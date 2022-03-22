
package roughwork;

import java.util.Scanner;

public class RWEtask1_1 {
	static int numOfStud;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RWEtask1_1 mc = new RWEtask1_1();
		
		System.out.println("Enter the number of Student");
		numOfStud = sc.nextInt();
		RichardWEtask1 size[] = new RichardWEtask1[numOfStud];
		
		mc.setData(sc, size);
		mc.sortData(size);
		mc.print(size);
		
		System.out.println("Enter the SEARCH element");
		float key = sc.nextFloat();
		int n = numOfStud - 1;
		mc.Binarysearch(size, 0, n, key);

	}

	void setData(Scanner sc, RichardWEtask1 size[]) {
		System.out.println("\n student Mark");
		System.out.println("************************");

		for (int i = 0; i < numOfStud; i++) {
			RichardWEtask1 ob = new RichardWEtask1();

			
			System.out.println("Enter Tamil Mark");
			float tamilM = sc.nextFloat();
			ob.setTamil(tamilM);

			System.out.println("Enter Englisg Mark");
			float englishM = sc.nextFloat();
			ob.setEnglish(englishM);

			System.out.println("Enter Maths Mark");
			float mathsM = sc.nextFloat();
			ob.setMaths(mathsM);

			System.out.println("Enter Science Mark");
			float scienceM = sc.nextFloat();
			ob.setScience(scienceM);

			System.out.println("Enter Social Mark");
			float socialM = sc.nextFloat();
			ob.setSocial(socialM);

			size[i] = ob;

		}
	}

	void sortData(RichardWEtask1 size[]) {
		int i, j, s;
		int n = size.length;
		for (i = 0; i < n - 1; i++) {
			System.out.println(i);
			s = i;
			for (j = i + 1; j < n; j++) {
				if (size[j].getTotal() < size[s].getTotal()) {
					s = j;
				}
			}
			RichardWEtask1 temp = size[s];
			size[s] = size[i];
			size[i] = temp;

		}
	}

	void print(RichardWEtask1 size[]) {
		for (int i = 0; i < numOfStud; i++) {
			System.out.println("**************************");
			System.out.println("Tamil Mark=" + size[i].getTamil());
			System.out.println("English Mark=" + size[i].getEnglish());
			System.out.println("Maths Mark=" + size[i].getMaths());
			System.out.println("Science Mark=" + size[i].getScience());
			System.out.println("Social Mark=" + size[i].getSocial());
			System.out.println("Total Mark=" + size[i].getTotal());
			System.out.println("***************************");

		}
	}

	void Binarysearch(RichardWEtask1 size[], int f, int l, float k) {

		int m = (f + l) / 2;
		while (f <= l) {
			if (size[m].getMaths() < k) {
				f = m + 1;
			} else if (size[m].getMaths() == k) {
				System.out.println("Search Element is found at-" + m);
				// return mid;
				break;
			} else {
				l = m - 1;
			}
			m = (f + l) / 2;
		}
		if (f > l) {
			System.out.println("Element is not found");
			
		}
	}
}
