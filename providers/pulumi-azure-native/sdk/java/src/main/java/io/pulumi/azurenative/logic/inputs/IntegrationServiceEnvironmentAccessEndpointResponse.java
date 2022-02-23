// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The integration service environment access endpoint.
 * 
 */
public final class IntegrationServiceEnvironmentAccessEndpointResponse extends io.pulumi.resources.InvokeArgs {

    public static final IntegrationServiceEnvironmentAccessEndpointResponse Empty = new IntegrationServiceEnvironmentAccessEndpointResponse();

    /**
     * The access endpoint type.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public IntegrationServiceEnvironmentAccessEndpointResponse(@Nullable String type) {
        this.type = type;
    }

    private IntegrationServiceEnvironmentAccessEndpointResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationServiceEnvironmentAccessEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationServiceEnvironmentAccessEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public IntegrationServiceEnvironmentAccessEndpointResponse build() {
            return new IntegrationServiceEnvironmentAccessEndpointResponse(type);
        }
    }
}
