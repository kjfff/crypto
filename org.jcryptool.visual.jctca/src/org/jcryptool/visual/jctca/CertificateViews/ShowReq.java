package org.jcryptool.visual.jctca.CertificateViews;

import java.util.ArrayList;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.jcryptool.visual.jctca.Util;
import org.jcryptool.visual.jctca.CertificateClasses.CertificateCSRR;
import org.jcryptool.visual.jctca.listeners.CAListener;

public class ShowReq implements Views {
	Composite composite;
	Composite left;
	Composite center;

	List lst_private_keys_ca;
	Button btn_accept_request;
	Button btn_reject_request;

	public ShowReq(Composite content, Composite exp) {
		composite = new Composite(content, SWT.NONE);
		composite.setLayout(new GridLayout(3, true));
		GridData gd_comp = new GridData(SWT.FILL, SWT.FILL, true, true);
		composite.setLayoutData(gd_comp);

		left = new Composite(composite, SWT.NONE);
		left.setLayout(new GridLayout(1, true));
		left.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		Group showSelectedRequest = new Group(composite, SWT.NONE);
		showSelectedRequest.setLayout(new GridLayout(2, true));
		GridData gd_grp = new GridData(SWT.FILL, SWT.TOP, true, true);
		showSelectedRequest.setLayoutData(gd_grp);
		showSelectedRequest.setText(Messages.ShowReq_editCSR_RR);

		// center = new Composite(showSelectedRequest, SWT.NONE);
		// center.setLayout(new GridLayout(1, true));
		// center.setLayoutData(new GridData(SWT.FILL, SWT.NONE, false, true));

		Tree tree = new Tree(left, SWT.BORDER);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		Util.createRootNodes(tree);

		lst_private_keys_ca = new List(showSelectedRequest, SWT.NONE);
		lst_private_keys_ca.setLayoutData(new GridData(SWT.FILL, SWT.NONE,
				true, true, 2, 1));
		ArrayList<AsymmetricCipherKeyPair> caKeys = CertificateCSRR.getInstance().getCAKeys();
		int cnt = 1;
		for(AsymmetricCipherKeyPair key : caKeys){
			lst_private_keys_ca.add("Zertifikat " + cnt + ": " + key.getPublic().hashCode());
			cnt++;
		}
		btn_accept_request = new Button(showSelectedRequest, SWT.NONE);
		btn_accept_request
				.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		btn_accept_request.setText(Messages.ShowReq_ReqGrant);
		btn_accept_request.setEnabled(false);
		
		btn_reject_request = new Button(showSelectedRequest, SWT.NONE);
		btn_reject_request
				.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		btn_reject_request.setText(Messages.ShowReq_ReqDeny);
		btn_reject_request.setEnabled(false);

		CAListener lst = new CAListener(tree, lst_private_keys_ca, btn_accept_request, btn_reject_request);
		tree.addSelectionListener(lst);
		lst_private_keys_ca.addSelectionListener(lst);
		btn_accept_request.addSelectionListener(lst);
		btn_reject_request.addSelectionListener(lst);
		
		
		// Label lbl_exp = (Label)exp.getChildren()[0];
		// lbl_exp.setText("Hi, I explain what is going on in Show Request!");

	}

	@Override
	public void dispose() {
		this.composite.dispose();
	}

	@Override
	public void setVisible(boolean visible) {
		composite.setVisible(visible);
	}
}
