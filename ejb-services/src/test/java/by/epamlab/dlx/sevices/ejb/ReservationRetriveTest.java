package by.epamlab.dlx.sevices.ejb;

import by.epamlab.dlx.ejb.beans.FareFamilyBean;
import by.epamlab.dlx.ejb.beans.ReservationBean;
import by.epamlab.dlx.model.beans.AncillaryAirComponent;
import by.epamlab.dlx.model.beans.FareFamily;
import by.epamlab.dlx.model.beans.ResComponent;
import by.epamlab.dlx.model.beans.Reservation;
import by.epamlab.dlx.model.interfaces.IFareFamilyDAO;
import by.epamlab.dlx.model.interfaces.IReservationDAO;
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
public class ReservationRetriveTest {
    @InjectMocks
    private ReservationBean reservationBeanRetrieve;

    @Mock
    private IReservationDAO ireservationDAO;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testReturn_Reservation_From_DAO(){
        //Act
        Reservation actReservation = reservationBeanRetrieve.getReservation();
        //Assert
        assertThat(actReservation, instanceOf(Reservation.class));
    }

    @Test
    public void testFareFamily_Not_NULL(){
        //Act
        Reservation actReservation = reservationBeanRetrieve.getReservation();
        //Assert
        assertNotNull(actReservation);
    }

    @Test
    public void testFareFamily_Expected_Not_Null_AirComponent_Should_Be_Added_To_FareFamily(){
        Reservation expReservation = new Reservation();
        List<ResComponent> components = new ArrayList<ResComponent>();
        expReservation.setComponens(components);
        //Act
        Mockito.doReturn(expReservation).when(ireservationDAO).getReservation();
        Reservation actReservation = reservationBeanRetrieve.getReservation();
        //Assert
        assertThat(actReservation.getComponents(), notNullValue());
    }

}
