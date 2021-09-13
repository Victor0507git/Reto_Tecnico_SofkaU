package vista;

import modelo.clsPreguntasNivel1;
import modelo.clsPreguntasNivel2;
import modelo.clsPreguntasNivel3;
import modelo.clsPreguntasNivel4;
import modelo.clsPreguntasNivel5;
import controlador.clsConexion;
import javax.swing.JOptionPane;

/**
 * @author Victor Manuel Suarez Huertas
 */
public class mainPreguntasNivel1 {

    /**
     * @param args Desarrollo de un juego de preguntas
     */
    public static void main(String[] args) {
        clsConexion objCon = new clsConexion(); 
        objCon.conectar();
        clsPreguntasNivel1 objPregunta = new clsPreguntasNivel1();  
        objPregunta.jugador();
        System.out.println(objPregunta.toString());
        if (objPregunta.acumulado() == 0) {
            System.out.println("Juego finalizado en la ronda 1, su premio acumulado es: " + objPregunta.getPremio());
            objPregunta.guardar();
            System.exit(0);
        } else {
            System.out.println("El valor obtenido en la ronda 1 es: " + objPregunta.getPremio());
            objPregunta.guardar();
            System.out.println(objPregunta.continuar());
            if ((objPregunta.getPremio() > 0) && (objPregunta.getContinuar().equals("B"))) {
                clsPreguntasNivel2 objPregunta2 = new clsPreguntasNivel2();
                objPregunta2.jugador();
                System.out.println(objPregunta2.toString());
                if (objPregunta2.acumulado() == 0) {
                    objPregunta2.setPremio(objPregunta.getPremio() * objPregunta2.getPremio());
                    System.out.println("Juego finalizado en la ronda 2, su premio acumulado es: " + objPregunta2.getPremio());
                    objPregunta2.guardar();
                    System.exit(0);
                } else {                   
                    System.out.println("El valor obtenido en la ronda 2 es: " + objPregunta2.getPremio());
                    objPregunta2.setPremio(objPregunta.getPremio() + objPregunta2.getPremio());
                    System.out.println("El valor total acumulado hasta la ronda 2 es: " + objPregunta2.getPremio());
                    objPregunta2.guardar();
                    System.out.println(objPregunta2.continuar());
                    
                    
                    if ((objPregunta2.getPremio() > 0) && (objPregunta2.getContinuar().equals("B"))) {
                        clsPreguntasNivel3 objPregunta3 = new clsPreguntasNivel3();
                        objPregunta3.jugador();
                        System.out.println(objPregunta3.toString());
                        if (objPregunta3.acumulado()==0){
                            objPregunta3.setPremio(objPregunta2.getPremio() * objPregunta3.getPremio());
                            System.out.println("Juego finalizado en la ronda 3, su premio acumulado es: " + objPregunta3.getPremio());
                            objPregunta3.guardar();
                            System.exit(0);
                        }else {
                            System.out.println("El valor obtenido en la ronda 3 es: " + objPregunta3.getPremio());
                            objPregunta3.setPremio(objPregunta2.getPremio() + objPregunta3.getPremio());
                            System.out.println("El valor total acumulado hasta la ronda 3 es: " + objPregunta3.getPremio());
                            objPregunta3.guardar();
                            System.out.println(objPregunta3.continuar());
                            
                            
                            if ((objPregunta3.getPremio()> 0) && (objPregunta3.getContinuar().equals("B"))){
                                clsPreguntasNivel4 objPregunta4 = new clsPreguntasNivel4();
                                objPregunta4.jugador();
                                System.out.println(objPregunta4.toString()); 
                                if (objPregunta4.acumulado()==0){                                                                  
                                    objPregunta4.setPremio(objPregunta3.getPremio() * objPregunta4.getPremio());
                                    System.out.println("Juego finalizado en la ronda 4, su premio acumulado es: " + objPregunta4.getPremio());
                                    objPregunta4.guardar();                                   
                                    System.exit(0);
                                }else{
                                    System.out.println("El valor obtenido en la ronda 4 es: " + objPregunta4.getPremio());
                                    objPregunta4.setPremio(objPregunta4.getPremio() + objPregunta3.getPremio());
                                    System.out.println("El valor total acumulado hasta la ronda 4 es: " + objPregunta4.getPremio());
                                    objPregunta4.guardar();
                                    System.out.println(objPregunta4.continuar());  
                                    
                                    
                                    if ((objPregunta4.getPremio()> 0) && (objPregunta4.getContinuar().equals("B"))){
                                        clsPreguntasNivel5 objPregunta5 = new clsPreguntasNivel5();
                                        objPregunta5.jugador();
                                        System.out.println(objPregunta5.toString());
                                        if (objPregunta5.acumulado()==0){
                                            objPregunta5.setPremio(objPregunta5.getPremio() * objPregunta4.getPremio());
                                            System.out.println("Juego finalizado en la ronda 5, su premio acumulado es: " + objPregunta5.getPremio());
                                            objPregunta5.guardar();                    
                                            System.exit(0);
                                        } else{
                                            System.out.println("El valor obtenido en la ronda 5 es: " + objPregunta5.getPremio());
                                            objPregunta5.setPremio(objPregunta5.getPremio() + objPregunta4.getPremio());
                                            System.out.println("El valor total acumulado hasta la ronda 5 es: " + objPregunta5.getPremio());
                                            objPregunta5.guardar();
                                            JOptionPane.showMessageDialog(null, "FELICITACIONES!!!  Has finalizado el juego con éxito");
                                            System.exit(0);
                                        }
                                    } else {
                                        System.out.println("Se ha retirado en la ronda 4, su premio acumulado es: " + objPregunta4.getPremio());
                                    }
                                }                           
                            }else {
                                System.out.println("Se ha retirado en la ronda 3, su premio acumulado es: " + objPregunta3.getPremio());
                            }
                        }
                    } else {
                        System.out.println("Se ha retirado en la ronda 2, su premio acumulado es: " + objPregunta2.getPremio());
                        
                    }
                }
            }else {
                System.out.println("Se ha retirado en la ronda 1, su premio acumulado es: " + objPregunta.getPremio());
            }      
        }
    }
}
