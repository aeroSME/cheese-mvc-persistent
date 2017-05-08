package org.launchcode.models.data;

import org.apache.log4j.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by Stephen on 5/8/2017.
 */
@Repository
@Transactional
public interface CategoryDAO extends CrudRepository<Category, Integer> {
}
