module com.warframeapi.warframeapifx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.httpcomponents.httpclient;
    requires org.apache.httpcomponents.httpcore;
    requires com.fasterxml.jackson.databind;


    opens com.warframeapi.warframeapifx to javafx.fxml;
    exports com.warframeapi.warframeapifx;
    exports com.warframeapi.warframeapifx.Controller;
    opens com.warframeapi.warframeapifx.Controller to javafx.fxml;
    exports com.warframeapi.warframeapifx.Model;
}