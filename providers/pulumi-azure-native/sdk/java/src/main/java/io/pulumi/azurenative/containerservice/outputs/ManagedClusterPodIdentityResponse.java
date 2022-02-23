// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.ManagedClusterPodIdentityResponseProvisioningInfo;
import io.pulumi.azurenative.containerservice.outputs.UserAssignedIdentityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterPodIdentityResponse {
    /**
     * Binding selector to use for the AzureIdentityBinding resource.
     * 
     */
    private final @Nullable String bindingSelector;
    /**
     * Information of the user assigned identity.
     * 
     */
    private final UserAssignedIdentityResponse identity;
    /**
     * Name of the pod identity.
     * 
     */
    private final String name;
    /**
     * Namespace of the pod identity.
     * 
     */
    private final String namespace;
    private final ManagedClusterPodIdentityResponseProvisioningInfo provisioningInfo;
    /**
     * The current provisioning state of the pod identity.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"bindingSelector","identity","name","namespace","provisioningInfo","provisioningState"})
    private ManagedClusterPodIdentityResponse(
        @Nullable String bindingSelector,
        UserAssignedIdentityResponse identity,
        String name,
        String namespace,
        ManagedClusterPodIdentityResponseProvisioningInfo provisioningInfo,
        String provisioningState) {
        this.bindingSelector = bindingSelector;
        this.identity = Objects.requireNonNull(identity);
        this.name = Objects.requireNonNull(name);
        this.namespace = Objects.requireNonNull(namespace);
        this.provisioningInfo = Objects.requireNonNull(provisioningInfo);
        this.provisioningState = Objects.requireNonNull(provisioningState);
    }

    /**
     * Binding selector to use for the AzureIdentityBinding resource.
     * 
     */
    public Optional<String> getBindingSelector() {
        return Optional.ofNullable(this.bindingSelector);
    }
    /**
     * Information of the user assigned identity.
     * 
     */
    public UserAssignedIdentityResponse getIdentity() {
        return this.identity;
    }
    /**
     * Name of the pod identity.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Namespace of the pod identity.
     * 
     */
    public String getNamespace() {
        return this.namespace;
    }
    public ManagedClusterPodIdentityResponseProvisioningInfo getProvisioningInfo() {
        return this.provisioningInfo;
    }
    /**
     * The current provisioning state of the pod identity.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPodIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bindingSelector;
        private UserAssignedIdentityResponse identity;
        private String name;
        private String namespace;
        private ManagedClusterPodIdentityResponseProvisioningInfo provisioningInfo;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPodIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingSelector = defaults.bindingSelector;
    	      this.identity = defaults.identity;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.provisioningInfo = defaults.provisioningInfo;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setBindingSelector(@Nullable String bindingSelector) {
            this.bindingSelector = bindingSelector;
            return this;
        }

        public Builder setIdentity(UserAssignedIdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }

        public Builder setProvisioningInfo(ManagedClusterPodIdentityResponseProvisioningInfo provisioningInfo) {
            this.provisioningInfo = Objects.requireNonNull(provisioningInfo);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public ManagedClusterPodIdentityResponse build() {
            return new ManagedClusterPodIdentityResponse(bindingSelector, identity, name, namespace, provisioningInfo, provisioningState);
        }
    }
}
