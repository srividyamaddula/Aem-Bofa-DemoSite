package com.bankofamerica.aem.core.models.impl;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.bankofamerica.aem.core.models.TitleDescModel;
import org.apache.sling.models.annotations.Exporter;
import com.adobe.cq.export.json.ExporterConstants;


@Model(
    adaptables = Resource.class,
    adapters = {TitleDescModel.class, ComponentExporter.class},
    defaultInjectionStrategy = org.apache.sling.models.annotations.DefaultInjectionStrategy.OPTIONAL,
    resourceType = TitleDescModelImpl.RESOURCE_TYPE
)
@Exporter(
    name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
    extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
public class TitleDescModelImpl implements TitleDescModel {
    public static final String RESOURCE_TYPE = "bankofamerica/components/titledesc";
     @SlingObject
    private Resource currentResource;
    // This is a simple model class that implements the TitleDescModel interface.
    @ValueMapValue
    private String text;
    @ValueMapValue
    private String description;

    @Override
    public String getTitle() {
        return text;
    }
    @Override
    public String getExportedType() {
        return currentResource!=null? currentResource.getResourceType(): RESOURCE_TYPE;
    }
    @Override
    public String getDescription() {
        return description;
    }
}