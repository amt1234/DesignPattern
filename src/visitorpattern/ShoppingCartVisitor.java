/******************************************************************************
 *  Purpose: visitor design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/

package visitorpattern;

public interface ShoppingCartVisitor {

	int visit(Book book);

	int visit(Fruit fruit);
}
