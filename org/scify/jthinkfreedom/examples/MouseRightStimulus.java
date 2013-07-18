/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scify.jthinkfreedom.examples;

import java.awt.PointerInfo;

/**
 *
 * @author eustratiadis-hua
 */
public class MouseRightStimulus extends MouseStimulus {
    
    public MouseRightStimulus() {
        super();
    }
    
    @Override
    protected boolean shouldReact(PointerInfo piOld, 
        PointerInfo piNew) {
        return piOld.getLocation().getX() <
                piNew.getLocation().getX();
    }
    
}