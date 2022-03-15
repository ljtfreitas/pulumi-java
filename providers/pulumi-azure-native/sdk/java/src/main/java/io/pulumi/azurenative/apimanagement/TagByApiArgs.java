// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagByApiArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagByApiArgs Empty = new TagByApiArgs();

    /**
     * API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * Tag identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="tagId")
      private final @Nullable Output<String> tagId;

    public Output<String> getTagId() {
        return this.tagId == null ? Output.empty() : this.tagId;
    }

    public TagByApiArgs(
        Output<String> apiId,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        @Nullable Output<String> tagId) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.tagId = tagId;
    }

    private TagByApiArgs() {
        this.apiId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceName = Output.empty();
        this.tagId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagByApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private @Nullable Output<String> tagId;

        public Builder() {
    	      // Empty
        }

        public Builder(TagByApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.tagId = defaults.tagId;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }

        public Builder tagId(@Nullable Output<String> tagId) {
            this.tagId = tagId;
            return this;
        }

        public Builder tagId(@Nullable String tagId) {
            this.tagId = Output.ofNullable(tagId);
            return this;
        }
        public TagByApiArgs build() {
            return new TagByApiArgs(apiId, resourceGroupName, serviceName, tagId);
        }
    }
}
