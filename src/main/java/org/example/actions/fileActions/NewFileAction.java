package org.example.actions.fileActions;

import org.example.gui.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class NewFileAction extends AbstractAction {

    private final MainFrame mainFrame;

    public NewFileAction(MainFrame mainFrame) {
        super("New");
        this.mainFrame = mainFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        mainFrame.getTextArea().setText("");
        mainFrame.getWindow().setTitle("Untitled - Editor");
        mainFrame.setFileName(null);
        mainFrame.setFilePath(null);

    }
}
