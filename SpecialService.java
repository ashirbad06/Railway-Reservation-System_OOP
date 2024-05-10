public interface SpecialService {
	static double applyStudentDiscount(double fare){
        return fare*0.70;
    }
    static double applySeniorCitizenDiscount(double fare){
        return fare*0.60;
    }
    static double applyMilitaryPersonnelDiscount(double fare){
        return fare*0.50;
    }
    static double applyDisabledPersonDiscount(double fare){
        return fare*0.45;
    }
}