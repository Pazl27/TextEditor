package org.example.actions.helpActions;

import javax.swing.*;
import java.io.IOException;

public class HelpAction extends AbstractAction {

            public HelpAction() {
                putValue(NAME, "Help");
            }

            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                String url_open ="https://www.youtube.com/watch?v=dQw4w9WgXcQ";
                try {
                    java.awt.Desktop.getDesktop().browse(java.net.URI.create(url_open));
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
}
