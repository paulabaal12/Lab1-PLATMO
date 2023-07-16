//PAULA REBECA BARILLAS

public class ItemDataJ{
    Object originalValue; 
//public void ItemDataJ(String[] args) {} 
public ItemDataJ(Object originalValue){
        this.originalValue = originalValue;
}

public String getType(){
    Class class1 =originalValue.getClass();
    if(class1.equals(String.class)){
        return "cadena";
    } else if (class1.equals(Integer.class)){
        return "entero";
    } else if (class1.equals(Boolean.class)){
        return "booleano";
    } else {
        return null; 
    }
   
}

public String getInfo(){
   Class class1 =originalValue.getClass();
   if(class1.equals(String.class)){
    return "L" + ((String)originalValue).length();
   } else if (class1.equals(Integer.class)){
        int value = (Integer) originalValue;
        if (value % 10 ==0){
            return "M10" ;

        } else if (value %5 == 0){
            return "M2";
        } else {
            return null;
        }
   } else if  (class1.equals(Boolean.class)){
    boolean value = (Boolean) originalValue;
    if(value){
        return "Verdadero";
    } else {
        return "Falso";
    }
} else {
    return null;
}
}

}