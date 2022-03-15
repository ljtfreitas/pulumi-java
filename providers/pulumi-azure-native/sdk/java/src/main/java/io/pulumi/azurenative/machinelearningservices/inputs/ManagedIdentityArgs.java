// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed identity configuration.
 * 
 */
public final class ManagedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedIdentityArgs Empty = new ManagedIdentityArgs();

    /**
     * Specifies a user-assigned identity by client ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * Enum to determine identity framework.
     * Expected value is 'Managed'.
     * 
     */
    @Import(name="identityType", required=true)
      private final Output<String> identityType;

    public Output<String> getIdentityType() {
        return this.identityType;
    }

    /**
     * Specifies a user-assigned identity by object ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="objectId")
      private final @Nullable Output<String> objectId;

    public Output<String> getObjectId() {
        return this.objectId == null ? Output.empty() : this.objectId;
    }

    /**
     * Specifies a user-assigned identity by ARM resource ID. For system-assigned, do not set this field.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId == null ? Output.empty() : this.resourceId;
    }

    public ManagedIdentityArgs(
        @Nullable Output<String> clientId,
        Output<String> identityType,
        @Nullable Output<String> objectId,
        @Nullable Output<String> resourceId) {
        this.clientId = clientId;
        this.identityType = Objects.requireNonNull(identityType, "expected parameter 'identityType' to be non-null");
        this.objectId = objectId;
        this.resourceId = resourceId;
    }

    private ManagedIdentityArgs() {
        this.clientId = Output.empty();
        this.identityType = Output.empty();
        this.objectId = Output.empty();
        this.resourceId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private Output<String> identityType;
        private @Nullable Output<String> objectId;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.identityType = defaults.identityType;
    	      this.objectId = defaults.objectId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }

        public Builder identityType(Output<String> identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }

        public Builder identityType(String identityType) {
            this.identityType = Output.of(Objects.requireNonNull(identityType));
            return this;
        }

        public Builder objectId(@Nullable Output<String> objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder objectId(@Nullable String objectId) {
            this.objectId = Output.ofNullable(objectId);
            return this;
        }

        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Output.ofNullable(resourceId);
            return this;
        }
        public ManagedIdentityArgs build() {
            return new ManagedIdentityArgs(clientId, identityType, objectId, resourceId);
        }
    }
}
