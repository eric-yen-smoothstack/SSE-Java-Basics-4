import java.util.*;

public class JUnitTest {
    @Test 
    public void Testers(){
        Line l1=new Line(0,0,1,1);
        Line l2=new Line(0,1,1,2);
        assertEquals(1,l1.getSlope(),.0001);
        assertTrue(l1.parallelTo(l2));
        
    }
    public static void main(String args[]) {
    
    }
}