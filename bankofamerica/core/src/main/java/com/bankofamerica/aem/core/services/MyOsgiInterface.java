package com.bankofamerica.aem.core.services;

import org.osgi.service.metatype.annotations.ObjectClassDefinition;
import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.AttributeType;
import org.osgi.service.metatype.annotations.*;

@ObjectClassDefinition(name = "My Osgi Training Implementation", description = "Fetch The Training Osgi")
public @interface MyOsgiInterface {

    @AttributeDefinition(name = "Name of the Trainer", description = "Fetch Trainer Name", type = AttributeType.STRING)
    String getTrainer() default "Lakshmi";

    @AttributeDefinition(name = "Scheduled Days", description = "No.of days", type = AttributeType.INTEGER)
    int getCountDays() default 1;

    @AttributeDefinition(name = "List of students", description = "List of students")
    String[] getStudentList() default { "Vidya" };

    @AttributeDefinition(name = "Batch type", description = "Select Mrng or Evng Batch", options = {
            @Option(label = "Morning Batch", value = "mrng"),
            @Option(label = "Evening Batch", value = "evng")
    })
    String batchValue() default "mrng";
}
