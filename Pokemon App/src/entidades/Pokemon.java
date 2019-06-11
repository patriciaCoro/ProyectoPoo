
package entidades;


public class Pokemon {
    private String nombre;
    private int nivel;
    private int vida;
    
    
    Pokemon(String nombre){
        this.nombre = nombre;
        nivel = 5;
        vida = 40 + nivel*5;
        
    }
        
    String Atacar(Pokemon contrincante){
        String resultado = "";
        
        int ataque =(int)(Math.random()*10 + 5);
        int critico = (int)(Math.random()*100);
        int esquivar = (int)(Math.random()*100);
        
        contrincante.vida = contrincante.vida - ataque;

        if (contrincante.vida < 0) {
            contrincante.vida = 0;
        }
        if (esquivar <=15){
            resultado = (contrincante.nombre + ataque) 
                    + " esquivo el ataque " ;
            
        }
        
        else if (critico <= 20) {
            resultado = contrincante.nombre 
                    + " recibió un ataque crítico de " + ataque;
        }
        
        else {
            resultado = contrincante.nombre 
                    + " recibió un ataque de " + ataque;
        }
        return resultado;
             
    }
    
    Integer UsarPoción(String nombre){
        Integer resultado = 0;
        resultado = this.vida + 15;
        return resultado;
    }
    
    String Rendirse(String nombre){
        String estado = this.nombre + "se ha rendido";
        return estado;
        
    }
    
    
}
