package org.frogforce503.FRCSIM;

import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Box;

/**
 *
 * @author Bryce Paputa
 */
public class Bumper {
    
    public Bumper(Node chassisNode, float width, float length, float height, Alliance alliance){
        Node bumperNode = new Node("Bumpers");
        Box frontBox = new Box(new Vector3f(length/2+Main.in(3.5f), height, width/2+.001f), new Vector3f(-length/2-Main.in(3.5f), height+Main.in(5), width/2+Main.in(3.5f)));
        Geometry frontGeometry = new Geometry("Bumper Front", frontBox);
        bumperNode.attachChild(frontGeometry);
        frontGeometry.setMaterial(alliance.material);
        Box leftBox = new Box(new Vector3f(length/2+.001f, height, width/2), new Vector3f(length/2+Main.in(3.5f), height+Main.in(5), -width/2));
        Geometry leftGeometry = new Geometry("Bumper Left", leftBox);
        bumperNode.attachChild(leftGeometry);
        leftGeometry.setMaterial(alliance.material);
        Box backBox = new Box(new Vector3f(-length/2-Main.in(3.5f), height, -width/2-.001f), new Vector3f(length/2+Main.in(3.5f), height+Main.in(5), -width/2-Main.in(3.5f)));
        Geometry backGeometry = new Geometry("Bumper Front", backBox);
        bumperNode.attachChild(backGeometry);
        backGeometry.setMaterial(alliance.material);
        Box rightBox = new Box(new Vector3f(-length/2-.001f, height, -width/2), new Vector3f(-length/2-Main.in(3.5f), height+Main.in(5), +width/2));
        Geometry rightGeometry = new Geometry("Bumper Left", rightBox);
        bumperNode.attachChild(rightGeometry);
        rightGeometry.setMaterial(alliance.material);
        
        chassisNode.attachChild(bumperNode);
    }
}