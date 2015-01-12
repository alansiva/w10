package com.bitcamp.day01;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Exercise class for GUI. 
 * Make a window that contains a panel which reacts on mouse click and draws a rectangle 
 * at the position where the click occurred
 */

public class Vjezba01 {

	public static void main(String[] args) {

		JFrame window = new JFrame("vjezba");
		DrawOnClick panel = new DrawOnClick();
		DrawOnClick clickListener = new DrawOnClick();
		panel.addMouseListener(clickListener);

		window.setContentPane(panel);
		window.setSize(400, 400);
		window.setLocation(400, 200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public static class DrawOnClick extends JPanel implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			Component krug = (Component) e.getSource();
			Graphics g = krug.getGraphics();

			int size = 40;

			g.fillRect(e.getX() - size / 2, e.getY() - size / 2, size, size);

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub

		}

	}

}
