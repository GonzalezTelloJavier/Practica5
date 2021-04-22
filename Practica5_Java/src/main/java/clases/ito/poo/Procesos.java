package clases.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;

public class Procesos {
	public Procesos(HashSet<String> descripcion, HashSet<LocalDate> fechaAdquisicion, HashSet<Float> costoMaquina) {
		super();
		Descripcion = descripcion;
		FechaAdquisicion = fechaAdquisicion;
		CostoMaquina = costoMaquina;
	}

	public HashSet<String> Descripcion = new HashSet<String>();
	public HashSet<java.time.LocalDate> FechaAdquisicion = new HashSet<java.time.LocalDate>();
	public HashSet<Float> CostoMaquina = new HashSet<Float>();

	public Procesos() {
		// Start of user code constructor for Maquinas)
		super();
		// End of user code
	}

	public HashSet<String> getDescripcion() {
		return this.Descripcion;
	}

	public HashSet<java.time.LocalDate> getFechaAdquisicion() {
		return this.FechaAdquisicion;
	}

	public HashSet<Float> getCostoMaquina() {
		return this.CostoMaquina;
	}

	@Override
	public String toString() {
		return "Maquinas [Descripcion=" + Descripcion + ", FechaAdquisicion=" + FechaAdquisicion + ", CostoMaquina="
				+ CostoMaquina + "]";
	}

}
