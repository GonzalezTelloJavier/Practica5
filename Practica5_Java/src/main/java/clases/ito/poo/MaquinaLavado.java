package clases.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;

import clases.ito.poo.Procesos;

public class MaquinaLavado extends Procesos {
	public MaquinaLavado(HashSet<String> descripcion, HashSet<LocalDate> fechaAdquisicion, HashSet<Float> costoMaquina,
			float capacidadLitro, int cicloLavado) {
		super(descripcion, fechaAdquisicion, costoMaquina);
		CapacidadLitro = capacidadLitro;
		CicloLavado = cicloLavado;
	}

	public float CapacidadLitro = 0F;
	public int CicloLavado = 0;

	public MaquinaLavado() {
		// Start of user code constructor for MaquinaLavado)
		super();
		// End of user code
	}

	public float CostoLavadoTotal(float CostoMaquina, int Botellas) {
		// Start of user code for method CostoLavado
		float a,CostoTotal;
		a=CostoMaquina*.005F;
		Botellas=Botellas/3;
		CostoTotal=a*Botellas;
		return CostoTotal;
	
		
		// End of user code
	}

	public float getCapacidadLitro() {
		return this.CapacidadLitro;
	}

	public void setCapacidadLitro(float newCapacidadLitro) {
		this.CapacidadLitro = newCapacidadLitro;
	}

	public int getCicloLavado() {
		return this.CicloLavado;
	}

	public void setCicloLavado(int newCicloLavado) {
		this.CicloLavado = newCicloLavado;
	}

	@Override
	public String toString() {
		return "MaquinaLavado [CapacidadLitro=" + CapacidadLitro + ", CicloLavado=" + CicloLavado + " segundos ]";
	}

}
