/********************************************
 * Copyright (c) 2017, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package online.shixun.project.atm.client;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 界面基类
 */
public class BaseFrame extends JFrame implements ActionListener {

    protected Font labelFont = new Font("Dialog", 1, 16);

    protected Color labelColor = Color.white;

    //返回按钮
    protected JButton btnReturn = new JButton(new ImageIcon("image/btn_return.png"));

    //确认按钮
    protected JButton btnConfirm = new JButton(new ImageIcon("image/btn_confirm.png"));

    public BaseFrame() {
        super();
    }

    public BaseFrame(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //获取当前类名
        String className = this.getClass().getName();

        //通过 ATMContext.getCurrentAccountId() 判断ATM客户端是否已经登录（需要排队登录界面）
        /*
        if (!className.equals("online.shixun.project.atm.client.Login") && ATMContext.getCurrentAccountId() == 0) {
            JOptionPane.showMessageDialog(null, "请登录后再进行操作！", "注意", JOptionPane.WARNING_MESSAGE);
            System.exit(0);
        }
        */
    }

    protected void setLayout(JFrame panel) {
        panel.setSize(600, 470);
        panel.setResizable(false);
        //设置 panel 居中显示
        panel.setLocationRelativeTo(null);
        panel.setLayout(null);
        panel.setVisible(true);
    }

    protected JButton renderReturnButton() {
        btnReturn.setBounds(10, 280, 120, 40);
        btnReturn.setOpaque(false);
        btnReturn.setBorder(null);
        btnReturn.addActionListener(this);
        btnReturn.setToolTipText("返回主菜单");
        return btnReturn;
    }

    protected JButton renderConfirmButton() {
        btnConfirm.setBounds(470, 280, 120, 40);
        btnConfirm.setOpaque(false);
        btnConfirm.setBorder(null);
        btnConfirm.addActionListener(this);
        btnConfirm.setToolTipText("确认操作");
        return btnConfirm;
    }

    protected void renderBackground(Container pane) {
        JLabel background = new JLabel(new ImageIcon("image/bg.png"));
        background.setBounds(0, 0, 600, 450);
        pane.add(background);
    }

    @Override
    public void setContentPane(Container contentPane) {
        super.setContentPane(contentPane);
        renderBackground(contentPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == btnReturn) {
            Main panel = new Main();
            setLayout(panel);
            dispose();
        }
    }
}
