// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.outputs;

import io.pulumi.azurenative.servicelinker.outputs.SecretAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.ServicePrincipalCertificateAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.ServicePrincipalSecretAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.SystemAssignedIdentityAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.SystemDataResponse;
import io.pulumi.azurenative.servicelinker.outputs.UserAssignedIdentityAuthInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetLinkerResult {
    /**
     * The authentication type.
     * 
     */
    private final @Nullable Object authInfo;
    /**
     * The application client type
     * 
     */
    private final @Nullable String clientType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The resource Id of target service.
     * 
     */
    private final @Nullable String targetId;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetLinkerResult(
        @CustomType.Parameter("authInfo") @Nullable Object authInfo,
        @CustomType.Parameter("clientType") @Nullable String clientType,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("targetId") @Nullable String targetId,
        @CustomType.Parameter("type") String type) {
        this.authInfo = authInfo;
        this.clientType = clientType;
        this.id = id;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.targetId = targetId;
        this.type = type;
    }

    /**
     * The authentication type.
     * 
    */
    public Optional<Object> getAuthInfo() {
        return Optional.ofNullable(this.authInfo);
    }
    /**
     * The application client type
     * 
    */
    public Optional<String> getClientType() {
        return Optional.ofNullable(this.clientType);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The system data.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The resource Id of target service.
     * 
    */
    public Optional<String> getTargetId() {
        return Optional.ofNullable(this.targetId);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLinkerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object authInfo;
        private @Nullable String clientType;
        private String id;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private @Nullable String targetId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLinkerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authInfo = defaults.authInfo;
    	      this.clientType = defaults.clientType;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.targetId = defaults.targetId;
    	      this.type = defaults.type;
        }

        public Builder authInfo(@Nullable Object authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        public Builder clientType(@Nullable String clientType) {
            this.clientType = clientType;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder targetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetLinkerResult build() {
            return new GetLinkerResult(authInfo, clientType, id, name, provisioningState, systemData, targetId, type);
        }
    }
}
