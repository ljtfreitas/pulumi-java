// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * KPack ClusterStack properties payload
 * 
 */
public final class StackPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final StackPropertiesResponse Empty = new StackPropertiesResponse();

    /**
     * Id of the ClusterStack.
     * 
     */
    @InputImport(name="id")
        private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Version of the ClusterStack
     * 
     */
    @InputImport(name="version")
        private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public StackPropertiesResponse(
        @Nullable String id,
        @Nullable String version) {
        this.id = id;
        this.version = version;
    }

    private StackPropertiesResponse() {
        this.id = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(StackPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.version = defaults.version;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public StackPropertiesResponse build() {
            return new StackPropertiesResponse(id, version);
        }
    }
}
