import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ElevatorListener implements ActionListener {
    public static String elevatorMoveUpMessage = "The elevator is moving up  ";
    @Override
    public void actionPerformed(ActionEvent e) {
        GuiElevator.textField.setText(elevatorMoveUpMessage);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        GuiElevator.textField.setText(String.valueOf(Building.numberOfWishedFloor));

    }

}