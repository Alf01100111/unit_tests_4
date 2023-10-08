package seminars.fourth.hotel;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class BookingServiceTest {
    @Test
    void roomAviableTest () {
        HotelService mockHotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(mockHotelService);
        when(mockHotelService.isRoomAvailable(2)).thenReturn(true);

        assertTrue(bookingService.bookRoom(2));
        verify(mockHotelService, times(1)).isRoomAvailable(2);
    }

}