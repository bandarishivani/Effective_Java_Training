
public class factorialapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int x=5;
        int fx= Math.factorial(x);
        System.out.println("Factorial of "+x+ " is "+fx);

    }

}
class Math {

    static int factorial(int n){

        int fn=1;

        while(n>1)
            fn*=n--;

        return fn;
    }
}
	}

}
