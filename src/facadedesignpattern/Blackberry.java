/******************************************************************************
 *  Purpose: Facade design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/
package facadedesignpattern;

public class Blackberry implements MobileShope {
	public void modelNo() {
		System.out.println("Blackberry");
	}

	public void price() {
		System.out.println("45,900 Rs.");
	}
}
