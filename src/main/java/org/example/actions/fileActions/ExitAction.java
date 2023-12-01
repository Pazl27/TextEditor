package org.example.actions.fileActions;

import javax.swing.*;

public class ExitAction extends AbstractAction {

        public ExitAction() {
            putValue(NAME, "Exit");
        }

        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            System.exit(0);
        }
}
