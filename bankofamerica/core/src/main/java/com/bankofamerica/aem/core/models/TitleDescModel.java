package com.bankofamerica.aem.core.models;
import org.osgi.annotation.versioning.ConsumerType;
import com.adobe.cq.export.json.ComponentExporter;

@ConsumerType
public interface TitleDescModel extends ComponentExporter {
    public static final String RESOURCE_TYPE = "bankofamerica/components/titledesc";
    public String getTitle();
    public String getDescription();
}
