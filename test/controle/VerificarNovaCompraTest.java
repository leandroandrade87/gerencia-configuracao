/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entity.Customer;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Leandro
 */
public class VerificarNovaCompraTest {
    
    private Customer customer;

    
    
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
        customer = new Customer();
        customer.setCreditLimit(10);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of verificarLimiteDisponivel method, of class VerificarNovaCompra.
     */
    @Test
    public void testVerificarLimiteDisponivel() {
        System.out.println("verificarLimiteDisponivel");
        Integer limiteCredito = 10;
        VerificarNovaCompra instance = new VerificarNovaCompra();
        instance.setCustomer(customer);
        //boolean result = instance.verificarLimiteDisponivel(limiteCredito);
        
        assertTrue(false);
    }

    /**
     * Test of getCustomer method, of class VerificarNovaCompra.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        VerificarNovaCompra instance = new VerificarNovaCompra();
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setCustomer method, of class VerificarNovaCompra.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        VerificarNovaCompra instance = new VerificarNovaCompra();
        instance.setCustomer(customer);
       
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer( Customer customer ) {
        this.customer = customer;
    }
}
