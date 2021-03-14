package CTF011038.Abstract;

public class product {
		String number;
		String name;
		String urlImage;
		String numSold;
		public productStatus.Status productStatus;
		public productStatus.PriceStats priceStatus;

public product(String numberInput, String nameInput, String urlImageInput, String numSoldInput) {
		number = numberInput;
		name = nameInput;
		urlImage = urlImageInput;
		numSold = numSoldInput;
}
}
