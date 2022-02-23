// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.azurenative.testbase.inputs.DistributionGroupListReceiverValueArgs;
import io.pulumi.azurenative.testbase.inputs.SubscriptionReceiverValueArgs;
import io.pulumi.azurenative.testbase.inputs.UserObjectReceiverValueArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A notification event receiver value.
 * 
 */
public final class NotificationReceiverValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationReceiverValueArgs Empty = new NotificationReceiverValueArgs();

    /**
     * The user object receiver value.
     * 
     */
    @InputImport(name="distributionGroupListReceiverValue")
        private final @Nullable Input<DistributionGroupListReceiverValueArgs> distributionGroupListReceiverValue;

    public Input<DistributionGroupListReceiverValueArgs> getDistributionGroupListReceiverValue() {
        return this.distributionGroupListReceiverValue == null ? Input.empty() : this.distributionGroupListReceiverValue;
    }

    /**
     * The user object receiver value.
     * 
     */
    @InputImport(name="subscriptionReceiverValue")
        private final @Nullable Input<SubscriptionReceiverValueArgs> subscriptionReceiverValue;

    public Input<SubscriptionReceiverValueArgs> getSubscriptionReceiverValue() {
        return this.subscriptionReceiverValue == null ? Input.empty() : this.subscriptionReceiverValue;
    }

    /**
     * The user object receiver value.
     * 
     */
    @InputImport(name="userObjectReceiverValue")
        private final @Nullable Input<UserObjectReceiverValueArgs> userObjectReceiverValue;

    public Input<UserObjectReceiverValueArgs> getUserObjectReceiverValue() {
        return this.userObjectReceiverValue == null ? Input.empty() : this.userObjectReceiverValue;
    }

    public NotificationReceiverValueArgs(
        @Nullable Input<DistributionGroupListReceiverValueArgs> distributionGroupListReceiverValue,
        @Nullable Input<SubscriptionReceiverValueArgs> subscriptionReceiverValue,
        @Nullable Input<UserObjectReceiverValueArgs> userObjectReceiverValue) {
        this.distributionGroupListReceiverValue = distributionGroupListReceiverValue;
        this.subscriptionReceiverValue = subscriptionReceiverValue;
        this.userObjectReceiverValue = userObjectReceiverValue;
    }

    private NotificationReceiverValueArgs() {
        this.distributionGroupListReceiverValue = Input.empty();
        this.subscriptionReceiverValue = Input.empty();
        this.userObjectReceiverValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationReceiverValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DistributionGroupListReceiverValueArgs> distributionGroupListReceiverValue;
        private @Nullable Input<SubscriptionReceiverValueArgs> subscriptionReceiverValue;
        private @Nullable Input<UserObjectReceiverValueArgs> userObjectReceiverValue;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationReceiverValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionGroupListReceiverValue = defaults.distributionGroupListReceiverValue;
    	      this.subscriptionReceiverValue = defaults.subscriptionReceiverValue;
    	      this.userObjectReceiverValue = defaults.userObjectReceiverValue;
        }

        public Builder setDistributionGroupListReceiverValue(@Nullable Input<DistributionGroupListReceiverValueArgs> distributionGroupListReceiverValue) {
            this.distributionGroupListReceiverValue = distributionGroupListReceiverValue;
            return this;
        }

        public Builder setDistributionGroupListReceiverValue(@Nullable DistributionGroupListReceiverValueArgs distributionGroupListReceiverValue) {
            this.distributionGroupListReceiverValue = Input.ofNullable(distributionGroupListReceiverValue);
            return this;
        }

        public Builder setSubscriptionReceiverValue(@Nullable Input<SubscriptionReceiverValueArgs> subscriptionReceiverValue) {
            this.subscriptionReceiverValue = subscriptionReceiverValue;
            return this;
        }

        public Builder setSubscriptionReceiverValue(@Nullable SubscriptionReceiverValueArgs subscriptionReceiverValue) {
            this.subscriptionReceiverValue = Input.ofNullable(subscriptionReceiverValue);
            return this;
        }

        public Builder setUserObjectReceiverValue(@Nullable Input<UserObjectReceiverValueArgs> userObjectReceiverValue) {
            this.userObjectReceiverValue = userObjectReceiverValue;
            return this;
        }

        public Builder setUserObjectReceiverValue(@Nullable UserObjectReceiverValueArgs userObjectReceiverValue) {
            this.userObjectReceiverValue = Input.ofNullable(userObjectReceiverValue);
            return this;
        }
        public NotificationReceiverValueArgs build() {
            return new NotificationReceiverValueArgs(distributionGroupListReceiverValue, subscriptionReceiverValue, userObjectReceiverValue);
        }
    }
}
