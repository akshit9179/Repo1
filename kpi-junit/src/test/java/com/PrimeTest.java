package com;
import static org.junit.Assert.assertEquals;
	import org.junit.Test;

public class PrimeTest
{

@Test

public void evaluatesExpression() {
 Prime prime =new Prime();
 String sol=prime.pm(13);
 assertEquals("Prime Number", sol);
}
}


