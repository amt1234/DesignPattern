/******************************************************************************
 *  Purpose: Observer design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/
package observerdesignpattern;

public interface Subject {
	// methods to register and unregister observers
	public void register(Observer obj);

	public void unregister(Observer obj);

	// method to notify observers of change
	public void notifyObservers();

	// method to get updates from subject
	public Object getUpdate(Observer obj);
}
