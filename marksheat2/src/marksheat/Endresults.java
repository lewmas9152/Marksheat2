package marksheat;
import java.util.Scanner;
public class Endresults {

	public static void main(String[] args) {
		int n=4;
		Scanner input = new Scanner(System.in);
		 String[] code =new String[n];
		 String[] unit =new String[n];
		 int[] score =new int [n];
		 double total =0;
		System.out.println("Unit Codes");
		for (int i=0; i<n;i++) {
			code[i] = input.nextLine();
			
		}
		
		System.out.println("Unit names");
		for (int i=0; i<n;i++) {
			unit[i] = input.nextLine();
		}
		
		System.out.println("scores");
		for (int i=0; i<n;i++) {
			score[i] = input.nextInt();
			total += score[i];
		}
		
		double avg = total/4;
		char grade;
       

        switch ((int)avg) {
	        case 70:
	        case 71:
	        case 72:
	        case 73:
	        case 74:
	        case 75:
	        case 76:
	        case 77:
	        case 78:
	        case 79:
	        case 80:
	        case 81:
	        case 82:
	        case 83:
	        case 84:
	        case 85:
	        case 86:
	        case 87:
	        case 88:
	        case 89:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                grade= 'A';
                break;
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            	grade= 'B';;
                break;
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            	grade= 'C';;
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            	grade= 'D';;
                break;
            default:
            	grade= 'F';;
                break;
        }
        
		System.out.println("                                      Department of Computer Science");
		System.out.println("                                           End Semester Results");
		String dot = new String(new char[100]).replace('\0','.');
		System.out.println(dot);
		System.out.println("|Name:Njuguna Samwel M.             |Roll_No:C026-01-0940/2022                     Semester:2.2");
		String line = new String(new char[100]).replace('\0','_');
		System.out.println(line);	
		System.out.println("|Unit code                         |Unit Name                                     Score");
		System.out.println(dot);
		System.out.println("|"+code[0] +"                           |"+unit[0] +"                                      | "+ score[0] );
		System.out.println(" ");
		System.out.println("|"+code[1] +"                           |"+unit[1] +"                                       | "+ score[1] );
		System.out.println(" ");
		System.out.println("|"+code[2] +"                           |"+unit[2] +"                                     | "+ score[2] );
		System.out.println(" ");
		System.out.println("|"+code[3] +"                           |"+unit[3] +"                                    | "+ score[3] );
		System.out.println(dot);
		System.out.println("|Total                                                                            |"+ total);
		System.out.println(dot);
		System.out.println("|Average                                                                          |"+ avg);
		System.out.println(dot);
		System.out.println("|Grade                                                                            |"+ grade);
		System.out.println(dot);
		System.out.println("                                                                   Recommendation |");
		System.out.println(dot);
		System.out.println("Grading Criteria                           Overall Grade(A-D)                   Recommend Pass");
		System.out.println("70-100          A");
		System.out.println("60-69           B");
		System.out.println("50-59           C");
		System.out.println("40-49           D");
		System.out.println("Below 40        F");
		System.out.println("70-100          A");
		System.out.println(dot);
		
	}

}
