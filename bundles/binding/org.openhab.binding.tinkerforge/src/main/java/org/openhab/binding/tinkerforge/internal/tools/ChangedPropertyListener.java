package org.openhab.binding.tinkerforge.internal.tools;

public interface ChangedPropertyListener<T> {
  public void changed(T oldValue, T newValue);
}
