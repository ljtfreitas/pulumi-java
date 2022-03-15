// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Setting indicating whether the service has a managed identity associated with it.
 * 
 */
public final class ServiceManagedIdentityResponseIdentity extends io.pulumi.resources.InvokeArgs {

    public static final ServiceManagedIdentityResponseIdentity Empty = new ServiceManagedIdentityResponseIdentity();

    /**
     * Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    public ServiceManagedIdentityResponseIdentity(@Nullable String type) {
        this.type = type;
    }

    private ServiceManagedIdentityResponseIdentity() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceManagedIdentityResponseIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceManagedIdentityResponseIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public ServiceManagedIdentityResponseIdentity build() {
            return new ServiceManagedIdentityResponseIdentity(type);
        }
    }
}
