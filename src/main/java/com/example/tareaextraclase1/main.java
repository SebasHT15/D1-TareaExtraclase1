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
import javafx.scene.control.cell.PropertyValueFactory;
import com.example.tareaextraclase1.CsvReader.*;

import com.example.tareaextraclase1.Estudiante.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class main extends Application {// la clase main contiene el diseño de la table view e inicializa el programa.
    private TableView table = new TableView();
    private TableColumn<Estudiante, Integer> Carne;
    private static ObservableList<Estudiante> data;
    @Override
    public void start(Stage stage) throws IOException {
        Group group = new Group ();
        Scene scene = new Scene(group, 1450, 500);
        stage.setTitle("Tabla");

        final Label label = new Label ("Tabla de estudiantes");
        label.setFont(new Font("Times New Roman", 20));

        table.setEditable(true); //Se utilizo setcellvaluefactory porque de otra manera no mostraba los datos.

        TableColumn carnecolumn = new TableColumn("Carne");
            carnecolumn.setCellValueFactory(new PropertyValueFactory<>("Carne"));
        TableColumn nombrecolumn = new TableColumn("Nombre");
            nombrecolumn.setCellValueFactory(new PropertyValueFactory<>("NombreyApellidos"));
        TableColumn correocolumn = new TableColumn("Correo");
            correocolumn.setCellValueFactory(new PropertyValueFactory<>("Correo"));
        TableColumn telefonocolumn = new TableColumn("Telefono");
            telefonocolumn.setCellValueFactory(new PropertyValueFactory<>("Telefono"));
        TableColumn nicknamecolumn = new TableColumn("Nickname");
            nicknamecolumn.setCellValueFactory(new PropertyValueFactory<>("Nickname"));
        TableColumn tipocolumn = new TableColumn("Tipo");
            tipocolumn.setCellValueFactory(new PropertyValueFactory<>("TipoEstudiante"));
        TableColumn notaPExamenescolumn = new TableColumn("NotaPExamenes");
            notaPExamenescolumn.setCellValueFactory(new PropertyValueFactory<>("NotaPExamenes"));
        notaPExamenescolumn.setMinWidth(100);
        TableColumn notaPQuicescolumn = new TableColumn("NotaPQuices");
            notaPQuicescolumn.setCellValueFactory(new PropertyValueFactory<>("NotaPQuices"));
        notaPQuicescolumn.setMinWidth(100);
        TableColumn notaPTareascolumn = new TableColumn("NotaPTareas");
            notaPTareascolumn.setCellValueFactory(new PropertyValueFactory<>("NotaPTareas"));
        notaPTareascolumn.setMinWidth(100);
        TableColumn notaProyecto1column= new TableColumn("NotaProyecto1");
            notaProyecto1column.setCellValueFactory(new PropertyValueFactory<>("NotaProyecto1"));
        notaProyecto1column.setMinWidth(100);
        TableColumn notaProyecto2column = new TableColumn("NotaProyecto2");
            notaProyecto2column.setCellValueFactory(new PropertyValueFactory<>("NotaProyecto2"));
        notaProyecto2column.setMinWidth(100);
        TableColumn notaProyecto3column = new TableColumn("NotaProyecto3");
            notaProyecto3column.setCellValueFactory(new PropertyValueFactory<>("NotaProyecto3"));
        notaProyecto3column.setMinWidth(100);
        TableColumn notaPromedioEQTcolumn = new TableColumn("NotaPromedioEQT");
            notaPromedioEQTcolumn.setCellValueFactory(new PropertyValueFactory<>("NotaPromedioEQT"));
        notaPromedioEQTcolumn.setMinWidth(130);
        TableColumn notaPProyectoscolumn= new TableColumn("NotaPProyectos");
            notaPProyectoscolumn.setCellValueFactory(new PropertyValueFactory<>("NotaPProyectos"));
        notaPProyectoscolumn.setMinWidth(100);
        TableColumn notaFinalcolumn = new TableColumn("NotaFinal");
            notaFinalcolumn.setCellValueFactory(new PropertyValueFactory<>("NotaFinal"));

        table.getColumns().addAll(carnecolumn, nombrecolumn, correocolumn, telefonocolumn, nicknamecolumn, tipocolumn, notaPExamenescolumn, notaPQuicescolumn,
                notaPTareascolumn, notaProyecto1column, notaProyecto2column, notaProyecto3column, notaPromedioEQTcolumn, notaPProyectoscolumn, notaFinalcolumn );

        table.setItems(data);//data es igual a la lista que es observable que se creo en la clase CsvReader.


        final VBox vbox = new VBox();
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(20, 0, 0, 30));
        vbox.getChildren().addAll(label, table);

        ((Group) scene.getRoot()).getChildren().addAll(vbox);

        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        CsvReader archivo = new CsvReader();//crea el objeto
        archivo.leerArchivo("C:\\Users\\sebas\\OneDrive\\Escritorio\\TEC\\Semestre 2\\Datos 1\\excel.csv");
        data = archivo.getlistaestudiantes();
        launch();
    }
}