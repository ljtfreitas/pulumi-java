// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.glue.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identifier for the schema where the schema version will be created.
 * 
 */
public final class SchemaVersionSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchemaVersionSchemaArgs Empty = new SchemaVersionSchemaArgs();

    /**
     * Name of the registry to identify where the Schema is located.
     * 
     */
    @Import(name="registryName")
      private final @Nullable Output<String> registryName;

    public Output<String> getRegistryName() {
        return this.registryName == null ? Output.empty() : this.registryName;
    }

    /**
     * Amazon Resource Name for the Schema. This attribute can be used to uniquely represent the Schema.
     * 
     */
    @Import(name="schemaArn")
      private final @Nullable Output<String> schemaArn;

    public Output<String> getSchemaArn() {
        return this.schemaArn == null ? Output.empty() : this.schemaArn;
    }

    /**
     * Name of the schema. This parameter requires RegistryName to be provided.
     * 
     */
    @Import(name="schemaName")
      private final @Nullable Output<String> schemaName;

    public Output<String> getSchemaName() {
        return this.schemaName == null ? Output.empty() : this.schemaName;
    }

    public SchemaVersionSchemaArgs(
        @Nullable Output<String> registryName,
        @Nullable Output<String> schemaArn,
        @Nullable Output<String> schemaName) {
        this.registryName = registryName;
        this.schemaArn = schemaArn;
        this.schemaName = schemaName;
    }

    private SchemaVersionSchemaArgs() {
        this.registryName = Output.empty();
        this.schemaArn = Output.empty();
        this.schemaName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchemaVersionSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> registryName;
        private @Nullable Output<String> schemaArn;
        private @Nullable Output<String> schemaName;

        public Builder() {
    	      // Empty
        }

        public Builder(SchemaVersionSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryName = defaults.registryName;
    	      this.schemaArn = defaults.schemaArn;
    	      this.schemaName = defaults.schemaName;
        }

        public Builder registryName(@Nullable Output<String> registryName) {
            this.registryName = registryName;
            return this;
        }

        public Builder registryName(@Nullable String registryName) {
            this.registryName = Output.ofNullable(registryName);
            return this;
        }

        public Builder schemaArn(@Nullable Output<String> schemaArn) {
            this.schemaArn = schemaArn;
            return this;
        }

        public Builder schemaArn(@Nullable String schemaArn) {
            this.schemaArn = Output.ofNullable(schemaArn);
            return this;
        }

        public Builder schemaName(@Nullable Output<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        public Builder schemaName(@Nullable String schemaName) {
            this.schemaName = Output.ofNullable(schemaName);
            return this;
        }
        public SchemaVersionSchemaArgs build() {
            return new SchemaVersionSchemaArgs(registryName, schemaArn, schemaName);
        }
    }
}
