// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMediaGraphArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMediaGraphArgs Empty = new GetMediaGraphArgs();

    /**
     * The Media Services account name.
     * 
     */
    @InputImport(name="accountName", required=true)
        private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The Media Graph name.
     * 
     */
    @InputImport(name="mediaGraphName", required=true)
        private final String mediaGraphName;

    public String getMediaGraphName() {
        return this.mediaGraphName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetMediaGraphArgs(
        String accountName,
        String mediaGraphName,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.mediaGraphName = Objects.requireNonNull(mediaGraphName, "expected parameter 'mediaGraphName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMediaGraphArgs() {
        this.accountName = null;
        this.mediaGraphName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMediaGraphArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String mediaGraphName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMediaGraphArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.mediaGraphName = defaults.mediaGraphName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setMediaGraphName(String mediaGraphName) {
            this.mediaGraphName = Objects.requireNonNull(mediaGraphName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetMediaGraphArgs build() {
            return new GetMediaGraphArgs(accountName, mediaGraphName, resourceGroupName);
        }
    }
}
