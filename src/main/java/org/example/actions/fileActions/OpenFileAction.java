package org.example.actions.fileActions;

import org.example.gui.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;

public class OpenFileAction extends AbstractAction {

    private final MainFrame mainFrame;

        public OpenFileAction(MainFrame mainFrame) {
            super("Open");
            this.mainFrame = mainFrame;
        }


    @Override
    public void actionPerformed(ActionEvent e) {
        FileDialog fileDialog = new FileDialog(mainFrame.getWindow(), "Open", FileDialog.LOAD);
        fileDialog.setVisible(true);

        if (fileDialog.getFile() != null) {
            mainFrame.setFileName(fileDialog.getFile());
            mainFrame.setFilePath(fileDialog.getDirectory());
            mainFrame.getWindow().setTitle(mainFrame.getFileName() + " - Editor");
        }

        try{
            BufferedReader bf = new BufferedReader(new FileReader(mainFrame.getFilePath() + mainFrame.getFileName()));
            String line = null;

            while ((line = bf.readLine()) != null) {
                mainFrame.getTextArea().append(line + "\n");
            }
            bf.close();
        } catch (Exception ex) {
            System.out.println("File not found");
        }
    }
}
