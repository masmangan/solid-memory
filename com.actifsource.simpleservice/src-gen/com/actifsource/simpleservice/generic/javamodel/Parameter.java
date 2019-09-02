package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Parameter extends DynamicResource implements IParameter {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IParameter> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IParameter>() {
    
    @Override
    public IParameter create() {
      return new Parameter();
    }
    
    @Override
    public IParameter create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Parameter(resourceRepository, resource);
    }
  
  };

  public Parameter() {
    super(IParameter.TYPE_ID);
  }
  
  public Parameter(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IParameter.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public com.actifsource.simpleservice.generic.javamodel.IType selectType() {
    return _getSingle(com.actifsource.simpleservice.generic.javamodel.IType.class, com.actifsource.simpleservice.generic.GenericPackage.Parameter_type);
  }

  public Parameter setType(com.actifsource.simpleservice.generic.javamodel.IType type) {
    _setSingle(com.actifsource.simpleservice.generic.GenericPackage.Parameter_type, type);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Parameter setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(com.actifsource.simpleservice.generic.javamodel.IType.class, com.actifsource.simpleservice.generic.GenericPackage.Parameter_type, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static java.util.List<com.actifsource.simpleservice.generic.javamodel.IParameter> selectToMeType(com.actifsource.simpleservice.generic.javamodel.IType object) {
    return _getToMeList(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.IParameter.class, com.actifsource.simpleservice.generic.GenericPackage.Parameter_type, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7fad8f73-c9e7-11e9-bddf-8b528cf040b4,gjFvaIw12hQfSoKj5zYzYTvY2XM=] */
