package com.warframeapi.warframeapifx.Controller;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.warframeapi.warframeapifx.Model.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Screen;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import com.fasterxml.jackson.databind.ObjectMapper;

public class HelloController implements Initializable {

    private String ApiUrlConcat(String ApiUrl1, String Choix){
        try {
            URI baseURI = new URI(ApiUrl1);
            URI relativeURI = new URI(Choix);
            URI resultURI = baseURI.resolve(relativeURI);
            String urlString = resultURI.toURL().toString();
            System.out.println("URL = "+urlString);
            return urlString.toString();
        } catch (URISyntaxException | MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }

    private String ResultApiUrl(String ApiUrlWarframe) throws Exception{
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(ApiUrlWarframe);

        CloseableHttpResponse response = httpClient.execute(httpGet);

        try {
            HttpEntity entity = response.getEntity();
            String responseBody = EntityUtils.toString(entity);
            System.out.println(responseBody);
            return responseBody;
        } finally {
            response.close();
            httpClient.close();
        }
    }

    @FXML
    private GridPane contenuAll;

    @FXML
    private Label retourApi;

    @FXML
    private Label earthTxt;

    @FXML
    private Label cetusTxt;

    @FXML
    private Label cambionTxt;

    @FXML
    private Label vallisTxt;

    @FXML Button imgCycle;


    @FXML
    private Button retourChoixLieux;

    @FXML
    private Button earthCycle;

    @FXML
    private Button cetusCycle;

    @FXML
    private Button cambionCycle;

    @FXML
    private Button vallisCycle;

    @FXML
    private VBox fissuresList;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws Exception {
        Button b = (Button) event.getSource();
        System.out.println("Button = "+b.getId());
        String ApiUrl = ApiUrlConcat("https://api.warframestat.us","/pc/"+b.getId());
        String jsonString = ResultApiUrl(ApiUrl);

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            if(b.getId().equals("vallisCycle")) {
                VallisCycle lieuxVallis = objectMapper.readValue(jsonString, VallisCycle.class);
                retourApi.setText("Vallis"+"\n"+"Temps restant : "+lieuxVallis.getTimeLeft()+"\n"+"State : "+lieuxVallis.getState());
                //retourApi.setText(lieuxVallis.getId() + "\n" + lieuxVallis.getExpiry() + "\n" + lieuxVallis.getIsWarm() + "\n" + lieuxVallis.getState() + "\n" + lieuxVallis.getActivation() + "\n" + lieuxVallis.getTimeLeft());
                imgCycle.setGraphic(ImageButtonLieux("/ImagesLieux/Orb_Vallis.png"));
            }
            else if (b.getId().equals("cetusCycle")) {
                CetusCycle lieuxCetus = objectMapper.readValue(jsonString, CetusCycle.class);
                retourApi.setText("Cetus"+"\n"+"Temps restant : "+lieuxCetus.getTimeLeft()+"\n"+"State : "+lieuxCetus.getState());
                //retourApi.setText(lieuxCetus.getId() + "\n" + lieuxCetus.getExpiry() + "\n" + lieuxCetus.getActivation() + "\n" + lieuxCetus.getIsDay() + "\n" + lieuxCetus.getState() + "\n" + lieuxCetus.getTimeLeft() + "\n" + lieuxCetus.getIsCetus() + "\n" + lieuxCetus.getShortString());
                imgCycle.setGraphic(ImageButtonLieux("/ImagesLieux/Cetus.jpg"));
            }
            else if (b.getId().equals("cambionCycle")) {
                CambionCycle lieuxCambion = objectMapper.readValue(jsonString, CambionCycle.class);
                retourApi.setText("Cambion"+"\n"+"Temps restant : "+lieuxCambion.getTimeLeft()+"\n  "+"State : "+lieuxCambion.getState());
                //retourApi.setText(lieuxCambion.getId() + "\n" + lieuxCambion.getActivation() + "\n" + lieuxCambion.getExpiry() + "\n" + lieuxCambion.getTimeLeft() + "\n" + lieuxCambion.getState() + "\n" + lieuxCambion.getActive());
                imgCycle.setGraphic(ImageButtonLieux("/ImagesLieux/Cambion.png"));
            } else if (b.getId().equals("earthCycle")) {
                EarthCycle lieuxEarth = objectMapper.readValue(jsonString, EarthCycle.class);
                retourApi.setText("Earth"+"\n"+"Temps restant : "+lieuxEarth.getTimeLeft()+"\n"+"State : "+lieuxEarth.getState());
                //retourApi.setText(lieuxEarth.getId() + "\n" + lieuxEarth.getExpiry() + "\n" + lieuxEarth.getActivation() + "\n" + lieuxEarth.getIsDay() + "\n" + lieuxEarth.getState() + "\n" + lieuxEarth.getTimeLeft());
                imgCycle.setGraphic(ImageButtonLieux("/ImagesLieux/Terre.jpg"));
            }
            else {
                retourApi.setText("Erreur, aucun lien avec l'API trouvé !");
            }
            ChoixLieuxEnableDisable(false);
        }
        catch (JsonMappingException e){
            System.out.println(e);
        }
    }

    @FXML
    protected void onReturnButtonClick(){
        ChoixLieuxEnableDisable(true);
    }

    public void ChoixLieuxEnableDisable(Boolean isVisible){
        earthTxt.setVisible(isVisible);
        earthCycle.setVisible(isVisible);
        cetusTxt.setVisible(isVisible);
        cetusCycle.setVisible(isVisible);
        cambionTxt.setVisible(isVisible);
        cambionCycle.setVisible(isVisible);
        vallisTxt.setVisible(isVisible);
        vallisCycle.setVisible(isVisible);
        retourChoixLieux.setVisible(!isVisible);
        retourApi.setVisible(!isVisible);
        imgCycle.setVisible((!isVisible));
    }

    public ImageView ImageButtonLieux(String UrlImg){
        Image img = new Image(getClass().getResourceAsStream(UrlImg));
        ImageView imageView = new ImageView(img);
        imageView.setFitWidth(Screen.getPrimary().getBounds().getWidth()/10); //192
        imageView.setFitHeight(Screen.getPrimary().getBounds().getHeight()/10); //108
        return imageView;
    }

    public void ListeFissureAdd() throws Exception {
        String jsonString = ResultApiUrl("https://api.warframestat.us/pc/fissures");

        ObjectMapper objectMapper = new ObjectMapper();
        Fissures[] f = objectMapper.readValue(jsonString, Fissures[].class);

        for(int i=0; i< f.length; i++){
            if(!(f[i].getMissionType().equals("Defense") || f[i].getMissionType().equals("Interception") || f[i].getMissionType().equals("Survival") || f[i].getMissionType().equals("Mobile Defense") || f[i].getMissionType().equals("Spy") || f[i].getMissionType().equals("Disruption") || f[i].getMissionType().equals("Assault") || (f[i].getIsStorm().equals("true")) ||  (f[i].getMissionType().equals("Survival") && f[i].getIsHard().equals("false")))) {
                //HBox hb = new HBox();
                HBox lbNode = new HBox(new Label(f[i].getNode()));
                HBox lbEnemy = new HBox(new Label(f[i].getEnemy()));
                HBox lbTier = new HBox(new Label(f[i].getTier()));
                HBox lbMissionType = new HBox(new Label(f[i].getMissionType()));
                lbNode.setStyle("-fx-background-color: #E7E7E7");
                lbEnemy.setStyle("-fx-background-color: #E7E7E7");
                lbTier.setStyle("-fx-background-color: #E7E7E7");
                lbMissionType.setStyle("-fx-background-color: #E7E7E7");

                //hb.getChildren().addAll(lbNode, lbEnemy, lbTier, lbMissionType);
                //fissuresList.getChildren().add(hb);

                contenuAll.add(lbNode, 0, i + 5);
                contenuAll.add(lbEnemy, 1, i + 5);
                contenuAll.add(lbTier, 2, i + 5);
                contenuAll.add(lbMissionType, 3, i + 5);


                //contenuAll.add(hb, 0, i+5);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //Button Hearth
        earthCycle.setGraphic(ImageButtonLieux("/ImagesLieux/Terre.jpg"));
        //Button Cetus
        cetusCycle.setGraphic(ImageButtonLieux("/ImagesLieux/Cetus.jpg"));
        //Button Cambion
        cambionCycle.setGraphic(ImageButtonLieux("/ImagesLieux/Cambion.png"));
        //Button Vallis
        vallisCycle.setGraphic(ImageButtonLieux("/ImagesLieux/Orb_Vallis.png"));

        try {
            ListeFissureAdd();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}