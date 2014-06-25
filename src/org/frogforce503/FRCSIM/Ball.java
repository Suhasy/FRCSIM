package org.frogforce503.FRCSIM;

import com.jme3.bullet.PhysicsSpace;
import com.jme3.bullet.control.RigidBodyControl;
import com.jme3.material.Material;
import com.jme3.scene.Geometry;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Sphere;

/**
 *
 * @author Bryce Paputa
 */
public class Ball {
    
    public Ball(Material material, Node rootNode, PhysicsSpace space){
        Sphere sphere = new Sphere(8, 8, Main.in(13));
        Geometry sphereGeometry = new Geometry("Sphere", sphere);
        sphereGeometry.setMaterial(material);
        sphereGeometry.setLocalTranslation(4, -4, 2);
        sphereGeometry.addControl(new RigidBodyControl(1));
        rootNode.attachChild(sphereGeometry);
        space.add(sphereGeometry);
    }
    
}