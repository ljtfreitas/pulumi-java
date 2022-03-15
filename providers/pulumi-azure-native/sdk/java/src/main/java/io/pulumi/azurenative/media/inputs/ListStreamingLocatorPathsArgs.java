// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListStreamingLocatorPathsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListStreamingLocatorPathsArgs Empty = new ListStreamingLocatorPathsArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The Streaming Locator name.
     * 
     */
    @Import(name="streamingLocatorName", required=true)
      private final String streamingLocatorName;

    public String getStreamingLocatorName() {
        return this.streamingLocatorName;
    }

    public ListStreamingLocatorPathsArgs(
        String accountName,
        String resourceGroupName,
        String streamingLocatorName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.streamingLocatorName = Objects.requireNonNull(streamingLocatorName, "expected parameter 'streamingLocatorName' to be non-null");
    }

    private ListStreamingLocatorPathsArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.streamingLocatorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListStreamingLocatorPathsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String streamingLocatorName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListStreamingLocatorPathsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.streamingLocatorName = defaults.streamingLocatorName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder streamingLocatorName(String streamingLocatorName) {
            this.streamingLocatorName = Objects.requireNonNull(streamingLocatorName);
            return this;
        }
        public ListStreamingLocatorPathsArgs build() {
            return new ListStreamingLocatorPathsArgs(accountName, resourceGroupName, streamingLocatorName);
        }
    }
}
