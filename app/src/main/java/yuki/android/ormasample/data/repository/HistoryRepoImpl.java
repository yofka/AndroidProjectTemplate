package yuki.android.ormasample.data.repository;

import java.util.List;

import javax.inject.Inject;

import yuki.android.ormasample.data.entity.History;
import yuki.android.ormasample.data.entity.OrmaDatabase;
import yuki.android.ormasample.domain.repository.HistoryRepo;

public class HistoryRepoImpl implements HistoryRepo {
  

  @Inject OrmaDatabase orma;
  
  @Inject
  public HistoryRepoImpl(OrmaDatabase orma) {
    this.orma = orma;
  }

  public List<History> findAll() {
    return orma.selectFromHistory().toList();
  }
}
