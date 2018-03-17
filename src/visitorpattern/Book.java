/******************************************************************************
 *  Purpose: visitor design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/
package visitorpattern;

public class Book implements ItemElement {

	private int price;
	private String isbnNumber;

	public Book(int cost, String isbn) {
		this.price = cost;
		this.isbnNumber = isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getIsbnNumber() {
		return isbnNumber;
	}

	@Override
	public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
	}

}