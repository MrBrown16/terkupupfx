package view;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonPanel extends HBox {
    Button calcButton;


    public ButtonPanel() {
        this.initComponent();
        this.setComponent();
        this.addComponent();
        this.setButtonPanel();
    }

    private void initComponent(){
        this.calcButton = new Button();
    }
    private void setComponent(){

    }
    private void addComponent(){
        this.getChildren().add(calcButton);
    }
    private void setButtonPanel(){
        HBox.setMargin(calcButton, new Insets(0, 0, 0, 10));
        this.setAlignment(Pos.CENTER);
    }
    public void setText(String text){
        this.calcButton.setText(text);
    }
    
    public String getText(){
        return this.calcButton.getText();
    }
    public Button getCalcButton() {
        return calcButton;
    }
}
