package io.github.dutchyd.helix.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This file is part of HelixUtility
 * Creation date: 7/29/2018
 * Created by: Dylan 'Dutchy' de Beer
 */

public class HelixUtility {

    public static Logger getLogger(String name) {
        return LoggerFactory.getLogger("Helix : " + name);
    }

}
