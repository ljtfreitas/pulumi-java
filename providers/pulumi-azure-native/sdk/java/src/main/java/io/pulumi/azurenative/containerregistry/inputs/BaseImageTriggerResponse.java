// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The trigger based on base image dependency.
 * 
 */
public final class BaseImageTriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final BaseImageTriggerResponse Empty = new BaseImageTriggerResponse();

    /**
     * The type of the auto trigger for base image dependency updates.
     * 
     */
    @InputImport(name="baseImageTriggerType", required=true)
        private final String baseImageTriggerType;

    public String getBaseImageTriggerType() {
        return this.baseImageTriggerType;
    }

    /**
     * The name of the trigger.
     * 
     */
    @InputImport(name="name", required=true)
        private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The current status of trigger.
     * 
     */
    @InputImport(name="status")
        private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The endpoint URL for receiving update triggers.
     * 
     */
    @InputImport(name="updateTriggerEndpoint")
        private final @Nullable String updateTriggerEndpoint;

    public Optional<String> getUpdateTriggerEndpoint() {
        return this.updateTriggerEndpoint == null ? Optional.empty() : Optional.ofNullable(this.updateTriggerEndpoint);
    }

    /**
     * Type of Payload body for Base image update triggers.
     * 
     */
    @InputImport(name="updateTriggerPayloadType")
        private final @Nullable String updateTriggerPayloadType;

    public Optional<String> getUpdateTriggerPayloadType() {
        return this.updateTriggerPayloadType == null ? Optional.empty() : Optional.ofNullable(this.updateTriggerPayloadType);
    }

    public BaseImageTriggerResponse(
        String baseImageTriggerType,
        String name,
        @Nullable String status,
        @Nullable String updateTriggerEndpoint,
        @Nullable String updateTriggerPayloadType) {
        this.baseImageTriggerType = Objects.requireNonNull(baseImageTriggerType, "expected parameter 'baseImageTriggerType' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.status = status == null ? "Enabled" : status;
        this.updateTriggerEndpoint = updateTriggerEndpoint;
        this.updateTriggerPayloadType = updateTriggerPayloadType;
    }

    private BaseImageTriggerResponse() {
        this.baseImageTriggerType = null;
        this.name = null;
        this.status = null;
        this.updateTriggerEndpoint = null;
        this.updateTriggerPayloadType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BaseImageTriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String baseImageTriggerType;
        private String name;
        private @Nullable String status;
        private @Nullable String updateTriggerEndpoint;
        private @Nullable String updateTriggerPayloadType;

        public Builder() {
    	      // Empty
        }

        public Builder(BaseImageTriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.baseImageTriggerType = defaults.baseImageTriggerType;
    	      this.name = defaults.name;
    	      this.status = defaults.status;
    	      this.updateTriggerEndpoint = defaults.updateTriggerEndpoint;
    	      this.updateTriggerPayloadType = defaults.updateTriggerPayloadType;
        }

        public Builder setBaseImageTriggerType(String baseImageTriggerType) {
            this.baseImageTriggerType = Objects.requireNonNull(baseImageTriggerType);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setUpdateTriggerEndpoint(@Nullable String updateTriggerEndpoint) {
            this.updateTriggerEndpoint = updateTriggerEndpoint;
            return this;
        }

        public Builder setUpdateTriggerPayloadType(@Nullable String updateTriggerPayloadType) {
            this.updateTriggerPayloadType = updateTriggerPayloadType;
            return this;
        }
        public BaseImageTriggerResponse build() {
            return new BaseImageTriggerResponse(baseImageTriggerType, name, status, updateTriggerEndpoint, updateTriggerPayloadType);
        }
    }
}
