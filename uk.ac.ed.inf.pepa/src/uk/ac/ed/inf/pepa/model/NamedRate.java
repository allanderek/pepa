/*******************************************************************************
 * Copyright (c) 2006, 2009 University of Edinburgh.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the BSD Licence, which
 * accompanies this feature and can be downloaded from
 * http://groups.inf.ed.ac.uk/pepa/update/licence.txt
 *******************************************************************************/
/*
 * Created on 08-Aug-2006
 *
 */
package uk.ac.ed.inf.pepa.model;

/**
 * A <code>Rate</code> with a name. It represents declarations made in the
 * rate declaration section of a <code>.pepa</code> file, e.g.
 * <p>
 * <code>r = 1.0;</code>
 * 
 * @author mtribast
 */
public interface NamedRate extends FiniteRate {
    
    /**
     * Get the name of the rate
     * 
     * @return the name 
   	 *
     */
    public String getName();

  
//    public void setName(String name);
}