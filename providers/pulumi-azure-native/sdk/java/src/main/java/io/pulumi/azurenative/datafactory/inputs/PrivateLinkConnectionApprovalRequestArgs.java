// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.PrivateLinkConnectionStateArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A request to approve or reject a private endpoint connection
 * 
 */
public final class PrivateLinkConnectionApprovalRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkConnectionApprovalRequestArgs Empty = new PrivateLinkConnectionApprovalRequestArgs();

    /**
     * The state of a private link connection
     * 
     */
    @Import(name="privateLinkServiceConnectionState")
      private final @Nullable Output<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState;

    public Output<PrivateLinkConnectionStateArgs> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Output.empty() : this.privateLinkServiceConnectionState;
    }

    public PrivateLinkConnectionApprovalRequestArgs(@Nullable Output<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
    }

    private PrivateLinkConnectionApprovalRequestArgs() {
        this.privateLinkServiceConnectionState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkConnectionApprovalRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkConnectionApprovalRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
        }

        public Builder privateLinkServiceConnectionState(@Nullable Output<PrivateLinkConnectionStateArgs> privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder privateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateArgs privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Output.ofNullable(privateLinkServiceConnectionState);
            return this;
        }
        public PrivateLinkConnectionApprovalRequestArgs build() {
            return new PrivateLinkConnectionApprovalRequestArgs(privateLinkServiceConnectionState);
        }
    }
}
