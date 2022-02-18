// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebPubSubSharedPrivateLinkResourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebPubSubSharedPrivateLinkResourceArgs Empty = new GetWebPubSubSharedPrivateLinkResourceArgs();

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the resource.
     * 
     */
    @InputImport(name="resourceName", required=true)
    private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    /**
     * The name of the shared private link resource
     * 
     */
    @InputImport(name="sharedPrivateLinkResourceName", required=true)
    private final String sharedPrivateLinkResourceName;

    public String getSharedPrivateLinkResourceName() {
        return this.sharedPrivateLinkResourceName;
    }

    public GetWebPubSubSharedPrivateLinkResourceArgs(
        String resourceGroupName,
        String resourceName,
        String sharedPrivateLinkResourceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
        this.sharedPrivateLinkResourceName = Objects.requireNonNull(sharedPrivateLinkResourceName, "expected parameter 'sharedPrivateLinkResourceName' to be non-null");
    }

    private GetWebPubSubSharedPrivateLinkResourceArgs() {
        this.resourceGroupName = null;
        this.resourceName = null;
        this.sharedPrivateLinkResourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebPubSubSharedPrivateLinkResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String resourceName;
        private String sharedPrivateLinkResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebPubSubSharedPrivateLinkResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.sharedPrivateLinkResourceName = defaults.sharedPrivateLinkResourceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }

        public Builder setSharedPrivateLinkResourceName(String sharedPrivateLinkResourceName) {
            this.sharedPrivateLinkResourceName = Objects.requireNonNull(sharedPrivateLinkResourceName);
            return this;
        }

        public GetWebPubSubSharedPrivateLinkResourceArgs build() {
            return new GetWebPubSubSharedPrivateLinkResourceArgs(resourceGroupName, resourceName, sharedPrivateLinkResourceName);
        }
    }
}
