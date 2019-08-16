package Tut4;

/**
 * Unit test for simple App.
 */
public class TestCalc 
{

    public void testAdd()
    {
        assert(12 == (new Calc().add(5, 7)));
    }
	
	public void testSubtract()
    {
        assert(2 == (new Calc().subtract(7, 5)));
    }
}
