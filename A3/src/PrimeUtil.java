import java.math.BigInteger;
import java.util.Random;

public class PrimeUtil {
	
	private static BigInteger two = BigInteger.ONE.add(BigInteger.ONE);
	private static BigInteger one = BigInteger.ONE;

	public PrimeUtil(){
		
	}
	
	public static BigInteger sopieGermainPrime(){
		
		Random rand = new Random(System.currentTimeMillis());
		BigInteger sg = BigInteger.probablePrime(1023,rand);		
		BigInteger sqTimes2 = sg.multiply(two);
		BigInteger sqTimes2Add1 = sqTimes2.add(one);
		
		
		while(sqTimes2Add1.isProbablePrime(3) == false){
			sg = BigInteger.probablePrime(1023,rand);
			two = BigInteger.ONE.add(one);
			sqTimes2 = sg.multiply(two);
			sqTimes2Add1 = sqTimes2.add(one);			
		}
		return sg;
	}
	
	public static BigInteger primitiveRoot(BigInteger sophie){
		
		BigInteger pMinus1 = sophie.subtract(one);
		BigInteger q = pMinus1.divide(two);
		BigInteger smallExp = pMinus1.divide(q);		
		boolean isPrimRoot = false;
		BigInteger g = one;
		while(!(isPrimRoot)){
			g = g.add(one);
			BigInteger smallTest = g.modPow(smallExp, sophie);
			isPrimRoot = smallTest.compareTo(one) != 0;
			BigInteger bigTest = g.modPow(q, sophie);
			isPrimRoot = isPrimRoot && (bigTest.compareTo(one) != 0);			
		}		
		System.out.println(g);
		return g;		
	}
	
	public static BigInteger getExponent(BigInteger pMinus2){
		Random rand = new Random(System.currentTimeMillis());
		int numBits = pMinus2.bitCount();
		BigInteger exp = new BigInteger(numBits,rand);
		return exp;
	}
}
