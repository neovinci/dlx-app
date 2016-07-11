package by.epamlab.dlx.sevices.ejb;

import by.epamlab.dlx.ejb.beans.CustomerBean;
import by.epamlab.dlx.model.beans.Customer;
import by.epamlab.dlx.model.beans.Payment;
import by.epamlab.dlx.model.factories.DAOFactory;
import by.epamlab.dlx.model.interfaces.ICustomerDAO;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.*;

/**
 * Created by Sergei Astapenko on 10.07.2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class CustomerRetriveTest {
    @InjectMocks
    private CustomerBean customerBeanRetrieve;

    @Mock
    private ICustomerDAO iCustomerDAO;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testReturn_Customer_From_DAO(){
        //Act
        Customer actCustomer = customerBeanRetrieve.getCustomer();
        //Assert
        assertThat(actCustomer, instanceOf(Customer.class));
    }

    @Test
    public void testCustomer_Not_NULL(){
        //Act
        Customer actCustomer = customerBeanRetrieve.getCustomer();
        //Assert
        assertNotNull(actCustomer);
    }

    @Test
    public void testCustomer_Expected_Not_Null_Payments_Should_Be_Added_To_Customer(){
        Customer expCustomer = new Customer();
        List<Payment> payments = new ArrayList<Payment>();
        expCustomer.setPayments(payments);
        //Act
        Mockito.doReturn(expCustomer).when(iCustomerDAO).getCustomer();
        Customer actCustomer = customerBeanRetrieve.getCustomer();
        //Assert
        assertThat(actCustomer.getPayments(), notNullValue());
    }
}
