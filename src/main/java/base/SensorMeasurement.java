package main.java.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class SensorMeasurement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer measurementId;
    
    private Integer sensorId;
   
	private String dateTime;
    
    private Float temperature;

    private Float humidity;

    public Integer getMeasurementId() {
		return measurementId;
	}

	public void setMeasurementId(Integer measurementId) {
		this.measurementId = measurementId;
	}
	
    public Integer getSensorId() {
		return sensorId;
	}

	public void setSensorId(Integer sensorId) {
		this.sensorId = sensorId;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public Float getHumidity() {
		return humidity;
	}

	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "SensorMeasurement [measurementId=" + measurementId + ", sensorId=" + sensorId + ", dateTime=" + dateTime
				+ ", temperature=" + temperature + ", humidity=" + humidity + "]";
	}

	
    
}

