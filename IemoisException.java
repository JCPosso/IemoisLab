package aplicacion;
public class IemoisException extends Exception{

    public static final String  DISTRIBUIDOR_DESCONOCIDO= "El Distribuidor no es conocido";
	public static final String  CURSO_REPETIDO= "El Curso ya existe";
	public static final String  CURSO_NO_EXISTE= "El Curso NO existe";
	//public static final String  NUMERO_INVALIDO= "Número de semanas invalido";
    public IemoisException(String message){
		super(message);
	}
}