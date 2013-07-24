package com.siondream.freegemas.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.LifecycleListener;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.badlogic.gdx.utils.Clipboard;
import com.siondream.freegemas.Freegemas;

public class GwtLauncher extends GwtApplication {

	public GwtLauncher() {
		super();
		Freegemas.setPlatformResolver(new WebGLResolver());
	}

	@Override
	public GwtApplicationConfiguration getConfig () {
		GwtApplicationConfiguration cfg = new GwtApplicationConfiguration(960, 540);
		return cfg;
	}

	@Override
	public ApplicationListener getApplicationListener () {
		return new Freegemas();
	}

	@Override
	public void addLifecycleListener(LifecycleListener arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Clipboard getClipboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Net getNet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLifecycleListener(LifecycleListener arg0) {
		// TODO Auto-generated method stub

	}
}