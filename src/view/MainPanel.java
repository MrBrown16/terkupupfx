package view;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;

public class MainPanel extends VBox{
    TitlePanel titlePanel;
    InputPanel radiusPanel;
    InputPanel heightPanel;
    ButtonPanel buttonPanel;
    InputPanel volumePanel;

    public MainPanel(){
        this.initComponent();
        this.setComponent();
        this.addComponent();
        this.setMainPanel();
    }
    private void initComponent(){
        this.titlePanel = new TitlePanel();
        this.radiusPanel = new InputPanel();
        this.heightPanel = new InputPanel();
        this.buttonPanel = new ButtonPanel();
        this.volumePanel = new InputPanel();

    }
    private void setComponent(){
        this.titlePanel.setText("Cone volume");
        this.radiusPanel.setText("Radius: ");
        this.heightPanel.setText("Height: ");
        this.buttonPanel.setText("Calculate");
        this.volumePanel.setText("Volume: ");        
    }
    private void addComponent(){
        this.getChildren().add(titlePanel);
        this.getChildren().add(radiusPanel);
        this.getChildren().add(heightPanel);
        this.getChildren().add(buttonPanel);
        this.getChildren().add(volumePanel);
    }
    // 
    private void setMainPanel(){
        this.setAlignment(Pos.CENTER);
    }
    // GETTERS
    public TitlePanel getTitlePanel() {
        return titlePanel;
    }
    public InputPanel getRadiusPanel() {
        return radiusPanel;
    }
    public InputPanel getHeightPanel() {
        return heightPanel;
    }
    public ButtonPanel getButtonPanel() {
        return buttonPanel;
    }
    public InputPanel getVolumePanel() {
        return volumePanel;
    }
    
}
