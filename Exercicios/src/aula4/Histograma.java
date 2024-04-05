package aula4;
import java.util.Scanner;
public class Histograma {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Quantos números terão no histograma?");
		int index = sc.nextInt();
		System.out.println("Qual será o maior número no histograma?");
		int quant = sc.nextInt();
		int preencheHist[] = preencheNum(index);
		histograma(asterisco(preencheHist,quant, index ));
	}
	
	public static int[] preencheNum(int y){
		int exemplo[] = new int[y];
		for(int x=1; x<exemplo.length+1; x++) {
			System.out.print(x+": ");
			int num = sc.nextInt();
			exemplo[x-1] = num;
		}
		return exemplo;
	}

	public static String[][] asterisco(int[] d, int a, int b){
	    String quantAst[][] = new String[a][b + 1];
	    for(int i = 0; i < a; i++) {
	        quantAst[i][0] = String.valueOf(i + 1);
	        for(int j = 1; j <= b; j++) {
	            quantAst[i][j] = ""; 
	        }
	    }

	    for(int num : d) {
	        if (num <= a) {
	            for (int j = 1; j <= b; j++) {
	                if (quantAst[num - 1][j].isEmpty()) { 
	                    quantAst[num - 1][j] = "*";
	                    break;
	                }
	            }
	        }
	    }

	    return quantAst;
	}

	public static void histograma(String[][] x) {
	    for(int i = 0; i < x.length; i++) {
	        for(int a = 0; a < x[i].length; a++) {
	            if (x[i][a] == null) {
	                System.out.print("  "); 
	            } else {
	                System.out.print(x[i][a] + " ");
	            }
	        }
	        System.out.println("\n");
	    }
	}

	}

