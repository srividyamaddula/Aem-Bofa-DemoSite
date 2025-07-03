package com.bankofamerica.aem.core.models;

import java.util.Objects;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardListModel {

    @ValueMapValue
    private String name;

    public String getName() {

        if (Objects.nonNull(name)) {
            return name;
        } else if (name.isEmpty()) {
            // return myOsgiService.getName();
        }

        else {
            // return myOsgiService.getName();
        }
        return name;

    }

}