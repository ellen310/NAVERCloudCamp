//package jb01.part08;

public class SwitchTest{
    public static void main(String[] args){
       
       int inputData = Integer.parsInt(args[0]);
       
       switch(inputData)
       {
           case 1:
               System.out.println("입력하신 값은 1입니다.");
               break;
            case 2:
               System.out.println("입력하신 값은 2입니다.");
               break;
            case 3:
               System.out.println("입력하신 값은 3입니다.");
               break;
            case 4:
               System.out.println("입력하신 값은 4입니다.");
               break;
            case 5:
               System.out.println("입력하신 값은 5입니다.");
               break;
            default:
               System.out.println("case문을 다통과(동일상수가 없을 경우");
               Systen.out.println("default가수행됨...입력하신 수는"+inputData+"입니다.");
               break;
       }
        
    }
    
}