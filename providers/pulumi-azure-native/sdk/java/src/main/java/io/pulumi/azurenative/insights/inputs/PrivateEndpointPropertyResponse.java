// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Private endpoint which the connection belongs to.
 * 
 */
public final class PrivateEndpointPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointPropertyResponse Empty = new PrivateEndpointPropertyResponse();

    /**
     * Resource id of the private endpoint.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    public PrivateEndpointPropertyResponse(@Nullable String id) {
        this.id = id;
    }

    private PrivateEndpointPropertyResponse() {
        this.id = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public PrivateEndpointPropertyResponse build() {
            return new PrivateEndpointPropertyResponse(id);
        }
    }
}
