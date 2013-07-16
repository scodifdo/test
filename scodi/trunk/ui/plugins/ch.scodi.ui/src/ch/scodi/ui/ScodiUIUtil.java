/*******************************************************************************
 * $URL: svn://176.28.48.244/projects/scodi/trunk/ui/plugins/ch.scodi.ui/src/ch/scodi/ui/ScodiUIUtil.java $
 * 
 * Copyright (c) 2007 henzler informatik gmbh, CH-4106 Therwil
 *******************************************************************************/
package ch.scodi.ui;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;

import ch.scodi.common.util.ScodiModelUtil;

import com.softmodeler.ui.UIUtil;

/**
 * UIUtil for Scodi specific tasks
 * 
 * @author created by Author: fdo, last update by $Author: fdo $
 * @version $Revision: 17831 $, $Date: 2012-12-21 14:03:21 +0100 (Fr, 21 Dez 2012) $
 */
public class ScodiUIUtil {
	/** enabled master data types */
	private static ArrayList<EClass> masterDataTypes;
	/** enabled document types */
	private static List<EClass> documentTypes;

	/**
	 * returns a list of all enabled document classifiers
	 * 
	 * @return
	 */
	public static synchronized List<EClass> getEnabledDocuments() {
		if (documentTypes == null) {
			documentTypes = new ArrayList<EClass>();
			for (EClass classifier : ScodiModelUtil.getDocuments()) {
				if (UIUtil.isObjectEnabled(classifier)) {
					documentTypes.add(classifier);
				}
			}
		}
		return documentTypes;
	}

	/**
	 * returns a list of all enabled master data classifiers
	 * 
	 * @return
	 */
	public static synchronized List<EClass> getEnabledMasterData() {
		if (masterDataTypes == null) {
			masterDataTypes = new ArrayList<EClass>();
			for (EClass classifier : ScodiModelUtil.getMasterData()) {
				if (UIUtil.isObjectEnabled(classifier)) {
					masterDataTypes.add(classifier);
				}
			}
		}
		return masterDataTypes;
	}
}
