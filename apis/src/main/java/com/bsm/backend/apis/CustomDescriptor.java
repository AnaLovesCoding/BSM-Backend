package com.bsm.backend.apis;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.type.AbstractSingleColumnStandardBasicType;
import org.hibernate.type.descriptor.java.JavaTypeDescriptor;
import org.hibernate.type.descriptor.sql.SqlTypeDescriptor;

import org.hibernate.type.descriptor.WrapperOptions;
import org.hibernate.type.descriptor.java.AbstractTypeDescriptor;
import org.hibernate.type.descriptor.java.ImmutableMutabilityPlan;
import org.hibernate.type.descriptor.spi.JdbcRecommendedSqlTypeMappingContext;

import java.util.Properties;

public class CustomDescriptor  extends AbstractTypeDescriptor<BsmUserType[]>   {

    protected CustomDescriptor() {
        super(BsmUserType[].class, new ImmutableMutabilityPlan<>());
    }

    @Override
    public String toString(BsmUserType[] value) {
        return null;
    }

    @Override
    public BsmUserType[] fromString(String string) {
        return null;
    }

    @Override
    public <X> X unwrap(BsmUserType[] value, Class<X> type, WrapperOptions options) {
        return null;
    }

    @Override
    public <X> BsmUserType[] wrap(X value, WrapperOptions options) {
        return null;
    }

    @Override
    public SqlTypeDescriptor getJdbcRecommendedSqlType(JdbcRecommendedSqlTypeMappingContext context) {
        return null;
    }


    }
