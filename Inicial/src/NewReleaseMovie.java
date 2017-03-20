
public class NewReleaseMovie extends Movie{
	
		public NewReleaseMovie(String title, int priceCode) {
			super(title, priceCode);			
		}

		@Override
		public double calculateMovieAmount(double thisAmount, Rental each) {
			thisAmount += each.getDaysRented() * 3;
			return thisAmount;
		}	
}
