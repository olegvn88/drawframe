package structure;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class homewindow {

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			JFrame frame = new MainFrame();
			frame.setTitle("Finance calculator");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
		});
	}
}

class MainFrame extends JFrame {

	public MainFrame(){
//		add(new MainComponent());
//		pack();
		add(new Rectangle());
		pack();
//		Image imageIcon = new ImageIcon("map.gif").getImage();
//		setIconImage(imageIcon);
	}


}

class MainComponent extends JComponent {

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(Color.BLUE.getRGB()));
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString("Hello, Guys", 200, 200);
		g.setColor(new Color(Color.GREEN.getRGB()));
		g.setFont(new Font("Arial", Font.BOLD, 30));
		g.drawString("Bye-bye, Guys", 200, 300);


	}

	@Override
	public Dimension getPreferredSize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeigh = screenSize.height;
		setLocation(screenWidth / 2, screenHeigh / 2);
		return  new Dimension(screenWidth, screenHeigh);
	}
}

class Rectangle extends JComponent{
	@Override
	public void paintComponent(Graphics g) {
		g.setFont(new Font("Tahoma", Font.BOLD, 40));
		g.drawString("Oleg", 200, 100);
		Rectangle2D floatReact = new Rectangle2D.Float(100.F, 250.0F, 220.5F, 200.0F);
		Rectangle2D doubleReact = new Rectangle2D.Double(500.d, 250.0d, 220.5d, 200.0d);
		Graphics2D g2 = (Graphics2D)g;
		g2.draw(floatReact);
		Graphics2D g3 = (Graphics2D)g;
		g3.draw(doubleReact);
	}

	@Override
	public Dimension getPreferredSize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenWidth = screenSize.width;
		int screenHeigh = screenSize.height;
		setLocation(screenWidth / 2, screenHeigh / 2);
		return  new Dimension(screenWidth, screenHeigh);
	}
}