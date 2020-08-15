package io.onedev.server.web.mapper;

import org.apache.wicket.core.request.mapper.ResourceMapper;
import org.apache.wicket.request.Url;
import org.apache.wicket.request.mapper.parameter.IPageParametersEncoder;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.request.resource.ResourceReference;

public class GeneralResourceMapper extends ResourceMapper {

	public GeneralResourceMapper(String path, ResourceReference resourceReference) {
		super(path, resourceReference);
	}

	@Override
	protected Url encodePageParameters(Url url, PageParameters pageParameters, IPageParametersEncoder encoder) {
		return new PathAwareUrl(super.encodePageParameters(url, pageParameters, encoder));
	}

}
