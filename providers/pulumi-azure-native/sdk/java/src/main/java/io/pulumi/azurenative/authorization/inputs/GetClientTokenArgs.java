// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetClientTokenArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetClientTokenArgs Empty = new GetClientTokenArgs();

    /**
     * Optional authentication endpoint. Defaults to the endpoint of Azure Resource Manager.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable String endpoint;

    public Optional<String> getEndpoint() {
        return this.endpoint == null ? Optional.empty() : Optional.ofNullable(this.endpoint);
    }

    public GetClientTokenArgs(@Nullable String endpoint) {
        this.endpoint = endpoint;
    }

    private GetClientTokenArgs() {
        this.endpoint = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClientTokenArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String endpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClientTokenArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public GetClientTokenArgs build() {
            return new GetClientTokenArgs(endpoint);
        }
    }
}
