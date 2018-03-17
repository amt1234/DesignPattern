/******************************************************************************
 *  Purpose: Facade design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/
package facadedesignpattern;

public class Shopkeeper {

	private MobileShope iphone;
	private MobileShope samsung;
	private MobileShope blackberry;

	public Shopkeeper() {
		iphone = new Iphone();
		samsung = new Samsung();
		blackberry = new Blackberry();
	}

	public void iphoneSale() {
		iphone.modelNo();
		iphone.price();
	}

	public void samsungSale() {
		samsung.modelNo();
		samsung.price();
	}

	public void blacberrySale() {
		blackberry.modelNo();
		blackberry.price();
	}
}
