/**
 * Created by Andrew Bell 9/15/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */
package com.recursivechaos.janus.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NounTest {

    @Test
    public void testGetNoun() throws Exception {
        Noun noun = new Noun();
        noun("THING");
        assertEquals("Noun(id=null, noun=THING)",noun.toString());
    }
}