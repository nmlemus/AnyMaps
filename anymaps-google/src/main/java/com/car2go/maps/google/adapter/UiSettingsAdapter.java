/*
 * Copyright (c) 2015 Daimler AG / Moovel GmbH
 *
 * All rights reserved
 */

package com.car2go.maps.google.adapter;

import com.car2go.maps.UiSettings;

/**
 * Adapts Google Map UiSettings to AnyMap UiSettings
 */
public class UiSettingsAdapter implements UiSettings {

	private final com.google.android.gms.maps.UiSettings uiSettings;

	public UiSettingsAdapter(com.google.android.gms.maps.UiSettings uiSettings) {
		this.uiSettings = uiSettings;
	}

	@Override
	public void setAllGesturesEnabled(boolean enabled) {
		uiSettings.setAllGesturesEnabled(enabled);
	}

	@Override
	public void setMyLocationButtonEnabled(boolean enabled) {
		uiSettings.setMyLocationButtonEnabled(enabled);
	}

	@Override
	public void setMapToolbarEnabled(boolean enabled) {
		uiSettings.setMapToolbarEnabled(enabled);
	}

	@Override
	public void setCompassEnabled(boolean enabled) {
		uiSettings.setCompassEnabled(enabled);
	}
}
