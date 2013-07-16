/*******************************************************************************
 * $URL: svn://176.28.48.244/projects/scodi/trunk/ui/plugins/ch.scodi.ui/src/ch/scodi/ui/ScodiUIPlugin.java $
 * 
 * Copyright (c) 2007 henzler informatik gmbh, CH-4106 Therwil
 *******************************************************************************/
package ch.scodi.ui;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 * 
 * @author created by Author: fdo, last update by $Author: fdo $
 * @version $Revision: 1271 $, $Date: 2009-03-09 13:13:02 +0100 (Mo, 09 Mrz 2009) $
 */
public class ScodiUIPlugin extends AbstractUIPlugin {

	/** The plug-in ID */
	public static final String PLUGIN_ID = "ch.scodi.ui"; //$NON-NLS-1$

	/** The shared instance */
	private static ScodiUIPlugin plugin;

	/**
	 * The constructor
	 */
	public ScodiUIPlugin() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static ScodiUIPlugin getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in relative path
	 * 
	 * @param path the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
