
public class TestPurse {

	public static void main(String[] args) {
		//Create a purse and some coins, then add the coins to the purse, 
		//and finally work out the total in the purse
		Purse p=new Purse();
		Purse p2=new Purse();

		Coin c=new Coin(0.1);
		p.getTotal();
		p.addCoins(5, c);
		p.getTotal();
		System.out.print(p.getTotal());
		System.out.print(p2.getTotal());


	}

}
