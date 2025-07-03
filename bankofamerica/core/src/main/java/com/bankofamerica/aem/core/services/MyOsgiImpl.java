package com.bankofamerica.aem.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.metatype.annotations.Designate;

@Component(immediate = true)
@Designate(ocd = MyOsgiInterface.class)
public class MyOsgiImpl {

    protected String name;
    protected int days;
    protected String[] studentList;
    protected String batchType;

    public String getName() {
        return name;
    }

    @Activate
    @Modified
    public void activate(MyOsgiInterface m) {
        this.name = m.getTrainer();
        this.days = m.getCountDays();
        this.studentList = m.getStudentList();
        this.batchType = m.batchValue();

    }

}
