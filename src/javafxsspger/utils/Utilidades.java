/*
*Autor: Mongeote Tlachy Daniel
*Fecha de creación: 09/06/2023
*Fecha de modificación: 09/06/2023
*Descripción: Clase que contiene los métodos declarados como simples y que son reutilizables
*/
package javafxsspger.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafxsspger.JavaFXSSPGER;
import javafxsspger.modelo.pojo.Calificacion;
import javafxsspger.modelo.pojo.TipoAnteproyecto;


public class Utilidades {
    
    public static void mostrarDialogoSimple (String titulo, String mensaje, Alert.AlertType tipo){
        Alert alertaSimple = new Alert (tipo);
        alertaSimple.setTitle(titulo);
        alertaSimple.setContentText(mensaje);
        alertaSimple.setHeaderText(null);
        alertaSimple.setAlertType(tipo);
        alertaSimple.showAndWait();
    }
    
    public static Scene inicializarEscena(String ruta){
       Scene escena = null;
        try {
            Parent vista = FXMLLoader.load(JavaFXSSPGER.class.getResource(ruta));
            escena = new Scene (vista);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return escena;
       
   }
    
   public static ArrayList <TipoAnteproyecto> obtenerTiposAnteproyecto (){
       ArrayList <TipoAnteproyecto> tiposAnteproyecto = new ArrayList();
       TipoAnteproyecto tipo1 = new TipoAnteproyecto(1, "Tesis");
       TipoAnteproyecto tipo2 = new TipoAnteproyecto(2, "Tesina");
       TipoAnteproyecto tipo3 = new TipoAnteproyecto(3, "Monografía");
       TipoAnteproyecto tipo4 = new TipoAnteproyecto(4, "Reporte técnico");
       TipoAnteproyecto tipo5 = new TipoAnteproyecto(5, "Memoria");
       TipoAnteproyecto tipo6 = new TipoAnteproyecto(6, "Trabajos prácticos");
       
       tiposAnteproyecto.add(tipo1);
       tiposAnteproyecto.add(tipo2);
       tiposAnteproyecto.add(tipo3);
       tiposAnteproyecto.add(tipo4);
       tiposAnteproyecto.add(tipo5);
       tiposAnteproyecto.add(tipo6);
       
       return tiposAnteproyecto;
   }
   
   public static ArrayList <Calificacion> obtenerRubricaCalificacion (){
       ArrayList <Calificacion> calificaciones = new ArrayList();
       Calificacion tipo1 = new Calificacion(1, "Nada satisfecho", 2);
       Calificacion tipo2 = new Calificacion(2, "Poco satisfecho", 4);
       Calificacion tipo3 = new Calificacion(3, "Neutral", 6);
       Calificacion tipo4 = new Calificacion(4, "Muy satisfecho", 8);
       Calificacion tipo5 = new Calificacion(5, "Totalmente", 10);
       Calificacion tipo6 = new Calificacion(6, "Pendiente", 0);
       
       calificaciones.add(tipo1);
       calificaciones.add(tipo2);
       calificaciones.add(tipo3);
       calificaciones.add(tipo4);
       calificaciones.add(tipo5);
       calificaciones.add(tipo6);
       
       return calificaciones;
   }
   
   public static boolean mostrarDialogoConfirmacion(String titulo, String mensaje){
        Alert alertaConfirmacion = new Alert(Alert.AlertType.CONFIRMATION);
        alertaConfirmacion.setTitle(titulo);
        alertaConfirmacion.setContentText(mensaje);
        alertaConfirmacion.setHeaderText(null);
        Optional<ButtonType> botonClic = alertaConfirmacion.showAndWait();
        return (botonClic.get() == ButtonType.OK);
    }
   
   public static String darFormatofechas(String fechaAnterior){
       DateTimeFormatter formatoOriginal = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatoDeseado = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaAnterior, formatoOriginal);
        String fechaFormateada = fecha.format(formatoDeseado);
        return fechaFormateada;
   }
   
}