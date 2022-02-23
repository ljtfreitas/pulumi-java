// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs Empty = new CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs();

    /**
     * Name of the schema registry that contains the schema. Must be provided when `schema_name` is specified and conflicts with `schema_arn`.
     * 
     */
    @InputImport(name="registryName")
    private final @Nullable Input<String> registryName;

    public Input<String> getRegistryName() {
        return this.registryName == null ? Input.empty() : this.registryName;
    }

    /**
     * ARN of the schema. One of `schema_arn` or `schema_name` has to be provided.
     * 
     */
    @InputImport(name="schemaArn")
    private final @Nullable Input<String> schemaArn;

    public Input<String> getSchemaArn() {
        return this.schemaArn == null ? Input.empty() : this.schemaArn;
    }

    /**
     * Name of the schema. One of `schema_arn` or `schema_name` has to be provided.
     * 
     */
    @InputImport(name="schemaName")
    private final @Nullable Input<String> schemaName;

    public Input<String> getSchemaName() {
        return this.schemaName == null ? Input.empty() : this.schemaName;
    }

    public CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs(
        @Nullable Input<String> registryName,
        @Nullable Input<String> schemaArn,
        @Nullable Input<String> schemaName) {
        this.registryName = registryName;
        this.schemaArn = schemaArn;
        this.schemaName = schemaName;
    }

    private CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs() {
        this.registryName = Input.empty();
        this.schemaArn = Input.empty();
        this.schemaName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> registryName;
        private @Nullable Input<String> schemaArn;
        private @Nullable Input<String> schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.schemaArn = defaults.schemaArn;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder setRegistryName(@Nullable Input<String> registryName) {
            this.registryName = registryName;
            return this;
        }

        public Builder setRegistryName(@Nullable String registryName) {
            this.registryName = Input.ofNullable(registryName);
            return this;
        }

        public Builder setSchemaArn(@Nullable Input<String> schemaArn) {
            this.schemaArn = schemaArn;
            return this;
        }

        public Builder setSchemaArn(@Nullable String schemaArn) {
            this.schemaArn = Input.ofNullable(schemaArn);
            return this;
        }

        public Builder setSchemaName(@Nullable Input<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        public Builder setSchemaName(@Nullable String schemaName) {
            this.schemaName = Input.ofNullable(schemaName);
            return this;
        }
        public CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs build() {
            return new CatalogTableStorageDescriptorSchemaReferenceSchemaIdGetArgs(registryName, schemaArn, schemaName);
        }
    }
}
