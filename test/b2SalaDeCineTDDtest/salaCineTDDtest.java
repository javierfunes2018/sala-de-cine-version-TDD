package b2SalaDeCineTDDtest;

import java.util.Iterator;

import javax.swing.plaf.synth.SynthGraphicsUtils;

import b2SalaDeCineTDD.salaCineTDD;

public class salaCineTDDtest {

	public static void main(String[] args) {
		
	
	   // 1. Crearla con la cantidad de butacas totales, y cantidad de filas
	   //TDD constructor
		Integer butacaTotales = 10;
		Integer cantidadFilas = 2;
		salaCineTDD myCine = new salaCineTDD(cantidadFilas, butacaTotales);
		
		// Se probó que el constructor funcioó correctamente.
		//System.out.println( myCine.getButacas(0,0));
	
		//------------------- >> 2 << ------------------------------//
		
		//2. Consultar si una butaca está ocupada (referida por fila y asiento)
		/*
		// PREPARO
		Integer filaConsulta = 0;
		Integer columnaConsulta=1;
		Boolean valorEsperado = Boolean.TRUE;
		
		// EJECUTO
		myCine.ocuparUnaButaca(filaConsulta,columnaConsulta);
		Boolean valorReal =myCine.consultaSiEstaOcupadaDeterminadaButaca(filaConsulta,columnaConsulta);
		
		// CONSTRASTACION
		if (valorEsperado == valorEsperado ) {
			System.out.println("El asiento "+filaConsulta+"-"+columnaConsulta+ " SI SE encuentra Ocupada");			
		} else {
			System.out.println("El asiento "+filaConsulta+"-"+columnaConsulta+ " NO encuentra Ocupada");
		}
		*/
		
		//------------------- >> 3 << ------------------------------//
		// Ocupar una butaca determinada, siempre que ésta no esté previamente ocupada.
		/*
		
		// PREPARAR
		Integer filaQueSeraOcupada = 0;
		Integer QueSeraOcupada = 1;
		Boolean valorEsperado = Boolean.TRUE;
		
		// EJECUTAR
		//myCine.ocuparUnaButaca(filaQueSeraOcupada, QueSeraOcupada);
		Boolean valorReal = myCine.ocuparUnaButaca(filaQueSeraOcupada, QueSeraOcupada);
		
		// CONSTRATAR
		if (valorEsperado = valorReal) { System.out.println("Se ha ocupado, ya que no estaba ocupado previamente");
			
		}else {
			System.out.println("No se ha ocupado, ya que previamente estaba ocupado");
		}
		
		*/
		//------------------- >> 4 << ------------------------------//
		// 4. Consultar la cantidad total de butacas ocupadas
		/*
		// PREPARAR
		Integer filaQueSeraOcupada = 0;
		Integer QueSeraOcupada = 1;
		myCine.ocuparUnaButaca(filaQueSeraOcupada, QueSeraOcupada);
		
		Integer filaQueSeraOcupada2 = 0;
		Integer QueSeraOcupada2 = 2;
		myCine.ocuparUnaButaca(filaQueSeraOcupada2, QueSeraOcupada2);
		
		Integer valorEsperado = 2;
		
		// EJECUTAR
		Integer valorReal = myCine.consultarCuantasButacasOcupadas();
		
		
		// CONSTATAR
		if (valorEsperado == valorReal) {
			System.out.println("Lo real es igual a lo esperado. El valor esperado es "+valorEsperado+" el real "+ valorReal);
			
		} else {
			System.out.println("Lo real NO es igual a lo esperado "+valorEsperado+" el real "+ valorReal);
			
		}
	*/
		//------------------- >> 5 << ------------------------------//
		
		//  Consultar si es posible acomodar a un grupo de X personas, en forma contigua, en la misma fila:
		
		// PREPARAR
		
		Integer filaQueSeraOcupada = 0;
		Integer QueSeraOcupada = 0;
		Integer filaQueConsulto = 0;
		Integer grupoXpersona = 3;
		myCine.ocuparUnaButaca(filaQueSeraOcupada, QueSeraOcupada);
		
		Integer filaQueSeraOcupada2 = 0;
		Integer QueSeraOcupada2 = 2;
		myCine.ocuparUnaButaca(filaQueSeraOcupada2, QueSeraOcupada2);
		
		
		Boolean valorEsperado = Boolean.FALSE;
		
		
		// EJECUTAR
		Boolean esposibleAcomodas = myCine.consultarSiEsPosibleAcomodarPersonasDeManeraContinua(filaQueConsulto, grupoXpersona);
		
		// CONSTATAR
		if (esposibleAcomodas) {
			System.out.println("Si es posible Acomodar "+grupoXpersona+ " en la fila "+filaQueConsulto);
		} else {
			System.out.println("No es posible Acomodar "+grupoXpersona+ " en la fila "+filaQueConsulto);
			
		}
		
		
		

	}

}
