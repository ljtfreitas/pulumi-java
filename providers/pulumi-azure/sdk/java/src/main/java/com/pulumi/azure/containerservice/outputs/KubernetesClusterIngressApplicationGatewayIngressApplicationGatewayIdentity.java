// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity {
    /**
     * @return The Client ID of the user-defined Managed Identity to be assigned to the Kubelets. If not specified a Managed Identity is created automatically.
     * 
     */
    private final @Nullable String clientId;
    /**
     * @return The Object ID of the user-defined Managed Identity assigned to the Kubelets.If not specified a Managed Identity is created automatically.
     * 
     */
    private final @Nullable String objectId;
    /**
     * @return The ID of the User Assigned Identity assigned to the Kubelets. If not specified a Managed Identity is created automatically.
     * 
     */
    private final @Nullable String userAssignedIdentityId;

    @CustomType.Constructor
    private KubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("userAssignedIdentityId") @Nullable String userAssignedIdentityId) {
        this.clientId = clientId;
        this.objectId = objectId;
        this.userAssignedIdentityId = userAssignedIdentityId;
    }

    /**
     * @return The Client ID of the user-defined Managed Identity to be assigned to the Kubelets. If not specified a Managed Identity is created automatically.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The Object ID of the user-defined Managed Identity assigned to the Kubelets.If not specified a Managed Identity is created automatically.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * @return The ID of the User Assigned Identity assigned to the Kubelets. If not specified a Managed Identity is created automatically.
     * 
     */
    public Optional<String> userAssignedIdentityId() {
        return Optional.ofNullable(this.userAssignedIdentityId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String objectId;
        private @Nullable String userAssignedIdentityId;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.userAssignedIdentityId = defaults.userAssignedIdentityId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder userAssignedIdentityId(@Nullable String userAssignedIdentityId) {
            this.userAssignedIdentityId = userAssignedIdentityId;
            return this;
        }        public KubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity build() {
            return new KubernetesClusterIngressApplicationGatewayIngressApplicationGatewayIdentity(clientId, objectId, userAssignedIdentityId);
        }
    }
}
