package b2SalaDeCineTDD;

public class salaCineTDD {

	private Integer butacaTotales;
	private Integer cantidadButacasFilas;
	private Integer cantidadFilas;
	// declaro la matriz
	private Boolean butacas[][];

	public salaCineTDD(Integer filas, Integer butacaTotales) {
		this.cantidadFilas = filas;
		this.butacaTotales = butacaTotales;
		this.cantidadButacasFilas = butacaTotales / filas;
		this.butacas = new Boolean[filas][cantidadButacasFilas];
		// relleno la matriz con false.
		for (Integer i = 0; i < this.butacas.length; i++) {
			for (Integer j = 0; j < this.butacas[i].length; j++) {
				this.butacas[i][j] = Boolean.FALSE;
			}
		}
	}

	public Boolean getButacas(Integer fila, Integer columna) {
		return butacas[fila][columna];
	}

	public void setButacas(Integer fila, Integer column) {
		this.butacas[fila][column] = Boolean.TRUE;
	}

	public Boolean ocuparUnaButaca(Integer filaQueSeraOcupada, Integer columsnQueSeraOcupada) {
		Boolean seOcupo;
		if (consultaSiEstaOcupadaDeterminadaButaca(filaQueSeraOcupada, columsnQueSeraOcupada)) {
			seOcupo = Boolean.FALSE;
		} else {
			this.butacas[filaQueSeraOcupada][columsnQueSeraOcupada] = Boolean.TRUE;
			seOcupo = Boolean.TRUE;
		}
		return seOcupo;

	}

	public Boolean consultaSiEstaOcupadaDeterminadaButaca(Integer filaConsulta, Integer columnaConsulta) {
		return this.butacas[filaConsulta][columnaConsulta];

	}

	public Integer consultarCuantasButacasOcupadas() {
		Integer totalButacasOcupadas = 0;
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				if (butacas[i][j]) {
					totalButacasOcupadas = totalButacasOcupadas + 1;
				}

			}
		}
		return totalButacasOcupadas;
	}

	public Boolean consultarSiEsPosibleAcomodarPersonasDeManeraContinua(Integer filaQueConsulto, Integer grupoXpersona) {
		Integer valoresDispoibles = 0;
		Boolean esPosibleAcomodar = Boolean.FALSE;

		for (Integer j = 0; j < butacas[filaQueConsulto].length; j++) {
				if (!butacas[filaQueConsulto][j]) {
					valoresDispoibles = valoresDispoibles + 1;
				} else {
					valoresDispoibles = 0;
				}
			}
		

		if (valoresDispoibles == grupoXpersona) {
			esPosibleAcomodar = Boolean.TRUE;
		}

		return esPosibleAcomodar;

	}

}
