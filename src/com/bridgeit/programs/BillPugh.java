/******************************************************************************
 *  Purpose: Bill pugh singleton design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   14-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

public class BillPugh {

	public static void main(String[] args) {

		BillP p = BillP.getInstance();
		System.out.println(p.hashCode());
	}

}

class BillP {
	private BillP() {
		System.out.println("Bill Pugh Singleton Implementation");
	}

	private static class InnerHelper {
		private static BillP instance = new BillP();
	}

	public static BillP getInstance() {

		return InnerHelper.instance;
	}
}