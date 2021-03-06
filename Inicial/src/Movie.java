
public abstract class Movie {

	public static final int CHILDRENS = 2;
	public static final int NEW_RELEASE = 1;
	public static final int REGULAR = 0;

	private String _title;
	private int _priceCode;

	public Movie(String title, int priceCode) {
		super();
		_title = title;
		_priceCode = priceCode;
	}

	public int getPriceCode() {
		return _priceCode;
	}

	public void setPriceCode(int arg) {
		_priceCode = arg;
	}
	public String getTitle() {
		return _title;
	}
	
	public double calculateAmount(Rental each, double thisAmount){
		thisAmount = each.getMovie().calculateMovieAmount(thisAmount, each);		
		return thisAmount;
	}
	
	public abstract double calculateMovieAmount(double thisAmount, Rental each);

}
