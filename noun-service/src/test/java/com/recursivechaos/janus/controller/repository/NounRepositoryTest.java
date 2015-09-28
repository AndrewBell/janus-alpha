/**
 * Created by Andrew Bell 9/8/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.janus.controller.repository;

import com.recursivechaos.JanusNounServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JanusNounServiceApplication.class)
public class NounRepositoryTest {

    @Autowired
    NounRepository nounRepository;

    @Test
    public void testGetNouns() throws Exception {
        assertEquals(5, nounRepository.count());
    }
}