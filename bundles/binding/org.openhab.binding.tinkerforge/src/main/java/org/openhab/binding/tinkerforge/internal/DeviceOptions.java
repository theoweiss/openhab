package org.openhab.binding.tinkerforge.internal;

import java.util.HashMap;

import org.slf4j.Logger;

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

  public boolean hasOption(String opt, Logger logger, String id) {
    if (deviceOptions.get(opt) == null) {
      if (logger != null && id != null) {
        logger.error("missing option: " + opt + " for device: " + id);
      }
      return false;
    }
    if (logger != null && id != null) {
      logger.error("found option: " + opt + "for device: " + id);
    }
    return true;
  }

  public Short asShort(String opt) {
    String optStr = deviceOptions.get(opt);
    if (optStr == null) {
      return null;
    }
    return Short.parseShort(optStr);
  }

  public Long asLong(String opt) {
    String optStr = deviceOptions.get(opt);
    if (optStr == null) {
      return null;
    }
    return Long.parseLong(optStr);
  }

  public char asChar(String opt) {
    String optStr = deviceOptions.get(opt);
    if (optStr == null) {
      return 0;
    }
    return optStr.charAt(0);
  }

}
