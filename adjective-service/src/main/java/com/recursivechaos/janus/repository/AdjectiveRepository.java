/**
 * Created by Andrew Bell 9/8/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */
package com.recursivechaos.janus.repository;

import com.recursivechaos.janus.domain.Adjective;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdjectiveRepository extends PagingAndSortingRepository<Adjective, Long> {

}
