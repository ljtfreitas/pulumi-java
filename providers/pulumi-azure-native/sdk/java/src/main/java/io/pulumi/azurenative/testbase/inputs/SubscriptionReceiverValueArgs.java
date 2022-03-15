// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The subscription role receiver value.
 * 
 */
public final class SubscriptionReceiverValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionReceiverValueArgs Empty = new SubscriptionReceiverValueArgs();

    /**
     * The role of the notification receiver.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    /**
     * The subscription id of the notification receiver.
     * 
     */
    @Import(name="subscriptionId")
      private final @Nullable Output<String> subscriptionId;

    public Output<String> getSubscriptionId() {
        return this.subscriptionId == null ? Output.empty() : this.subscriptionId;
    }

    /**
     * The subscription name of the notification receiver.
     * 
     */
    @Import(name="subscriptionName")
      private final @Nullable Output<String> subscriptionName;

    public Output<String> getSubscriptionName() {
        return this.subscriptionName == null ? Output.empty() : this.subscriptionName;
    }

    public SubscriptionReceiverValueArgs(
        @Nullable Output<String> role,
        @Nullable Output<String> subscriptionId,
        @Nullable Output<String> subscriptionName) {
        this.role = role;
        this.subscriptionId = subscriptionId;
        this.subscriptionName = subscriptionName;
    }

    private SubscriptionReceiverValueArgs() {
        this.role = Output.empty();
        this.subscriptionId = Output.empty();
        this.subscriptionName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionReceiverValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> role;
        private @Nullable Output<String> subscriptionId;
        private @Nullable Output<String> subscriptionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionReceiverValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.subscriptionName = defaults.subscriptionName;
        }

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }

        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = Output.ofNullable(subscriptionId);
            return this;
        }

        public Builder subscriptionName(@Nullable Output<String> subscriptionName) {
            this.subscriptionName = subscriptionName;
            return this;
        }

        public Builder subscriptionName(@Nullable String subscriptionName) {
            this.subscriptionName = Output.ofNullable(subscriptionName);
            return this;
        }
        public SubscriptionReceiverValueArgs build() {
            return new SubscriptionReceiverValueArgs(role, subscriptionId, subscriptionName);
        }
    }
}
