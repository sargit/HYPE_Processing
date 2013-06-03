/*
 * HYPE_Processing
 * http://www.hypeframework.org/ & https://github.com/hype/HYPE_Processing
 * 
 * Copyright (c) 2013 Joshua Davis & James Cruz
 * 
 * Distributed under the BSD License. See LICENSE.txt for details.
 * 
 * All rights reserved.
 */

package hype.core.interfaces;

public interface HLocatable {
	/**
	 * TODO
	 * 
	 * @return
	 */
	public float x();
	
	/**
	 * TODO
	 * 
	 * @chainable
	 * @param newX
	 * @return
	 */
	public HLocatable x(float newX);
	
	/**
	 * TODO
	 * 
	 * @return
	 */
	public float y();
	
	/**
	 * TODO
	 * 
	 * @chainable
	 * @param newY
	 * @return
	 */
	public HLocatable y(float newY);
	
	/**
	 * TODO
	 * 
	 * @return
	 */
	public float z();
	
	/**
	 * TODO
	 *
	 * @chainable
	 * @param newZ
	 * @return
	 */
	public HLocatable z(float newZ);
}