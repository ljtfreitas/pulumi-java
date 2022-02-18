// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The Azure service principal used by Kubernetes for configuring load balancers
 * 
 */
public final class ServicePrincipalPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePrincipalPropertiesArgs Empty = new ServicePrincipalPropertiesArgs();

    /**
     * The service principal client ID
     * 
     */
    @InputImport(name="clientId", required=true)
    private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    /**
     * The service principal secret. This is not returned in response of GET/PUT on the resource. To see this please call listKeys.
     * 
     */
    @InputImport(name="secret", required=true)
    private final Input<String> secret;

    public Input<String> getSecret() {
        return this.secret;
    }

    public ServicePrincipalPropertiesArgs(
        Input<String> clientId,
        Input<String> secret) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.secret = Objects.requireNonNull(secret, "expected parameter 'secret' to be non-null");
    }

    private ServicePrincipalPropertiesArgs() {
        this.clientId = Input.empty();
        this.secret = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePrincipalPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clientId;
        private Input<String> secret;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePrincipalPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.secret = defaults.secret;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setSecret(Input<String> secret) {
            this.secret = Objects.requireNonNull(secret);
            return this;
        }

        public Builder setSecret(String secret) {
            this.secret = Input.of(Objects.requireNonNull(secret));
            return this;
        }

        public ServicePrincipalPropertiesArgs build() {
            return new ServicePrincipalPropertiesArgs(clientId, secret);
        }
    }
}
