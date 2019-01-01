// -----BEGIN DISCLAIMER-----
/*******************************************************************************
 * Copyright (c) 2019 JCrypTool Team and Contributors
 *
 * All rights reserved. This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
// -----END DISCLAIMER-----
package org.jcryptool.visual.he.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.jcryptool.visual.he.Messages;
import org.jcryptool.visual.he.algo.PaillierData;
import org.jcryptool.visual.he.wizards.pages.PaillierChooseOperationTextPage;

/**
 * Wizard to enter an operation number for Paillier homomorphic visualization
 * @author Coen Ramaekers
 *
 */
public class PaillierOperationTextWizard extends Wizard {
	/** wizard title, displayed in the titlebar. */
	private static final String TITLE = Messages.OperationTextWizard_Title;

	/** Will hold data */
	private PaillierData data;

	public PaillierOperationTextWizard(PaillierData data) {
		this.data = data;
		this.setWindowTitle(TITLE);
	}

	@Override
	public void addPages() {
		addPage(new PaillierChooseOperationTextPage(data));
	}

	@Override
	public boolean canFinish() {
		return getPage(PaillierChooseOperationTextPage.getPagename()).isPageComplete();
	}

	@Override
	public boolean performFinish() {
		return true;
	}
}