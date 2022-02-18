// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedIdentityResponse {
    /**
     * Specifies a user-assigned identity by client ID. For system-assigned, do not set this field.
     * 
     */
    private final @Nullable String clientId;
    /**
     * Enum to determine identity framework.
     * Expected value is 'Managed'.
     * 
     */
    private final String identityType;
    /**
     * Specifies a user-assigned identity by object ID. For system-assigned, do not set this field.
     * 
     */
    private final @Nullable String objectId;
    /**
     * Specifies a user-assigned identity by ARM resource ID. For system-assigned, do not set this field.
     * 
     */
    private final @Nullable String resourceId;

    @OutputCustomType.Constructor({"clientId","identityType","objectId","resourceId"})
    private ManagedIdentityResponse(
        @Nullable String clientId,
        String identityType,
        @Nullable String objectId,
        @Nullable String resourceId) {
        this.clientId = clientId;
        this.identityType = Objects.requireNonNull(identityType);
        this.objectId = objectId;
        this.resourceId = resourceId;
    }

    /**
     * Specifies a user-assigned identity by client ID. For system-assigned, do not set this field.
     * 
     */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * Enum to determine identity framework.
     * Expected value is 'Managed'.
     * 
     */
    public String getIdentityType() {
        return this.identityType;
    }
    /**
     * Specifies a user-assigned identity by object ID. For system-assigned, do not set this field.
     * 
     */
    public Optional<String> getObjectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * Specifies a user-assigned identity by ARM resource ID. For system-assigned, do not set this field.
     * 
     */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private String identityType;
        private @Nullable String objectId;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.identityType = defaults.identityType;
    	      this.objectId = defaults.objectId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setIdentityType(String identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public ManagedIdentityResponse build() {
            return new ManagedIdentityResponse(clientId, identityType, objectId, resourceId);
        }
    }
}
