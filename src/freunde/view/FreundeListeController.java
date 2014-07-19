/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package freunde.view;

import freunde.model.DBModelFreunde;
import freunde.model.Freund;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author Robert
 */
public class FreundeListeController implements Initializable {
    
   // @FXML private ImageView imgV; 
    @FXML private MenuItem menuExit;
    @FXML private MenuItem menuConnect;
    @FXML private TableView<Freund> tableview;
    @FXML private TableColumn<Freund, String> tvorname;
    @FXML private TableColumn<Freund, String> tnachname;
    @FXML private Label dvorname;
    @FXML private Label dnachname;
    @FXML private Label dgeburtsdatum;
    @FXML private Label dgröße;
    @FXML private ImageView dbild;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        try {
//            Image image = new Image("file:C:\\Duke.jpg");
//            imgV.setImage(image);
//        } catch (Exception e) {
//            System.out.println("asdasd");
//        }
        
        DBModelFreunde datamodel = new DBModelFreunde();
                
        menuExit.setOnAction((ActionEvent event)-> {Platform.exit();});
        menuConnect.setOnAction((ActionEvent event) -> {
            datamodel.connect();
            tableview.setItems(datamodel.freunde);
            tvorname.setCellValueFactory(new PropertyValueFactory<>("vorname"));
            tnachname.setCellValueFactory(new PropertyValueFactory<>("nachname"));
        });
        
        tableview.getSelectionModel().selectedItemProperty().addListener(
                (ObservableValue<? extends Freund> o, Freund oldValue, Freund newValue) -> {
                    dvorname.setText(newValue.getVorname());
                    dnachname.setText(newValue.getNachname());
                    dgeburtsdatum.setText(newValue.getGeburtsdatum());
                    dgröße.setText(Float.toString(newValue.getGröße()));
                    Image img = new Image("file:"+newValue.getBild());
                    dbild.setImage(img);
        });   
    }
}
