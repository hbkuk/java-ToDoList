package scheduler.checkbox.study;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class frame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("ToDoList");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("To-Do-List");
		JPanel btnPanel = new JPanel();
		JButton btn1 = new JButton("Add Task");
		JButton btn2 = new JButton("Clear Complete Tasks");
		JTextArea txtArea = new JTextArea();
		
		
		
		frame.add(panel); 
		panel.setLayout(new BorderLayout());
		panel.add(label, BorderLayout.NORTH);
		label.setPreferredSize(new Dimension(100,100));
		panel.add(txtArea, BorderLayout.CENTER);
		
		
		label.setFont(label.getFont().deriveFont(50.0f));
		label.setHorizontalAlignment(JLabel.CENTER);
		
		
		panel.add(btnPanel, BorderLayout.SOUTH);
		btnPanel.add(btn1);
		btnPanel.add(btn2);
		
		//frame 설정
		frame.setVisible(true);
		frame.setSize(800, 600);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
};
		
		
		//label 설정
		//panel.add(label, BorderLayout.NORTH);
		
		//panel 설정
		//frame.add(panel);
		//panel.setLayout(new BorderLayout());
		
		//frame 설정
		//frame.setVisible(true);
		//frame.setSize(800, 600);
		//frame.setResizable(true);
		//frame.setLocationRelativeTo(null);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);