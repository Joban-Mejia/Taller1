public class Modificacion 
{

    public static void main(String[] args)
    {
        System.out.println("¡Hola, Mundo!");

        CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
        System.out.println(calc.paisConMasMedallistas());
    }
}