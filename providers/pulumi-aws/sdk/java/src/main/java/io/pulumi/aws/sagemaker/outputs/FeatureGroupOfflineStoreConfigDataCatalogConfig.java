// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FeatureGroupOfflineStoreConfigDataCatalogConfig {
    /**
     * The name of the Glue table catalog.
     * 
     */
    private final @Nullable String catalog;
    /**
     * The name of the Glue table database.
     * 
     */
    private final @Nullable String database;
    /**
     * The name of the Glue table.
     * 
     */
    private final @Nullable String tableName;

    @OutputCustomType.Constructor({"catalog","database","tableName"})
    private FeatureGroupOfflineStoreConfigDataCatalogConfig(
        @Nullable String catalog,
        @Nullable String database,
        @Nullable String tableName) {
        this.catalog = catalog;
        this.database = database;
        this.tableName = tableName;
    }

    /**
     * The name of the Glue table catalog.
     * 
     */
    public Optional<String> getCatalog() {
        return Optional.ofNullable(this.catalog);
    }
    /**
     * The name of the Glue table database.
     * 
     */
    public Optional<String> getDatabase() {
        return Optional.ofNullable(this.database);
    }
    /**
     * The name of the Glue table.
     * 
     */
    public Optional<String> getTableName() {
        return Optional.ofNullable(this.tableName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureGroupOfflineStoreConfigDataCatalogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String catalog;
        private @Nullable String database;
        private @Nullable String tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureGroupOfflineStoreConfigDataCatalogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalog = defaults.catalog;
    	      this.database = defaults.database;
    	      this.tableName = defaults.tableName;
        }

        public Builder setCatalog(@Nullable String catalog) {
            this.catalog = catalog;
            return this;
        }

        public Builder setDatabase(@Nullable String database) {
            this.database = database;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = tableName;
            return this;
        }
        public FeatureGroupOfflineStoreConfigDataCatalogConfig build() {
            return new FeatureGroupOfflineStoreConfigDataCatalogConfig(catalog, database, tableName);
        }
    }
}
