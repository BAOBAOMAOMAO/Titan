package levelBuilder.move.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import levelBuilder.entity.Move;
import levelBuilder.game.LevelBuilder;
import levelBuilder.move.EnableSquareMove;
import levelBuilder.view.LBPanel;

public class EnableSquareController implements ActionListener{

	protected LevelBuilder lb;
//	protected LBPanel panel;
	
	public EnableSquareController(LevelBuilder lb){
		this.lb = lb;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Integer rowFrom = Integer.parseInt(lb.getLbPanel().getRowFrom().getText());
		Integer rowTo = Integer.parseInt(lb.getLbPanel().getRowTo().getText());
		Integer colFrom = Integer.parseInt(lb.getLbPanel().getColFrom().getText());
		Integer colTo = Integer.parseInt(lb.getLbPanel().getColTo().getText());
		
		Move m = new EnableSquareMove(lb.getModel().getDisableSquareList(), rowFrom, rowTo, colFrom, colTo);
	
		if(m.execute(lb)){
			lb.pushMove(m);
		}
	}

}
