package org.opendedup.sdfs.mgmt;

import java.io.IOException;

import org.opendedup.sdfs.Main;
import org.opendedup.sdfs.io.BlockDev;
import org.w3c.dom.Element;

public class BlockDeviceStart {

	public Element getResult(String devName) throws Exception {
		if (!Main.blockDev)
			throw new IOException("Block devices not supported on this volume");
		else {
			BlockDev dev = Main.volume.startDev(devName);
			return dev.getElement();
		}
	}

}
