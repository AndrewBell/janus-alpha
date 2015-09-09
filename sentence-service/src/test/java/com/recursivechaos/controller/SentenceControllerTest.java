/**
 * Created by Andrew Bell 9/8/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.controller;

import com.recursivechaos.SentenceServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SentenceServiceApplication.class)
public class SentenceControllerTest {

    @Autowired
    SentenceController controller;

    @Test
    public void testGetThing() throws Exception {
        assertEquals("Hello world!",controller.createSentence("world"));
    }

}