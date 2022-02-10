// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.azurenative.testbase.outputs.DistributionGroupListReceiverValueResponse;
import io.pulumi.azurenative.testbase.outputs.SubscriptionReceiverValueResponse;
import io.pulumi.azurenative.testbase.outputs.UserObjectReceiverValueResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NotificationReceiverValueResponse {
    private final @Nullable DistributionGroupListReceiverValueResponse distributionGroupListReceiverValue;
    private final @Nullable SubscriptionReceiverValueResponse subscriptionReceiverValue;
    private final @Nullable UserObjectReceiverValueResponse userObjectReceiverValue;

    @OutputCustomType.Constructor({"distributionGroupListReceiverValue","subscriptionReceiverValue","userObjectReceiverValue"})
    private NotificationReceiverValueResponse(
        @Nullable DistributionGroupListReceiverValueResponse distributionGroupListReceiverValue,
        @Nullable SubscriptionReceiverValueResponse subscriptionReceiverValue,
        @Nullable UserObjectReceiverValueResponse userObjectReceiverValue) {
        this.distributionGroupListReceiverValue = distributionGroupListReceiverValue;
        this.subscriptionReceiverValue = subscriptionReceiverValue;
        this.userObjectReceiverValue = userObjectReceiverValue;
    }

    public Optional<DistributionGroupListReceiverValueResponse> getDistributionGroupListReceiverValue() {
        return Optional.ofNullable(this.distributionGroupListReceiverValue);
    }
    public Optional<SubscriptionReceiverValueResponse> getSubscriptionReceiverValue() {
        return Optional.ofNullable(this.subscriptionReceiverValue);
    }
    public Optional<UserObjectReceiverValueResponse> getUserObjectReceiverValue() {
        return Optional.ofNullable(this.userObjectReceiverValue);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationReceiverValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DistributionGroupListReceiverValueResponse distributionGroupListReceiverValue;
        private @Nullable SubscriptionReceiverValueResponse subscriptionReceiverValue;
        private @Nullable UserObjectReceiverValueResponse userObjectReceiverValue;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationReceiverValueResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionGroupListReceiverValue = defaults.distributionGroupListReceiverValue;
    	      this.subscriptionReceiverValue = defaults.subscriptionReceiverValue;
    	      this.userObjectReceiverValue = defaults.userObjectReceiverValue;
        }

        public Builder setDistributionGroupListReceiverValue(@Nullable DistributionGroupListReceiverValueResponse distributionGroupListReceiverValue) {
            this.distributionGroupListReceiverValue = distributionGroupListReceiverValue;
            return this;
        }

        public Builder setSubscriptionReceiverValue(@Nullable SubscriptionReceiverValueResponse subscriptionReceiverValue) {
            this.subscriptionReceiverValue = subscriptionReceiverValue;
            return this;
        }

        public Builder setUserObjectReceiverValue(@Nullable UserObjectReceiverValueResponse userObjectReceiverValue) {
            this.userObjectReceiverValue = userObjectReceiverValue;
            return this;
        }

        public NotificationReceiverValueResponse build() {
            return new NotificationReceiverValueResponse(distributionGroupListReceiverValue, subscriptionReceiverValue, userObjectReceiverValue);
        }
    }
}