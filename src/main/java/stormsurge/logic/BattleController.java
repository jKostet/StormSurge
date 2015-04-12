/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stormsurge.logic;

import java.util.ArrayList;
import stormsurge.entities.Fleet;
import stormsurge.entities.Sea;

/**
 *
 * @author jkostet
 */
public class BattleController {
    /**
     *  Class will control the flow of the gameplay.
     */
    
    private ArrayList<Fleet> fleets;
    private Sea sea;
    
    public BattleController(Sea sea) {
        this.sea = sea;
        this.fleets = new ArrayList();
    }
}
