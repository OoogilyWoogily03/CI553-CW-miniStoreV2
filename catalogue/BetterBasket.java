package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.ArrayList;

public class BetterBasket extends Basket {
	public boolean add (Product pr)
	{
		for(Product prInList: this) {
			if(prInList.getProductNum().equals(pr.getProductNum())) {
			int quantity = pr.getQuantity()+ prInList.getQuantity();
			prInList.setQuantity(quantity);
			return(true);
			}
		}
	super.add(pr);
	Collections.sort(this);
	return(true);
}
}