// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ServicePrincipalProfile represents a service principal profile.
 * 
 */
public final class ServicePrincipalProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalProfileArgs Empty = new ServicePrincipalProfileArgs();

    /**
     * The client ID used for the cluster (immutable).
     * 
     */
    @InputImport(name="clientId")
        private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The client secret used for the cluster (immutable).
     * 
     */
    @InputImport(name="clientSecret")
        private final @Nullable Input<String> clientSecret;

    public Input<String> getClientSecret() {
        return this.clientSecret == null ? Input.empty() : this.clientSecret;
    }

    public ServicePrincipalProfileArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    private ServicePrincipalProfileArgs() {
        this.clientId = Input.empty();
        this.clientSecret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setClientSecret(@Nullable Input<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }

        public Builder setClientSecret(@Nullable String clientSecret) {
            this.clientSecret = Input.ofNullable(clientSecret);
            return this;
        }
        public ServicePrincipalProfileArgs build() {
            return new ServicePrincipalProfileArgs(clientId, clientSecret);
        }
    }
}
