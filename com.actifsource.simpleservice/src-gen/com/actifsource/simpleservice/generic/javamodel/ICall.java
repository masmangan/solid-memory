package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface ICall extends ch.actifsource.core.javamodel.INamedResource {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("7cf0ba3f-c9e7-11e9-bddf-8b528cf040b4");
  
  // relations
  
  public java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IParameter> selectParameter();
  
  public com.actifsource.simpleservice.generic.javamodel.IType selectReturnType();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,7cf0ba3f-c9e7-11e9-bddf-8b528cf040b4,MLM5OSNPof5sKJ/Q+hoMXlUexUY=] */
