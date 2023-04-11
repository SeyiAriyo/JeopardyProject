import javax.swing.SwingUtilities;

/**
 * ---------------------------------------------------------------------------
 * File name: Main.java
 * Project name: Jeopardy
 * ---------------------------------------------------------------------------
 * Creator's name and email: Forrest Cline, forrestcline@gmail.com
 * Creation Date: Apr 10, 2023
 * ---------------------------------------------------------------------------
 */

/**
 * Enter type purpose here
 *
 * <hr>
 * Date created: Apr 10, 2023
 * <hr>
 * @author Forrest Cline
 */
public class Main
{

	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Apr 10, 2023
	 *
	 * <hr>
	 * @param args
	 */
	public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
           public void run() {
                new GUI();
            }
        });
    }
}
