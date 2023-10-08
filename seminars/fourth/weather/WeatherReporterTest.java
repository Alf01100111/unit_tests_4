package seminars.fourth.weather;
//Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
//        обращающийся к внешнему API для получения информации о текущей температуре.
//        Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
//        Создайте мок-объект для WeatherService с использованием Mockito.


import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class WeatherReporterTest {
    @Test
    void takeReportTest () {
        // Arrange
        WeatherService testWeatherService = mock(WeatherService.class);
        WeatherReporter reporter = new WeatherReporter(testWeatherService);
        when(testWeatherService.getCurrentTemperature()).thenReturn(15);

        // Act
        String res = reporter.generateReport();

        // Assert

        assertEquals("Текущая температура: 15 градусов.", res);

        verify(testWeatherService, times(1)).getCurrentTemperature();
    }



}


//    @Test
//    public void iteratorWillReturnHelloWorld() {
//        // Arrange
//        Iterator iteratorMock = mock(Iterator.class);
//
//        when(iteratorMock.next()).thenReturn("Hello").thenReturn("World");
//        // Act
//        String res =iteratorMock.next() + " " + iteratorMock.next();
//        // Assert
//        assertEquals("Hello World", res);
//    }