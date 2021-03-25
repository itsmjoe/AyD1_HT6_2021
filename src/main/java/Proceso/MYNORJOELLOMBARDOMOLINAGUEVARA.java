package Proceso;
import Objetos.Carrera;
import Objetos.RegistroAcademico;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.given;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import Objetos.Horario;
import Objetos.RegistroAcademico;
import Objetos.Estudiante;


public class MYNORJOELLOMBARDOMOLINAGUEVARA {
	private Estudiante estudiante;
    private Horario horario;
    private Carrera carrera;
    private RegistroAcademico registro;
    private static AsignarHorario ahorario;
    
    @BeforeAll
    public void setUp() throws Exception{
        ahorario = new AsignarHorario();
        estudiante = Mockito.mock(Estudiante.class);
        carrera = Mockito.mock(Carrera.class);
        registro = Mockito.mock(RegistroAcademico.class);
        when(carrera.procesarCarrera()).thenReturn(0);
    }
    
    @Test
	void Test1() 
	{
    	//debería retornar false pues no cumple con el tamaño
    	registro = new RegistroAcademico(2010, "14566");
		when(registro.cheequearCarnet()).thenReturn(false);
        boolean checkNumber = registro.cheequearCarnet();
        assertEquals(false, checkNumber);
	}
    
    @Test
	void Test2 () throws Exception
	{
    	//debería retornar 0 pues no existe el rango definido
    	carrera = new Carrera(15, "carrera test");
        int checkNumber = carrera.procesarCarrera();
        assertEquals(0, checkNumber);
	}
}
