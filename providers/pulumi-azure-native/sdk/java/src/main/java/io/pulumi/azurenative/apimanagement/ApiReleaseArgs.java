// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiReleaseArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiReleaseArgs Empty = new ApiReleaseArgs();

    /**
     * Identifier of the API the release belongs to.
     * 
     */
    @InputImport(name="apiId", required=true)
        private final Input<String> apiId;

    public Input<String> getApiId() {
        return this.apiId;
    }

    /**
     * Release Notes
     * 
     */
    @InputImport(name="notes")
        private final @Nullable Input<String> notes;

    public Input<String> getNotes() {
        return this.notes == null ? Input.empty() : this.notes;
    }

    /**
     * Release identifier within an API. Must be unique in the current API Management service instance.
     * 
     */
    @InputImport(name="releaseId")
        private final @Nullable Input<String> releaseId;

    public Input<String> getReleaseId() {
        return this.releaseId == null ? Input.empty() : this.releaseId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
        private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public ApiReleaseArgs(
        Input<String> apiId,
        @Nullable Input<String> notes,
        @Nullable Input<String> releaseId,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.notes = notes;
        this.releaseId = releaseId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private ApiReleaseArgs() {
        this.apiId = Input.empty();
        this.notes = Input.empty();
        this.releaseId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiReleaseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> apiId;
        private @Nullable Input<String> notes;
        private @Nullable Input<String> releaseId;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiReleaseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.notes = defaults.notes;
    	      this.releaseId = defaults.releaseId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setApiId(Input<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder setApiId(String apiId) {
            this.apiId = Input.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder setNotes(@Nullable Input<String> notes) {
            this.notes = notes;
            return this;
        }

        public Builder setNotes(@Nullable String notes) {
            this.notes = Input.ofNullable(notes);
            return this;
        }

        public Builder setReleaseId(@Nullable Input<String> releaseId) {
            this.releaseId = releaseId;
            return this;
        }

        public Builder setReleaseId(@Nullable String releaseId) {
            this.releaseId = Input.ofNullable(releaseId);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public ApiReleaseArgs build() {
            return new ApiReleaseArgs(apiId, notes, releaseId, resourceGroupName, serviceName);
        }
    }
}
