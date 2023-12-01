package org.example.actions.formatActions;

import org.example.gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TNRFontAction extends AbstractAction {

    private final MainFrame mainFrame;

    public TNRFontAction(MainFrame mainFrame) {
        super("Times New Roman");
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.getTextArea().setFont(new Font("Times New Roman", Font.PLAIN, mainFrame.getFontSize()));
    }
}
