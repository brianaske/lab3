import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import org.junit.*;
public class ListTests {
    private static final StringChecker StringChecker = null;

    @Test
    public void testFilter(){

        String [] aStringList = {"happy","apple","bun"};
        List<String> arr = new ArrayList();
        for (int i=0; i<aStringList.length; i++){
            arr.add(aStringList[i]);
        }
        
        List<String> result = ListExamples.filter(arr, new ListExamples());
        assertEquals(Arrays.asList(new String[]{"happy","apple"}), result);
    }
}
