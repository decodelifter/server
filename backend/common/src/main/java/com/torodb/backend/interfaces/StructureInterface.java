package com.torodb.backend.interfaces;

import java.util.Collection;

import javax.annotation.Nonnull;

import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.Field;

public interface StructureInterface {
    void createSchema(@Nonnull DSLContext dsl, @Nonnull String schemaName);
    void dropSchema(@Nonnull DSLContext dsl, @Nonnull String schemaName);
    void createDocPartTable(@Nonnull DSLContext dsl, @Nonnull String schemaName, @Nonnull String tableName, @Nonnull Collection<Field<?>> fields);
    @Nonnull String createIndexStatement(@Nonnull Configuration conf, @Nonnull String schemaName, @Nonnull String tableName, @Nonnull String fieldName);
    @Nonnull String addColumnToDocPartTableStatement(@Nonnull Configuration conf, @Nonnull String schemaName, @Nonnull String tableName, @Nonnull Field<?> field);
}
