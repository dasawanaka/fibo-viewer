package org.edmcouncil.spec.fibo.weasel.ontology.updater.util;

import org.edmcouncil.spec.fibo.weasel.ontology.updater.model.UpdateJob;
import org.edmcouncil.spec.fibo.weasel.ontology.updater.model.UpdateJobStatus;

public class UpdateJobGenerator {

  public static UpdateJob generateNewUpdateJob() {
    UpdateJob uj = new UpdateJob();
    uj.setStartTimestamp(System.currentTimeMillis());
    uj.setStatus(UpdateJobStatus.CREATED);
    uj.setId(UpdateJobIdGenerator.nextStringId());
    uj.setMsg("UpdateJob with ID %s is created");
    return uj;
  }
}
