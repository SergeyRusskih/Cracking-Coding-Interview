package ArraysAndStrings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsUniqueTests {

    private IsUnique isUnique;

    @BeforeEach
    public void setUp() {
        isUnique = new IsUnique();
    }

    @Test
    public void shouldBeTrue_forUniqueString_withAdditionalDataStructure() {
        assertTrue(isUnique.withHashTable("abcd"));
    }

    @Test
    public void shouldBeFalse_forUniqueString_withAdditionalDataStructure() {
        assertFalse(isUnique.withHashTable("abcda"));
    }

    @Test
    public void shouldBeTrue_forUniqueString_withoutAdditionalDataStructure() {
        assertTrue(isUnique.withNoAdditionalStructures("abcd"));
    }

    @Test
    public void shouldBeFalse_forUniqueString_withoutAdditionalDataStructure() {
        assertFalse(isUnique.withNoAdditionalStructures("abcda"));
    }
}
