package zadatak15;

public class Proizvod {

	public static void main(String[] args) {
		// PROIZVOD NA CLENOVI VNESENI VO NIZA - ZADACA
		System.out.println("Od vneseni broevi vo nizata da se zadade proizvod." );
		Scanner input = new Scanner(System.in);
		System.out.println("Vcitaj broj na clenovi vo niza: ");
		int n = input.nextInt();
		int niza[] = new int[n];
		System.out.println("Vcitaj clenovi vo niza: ");
		for(int i = 0; i < niza.length; i++)
		{
			System.out.print(i+ " --> ");
			niza[i] = input.nextInt();
		}
		double p=1;
		for (int i=0; i < niza.length; i++)
		{
			p=p*niza[i];
		}
		System.out.println("P= "+p);
	}

}
