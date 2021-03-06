/**
 * Copyright (c) 2010-2016 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.plex.internal.communication.websocket;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.openhab.binding.plex.internal.communication.SessionUpdate;

/**
 * Part of the {@link NotificationContainer} object
 *
 * @author Jeroen Idserda
 * @since 1.9.0
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaySessionStateNotification implements SessionUpdate {

    private String key;

    private String sessionKey;

    private String state;

    private Integer viewOffset;

    @Override
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    @Override
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public Integer getViewOffset() {
        return viewOffset;
    }

    public void setViewOffset(Integer viewOffset) {
        this.viewOffset = viewOffset;
    }

}
