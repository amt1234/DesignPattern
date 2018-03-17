/******************************************************************************
 *  Purpose: Observer design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/
package observerdesignpattern;

public interface Observer {
	// method to update the observer, used by subject
	public void update();

	// attach with subject to observe
	public void setSubject(Subject sub);
}
