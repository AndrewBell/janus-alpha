/**
 * Created by Andrew Bell 9/14/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.janus.client;

import com.recursivechaos.janus.domain.Adjective;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("adjective-service")
public interface AdjectiveClient {

    @RequestMapping(method = RequestMethod.GET, value = "/adjectives")
    //ResponseEntity<PagedResources<Resource<Adjective>>> getAdjectives();
    PagedResources<Resource<Adjective>> getAdjectives();

}
