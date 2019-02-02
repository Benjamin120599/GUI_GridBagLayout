
import javax.swing.*;
import java.awt.*;
import java.nio.channels.GatheringByteChannel;



public class GUI_GridBagLayout extends JFrame {
	
	public GUI_GridBagLayout () {
		crearComponentes();
	}
	
	GridBagLayout gbl = new GridBagLayout();
	
	public void metodoGeneral(JComponent component, int x, int y, int ancho, int alto, int orientacion) {
		
		GridBagConstraints gbc = new GridBagConstraints();
		
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = ancho;
		gbc.gridheight = alto;
		gbc.fill = orientacion;
		gbl.setConstraints(component, gbc);
		add(component);
		
	}
	
	public void crearComponentes() {
		
		GridBagConstraints gbc = new GridBagConstraints();
		getContentPane().setLayout(gbl);
		setTitle("FORMULARIO");
		setLocationRelativeTo(null);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		Font Titulo = new Font("Arial", Font.PLAIN, 12);
		
		JLabel label1 = new JLabel("<html><p>The <b>Classic Form</b> to includes all visible fields for \r\nthis list.</p></html>");
		label1.setFont(Titulo);
		metodoGeneral(label1, 0, 0, 1, 1, 2);
		
		JLabel label2 = new JLabel("<html><p>Form options</p></html>");
		label2.setFont(new Font("Arial", Font.BOLD, 13));
		metodoGeneral(label2, 0, 1, 1, 1, 2);
		
		JLabel label3 = new JLabel("<html><p>Include the following:</p></html>");
		label3.setFont(new Font("Arial", Font.PLAIN, 12));
		metodoGeneral(label3, 0, 2, 1, 1, 2);
		
		JCheckBox checkBox1 = new JCheckBox("   A title for you form.");
		checkBox1.setFont(Titulo);
		checkBox1.setBackground(Color.WHITE);
		metodoGeneral(checkBox1, 0, 3, 1, 1, 2);
		
		JTextField textField1 = new JTextField("   Subscribe to our mailing list.");
		metodoGeneral(textField1, 0, 4, 1, 1, 2);
		
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton radioButton1 = new JRadioButton("   Only required fields.");
		radioButton1.setFont(Titulo);
		radioButton1.setBackground(Color.WHITE);
		bg.add(radioButton1);
		metodoGeneral(radioButton1, 0, 5, 1, 1, 2);
		
		pack();
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new GUI_GridBagLayout();
			}
		});

	}

}
