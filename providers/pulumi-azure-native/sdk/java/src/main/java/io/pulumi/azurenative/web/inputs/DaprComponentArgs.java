// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.DaprMetadataArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Dapr component configuration
 * 
 */
public final class DaprComponentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaprComponentArgs Empty = new DaprComponentArgs();

    /**
     * Component metadata
     * 
     */
    @InputImport(name="metadata")
        private final @Nullable Input<List<DaprMetadataArgs>> metadata;

    public Input<List<DaprMetadataArgs>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    /**
     * Component name
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Component type
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * Component version
     * 
     */
    @InputImport(name="version")
        private final @Nullable Input<String> version;

    public Input<String> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public DaprComponentArgs(
        @Nullable Input<List<DaprMetadataArgs>> metadata,
        @Nullable Input<String> name,
        @Nullable Input<String> type,
        @Nullable Input<String> version) {
        this.metadata = metadata;
        this.name = name;
        this.type = type;
        this.version = version;
    }

    private DaprComponentArgs() {
        this.metadata = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaprComponentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DaprMetadataArgs>> metadata;
        private @Nullable Input<String> name;
        private @Nullable Input<String> type;
        private @Nullable Input<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(DaprComponentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setMetadata(@Nullable Input<List<DaprMetadataArgs>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable List<DaprMetadataArgs> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setVersion(@Nullable Input<String> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public DaprComponentArgs build() {
            return new DaprComponentArgs(metadata, name, type, version);
        }
    }
}
