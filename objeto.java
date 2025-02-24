public class objeto {
    public static void main(String args[]) {
        Classe objeto = new Classe(10, "Exemplo");

        objeto.metodo1();
        System.out.println("Atributo1: " + objeto.getAtributo1());

        objeto.metodo2();
        System.out.println("Atributo2: " + objeto.getAtributo2());
    }
}
