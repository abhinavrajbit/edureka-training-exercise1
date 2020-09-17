package com.abhinav.test;
import org.junit.Test;

import com.abhinav.testDemo.AnagramDetector;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class AnagramTest {
    AnagramDetector underTest = new AnagramDetector();

    @Test
    public void testWithIdentity() {
        assertTrue(underTest.isAnagramOf("post", "post"));
    }

    @Test
    public void testWithSimpleAnagram() {
        assertTrue(underTest.isAnagramOf("post", "stop"));
    }

    @Test
    public void testWithAnagram_DuplicateLetter() {
        assertTrue(underTest.isAnagramOf("Kammer", "Kramem"));
    }

    @Test
    public void testWithNoAnagram_Simple() {
        assertFalse(underTest.isAnagramOf("post", "plus"));
    }

    @Test
    public void testWithNoAnagram_DuplicateLetters() {
        assertFalse(underTest.isAnagramOf("post", "stopp"));
    }

    @Test
    public void testWithNoAnagram_SeveralDuplicateLetters() {
        assertFalse(underTest.isAnagramOf("flussschifffahrt", "iffussahrtsch"));
    }
}
