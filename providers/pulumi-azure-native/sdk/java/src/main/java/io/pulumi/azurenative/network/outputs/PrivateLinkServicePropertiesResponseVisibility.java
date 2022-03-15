// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PrivateLinkServicePropertiesResponseVisibility {
    /**
     * The list of subscriptions.
     * 
     */
    private final @Nullable List<String> subscriptions;

    @CustomType.Constructor
    private PrivateLinkServicePropertiesResponseVisibility(@CustomType.Parameter("subscriptions") @Nullable List<String> subscriptions) {
        this.subscriptions = subscriptions;
    }

    /**
     * The list of subscriptions.
     * 
    */
    public List<String> getSubscriptions() {
        return this.subscriptions == null ? List.of() : this.subscriptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServicePropertiesResponseVisibility defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> subscriptions;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServicePropertiesResponseVisibility defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subscriptions = defaults.subscriptions;
        }

        public Builder subscriptions(@Nullable List<String> subscriptions) {
            this.subscriptions = subscriptions;
            return this;
        }
        public PrivateLinkServicePropertiesResponseVisibility build() {
            return new PrivateLinkServicePropertiesResponseVisibility(subscriptions);
        }
    }
}
