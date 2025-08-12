import javax.swing.*;

public class ToDoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ToDoAppGUI app = new ToDoAppGUI();
            app.setVisible(true);
        });
    }
}
