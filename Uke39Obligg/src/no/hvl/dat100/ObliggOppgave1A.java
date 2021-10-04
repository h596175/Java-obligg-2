package no.hvl.dat100;

public class ObliggOppgave1A {
	
	public static void skrivUt(int [] tabell) {
		for (int i =0; i<=tabell.length-1; i++) {
			int x = tabell[i];
			System.out.println(x);
			
		}
	}
	
	
	public static int summer (int[] tabell) {
		int sum=0;
		for (int i =0; i<=tabell.length-1; i++) {
			int x = tabell[i];
			sum = sum+x;
		}
		return sum;
	}
	
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean a = false;
		for (int i =0; i<tabell.length; i++) {
			int x = tabell[i];
			if (x==tall)
				a=true;
		}
		return a;
	}
public static int posisjonTall(int[] tabell, int tall) {
	int posisjon=-1;
	for (int i =0; i<tabell.length; i++) {
		int x = tabell[i];
			if (x==tall)
				posisjon = i;
	}
	return posisjon;
	
}

public static int[] reverser (int[] tabell) {
	int nytabell[] =  new int [tabell.length];
	
	for (int i =0; i<tabell.length; i++) {
		int x = tabell[tabell.length-1-i];
		nytabell[i]=x;	

	}
	return nytabell;
}

public static boolean erSortert(int[] tabell) {
	
	int j = 0;
	boolean sortert = true;
	
	while (sortert && j < tabell.length - 1 )	{	
	if (tabell[j] > tabell[j+1]) {
	sortert = false;
		}
		j++;
	}
	return sortert;}

public static int[] settSammen (int[] tabell1, int[]tabell2) {
	int x =(tabell1.length);
	int y = (tabell2.length);
	
	int z= x+y;
	int nytabell[] = new int[z];
	
	for (int i =0; i<tabell1.length; i++) {
		int o =tabell1[i];
		nytabell[i]=o;
		
	}
	for (int l=0; l<tabell2.length; l++) {
		int p = tabell2[l];
		nytabell[nytabell.length-1-l]=p;
	}
	return nytabell;
}

public static String tilStreng (int[] tabell) {
	
	String print = "{";
	
	for (int i =0; i<tabell.length; i++) {
		print += tabell[i];
		if (i !=tabell.length-1)
			print += ",";
	}
	print += "}";
	return print;
}





	
	public static void main(String[] args) {
	int[] tabell = {1,2,3};
	int [] tabell2= {3,2,1};
	int []tabell1= {4,5,6,5};
	skrivUt(tabell);
	System.out.println(tilStreng(tabell));
	System.out.println(erSortert(tabell));
	System.out.println(summer(tabell));
	System.out.println(finnesTall(tabell,4));
	System.out.println(posisjonTall(tabell,5));
	skrivUt(reverser(tabell));
	reverser(tabell);
	System.out.println(erSortert(tabell2));
	skrivUt(settSammen(tabell1,tabell2));
	}

}