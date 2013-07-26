package io.github.ianfairman.example.factor;

import java.util.List;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

public class FactoriserTest {
    
    private Factoriser factoriser;
    
    @Before
    public void createFactoriser() {
        factoriser = new Factoriser();
    }

    @Test
    public void shouldFindPrimeFactorsOf2() {
        // When
        List<Integer> factors = factoriser.factorise(2);
        // Then
        assertThat(factors, contains(Integer.valueOf(2)));
    }
    
    @Test
    public void shouldFindPrimeFactorsOf4() {
        // When
        List<Integer> factors = factoriser.factorise(4);
        // Then
        assertThat(factors, contains(Integer.valueOf(2), Integer.valueOf(2)));
    }
    
    @Test
    public void shouldFindPrimeFactorsOf6() {
        // When
        List<Integer> factors = factoriser.factorise(6);
        // Then
        assertThat(factors, contains(Integer.valueOf(2), Integer.valueOf(3)));
    }
    
    @Test
    public void shouldFindPrimeFactorsOf1000000() {
        // When
        List<Integer> factors = factoriser.factorise(1000000);
        // Then
        assertThat(factors, contains(Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2),
                                     Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(2),
                                     Integer.valueOf(5), Integer.valueOf(5), Integer.valueOf(5),
                                     Integer.valueOf(5), Integer.valueOf(5), Integer.valueOf(5)));
    }
    
    @Test
    public void shouldFindPrimeFactorsOf1961() {
        // When
        List<Integer> factors = factoriser.factorise(1961);
        // Then
        assertThat(factors, contains(Integer.valueOf(37), Integer.valueOf(53)));
    }
    
}
