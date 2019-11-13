package com.rgs.pocproject.interfaces.section1;

import com.rgs.pocproject.entity.section1.DtoAnimal;
import com.rgs.pocproject.entity.section1.DtoNewAnimal;

/**
 * The interfaces interface for item1
 *
 * @author mz
 * @date 2019-11-06
 */
public interface Item1Service {

    /**
     * Get correct instance by using the item1
     * @return the dto of new animal object
     */
    DtoNewAnimal getCorrectInstance(DtoAnimal animal);
}
