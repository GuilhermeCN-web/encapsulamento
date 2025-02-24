class Classe {
    private int atributo1;
    private String atributo2;
        
        public Classe(final int atributo1, final String atributo2) {
            this.atributo1 = atributo1;
            this.atributo2 = atributo2;
        }

        public void metodo1() {
            System.out.println("Método 1 executado.");
        }
        
        public int getAtributo1() {
            return atributo1;
        }
        
        public void setAtributo1(final int atributo1) {
            this.atributo1 = atributo1;
        }

        public void metodo2() {
            System.out.println("Método 2 executado.");
        }

        public String getAtributo2() {
            return atributo2;
        }

        public void setAtributo2(final String atributo2) {
            this.atributo2 = atributo2;
        }
    }
