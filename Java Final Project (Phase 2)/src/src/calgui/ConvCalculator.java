package calgui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import conversions.Volume;
import conversions.Currency;
import conversions.Temperature;
import conversions.Time;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class ConvCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConvCalculator frame = new ConvCalculator();
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
	public ConvCalculator() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ConvCalculator.class.getResource("/resources/flask.png")));
		setTitle("Conversion Calculator");
		setBounds(100, 100, 400, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_VolumeButton = new JButton("Volume");
		btn_VolumeButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) { 
				Volume degToRadians_window = new Volume();
				degToRadians_window.setVisible(true);
			}
		});
		btn_VolumeButton.setToolTipText("");
		btn_VolumeButton.setBounds(20, 70, 150, 60);
		contentPane.add(btn_VolumeButton);
		
		JButton btn_TemperatureButton = new JButton("Temperature");
		btn_TemperatureButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				Temperature temperature = new Temperature();
				temperature.setVisible(true);
			}
		});
		btn_TemperatureButton.setToolTipText("");
		btn_TemperatureButton.setBounds(20, 200, 150, 60);
		contentPane.add(btn_TemperatureButton);
		
		JButton btn_CurrencyButton = new JButton("Currency");
		btn_CurrencyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Currency currency = new Currency();
				currency.setVisible(true);
			}
		});
		btn_CurrencyButton.setToolTipText("");
		btn_CurrencyButton.setBounds(200, 70, 150, 60);
		contentPane.add(btn_CurrencyButton);
		
		JButton btn_TimeButton = new JButton("Time");
		btn_TimeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Time timeWindow = new Time();
				timeWindow.setVisible(true);
			}
		});
		btn_TimeButton.setToolTipText("");
		btn_TimeButton.setBounds(200, 200, 150, 60);
		contentPane.add(btn_TimeButton);
		
		JLabel lbl_Description = new JLabel("Convert from one unit to another!");
		lbl_Description.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Description.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbl_Description.setBounds(20, 10, 330, 30);
		contentPane.add(lbl_Description);

	}
}
