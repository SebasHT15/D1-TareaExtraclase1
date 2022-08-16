package com.example.tareaextraclase1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import com.example.tareaextraclase1.CsvReader.*;
import java.io.IOException;

public class main extends Application {
    private TableView table = new TableView();
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group ();
        Scene scene = new Scene(group, 500, 500);
        stage.setTitle("Tabla");

        final Label label = new Label ("Tabla de estudiantes");
        label.setFont(new Font("Times New Roman", 20));

        table.setEditable(true);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        CsvReader archivo = new CsvReader();//crea el objeto
        archivo.leerArchivo("C:\\Users\\sebas\\OneDrive\\Escritorio\\TEC\\Semestre 2\\Datos 1\\excel.csv");
        launch();
    }
}