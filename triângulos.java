public class Primeiro 
{ 

	public static void triangulos()
    {
	    int isoceles;
	    int equilatero;
	    int escaleno;
    }
	Scanner isoceles = new Scanner (System.in);
	Scanner equilatero = new Scanner (System.in);
	Scanner escaleno = new Scanner (System.in);
	if (isoceles < equilatero + escaleno || equilatero < isoceles + escaleno || escaleno < isoceles+equilatero){
		System.out.println("Trata-se de um triangulo");
	}
	if (isoceles == equilatero && isoceles == escaleno){
		System.out.println("Três lados iguais . Trata-se de um Triangulo Equilatero");
	}else if(isoceles == equilatero || isoceles == escaleno){
		System.out.println("Dois lados iguais . Trata-se de um Triangulo Isosceles");
		}else{
		System.out.println("Três lados diferentes.");
    }
    public static void main(String[] args) {
        System.out.println("Triangulo");
    }
}    