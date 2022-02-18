// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.ResourceGuardOperationDetailResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceGuardProxyBaseResponse extends io.pulumi.resources.InvokeArgs {

    public static final ResourceGuardProxyBaseResponse Empty = new ResourceGuardProxyBaseResponse();

    @InputImport(name="lastUpdatedTime")
    private final @Nullable String lastUpdatedTime;

    public Optional<String> getLastUpdatedTime() {
        return this.lastUpdatedTime == null ? Optional.empty() : Optional.ofNullable(this.lastUpdatedTime);
    }

    @InputImport(name="resourceGuardOperationDetails")
    private final @Nullable List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails;

    public List<ResourceGuardOperationDetailResponse> getResourceGuardOperationDetails() {
        return this.resourceGuardOperationDetails == null ? List.of() : this.resourceGuardOperationDetails;
    }

    @InputImport(name="resourceGuardResourceId")
    private final @Nullable String resourceGuardResourceId;

    public Optional<String> getResourceGuardResourceId() {
        return this.resourceGuardResourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceGuardResourceId);
    }

    public ResourceGuardProxyBaseResponse(
        @Nullable String lastUpdatedTime,
        @Nullable List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails,
        @Nullable String resourceGuardResourceId) {
        this.lastUpdatedTime = lastUpdatedTime;
        this.resourceGuardOperationDetails = resourceGuardOperationDetails;
        this.resourceGuardResourceId = resourceGuardResourceId;
    }

    private ResourceGuardProxyBaseResponse() {
        this.lastUpdatedTime = null;
        this.resourceGuardOperationDetails = List.of();
        this.resourceGuardResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceGuardProxyBaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String lastUpdatedTime;
        private @Nullable List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails;
        private @Nullable String resourceGuardResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceGuardProxyBaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.resourceGuardOperationDetails = defaults.resourceGuardOperationDetails;
    	      this.resourceGuardResourceId = defaults.resourceGuardResourceId;
        }

        public Builder setLastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }

        public Builder setResourceGuardOperationDetails(@Nullable List<ResourceGuardOperationDetailResponse> resourceGuardOperationDetails) {
            this.resourceGuardOperationDetails = resourceGuardOperationDetails;
            return this;
        }

        public Builder setResourceGuardResourceId(@Nullable String resourceGuardResourceId) {
            this.resourceGuardResourceId = resourceGuardResourceId;
            return this;
        }

        public ResourceGuardProxyBaseResponse build() {
            return new ResourceGuardProxyBaseResponse(lastUpdatedTime, resourceGuardOperationDetails, resourceGuardResourceId);
        }
    }
}
