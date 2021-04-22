package clases.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;

import clases.ito.poo.Procesos;

public class MaquinaLlenadoEnv extends Procesos {
	public MaquinaLlenadoEnv(HashSet<String> descripcion, HashSet<LocalDate> fechaAdquisicion,
			HashSet<Float> costoMaquina, int envasesxmin, int regulacionMl) {
		super(descripcion, fechaAdquisicion, costoMaquina);
		Envasesxmin = envasesxmin;
		RegulacionMl = regulacionMl;
	}

	public int Envasesxmin = 0;
	public int RegulacionMl = 0;

	public MaquinaLlenadoEnv() {
		// Start of user code constructor for MaquinaLlenadoEnv)
		super();
		// End of user code
	}

	public float CostoLavadoTotal(float CostoMaquina, int Botellasxmin) {
		// Start of user code for method CostoLavado
		float costo,botellas= Botellasxmin/Envasesxmin;
		costo=(CostoMaquina*0.0025F)*botellas;
		
		return costo;
		// End of user code
	}

	public int getEnvasesxmin() {
		return this.Envasesxmin;
	}

	public void setEnvasesxmin(int newEnvasesxmin) {
		this.Envasesxmin = newEnvasesxmin;
	}

	public int getRegulacionMl() {
		return this.RegulacionMl;
	}

	public void setRegulacionMl(int newRegulacionMl) {
		this.RegulacionMl = newRegulacionMl;
	}

	@Override
	public String toString() {
		return "MaquinaLlenadoEnv [Envasesxmin=" + Envasesxmin + ", RegulacionMl=" + RegulacionMl + "]";
	}

}
