/******************************************************************************
 *  Purpose: Facade design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/
package facadedesignpattern;

public class Iphone implements MobileShope {

	public void modelNo() {
		System.out.println("IPhone 6");
	}

	public void price() {
		System.out.println("60,000 Rs.");
	}
}
