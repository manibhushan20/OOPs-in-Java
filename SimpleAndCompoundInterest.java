// Preventing inheritance from superclass using final keyword
// Preventing inheritance from superclass by making constructor private

 class Interest {
    double principle;
    double rate;
    double time;
    
   Interest(double p, double r, double t) {
        principle = p;
        rate = r;
        time = t;
    }
    
    double calculateInterest() {
        return (principle * rate * time) / 100;
    }
}

class SI extends Interest {
    SI(double p, double r, double t) {
        super(p, r, t);
    }
    
    @Override
    double calculateInterest() {
        return (principle * rate * time) / 100;
    }
}

class CI extends Interest {
    CI(double p, double r, double t) {
        super(p, r, t);
    }
    
    @Override
    double calculateInterest() {
        return principle * Math.pow((1 + rate / 100), time) - principle;
    }
}


public class SimpleAndCompoundInterest{
       public static void main(String [] args){
         SI  a=new SI(5000, 5,5);
         CI b=new CI(5000,5,5);
      
     System.out.println("The Simple interest is:" + a.calculateInterest());
    System.out.println("The compound interst is:" +b.calculateInterest());

      } 
}

