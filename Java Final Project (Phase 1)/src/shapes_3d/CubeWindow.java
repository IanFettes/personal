package shapes_3d;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class CubeWindow extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField sideLength_field;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CubeWindow frame = new CubeWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CubeWindow() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CubeWindow.class.getResource("/resources/cube.png")));
		setTitle("Cube");
		setBounds(100, 100, 250, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_sideLength = new JLabel("Enter a");
		lbl_sideLength.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_sideLength.setBounds(10, 10, 135, 17);
		contentPane.add(lbl_sideLength);
		
		sideLength_field = new JTextField();
		sideLength_field.setBounds(10, 40, 90, 20);
		contentPane.add(sideLength_field);
		sideLength_field.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(SystemColor.window);
		textPane.setBounds(10, 130, 90, 20);
		contentPane.add(textPane);
		
		JLabel lbl_area = new JLabel("Area:");
		lbl_area.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_area.setBounds(10, 100, 135, 17);
		contentPane.add(lbl_area);
		
		JLabel lblNewLabel = new JLabel("in");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(110, 40, 90, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lbl_inCubed = new JLabel("in^3");
		lbl_inCubed.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_inCubed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_inCubed.setBounds(110, 130, 90, 14);
		contentPane.add(lbl_inCubed);
		
		JButton btnCalculateButton = new JButton("Calculate");
		btnCalculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Get text from side length field box and convert it from String to Double
				Double convertedText = Double.parseDouble(sideLength_field.getText());
				convertedText = 6 * Math.pow(convertedText, 2); // Square it
				// TODO fix this
				textPane.setText(convertedText.toString()); // Set squared number to text pane for user to view
			}
		});
		btnCalculateButton.setBounds(10, 66, 89, 23);
		contentPane.add(btnCalculateButton);

	}
}
