package org.example.actions.formatActions;

import org.example.gui.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class WordWrapAction extends AbstractAction {

    private final MainFrame mainFrame;
    public WordWrapAction(MainFrame mainFrame) {
        super("Word Wrap: OFF");
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(mainFrame.getTextArea().getLineWrap()){
            mainFrame.getTextArea().setLineWrap(false);
            mainFrame.getTextArea().setWrapStyleWord(false);
            mainFrame.getWordWrap().setText("Word Wrap: OFF");
        }
        else{
            mainFrame.getTextArea().setLineWrap(true);
            mainFrame.getTextArea().setWrapStyleWord(true);
            mainFrame.getWordWrap().setText("Word Wrap: ON");
        }
    }
}
