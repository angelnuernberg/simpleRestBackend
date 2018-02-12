package main.java.base;
import io.swagger.annotations.ApiOperation;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sensorMeasurement")
public class SensorMeasurementController {
    private SensorMeasurementRepository repository;

    @Autowired
    public SensorMeasurementController(SensorMeasurementRepository repository) {
        this.repository = repository;
    }

    @ApiOperation(value = "Returns a list of sensor measurements")
    /*    @ApiResponses(value = {
                @ApiResponse(code = 200, message = "Operation erfolgreich", response = Customer.class, responseHeaders = {}),
                @ApiResponse(code = 204, message = "Keine Termine vorhanden", responseHeaders = {}),
                @ApiResponse(code = 400, message = "Ein Fehler ist Aufgetreten", responseHeaders = {})
        })
    */
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<SensorMeasurement>> listAll() {
    	List<SensorMeasurement> measurements=(List<SensorMeasurement>) repository.findAll();
    	return new ResponseEntity<> (measurements,HttpStatus.OK);
    }

    @ApiOperation(value = "Adds a new sensor measurement.")
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<SensorMeasurement> add(@RequestBody @Valid SensorMeasurement sensorMeasurement) {
        SensorMeasurement savedSensorMeasurement=repository.save(sensorMeasurement);
    	return new ResponseEntity<>(savedSensorMeasurement, HttpStatus.CREATED);
    }
    
    @ApiOperation(value = "Updates an existig sensor measurement.")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<SensorMeasurement> update(@RequestBody @Valid SensorMeasurement sensorMeasurement) {
        SensorMeasurement updatedSensorMeasurement=repository.save(sensorMeasurement);
    	return new ResponseEntity<>(updatedSensorMeasurement, HttpStatus.OK);
    }

  

    @ApiOperation(value = "Gets an sensor measurement by measurementId.")
    @RequestMapping(value = "/{measurementId}", method = RequestMethod.GET)
    public ResponseEntity<SensorMeasurement> getById(@PathVariable String measurementId) {
    	SensorMeasurement sensorMeasurement=repository.findOne(new Integer(measurementId));
        return new ResponseEntity<>(sensorMeasurement, HttpStatus.OK);
    }

    @ApiOperation(value = "Deletes an existing sensor measurement.")
    @RequestMapping(value = "/{measurementId}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteById(@PathVariable String measurementId) {
    	repository.delete(new Integer(measurementId));
        return new ResponseEntity<>(HttpStatus.OK);
    }
}