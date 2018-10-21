package aplicacion;
public class IemoisException extends Exception{

    public static final String  DISTRIBUIDOR_DESCONOCIDO= "El Distribuidor no es conocido";
	public static final String  CURSO_YA_EXISTE= "El curso ya existe";
	public static final String  INFORMACION_DESCONOCIDA= "Es necesario poner informacion sobre el curso";
    public IemoisException(String message){
		super(message);
	}
}
