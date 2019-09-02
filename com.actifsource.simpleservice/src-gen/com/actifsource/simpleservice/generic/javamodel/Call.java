package com.actifsource.simpleservice.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class Call extends DynamicResource implements ICall {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICall> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<ICall>() {
    
    @Override
    public ICall create() {
      return new Call();
    }
    
    @Override
    public ICall create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new Call(resourceRepository, resource);
    }
  
  };

  public Call() {
    super(ICall.TYPE_ID);
  }
  
  public Call(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, ICall.TYPE_ID);
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
  public java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IParameter> selectParameter() {
    return _getList(com.actifsource.simpleservice.generic.javamodel.IParameter.class, com.actifsource.simpleservice.generic.GenericPackage.Call_parameter);
  }

  public Call setParameter(java.util.List<? extends com.actifsource.simpleservice.generic.javamodel.IParameter> parameter) {
    _setList(com.actifsource.simpleservice.generic.GenericPackage.Call_parameter, parameter);
    return this;
  }
    
  @Override
  public com.actifsource.simpleservice.generic.javamodel.IType selectReturnType() {
    return _getSingle(com.actifsource.simpleservice.generic.javamodel.IType.class, com.actifsource.simpleservice.generic.GenericPackage.Call_returnType);
  }

  public Call setReturnType(com.actifsource.simpleservice.generic.javamodel.IType returnType) {
    _setSingle(com.actifsource.simpleservice.generic.GenericPackage.Call_returnType, returnType);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public Call setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptList(com.actifsource.simpleservice.generic.javamodel.IParameter.class, com.actifsource.simpleservice.generic.GenericPackage.Call_parameter, visitor);
    _acceptSingle(com.actifsource.simpleservice.generic.javamodel.IType.class, com.actifsource.simpleservice.generic.GenericPackage.Call_returnType, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static com.actifsource.simpleservice.generic.javamodel.ICall selectToMeParameter(com.actifsource.simpleservice.generic.javamodel.IParameter object) {
    return _getToMeSingle(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.ICall.class, com.actifsource.simpleservice.generic.GenericPackage.Call_parameter, object.getResource());
  }
  
  public static java.util.List<com.actifsource.simpleservice.generic.javamodel.ICall> selectToMeReturnType(com.actifsource.simpleservice.generic.javamodel.IType object) {
    return _getToMeList(object.getRepository(), com.actifsource.simpleservice.generic.javamodel.ICall.class, com.actifsource.simpleservice.generic.GenericPackage.Call_returnType, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7cf0ba3f-c9e7-11e9-bddf-8b528cf040b4,WRzv2vFfRbWVe3cQVAIAltCmO9Q=] */
