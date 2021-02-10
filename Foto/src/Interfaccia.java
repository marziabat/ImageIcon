import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Interfaccia extends JFrame implements ActionListener{
	
	private JPanel p1, p2;
	Object[][] data = {};
	private DefaultTableModel dtm;
	private JTable tab;
	private JScrollPane jsp;
	private JLabel lbl;
	private ImageIcon icon;
	private JButton btn;
	
	public void InitComp() {
		this.setLayout(new GridLayout(1,2));
		p1 = new JPanel();
		p2 = new JPanel();
		btn = new JButton("apri");
		btn.addActionListener(this);
		/*dtm = new DefaultTableModel(data,new String[]{"nome"});
		tab = new JTable(dtm);
		jsp = new JScrollPane(tab);
		lbl1 = new JLabel();
		p1.add(jsp);*/
		lbl = new JLabel();
		p1.add(btn);
		p2.add(lbl);
		this.add(p1);
		this.add(p2);
	}
	
	public Interfaccia() {
		InitComp();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			JFileChooser fc = new JFileChooser();
			fc.setFileFilter(new Filter());
			int i = fc.showOpenDialog(this);
			if (i == JFileChooser.APPROVE_OPTION) {
				File f = fc.getSelectedFile();
				icon = new ImageIcon(f.getName());
				setIconImage(icon.getImage());
			}
		}
	}
	public static void main(String[] args) {
		Interfaccia i = new Interfaccia();
		i.setSize(1800,1200);
		i.setVisible(true);
	}

}
