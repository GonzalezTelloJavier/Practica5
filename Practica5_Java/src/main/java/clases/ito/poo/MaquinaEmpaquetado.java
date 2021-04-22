package clases.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;

import clases.ito.poo.Procesos;

public class MaquinaEmpaquetado extends Procesos {
	public MaquinaEmpaquetado(HashSet<String> descripcion, HashSet<LocalDate> fechaAdquisicion, HashSet<Float> costoMaquina,
			String tipoEmpaque, int empaquesxmin) {
		super(descripcion, fechaAdquisicion, costoMaquina);
		TipoEmpaque = tipoEmpaque;
		Empaquesxmin = empaquesxmin;
	
	}

	public String TipoEmpaque = "";
	public int Empaquesxmin = 0;

	public MaquinaEmpaquetado() {
		// Start of user code constructor for MaquinaEmpaq)
		super();
		// End of user code
	}

	public float CostoEmpaquetadoTotal(float CostoMaquina, int Empaquestotales) {
		// Start of user code for method CostoEmpaquetado
		CostoMaquina=(float) (CostoMaquina-CostoMaquina*.5);
		Empaquestotales=(Empaquestotales*9);
		float costoempaquexbotella=((Empaquestotales/27)*.188F);
		return costoempaquexbotella;
				
		// End of user code
	}

	public String getTipoEmpaque() {
		return this.TipoEmpaque;
	}

	public void setTipoEmpaque(String newTipoEmpaque) {
		this.TipoEmpaque = newTipoEmpaque;
	}

	public int getEmpaquesxmin() {
		return this.Empaquesxmin;
	}

	public void setEmpaquesxmin(int newEmpaquesxmin) {
		this.Empaquesxmin = newEmpaquesxmin;
	}

	@Override
	public String toString() {
		return "MaquinaEmpaq [TipoEmpaque=" + TipoEmpaque + ", Empaquesxmin=" + Empaquesxmin + "]";
	}

}
