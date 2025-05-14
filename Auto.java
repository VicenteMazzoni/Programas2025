package VehiculoAutosControlador;
public class Auto extends Vehiculo {
	private int ventanas;
		public Auto(String matricula, String marca, int ventanas) {
			super(matricula,marca);
			this.ventanas = ventanas;
		}
		public int getVentanas() {
			return ventanas;
		}
		public void setVentanas(int ventanas) {
			this.ventanas = ventanas;
		}
		
}
