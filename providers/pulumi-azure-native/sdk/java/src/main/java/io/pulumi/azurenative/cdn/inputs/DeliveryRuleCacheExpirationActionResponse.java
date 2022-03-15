// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.CacheExpirationActionParametersResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the cache expiration action for the delivery rule.
 * 
 */
public final class DeliveryRuleCacheExpirationActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryRuleCacheExpirationActionResponse Empty = new DeliveryRuleCacheExpirationActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'CacheExpiration'.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
      private final CacheExpirationActionParametersResponse parameters;

    public CacheExpirationActionParametersResponse getParameters() {
        return this.parameters;
    }

    public DeliveryRuleCacheExpirationActionResponse(
        String name,
        CacheExpirationActionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private DeliveryRuleCacheExpirationActionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryRuleCacheExpirationActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private CacheExpirationActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryRuleCacheExpirationActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder parameters(CacheExpirationActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public DeliveryRuleCacheExpirationActionResponse build() {
            return new DeliveryRuleCacheExpirationActionResponse(name, parameters);
        }
    }
}
