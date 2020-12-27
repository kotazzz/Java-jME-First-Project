package ru.newlife.jmesimple.main;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.texture.Texture;
import com.jme3.scene.shape.Quad;


public class Main extends SimpleApplication {
	 public static void main(String[] args){
		 	Main app = new Main();
	        app.start();
	    }
	    
		 	
    	
    	@Override
	    public void simpleInitApp() {
    		Quad leftside = new Quad(1,1); Geometry left = new Geometry("Cube", leftside);
        	Quad rightside = new Quad(1,1);Geometry right = new Geometry("Cube", rightside);
        	Quad frontside = new Quad(1,1);Geometry front = new Geometry("Cube", frontside);
        	Quad backside = new Quad(1,1);Geometry back = new Geometry("Cube", backside);
        	Quad upside = new Quad(1,1);  Geometry up = new Geometry("Cube", upside);
        	Quad downside = new Quad(1,1);Geometry down = new Geometry("Cube", downside);
        	
        	Texture leftsidet = assetManager.loadTexture("Textures/l.jpg");
        	Texture rightsidet = assetManager.loadTexture("Textures/r.jpg");
        	Texture frontsidet = assetManager.loadTexture("Textures/f.jpg");
        	Texture backsidet = assetManager.loadTexture("Textures/b.jpg");
        	Texture upsidet = assetManager.loadTexture("Textures/u.jpg");
        	Texture downsidet = assetManager.loadTexture("Textures/d.jpg");
        	
        	Material leftsidetm = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md"); leftsidetm.setTexture("ColorMap", leftsidet);
        	Material rightsidetm = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md"); rightsidetm.setTexture("ColorMap", rightsidet);
        	Material frontsidetm = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md"); frontsidetm.setTexture("ColorMap", frontsidet);
        	Material backsidetm = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md"); backsidetm.setTexture("ColorMap", backsidet);
        	Material upsidetm = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md"); upsidetm.setTexture("ColorMap", upsidet);
        	Material downsidetm = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md"); downsidetm.setTexture("ColorMap", downsidet);
        	
        	left.setLocalTranslation(new Vector3f(0,0,0));
        	right.setLocalTranslation(new Vector3f(0,0,1));
        	front.setLocalTranslation(new Vector3f(0,0,1));
        	back.setLocalTranslation(new Vector3f(0,0,0));
        	up.setLocalTranslation(new Vector3f(0,1,0));
        	down.setLocalTranslation(new Vector3f(0,0,0));
        	
        	left.setMaterial(leftsidetm);
        	right.setMaterial(rightsidetm);
        	front.setMaterial(frontsidetm);
        	back.setMaterial(backsidetm);
        	up.setMaterial(upsidetm);
        	down.setMaterial(downsidetm);
        	float ndcfr = 1.5708f;
        	left.rotate(-ndcfr,0,0);
        	right.rotate(-ndcfr,0,0);
        	up.rotate(0,-ndcfr,0);
        	down.rotate(0,-ndcfr,0);

        	
        	rootNode.attachChild(left);
        	rootNode.attachChild(right);
        	rootNode.attachChild(front);
        	rootNode.attachChild(back);
        	rootNode.attachChild(up);
        	rootNode.attachChild(down);
        	
        	
	    	//myCube2.setMaterial(material);
	        
	    	//rootNode.attachChild(myCube);
	    	//rootNode.attachChild(myCube2);
	    	
	    	//myCube.rotate(1.5708f,0,0);
	    }
	    @Override
	    public void simpleUpdate(float tpf) {
	    	
	    }
	}
