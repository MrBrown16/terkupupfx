package control;

import javafx.scene.control.Button;
import model.MainModel;
import view.MainPanel;

public class MainCrontroller {
    MainPanel mainPanel;
    MainModel mainModel;
    public MainCrontroller() {
        this.mainPanel = new MainPanel();
        this.mainModel = new MainModel();
        this.handleEvent();
    }
    public MainPanel getMainPanel() {
        return mainPanel;
    }
    private void handleEvent(){
        Button calcButton = this.mainPanel.getButtonPanel().getCalcButton();
        calcButton.setOnAction(e -> onClickCalcButton());
    }
    private void onClickCalcButton(){
        String radiusStr = this.mainPanel.getRadiusPanel().getValue();
        String heightStr = this.mainPanel.getHeightPanel().getValue();
        double radius = Double.parseDouble(radiusStr);
        double height = Double.parseDouble(heightStr);
        Double volume = this.mainModel.calcConeVolume(radius, height);
        this.mainPanel.getVolumePanel().setValue(volume.toString());
    }
}
