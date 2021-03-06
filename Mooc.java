package aplicacion; 
 
/**
 * @version ECI 2018-2
 */

public class Mooc{
    private String nombre;
    private String area;   
    private String objetivo;
    private String distribuidor;
    private String semanas;  

 
    public Mooc(String nombre, String area,  String objetivo, String  distribuidor, String semanas){
        this.nombre = nombre.trim();
        this.area = area.trim();
        this.objetivo = objetivo.trim();
        this.distribuidor = distribuidor.trim();
        this.semanas = semanas.trim();        
    }
    
    /**
     * @return 
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * @return 
     */
    public String getArea(){
        return area;
    }

    /**
     * @return 
     */
    public String getObjetivo(){
        return objetivo;
    }
    
    /**
     * @return 
     */
    public String getDistribuidor(){
        return distribuidor;
    }    
    
    /**
     * @return 
     */
    public String getSemanas(){
        return semanas;
    }
    


    /**
     * @return 
     */
    public String toString(){
        return nombre + "\n" + distribuidor + "\nSemanas:" + semanas+"\n" +objetivo ;
    }

}
