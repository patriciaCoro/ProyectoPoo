
package entidades;


public class Pokemon {
    public String nombre;
    private int nivel;
    public int vida;
    
    
    public Pokemon(String nombre){
        this.nombre = nombre;
        nivel = 5;
        vida = 40 + nivel*5;
        
    }
    public String MostrarEstado() {
        String estado = this.nombre + " / " + this.vida 
                + " HP";
        return estado;
    }
    
    public String MostrarNivel(){
        String niv = "Nivel" + this.nivel;
        return niv;
    }
        
    public String Atacar(Pokemon contrincante){
        String resultado = "";
        
        int ataque =(int)(Math.random()*5 + 5);
        int critico = (int)(Math.random()*100);
        int esquivar = (int)(Math.random()*100);
        
        if (critico <=20){
            ataque = (int)(ataque*2);
        }
        else if (esquivar <= 15){
            ataque = 0;
        }
        
        contrincante.vida = contrincante.vida - ataque;

        if (contrincante.vida < 0) {
            contrincante.vida = 0;
        }
        if (esquivar <=15){
            resultado = contrincante.nombre
                    + ", esquivo el ataque " ;
            
        }
        
        else if (critico <= 20) {
            resultado = contrincante.nombre 
                    + ", recibió un ataque crítico de " + ataque;
        }
        
        else {
            resultado = contrincante.nombre 
                    + ", recibió un ataque de " + ataque;
        }
        return resultado;
             
    }
    
    public String AtacarVentaja(Pokemon mine){
        String resultado = "";
        
        int ataque =(int)(Math.random()*5 + 7);
        int critico = (int)(Math.random()*100);
        int esquivar = (int)(Math.random()*100);
        
        if (critico <= 20){
            ataque = (int)(ataque*3);
        }
        else if (esquivar <= 20){
            ataque = 0;
        }
        
        mine.vida = mine.vida - ataque;

        if (mine.vida < 0) {
            mine.vida = 0;
        }
        if (esquivar <= 20){
            resultado = mine.nombre
                    + ", esquivo el ataque " ;
            
        }
        
        else if (critico <= 20) {
            resultado = mine.nombre 
                    + ", recibió un ataque crítico de " + ataque;
        }
        
        else {
            resultado = mine.nombre 
                    + ", recibió un ataque de " + ataque;
        }
        return resultado;
        
        
    }
    
    
    public String Pocion(Pokemon mine){
        String resultado = "";
        mine.vida = mine.vida + 15;
        resultado = mine.nombre + ", ha usado poción";
        return resultado;
    }
    
    public String Rendirse(Pokemon mine){
        String estado = mine.nombre + ", se ha rendido";
        return estado;
        
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

      
    
    
}
