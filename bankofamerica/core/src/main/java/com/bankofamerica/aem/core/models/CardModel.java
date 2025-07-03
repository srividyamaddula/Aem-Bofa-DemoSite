package com.bankofamerica.aem.core.models;

import java.util.List;
import java.util.Objects;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bankofamerica.aem.core.services.MyOsgiImpl;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CardModel {

    private static final Logger LOG = LoggerFactory.getLogger(CardModel.class);

    @OSGiService
    MyOsgiImpl osgi;

    @ValueMapValue
    private String title;

    @ChildResource
    private List<CardListModel> cardList;

    public String getTitle() {

        if (title.equals("Name1")) {
            title = osgi.getName();
            LOG.info("Title is Name1, using osgi.getName(): {}", osgi.getName());
            return title;
        } else {
            return title;
        }

    }

    public List<CardListModel> getCardList() {
        return cardList;
    }

}