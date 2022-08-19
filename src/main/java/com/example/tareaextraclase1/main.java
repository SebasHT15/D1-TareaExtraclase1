package com.example.tareaextraclase1;

import javafx.application.Application;

import javafx.collections.FXCollections;

import javafx.collections.ObservableList;

import javafx.fxml.FXMLLoader;

import javafx.geometry.Insets;

import javafx.scene.Group;

import javafx.scene.Scene;

import javafx.scene.control.Label;

import javafx.scene.control.TableColumn;

import javafx.scene.control.TableView;

import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;

import javafx.scene.text.Font;

import javafx.stage.Stage;

import com.example.tareaextraclase1.CsvReader.*;

import com.example.tareaextraclase1.Estudiante.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class main extends Application {
    private TableView table = new TableView();
    private TableColumn<Estudiante, Integer> Carne;
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group ();
        Scene scene = new Scene(group, 1450, 500);
        stage.setTitle("Tabla");

        final Label label = new Label ("Tabla de estudiantes");
        label.setFont(new Font("Times New Roman", 20));

        table.setEditable(true);

        TableColumn carne = new TableColumn("Carne");
        TableColumn nombre = new TableColumn("Nombre");
        TableColumn correo = new TableColumn("Correo");
        TableColumn telefono = new TableColumn("Telefono");
        TableColumn nickname = new TableColumn("Nickname");
        TableColumn tipo = new TableColumn("Tipo");
        TableColumn notaPExamenes = new TableColumn("NotaPExamenes");
        notaPExamenes.setMinWidth(100);
        TableColumn notaPQuices = new TableColumn("NotaPQuices");
        notaPQuices.setMinWidth(100);
        TableColumn notaPTareas = new TableColumn("NotaPTareas");
        notaPTareas.setMinWidth(100);
        TableColumn notaProyecto1= new TableColumn("NotaProyecto1");
        notaProyecto1.setMinWidth(100);
        TableColumn notaProyecto2 = new TableColumn("NotaProyecto2");
        notaProyecto2.setMinWidth(100);
        TableColumn notaProyecto3 = new TableColumn("NotaProyecto3");
        notaProyecto3.setMinWidth(100);
        TableColumn notaPromedioEQT = new TableColumn("NotaPromedioEQT");
        notaPromedioEQT.setMinWidth(130);
        TableColumn notaPProyectos= new TableColumn("NotaPProyectos");
        notaPProyectos.setMinWidth(100);
        TableColumn notaFinal = new TableColumn("NotaFinal");

        table.getColumns().addAll(carne);
        table.getColumns().addAll(nombre);
        table.getColumns().addAll(correo);
        table.getColumns().addAll(telefono);
        table.getColumns().addAll(nickname);
        table.getColumns().addAll(tipo);
        table.getColumns().addAll(notaPExamenes);
        table.getColumns().addAll(notaPQuices);
        table.getColumns().addAll(notaPTareas);
        table.getColumns().addAll(notaProyecto1);
        table.getColumns().addAll(notaProyecto2);
        table.getColumns().addAll(notaProyecto3);
        table.getColumns().addAll(notaPromedioEQT);
        table.getColumns().addAll(notaPProyectos);
        table.getColumns().addAll(notaFinal);

        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(20, 0, 0, 30));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }
    public void initialize (URL url, ResourceBundle rb){
        Carne.setCellValueFactory(new PropertyValueFactory<Estudiante, Integer>("Carne"));
    }
    public static void main(String[] args) {
        CsvReader archivo = new CsvReader();//crea el objeto
        archivo.leerArchivo("C:\\Users\\sebas\\OneDrive\\Escritorio\\TEC\\Semestre 2\\Datos 1\\excel.csv");
        launch();
    }
}