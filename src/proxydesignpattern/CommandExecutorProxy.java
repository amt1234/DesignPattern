/******************************************************************************
 *  Purpose: proxy design pattern

 *  @author  Poonam
 *  @version 1.0
 *  @since   15-03-2018
 *
 ******************************************************************************/
package proxydesignpattern;

public class CommandExecutorProxy implements CommandExecutor {

	private boolean isAdmin;
	private CommandExecutor executor;

	public CommandExecutorProxy(String user, String pwd) {
		if ("Pankaj".equals(user) && "J@urnalD$v".equals(pwd))
			isAdmin = true;
		executor = new CommandExecutorImpl();
	}

	@Override
	public void runCommand(String cmd) throws Exception {
		if (isAdmin) {
			executor.runCommand(cmd);
		} else {
			if (cmd.trim().startsWith("rm")) {
				throw new Exception("rm command is not allowed for non-admin users.");
			} else {
				executor.runCommand(cmd);
			}
		}
	}

}
