/******************************************************************************
 *  Purpose: Facade design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/
package facadedesignpattern;

public class Samsung implements MobileShope {
	public void modelNo() {
		System.out.println("Samsung galaxy");
	}

	public void price() {
		System.out.println("50,000 Rs.");
	}
}
