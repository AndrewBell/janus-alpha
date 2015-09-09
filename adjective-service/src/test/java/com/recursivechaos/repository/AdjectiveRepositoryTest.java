/**
 * Created by Andrew Bell 9/8/2015
 * www.recursivechaos.com
 * andrew@recursivechaos.com
 * Licensed under MIT License 2015. See license.txt for details.
 */

package com.recursivechaos.repository;

import com.recursivechaos.JanusAdjectiveServiceApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = JanusAdjectiveServiceApplication.class)
public class AdjectiveRepositoryTest {

    @Autowired
    AdjectiveRepository adjectiveRepository;

    @Test
    public void testGetNouns() throws Exception {
        assertEquals(5, adjectiveRepository.count());
    }
}