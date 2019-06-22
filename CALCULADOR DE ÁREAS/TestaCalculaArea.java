public class TestaCalculaArea {
    public static void main(String[] args){
        
        AreaCalculavel[] lista = new AreaCalculavel[3];

        lista[0]= new Quadrado(2);
        lista[1] = new Retangulo(5, 2);
        lista[2] = new Circulo(2);

        for(int k = 0; k < lista.length; k++) {
            System.out.println(lista[k].calculaArea());
        }
    
    }
    
}