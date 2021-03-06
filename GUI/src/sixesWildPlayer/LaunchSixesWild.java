package sixesWildPlayer;

import sixesWild.model.AllLevel;
import sixesWild.model.Board;
import sixesWild.model.Model;
import sixesWild.view.SelectLevelView;
//In elimination mode, reset didn't take move limit. Fix this later!!
public class LaunchSixesWild 
{
	final static String inputLevels = "src/";
	final static String inputStates = "src/stateInput.txt";
	public static AllLevel initializeLevels() throws Exception
	{
		AllLevel allLevels = new AllLevel(inputLevels, inputStates);
		return allLevels;
	}
	public static void main(String[] args) throws Exception
	{
		AllLevel al=initializeLevels();
		//Initialize the board with the first level.
		Board startingBoard = new Board(al.getGivenLevel(1));
		Model m = new Model(al, startingBoard);
		SelectLevelView slv=new SelectLevelView(m);
		slv.setVisible(true);
	}
}
