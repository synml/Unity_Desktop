package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
class DesktopInfoDialog extends JDialog {
	
	private JPanel contentPanel = new JPanel();

	/* �� Ŭ������ ���� ������ �� �ְ� ���ִ� �޼ҵ� */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new DesktopInfoDialog();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	DesktopInfoDialog() {
		/* Dialog ���� */
		//-----------------------------------------------------------
		setTitle("Unity Desktop ����");
		setSize(220,120);
        setModal(true);
        setResizable(false);		//ȭ�� ũ�� ���� �Ұ�
		setLocationRelativeTo(null);	//ȭ�� �߾ӿ� ������ ����
		//-----------------------------------------------------------
		
		contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
        
        JLabel label1 = new JLabel("Unity Desktop 1.0.0");
        label1.setFont(new Font("���� ����", Font.BOLD, 15));
        
        JLabel label2 = new JLabel("Made by Lulin Pollux");
        label2.setFont(new Font("���� ����", Font.BOLD, 15));
        
        contentPanel.add(label1);
        contentPanel.add(label2);
        
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);
	}

}