package generic_ex2;

public class HomeAgency implements Rentable<Home>{

	
	@Override
	public Home rent() {
		return new Home();
	}


	
}
