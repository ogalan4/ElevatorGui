import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class BuildingSetNumberOfFloor implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 1; i <= Building.countOfFloors; i++) {

            if (GuiElevator.floorsList.get(Building.countOfFloors-i).isSelected()){
                Building.numberOfWishedFloor=i;
                GuiElevator.elevatorList.get(Building.countOfFloors-i).setSelected(true);
                break;
            } else {
                GuiElevator.elevatorList.get(Building.countOfFloors-i).setSelected(true);
                }

        } GuiElevator.textField.setText(String.valueOf(Building.numberOfWishedFloor));
        System.out.println(Building.numberOfWishedFloor);
    }
}