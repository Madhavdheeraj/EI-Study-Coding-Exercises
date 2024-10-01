public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay();
        DesktopDisplay desktopDisplay = new DesktopDisplay();

        weatherStation.addObserver(phoneDisplay);
        weatherStation.addObserver(desktopDisplay);

        weatherStation.setWeatherData(30.0f, 70.0f);
        weatherStation.setWeatherData(25.0f, 60.0f);
    }
}