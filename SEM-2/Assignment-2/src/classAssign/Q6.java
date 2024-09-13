package classAssign;

public class Q6 {
    public static void main(String[] args) {
        CSE s1 = new CSE(90,80,75);
        NonCSE s2 = new NonCSE(50,80,85);
        System.out.println("% of 1st student is: "+s1.getPercentage());
        System.out.println("% of 2nd student is: "+s2.getPercentage());
    }
}
abstract class Marks {
    int markICP;
    int markDSA;
    double percentage;
    abstract double getPercentage();
}
class CSE extends Marks{
    int algoDesign;
    double getPercentage() {
        percentage = (double)(markICP+markDSA+algoDesign)/3;
        return percentage;
    }
    CSE(int markICP, int markDSA, int algoDesign) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.algoDesign = algoDesign;
    }
}
class NonCSE extends Marks {
    int enggMechanics;
    double getPercentage() {
        percentage = (double)(markICP+markDSA+enggMechanics)/3;
        return percentage;
    }
    NonCSE(int markICP, int markDSA, int enggMechanics) {
        this.markICP = markICP;
        this.markDSA = markDSA;
        this.enggMechanics = enggMechanics;
    }
}