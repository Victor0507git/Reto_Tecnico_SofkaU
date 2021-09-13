/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import controlador.clsConexion;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Manuel Suarez Huertas
 */
public class clsPreguntasNivel4 {

    //Declaración de atributos
    private int preguntas = (int) (Math.random() * 5);
    private int premio = 0;
    private String resultado;
    private String codigo;
    private String continuar;
    private String opcion[] = {
        "Amarillo","verde", "Rojo", "Blanco", "Azul"};
    private String respuesta[] = {
       " A) White, B) Yellow, C) Orange, D) Gray",
       " A) Purple, B) Beige, C) Green, D) Blue",
       " A) Blue, B) Red, C) Yellow, D) Orange",
       " A) White, B) Red, C) Black, D) Violet",
       " A) Black, B) Green, C) Blue, D) Red"};
    clsConexion objCon = new clsConexion();

    //Constructores
    public clsPreguntasNivel4() {

    }

    public clsPreguntasNivel4(int preguntas) {
        this.preguntas = preguntas;
    }
    //Encapsulacion
    public int getPreguntas() {
        return preguntas;
    }
    public void setPreguntas(int preguntas) {
        this.preguntas = preguntas;
    }
    public int getPremio() {
        return premio;
    }
    public void setPremio(int premio) {
        this.premio = premio;
    }
    public String getResultado() {
        return resultado;
    }    
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getContinuar() {
        return continuar;
    }
    public void setContinuar(String continuar) {
        this.continuar = continuar;
    }    
    public String[] getOpcion() {
        return opcion;
    }
    public void setOpcion(String[] opcion) {
        this.opcion = opcion;
    }
    public String[] getRespuesta() {
        return respuesta;
    }
    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }
    
    //Metodo para capturar el ID del jugador 
    public String jugador(){
        clsPreguntasNivel1 objCodigo = new clsPreguntasNivel1();
        setCodigo(objCodigo.jugador());
        return getCodigo();
    }

    //Metodo para mostrar la pregunta al usuario
    @Override
    public String toString() {
        return "Ronda #4: Como se escribe " + opcion[getPreguntas()] + " en inglés: " + respuesta[getPreguntas()];
    }

    // Metodo para evaluar la respuesta y determinar el premio ganado
    public int acumulado() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Su respuesta es: ");
        setResultado(entrada.nextLine());

        switch (preguntas) {
            case 0:
                //Condicional para determinar si respondio bien la pregunta numero 1
                if (getResultado().equals("B")) {
                    setPremio(getPremio() + 2500);
                    System.out.println("Respuesta correcta");
                } else {
                    System.out.println("Respuesta incorrecta");
                }   break;
            case 1:
                //Condicional para determinar si respondio bien la pregunta numero 2
                if (getResultado().equals("C")) {
                    setPremio(getPremio() + 2500);
                    System.out.println("Respuesta correcta");
                } else {
                    System.out.println("Respuesta incorrecta");
                }   break;
            case 2:
                //Condicional para determinar si respondio bien la pregunta numero 3
                if (getResultado().equals("B")) {
                    setPremio(getPremio() + 2500);
                    System.out.println("Respuesta correcta" );
                } else {
                    System.out.println("Respuesta incorrecta");
                }   break;
            case 3:
                //Condicional para determinar si respondio bien la pregunta numero 4
                if (getResultado().equals("A")) {
                    setPremio(getPremio() + 2500);
                    System.out.println("Respuesta correcta");
                } else {
                    System.out.println("Respuesta incorrecta");
                }   break;
            default:
                //Condicional para determinar si respondio bien la pregunta numero 5
                if (getResultado().equals("C")) {
                    setPremio(getPremio() + 2500);
                    System.out.println("Respuesta correcta");
                } else {
                    System.out.println("Respuesta incorrecta");
                }   break;
        }
    return getPremio();
    }
    
    //Metodo para determinar si se retira o sigue jugando
    public String continuar(){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Que quiere hacer a continuación: A. Retirarse o B. Continuar jugando ");
        setContinuar(entrada.nextLine());
        return "Su decision es: " + getContinuar();
    }

    //Metodo para guardar los datos del jugador
    public void guardar() {
        try {
            objCon.conectar();
            objCon.Sql = objCon.con.prepareStatement("INSERT INTO historicos (ID_jugador,Pregunta,Respuestas, Respuesta_escogida, Ronda, Premio_acumulado)VALUES(?,?,?,?,?,?)");
            objCon.Sql.setString(1,getCodigo());
            objCon.Sql.setString(2,opcion[getPreguntas()]);
            objCon.Sql.setString(3,respuesta[getPreguntas()]);
            objCon.Sql.setString(4, getResultado());
            objCon.Sql.setString(5, "Ronda 4");
            objCon.Sql.setInt(6, getPremio());
            objCon.Sql.executeUpdate();
            objCon.cerrar();
            JOptionPane.showMessageDialog(null, "Registro guardado con éxito");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al guardar ");
        }
    }
    
}
