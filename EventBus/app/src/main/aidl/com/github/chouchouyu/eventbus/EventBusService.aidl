// EventBusService.aidl
package com.github.chouchouyu.eventbus;

// Declare any non-default types here with import statements
import com.github.chouchouyu.eventbus.Requests;
import com.github.chouchouyu.eventbus.Responces;

interface EventBusService {
 Responces send(in Requests request);
}
