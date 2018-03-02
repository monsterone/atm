/********************************************
 * Copyright (c) 2017, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package online.shixun.project.atm.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * ATM 功能界面面
 */
public class Main extends BaseFrame implements ActionListener {

    public static void main(String[] args) {
        Main panel = new Main();
        panel.setLayout(panel);
    }

    JButton btnQueryBalance = new JButton(new ImageIcon("image/btn_query.png"));

    JButton btnDeposit = new JButton(new ImageIcon("image/btn_deposit.png"));

    JButton btnWithdraw = new JButton(new ImageIcon("image/btn_withdraw.png"));

    JButton btnTransfer = new JButton(new ImageIcon("image/btn_transfer.png"));

    JButton btnChangePassword = new JButton(new ImageIcon("image/btn_changepwd.png"));

    JButton btnLogout = new JButton(new ImageIcon("image/btn_logout.png"));

    JLabel labLoginDate = new JLabel();

    public Main() {
        super("ShiXun ATM");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        btnQueryBalance.setBounds(470, 120, 120, 40);
        btnQueryBalance.setOpaque(false);
        btnQueryBalance.setBorder(null);
        panel.add(btnQueryBalance);
        btnQueryBalance.addActionListener(this);

        btnDeposit.setBounds(470, 200, 120, 40);
        btnDeposit.setOpaque(false);
        btnDeposit.setBorder(null);
        panel.add(btnDeposit);
        btnDeposit.addActionListener(this);

        btnWithdraw.setBounds(470, 280, 120, 40);
        btnWithdraw.setOpaque(false);
        btnWithdraw.setBorder(null);
        panel.add(btnWithdraw);
        btnWithdraw.addActionListener(this);

        btnTransfer.setBounds(10, 120, 120, 40);
        btnTransfer.setOpaque(false);
        btnTransfer.setBorder(null);
        panel.add(btnTransfer);
        btnTransfer.addActionListener(this);

        btnChangePassword.setBounds(10, 200, 120, 40);
        btnChangePassword.setOpaque(false);
        btnChangePassword.setBorder(null);
        panel.add(btnChangePassword);
        btnChangePassword.addActionListener(this);

        btnLogout.setBounds(10, 280, 120, 40);
        btnLogout.setOpaque(false);
        btnLogout.setBorder(null);
        panel.add(btnLogout);

        btnLogout.addActionListener(this);

        //设置登录日期时间
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:ss:mm");
        String loginDate = simpleDateFormat.format(new Date());
        labLoginDate.setBounds(200, 140, 250, 30);
        labLoginDate.setFont(labelFont);
        labLoginDate.setForeground(labelColor);
        labLoginDate.setText(loginDate);
        panel.add(labLoginDate);

        setContentPane(panel);
        setLayout(this);
    }

    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();

        //进入查询余额界面
        if (source == btnQueryBalance) {
            Query queryBalancePanel = new Query();
            dispose();
        }

        //进入存款界面
        if (source == btnDeposit) {
            Deposit depositPanel = new Deposit();
            dispose();
        }

        //进入取款界面
        if (source == btnWithdraw) {
            Withdraw withdrawPanel = new Withdraw();
            dispose();
        }

        //进入转账界面
        if (source == btnTransfer) {
            Transfer transferPanel = new Transfer();
            dispose();
        }

        //进入修改密码界面
        if (source == btnChangePassword) {
            ChangePassword changePasswordPanel = new ChangePassword();
            dispose();
        }

        //进入退出
        if (source == btnLogout) {
            int result = JOptionPane.showConfirmDialog(null, "确认退出系统吗?", "Logout", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

}
