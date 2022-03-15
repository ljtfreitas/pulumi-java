// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListShareSubscriptionSourceShareSynchronizationSettingsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListShareSubscriptionSourceShareSynchronizationSettingsArgs Empty = new ListShareSubscriptionSourceShareSynchronizationSettingsArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the shareSubscription.
     * 
     */
    @Import(name="shareSubscriptionName", required=true)
      private final String shareSubscriptionName;

    public String getShareSubscriptionName() {
        return this.shareSubscriptionName;
    }

    /**
     * Continuation token
     * 
     */
    @Import(name="skipToken")
      private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    public ListShareSubscriptionSourceShareSynchronizationSettingsArgs(
        String accountName,
        String resourceGroupName,
        String shareSubscriptionName,
        @Nullable String skipToken) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName, "expected parameter 'shareSubscriptionName' to be non-null");
        this.skipToken = skipToken;
    }

    private ListShareSubscriptionSourceShareSynchronizationSettingsArgs() {
        this.accountName = null;
        this.resourceGroupName = null;
        this.shareSubscriptionName = null;
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListShareSubscriptionSourceShareSynchronizationSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String resourceGroupName;
        private String shareSubscriptionName;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListShareSubscriptionSourceShareSynchronizationSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareSubscriptionName = defaults.shareSubscriptionName;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder shareSubscriptionName(String shareSubscriptionName) {
            this.shareSubscriptionName = Objects.requireNonNull(shareSubscriptionName);
            return this;
        }

        public Builder skipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }
        public ListShareSubscriptionSourceShareSynchronizationSettingsArgs build() {
            return new ListShareSubscriptionSourceShareSynchronizationSettingsArgs(accountName, resourceGroupName, shareSubscriptionName, skipToken);
        }
    }
}
