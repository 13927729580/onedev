package com.pmease.gitplex.web.component.filelist;

import org.apache.wicket.request.resource.IResource;
import org.apache.wicket.request.resource.ResourceReference;

class LastCommitsResourceReference extends ResourceReference {

	public static final String NAME = "lastCommitsOfChildren";
	
	public LastCommitsResourceReference() {
		super(NAME);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public IResource getResource() {
		return new LastCommitsResource();
	}

}
