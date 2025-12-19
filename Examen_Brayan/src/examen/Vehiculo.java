package examen;

public class Vehiculo {

	private String matricula;
	private String marca;
	private String modelo;
	private double prestado;
	
	public Vehiculo(String matricula, String marca, String modelo, double prestado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.prestado = prestado;
    }
	
	public String getMatricula() {
        return matricula;
    }

<<<<<<< HEAD
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrestado() {
        return prestado;
    }

    public void setPrestado(double prestado) {
        this.prestado = prestado;
    }
    
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", prestado=" + prestado +
                '}';
    }
    
=======
	public Vehiculo(String matricula, String marca, String modelo, double prestado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.prestado = prestado;
    }
>>>>>>> 1df9c0ea0493351c4767d245751a168097c29145
}
