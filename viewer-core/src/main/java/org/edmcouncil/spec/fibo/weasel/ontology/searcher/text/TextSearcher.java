package org.edmcouncil.spec.fibo.weasel.ontology.searcher.text;

import java.util.List;
import org.edmcouncil.spec.fibo.weasel.exception.ViewerException;
import org.edmcouncil.spec.fibo.weasel.ontology.searcher.ViewerSearcher;
import org.edmcouncil.spec.fibo.weasel.ontology.searcher.model.ExtendedResult;
import org.edmcouncil.spec.fibo.weasel.ontology.searcher.model.SearcherResult;
import org.edmcouncil.spec.fibo.weasel.ontology.searcher.model.hint.HintItem;
import org.edmcouncil.spec.fibo.weasel.ontology.searcher.result.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Michał Daniel (michal.daniel@makolab.com)
 */
@Component
public class TextSearcher implements ViewerSearcher {

  @Autowired
  private TextSearcherDb db;

  @Override
  public SearcherResult search(String query, Integer maxResultCount, Integer currentPage) throws ViewerException{

    ExtendedResult result = db.getSearchResult(query, maxResultCount, currentPage);
    
    return ResultFactory.createSearchResult(result);
  }

  public List<HintItem> getHints(String query, Integer maxHintCount) {
    
    List<HintItem> result = db.getHints(query, maxHintCount);

    return result;
  }

}
