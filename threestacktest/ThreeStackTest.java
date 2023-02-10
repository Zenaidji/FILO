package threestacktest;
import org.junit.Test;
import static org.junit.Assert.*;
import ThreeStack from treestack;

public class ThreeStackTest {
  @Test
  public void testPush() {
    ThreeStack threeStack = new ThreeStack();
    threeStack.push(1, "objet1");
    threeStack.push(1, "objet2");
    threeStack.push(2, "objet3");
    threeStack.push(2, "objet4");
    threeStack.push(3, "objet5");


    assertEquals("objet2", threeStack.FILO1.getFirst());
    assertEquals("objet1", threeStack.FILO1.getLast());
    assertEquals("objet4", threeStack.FILO2.getFirst());
    assertEquals("objet3", threeStack.FILO2.getLast());
    assertEquals("objet5", threeStack.FILO3.getFirst());
  }



   @Test
  public void testPop() {
    ThreeStack threeStack = new ThreeStack();
    threeStack.push(1, "objet1");
    threeStack.push(1, "objet2");
    threeStack.push(2, "objet3");
    threeStack.push(2, "objet4");
    threeStack.push(3, "objet5");


    assertEquals("objet2", threeStack.pop(1));
    assertEquals("objet1", threeStack.pop(1));
    assertEquals("objet4", threeStack.pop(2));
    assertEquals("objet3", threeStack.pop(2));
    assertEquals("objet5", threeStack.pop(3));
  }
}





