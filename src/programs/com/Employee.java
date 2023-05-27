package programs.com;


import java.util.HashSet;
import java.util.Set;

public class Employee {

	private String name;
	private Set<String>devices;
	
//	public Employee(String name,Set<String>devices ) {
//		this.setName(name);
//		this.setDevicesNames(devices);
//	}
	
	public void addDevices(String deviceNames) {
		if(this.devices==null) {
			this.devices = new HashSet<>();
		}
		this.devices.add(deviceNames);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getDevicesNames() {
		return devices;
	}

	public void setDevicesNames(Set<String> devices) {
		this.devices = devices;
	}

	}

