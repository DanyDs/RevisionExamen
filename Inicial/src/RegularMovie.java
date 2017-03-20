
public class RegularMovie extends Movie {

	public RegularMovie(String title, int priceCode) {
		super(title, priceCode);
		
	}

	@Override
	public double calculateMovieAmount(double thisAmount, Rental each) {
		thisAmount += 2;
		if (each.getDaysRented() > 2)
			thisAmount += (each.getDaysRented() - 2) * 1.5;
		return thisAmount;
	}	

}
