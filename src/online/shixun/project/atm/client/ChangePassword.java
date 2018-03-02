/********************************************
 * Copyright (c) 2017, www.qingshixun.com
 *
 * All rights reserved
 *
*********************************************/
package online.shixun.project.atm.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * ATM 修改密码功能界面
 */
public class ChangePassword extends BaseFrame implements ActionListener {

    JPasswordField txtOrginalAccountPassword = new JPasswordField(30);

    JPasswordField txtNewAccountPassword = new JPasswordField(30);

    JPasswordField txtAgainNewAccountPassword = new JPasswordField(30);

    JLabel labOrginalAccountPassword = new JLabel("请输入原密码：");

    JLabel labNewAccountPassword = new JLabel("请输入新密码：");

    JLabel labAgainNewAccountPassword = new JLabel("请再次输入新密码：");

    public ChangePassword() {
        super("ATM 修改密码");

        JPanel panel = new JPanel();
        panel.setLayout(null);

        panel.add(txtOrginalAccountPassword);
        panel.add(txtNewAccountPassword);
        panel.add(txtAgainNewAccountPassword);

        panel.add(labOrginalAccountPassword);
        panel.add(labNewAccountPassword);
        panel.add(labAgainNewAccountPassword);

        labOrginalAccountPassword.setBounds(160, 140, 160, 30);
        labOrginalAccountPassword.setFont(labelFont);
        labOrginalAccountPassword.setForeground(labelColor);

        txtOrginalAccountPassword.setBounds(270, 140, 120, 30);

        labNewAccountPassword.setBounds(160, 180, 150, 30);
        labNewAccountPassword.setFont(labelFont);
        labNewAccountPassword.setForeground(labelColor);

        txtNewAccountPassword.setBounds(270, 180, 120, 30);

        labAgainNewAccountPassword.setBounds(130, 220, 150, 30);
        labAgainNewAccountPassword.setFont(labelFont);
        labAgainNewAccountPassword.setForeground(labelColor);

        txtAgainNewAccountPassword.setBounds(270, 220, 120, 30);

        panel.add(super.renderReturnButton());
        panel.add(super.renderConfirmButton());

        setContentPane(panel);
        setLayout(this);
    }

    public void actionPerformed(ActionEvent e) {
        super.actionPerformed(e);

        Object source = e.getSource();
        //确认修改密码
        if (source == btnConfirm) {
            //原密码
            String originalPassword = new String(txtOrginalAccountPassword.getPassword()).trim();
            //新密码
            String newPassword = new String(txtNewAccountPassword.getPassword()).trim();
            //再次输入新密码
            String againNewPassword = new String(txtAgainNewAccountPassword.getPassword()).trim();

            //TODO 编写确认修改密码业务代码
        }

    }

    public static void main(String[] args) {
        ChangePassword panel = new ChangePassword();
        panel.setLayout(panel);
    }
}
