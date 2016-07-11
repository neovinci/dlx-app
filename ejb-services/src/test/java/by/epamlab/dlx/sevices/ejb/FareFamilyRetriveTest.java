package by.epamlab.dlx.sevices.ejb;

import by.epamlab.dlx.ejb.beans.FareFamilyBean;
import by.epamlab.dlx.model.beans.AncillaryAirComponent;
import by.epamlab.dlx.model.beans.FareFamily;
import by.epamlab.dlx.model.interfaces.IFareFamilyDAO;
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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Sergei Astapenko on 11.07.2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class FareFamilyRetriveTest {

    @InjectMocks
    private FareFamilyBean fareFamilyBeanRetrieve;

    @Mock
    private IFareFamilyDAO iFareFamilyDAO;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testReturn_FareFamily_From_DAO(){
        //Act
        FareFamily actFarefamily = fareFamilyBeanRetrieve.getFareFamily();
        //Assert
        assertThat(actFarefamily, instanceOf(FareFamily.class));
    }

    @Test
    public void testFareFamily_Not_NULL(){
        //Act
        FareFamily actFarefamily = fareFamilyBeanRetrieve.getFareFamily();
        //Assert
        assertNotNull(actFarefamily);
    }

    @Test
    public void testFareFamily_Expected_Not_Null_AirComponent_Should_Be_Added_To_FareFamily(){
        FareFamily expFareFamily = new FareFamily();
        List<AncillaryAirComponent> airComponents = new ArrayList<AncillaryAirComponent>();
        expFareFamily.setAirComponents(airComponents);
        //Act
        Mockito.doReturn(expFareFamily).when(iFareFamilyDAO).getFareFamily();
        FareFamily actFareFamily = fareFamilyBeanRetrieve.getFareFamily();
        //Assert
        assertThat(actFareFamily.getAirComponents(), notNullValue());
    }
}
