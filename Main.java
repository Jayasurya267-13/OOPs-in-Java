//sum of digits and String data extraction from a given string
public class Main {
    public static void main(String[] args) {
        String input="I 873 am 89393 a software 8393923 Engineer";
        String[] arr=input.split(" ");
        
        int sum=0;
        String stringData="";
        for(String arrData:arr){
            if(Character.isDigit(arrData.charAt(0))){
                sum+=Integer.valueOf(arrData);
            }
            else{
                stringData+=arrData+" ";
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("String Data: " + stringData);
    }
}
