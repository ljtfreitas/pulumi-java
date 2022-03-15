// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.glue.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CatalogTableStorageDescriptorSerDeInfo {
    /**
     * Name of the target table.
     * 
     */
    private final @Nullable String name;
    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    private final @Nullable Map<String,String> parameters;
    /**
     * Usually the class that implements the SerDe. An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe`.
     * 
     */
    private final @Nullable String serializationLibrary;

    @CustomType.Constructor
    private CatalogTableStorageDescriptorSerDeInfo(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("parameters") @Nullable Map<String,String> parameters,
        @CustomType.Parameter("serializationLibrary") @Nullable String serializationLibrary) {
        this.name = name;
        this.parameters = parameters;
        this.serializationLibrary = serializationLibrary;
    }

    /**
     * Name of the target table.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Map of initialization parameters for the SerDe, in key-value form.
     * 
    */
    public Map<String,String> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * Usually the class that implements the SerDe. An example is `org.apache.hadoop.hive.serde2.columnar.ColumnarSerDe`.
     * 
    */
    public Optional<String> getSerializationLibrary() {
        return Optional.ofNullable(this.serializationLibrary);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSerDeInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable Map<String,String> parameters;
        private @Nullable String serializationLibrary;

        public Builder() {
    	      // Empty
        }

        public Builder(CatalogTableStorageDescriptorSerDeInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.serializationLibrary = defaults.serializationLibrary;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder serializationLibrary(@Nullable String serializationLibrary) {
            this.serializationLibrary = serializationLibrary;
            return this;
        }
        public CatalogTableStorageDescriptorSerDeInfo build() {
            return new CatalogTableStorageDescriptorSerDeInfo(name, parameters, serializationLibrary);
        }
    }
}
