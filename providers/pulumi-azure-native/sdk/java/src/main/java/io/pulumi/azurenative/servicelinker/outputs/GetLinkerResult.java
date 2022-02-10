// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.outputs;

import io.pulumi.azurenative.servicelinker.outputs.SecretAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.ServicePrincipalCertificateAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.ServicePrincipalSecretAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.SystemAssignedIdentityAuthInfoResponse;
import io.pulumi.azurenative.servicelinker.outputs.SystemDataResponse;
import io.pulumi.azurenative.servicelinker.outputs.UserAssignedIdentityAuthInfoResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLinkerResult {
    private final @Nullable Object authInfo;
    private final @Nullable String clientType;
    private final String id;
    private final String name;
    private final String provisioningState;
    private final SystemDataResponse systemData;
    private final @Nullable String targetId;
    private final String type;

    @OutputCustomType.Constructor({"authInfo","clientType","id","name","provisioningState","systemData","targetId","type"})
    private GetLinkerResult(
        @Nullable Object authInfo,
        @Nullable String clientType,
        String id,
        String name,
        String provisioningState,
        SystemDataResponse systemData,
        @Nullable String targetId,
        String type) {
        this.authInfo = authInfo;
        this.clientType = clientType;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.systemData = Objects.requireNonNull(systemData);
        this.targetId = targetId;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<Object> getAuthInfo() {
        return Optional.ofNullable(this.authInfo);
    }
    public Optional<String> getClientType() {
        return Optional.ofNullable(this.clientType);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public Optional<String> getTargetId() {
        return Optional.ofNullable(this.targetId);
    }
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

        public Builder setAuthInfo(@Nullable Object authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        public Builder setClientType(@Nullable String clientType) {
            this.clientType = clientType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTargetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetLinkerResult build() {
            return new GetLinkerResult(authInfo, clientType, id, name, provisioningState, systemData, targetId, type);
        }
    }
}