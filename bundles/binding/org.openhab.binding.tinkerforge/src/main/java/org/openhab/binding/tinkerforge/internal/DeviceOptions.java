package org.openhab.binding.tinkerforge.internal;

import java.util.HashMap;

public class DeviceOptions {
  HashMap<String, String> deviceOptions = new HashMap<String, String>();
  
  public void put(String key, String value){
    deviceOptions.put(key, value);
  }

  public String getOption(String option){
    return deviceOptions.get(option);
  }
  
  public HashMap<String, String> getDeviceOptions() {
    return deviceOptions;
  }

}
