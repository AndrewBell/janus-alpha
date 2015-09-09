/**
 * Created by Andrew Bell 9/8/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sentence")
public class SentenceController {

    @RequestMapping(method= RequestMethod.GET)
    public @ResponseBody String createSentence(@RequestParam(value="next-big-thing", required=false, defaultValue="SpringBoot") String nextBigThing) {
        return "Hello " + nextBigThing + "!";
    }

}
