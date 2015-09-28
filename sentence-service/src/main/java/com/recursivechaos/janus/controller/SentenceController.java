/**
 * Created by Andrew Bell 9/8/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.janus.controller;

import com.recursivechaos.janus.client.AdjectiveClient;
import com.recursivechaos.janus.client.NounClient;
import com.recursivechaos.janus.domain.Adjective;
import com.recursivechaos.janus.domain.Noun;
import feign.Feign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.PagedResources;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/sentence")
public class SentenceController {

    @Autowired
    NounClient nounClient;

    @Autowired
    AdjectiveClient adjectiveClient;

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody String createSentence(@RequestParam(value="next-big-thing", required=false, defaultValue="SpringBoot") String nextBigThing) {

        // Do lookup here

        return "The next big thing, " + nextBigThing + " will be a " + "" + "!";
    }

}
