class Element {
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    public Element(String symbol, int atomicNumber, double atomicWeight) {
        this.symbol = symbol;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    public void describeElement() {
        System.out.println("Symbol: " + symbol);
        System.out.println("Atomic Number: " + atomicNumber);
        System.out.println("Atomic Weight: " + atomicWeight);
    }
}

class MetalElement extends Element {
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        super.describeElement();
        System.out.println("Metal Element");
    }
}

class SemiconductorElement extends Element {
    public SemiconductorElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        super.describeElement();
        System.out.println("Semiconductor Element");
    }
}

public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[6];

        elements[0] = new MetalElement("Fe", 26, 55.85);
        elements[1] = new MetalElement("Cu", 29, 63.55);
        elements[2] = new MetalElement("Ag", 47, 107.87);
        elements[3] = new SemiconductorElement("Si", 14, 28.09);
        elements[4] = new SemiconductorElement("Ge", 32, 72.63);
        elements[5] = new SemiconductorElement("Ga", 31, 69.72);

       
    for (int i = 0; i < elements.length; i++) {
        Element element = elements[i];
        element.describeElement();
        System.out.println();
         }
    }
}
