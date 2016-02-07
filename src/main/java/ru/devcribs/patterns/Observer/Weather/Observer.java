package ru.devcribs.patterns.Observer.Weather;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
