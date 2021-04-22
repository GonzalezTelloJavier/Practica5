package app.ito.poo;
import clases.ito.poo.*;
import java.time.LocalDate;

public class MyApp {

	static void run() {
		Procesos m=new Procesos();
		m.Descripcion.add("maquina de empaquetado");
		m.FechaAdquisicion.add(LocalDate.of(2021, 4, 21));
		m.CostoMaquina.add(15000F);
		
		m.Descripcion.add("Maquina de lavado");
		m.FechaAdquisicion.add(LocalDate.of(2021, 4, 22));
		m.CostoMaquina.add(18000F);
		
		m.Descripcion.add("Maquina de llenado y envasado");
		m.FechaAdquisicion.add(LocalDate.of(2021, 4, 23));
		m.CostoMaquina.add(20000F);
		System.out.println(m);
		
		
		
	MaquinaLavado ml= new MaquinaLavado();
	ml.setCapacidadLitro(1800.21F);
	ml.setCicloLavado(20);
	System.out.println("\n"+ml);
		System.out.println("Costo de lavado por botella= $" +ml.CostoLavadoTotal(11600, 423));
		
		
		
	MaquinaLlenadoEnv mll =new MaquinaLlenadoEnv();
	mll.setEnvasesxmin(15);
	mll.setRegulacionMl(15);
	System.out.println("\n"+mll);
	System.out.println("Costo por llenado y envasado= $"+mll.CostoLavadoTotal(54300, 780));
		
	
		
	 MaquinaEmpaquetado me=new MaquinaEmpaquetado();
	 me.setTipoEmpaque("cartón del 6");
	 me.setEmpaquesxmin(3);	 
	System.out.println("\n"+me);	
	System.out.println("Costo de empaquetado por botella= $"+me.CostoEmpaquetadoTotal(13500, 7700));
	}
	

	public static void main(String []args) {
		run();
	}
}
