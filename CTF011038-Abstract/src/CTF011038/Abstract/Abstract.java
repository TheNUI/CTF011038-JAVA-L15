package CTF011038.Abstract;

import CTF011038.Abstract.productStatus.PriceStats;

public abstract class Abstract {
	public abstract String getTitle();
	public abstract String getPrice();
	public abstract String urlImage();
	public abstract String soldText();
	
	
	
public static void main(String[] args) {
	final String name = "Nui";
	product x = new product("100","iPhone","","ขายแล้ว 10 เครื่อง");
	x.productStatus = productStatus.Status.DRAFT;
	x.priceStatus=PriceStats.DEAL;
}

}
