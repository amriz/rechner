
package spielrechner;

public enum Operator {
    PLUS() {  //constant specific body / SubClass von Operator
        @Override
        public double calc(int zahl1, double zahl2) {
            return zahl1+zahl2;
        }        
    }, 
    MINUS {  //constant specific body / SubClass von Operator
        @Override
        public double calc(int zahl1, double zahl2) {
            return zahl1-zahl2;
        }        
    }, 
    MAL {  //constant specific body / SubClass von Operator
        @Override
        public double calc(int zahl1, double zahl2) {
            return zahl1*zahl2;
        }        
    }, 
    DURCH {  //constant specific body / SubClass von Operator
        @Override
        public double calc(int zahl1, double zahl2) {
            return zahl1/zahl2;
        }        
    },
    ;
    //methode
//    public double calc(int zahl1, double zahl2){
//        throw new UnsupportedOperationException();
//    }
    
    public abstract double calc(int zahl1, double zahl2);
}
