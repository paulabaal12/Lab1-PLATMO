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



}