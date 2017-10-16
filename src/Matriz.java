
import java.util.Scanner;

/**
 *
 * @author Joel Corona
 */
public class Matriz {

    /**
     * Genera una matriz aleatoria, atributos.
     */
    public int m;
    public int n;
    public int l1;
    public int l2;
    public int ini1;
    public int ini2;
    public int[][] matriz;
    public int cent;
    

    public Matriz() {
        
    	
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas");
         m = sc.nextInt();
        System.out.println("Ingrese la cantidad de columnas");
         n = sc.nextInt();
        matriz = new int[m][n];
        int d = 50;
        l1 = m;
        l2 = n; 
        int ini1 = 0, ini2 = 0;

        for (int i = ini1; i < l1; i++) {
            for (int j = ini2; j < l2; j++) {
                matriz[i][j] = d;
                d--;
            }
        }
       
    }
    
    public void mostrarmatriz() {
       
       for (int i = ini1; i < l1; i++) {
            for (int j = ini2; j < l2; j++) {
            	
                System.out.printf(matriz[i][j] + " ");
                
            }
            System.out.println(); //salto de linea
        }
    }

    public int paderecha(int f /*le pido la fila*/) {
        //me muevo por toda la fila
        for (int i = ini2; i <= l2-1; i++) {
        	cent++;
            System.out.printf(matriz[f][i] + " ");
        }
        System.out.println(); //salto de linea

        return cent;
        
    }

    public int paabajo(int c /*le pido la columna*/) {
        for (int i = ini1 + 1; i <= l1-1; i++) {
        	cent++;
            System.out.printf(matriz[i][c] + " ");
        }
        System.out.println(); //salto de linea
        return cent;
        
    }

    public int paizquierda(int f /*le pido la fila*/) {
        for (int i = l2 - 2; i >= ini2; i--) {
        	cent++;
            System.out.printf(matriz[f][i] + " ");
        }
        System.out.println(); //salto de linea
        return cent;
        
    }

    public int paarriba(int c /*le pido la columna*/) {
    	
        for (int i = l1 - 2; i >= ini1+1 ; i--) {
        	cent++;
            System.out.printf(matriz[i][c] + " ");
        }
        System.out.println(); //salto de linea
        return cent;
        
    }
    /*
     Ahora vamos a crear metodos para actualizar el tamaño de la matriz cada vez.
     */
    
    public int getl1() {
    	return l1;
    }
    public int getl2() {
    	return l2;
    }
    public int getini1() {
    	return ini1;
    }
    
    public void setl1() {
    	l1--;
    	}
    
    public void setl2() {
    	l2--;
    }
    
	public void setini1() {
		ini1++;}
	
	public void setini2() {
		ini2++;
	}
	public int getini2() {
    	return ini2;
    }
	/*
	 Matriz leida de forma helicoidal
	 */
	
	public void helicoidal() {
		
		int f, c,d;
		Matriz k = new Matriz();
		f=k.getini1();
		c=k.getini2();
		
		System.out.println(cent);
		while (k.cent!=(l1*l2)){
			if(f==k.getini1() && c==k.getini2()) {
				//Para la derecha en las filas
				d=k.paderecha(f);
				
				//debo actualizar columnas
				c=k.getl2()-1;	
				
			}
			if(c==k.getl2()-1 && f==k.getini1()) {
				//Para abajo en las columnas
				
				d=k.paabajo(c);
				
				//Actualizo las filas
				f=k.getl1()-1;	
				
			}
			if(c==k.getl2()-1 && f==k.getl1()-1) {
				//recodido a la izquierda
				d=k.paizquierda(f);
				
				//Actualizo la columna
				c=k.getini2();
				
			}
			if(c==k.getini2() && f==k.getl1()-1) {
				
				
				//Para arriba en la columna
				d=k.paarriba(c);
				
				//actualizo 
				k.setini1();
				k.setini2();
				k.setl2();
				k.setl1();
				f=k.getini1();
				c=k.getini2();
				
				
			}
			
		} 
	}

}
