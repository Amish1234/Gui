import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.awt.event.ActionEvent;

public class ImageSelector {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImageSelector window = new ImageSelector();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ImageSelector() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 998, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_1185325741779");
		panel.setLayout(null);
		
		final JCheckBox chckbxA = new JCheckBox("a");
		chckbxA.setBounds(146, 143, 129, 23);
		panel.add(chckbxA);
		
		final JCheckBox chckbxB = new JCheckBox("b");
		chckbxB.setBounds(146, 170, 129, 23);
		panel.add(chckbxB);
		
		final JCheckBox chckbxC = new JCheckBox("c");
		chckbxC.setBounds(146, 197, 129, 23);
		panel.add(chckbxC);
		
		final JCheckBox chckbxD = new JCheckBox("d");
		chckbxD.setBounds(146, 224, 129, 23);
		panel.add(chckbxD);
		
		final JCheckBox chckbxE = new JCheckBox("e");
		chckbxE.setBounds(146, 251, 129, 23);
		panel.add(chckbxE);
		
		final JCheckBox chckbxF = new JCheckBox("f");
		chckbxF.setBounds(146, 278, 129, 23);
		panel.add(chckbxF);
		
//		ImageIcon image = new ImageIcon("image/pic1.jpg");
//		JLabel label = new JLabel("", image, JLabel.CENTER);
//		JPanel panel = new JPanel(new BorderLayout());
//		panel.add( label, BorderLayout.CENTER );
		
		// If using absolute layout
//		ImageIcon background = new ImageIcon("Background/background.png");
//		JLabel label = new JLabel();
//		label.setBounds(0, 0, x, y);
//		label.setIcon(background);
//
//		JPanel panel = new JPanel();
//		panel.setLayout(null);
//		panel.add(label);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(340, 100, 324, 225);
		lblNewLabel.setIcon(new ImageIcon("earth.jpg"));
		panel.add(lblNewLabel);
		
		final JCheckBox chckbxG = new JCheckBox("g");
		chckbxG.setBounds(678, 140, 130, 23);
		panel.add(chckbxG);
		
		final JCheckBox chckbxH = new JCheckBox("h");
		chckbxH.setBounds(678, 167, 130, 23);
		panel.add(chckbxH);
		
		final JCheckBox chckbxI = new JCheckBox("i");
		chckbxI.setBounds(678, 194, 130, 23);
		panel.add(chckbxI);
		
		final JCheckBox chckbxJ = new JCheckBox("j");
		chckbxJ.setBounds(678, 221, 130, 23);
		panel.add(chckbxJ);
		
		final JCheckBox chckbxK = new JCheckBox("k");
		chckbxK.setBounds(678, 248, 130, 23);
		panel.add(chckbxK);
		
		final JCheckBox chckbxL = new JCheckBox("l");
		chckbxL.setBounds(678, 275, 130, 23);
		panel.add(chckbxL);
		
		final JCheckBox chckbxM = new JCheckBox("m");
		chckbxM.setBounds(678, 302, 130, 23);
		panel.add(chckbxM);
		
		// Submit button: 
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = new String();
				
				// Save the content of check boxes
				if (chckbxA.isSelected())
					str = "A is selected\n";
				
				if (chckbxB.isSelected())
					str += "B is selected\n";
				
				if (chckbxA.isSelected())
					str += "C is selected\n";
				
				if (chckbxD.isSelected())
					str += "D is selected\n";
				
				if (chckbxE.isSelected())
					str += "E is selected\n";
				
				if (chckbxF.isSelected())
					str += "F is selected\n";
				
				if (chckbxG.isSelected())
					str += "G is selected\n";
				
				if (chckbxH.isSelected())
					str += "H is selected\n";
				
				if (chckbxI.isSelected())
					str += "I is selected\n";
				
				if (chckbxJ.isSelected())
					str += "J is selected\n";
				
				if (chckbxK.isSelected())
					str += "K is selected\n";
				
				if (chckbxL.isSelected())
					str += "L is selected\n";
				
				if (chckbxM.isSelected())
					str += "M is selected\n";
				
				// Save string to text file
				saveToText(str);
				
				// Clear check boxes
				chckbxA.setSelected(false);
				chckbxB.setSelected(false);
				chckbxC.setSelected(false);
				chckbxD.setSelected(false);
				chckbxE.setSelected(false);
				chckbxF.setSelected(false);
				chckbxG.setSelected(false);
				chckbxH.setSelected(false);
				chckbxI.setSelected(false);
				chckbxJ.setSelected(false);
				chckbxK.setSelected(false);
				chckbxL.setSelected(false);
				chckbxM.setSelected(false);

				// Display save message
				JOptionPane.showMessageDialog(null, "Successfully saved content in a text file. Press next to see next image.");
			}

			private void saveToText(String str){
				
				try {
					
					if(Files.exists(Paths.get("earthText.txt"))) { 
						PrintWriter writer = new PrintWriter("gator.txt", "UTF-8");
						writer.println(str);
						writer.close();	
					}
					
					PrintWriter writer = new PrintWriter("earthText.txt", "UTF-8");
					writer.println(str);
					writer.close();	
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnSubmit.setBounds(370, 359, 223, 74);
		panel.add(btnSubmit);
		
		// Next image button: 
		JButton button = new JButton(">");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Display left arrow key, remove right arrow key
				
				// Clear check boxes
				chckbxA.setSelected(false);
				chckbxB.setSelected(false);
				chckbxC.setSelected(false);
				chckbxD.setSelected(false);
				chckbxE.setSelected(false);
				chckbxF.setSelected(false);
				chckbxG.setSelected(false);
				chckbxH.setSelected(false);
				chckbxI.setSelected(false);
				chckbxJ.setSelected(false);
				chckbxK.setSelected(false);
				chckbxL.setSelected(false);
				chckbxM.setSelected(false);
				
				// Display the next image
				lblNewLabel.setIcon(null);
				frame.remove(lblNewLabel);
				frame.remove(button);
				frame.revalidate();
				frame.repaint();
				
				JLabel lblNewLabel2 = new JLabel();
				lblNewLabel2.setBounds(340, 100, 324, 225);
				lblNewLabel2.setIcon(new ImageIcon("gator.png"));
				panel.add(lblNewLabel2);				
				
			}
		});
		button.setBounds(829, 191, 117, 89);
		panel.add(button);
		
		JButton button_1 = new JButton("<");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// Display left arrow key, remove right arrow key
				
				// Clear check boxes
				chckbxA.setSelected(false);
				chckbxB.setSelected(false);
				chckbxC.setSelected(false);
				chckbxD.setSelected(false);
				chckbxE.setSelected(false);
				chckbxF.setSelected(false);
				chckbxG.setSelected(false);
				chckbxH.setSelected(false);
				chckbxI.setSelected(false);
				chckbxJ.setSelected(false);
				chckbxK.setSelected(false);
				chckbxL.setSelected(false);
				chckbxM.setSelected(false);
				
				// Display the next image
				lblNewLabel.setIcon(null);
				frame.remove(lblNewLabel);
				frame.remove(button);
				frame.revalidate();
				frame.repaint();
				
				JLabel lblNewLabel2 = new JLabel();
				lblNewLabel2.setBounds(340, 100, 324, 225);
				lblNewLabel2.setIcon(new ImageIcon("gator.png"));
				panel.add(lblNewLabel2);		
				
				
			}
		});
		button_1.setBounds(21, 191, 117, 89);
		panel.add(button_1);
	}
}
