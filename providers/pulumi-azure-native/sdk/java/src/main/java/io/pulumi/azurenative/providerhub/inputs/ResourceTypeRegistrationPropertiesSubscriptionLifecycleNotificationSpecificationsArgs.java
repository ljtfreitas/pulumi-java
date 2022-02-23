// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.SubscriptionStateOverrideActionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs Empty = new ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs();

    @InputImport(name="softDeleteTTL")
        private final @Nullable Input<String> softDeleteTTL;

    public Input<String> getSoftDeleteTTL() {
        return this.softDeleteTTL == null ? Input.empty() : this.softDeleteTTL;
    }

    @InputImport(name="subscriptionStateOverrideActions")
        private final @Nullable Input<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions;

    public Input<List<SubscriptionStateOverrideActionArgs>> getSubscriptionStateOverrideActions() {
        return this.subscriptionStateOverrideActions == null ? Input.empty() : this.subscriptionStateOverrideActions;
    }

    public ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs(
        @Nullable Input<String> softDeleteTTL,
        @Nullable Input<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions) {
        this.softDeleteTTL = softDeleteTTL;
        this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
    }

    private ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs() {
        this.softDeleteTTL = Input.empty();
        this.subscriptionStateOverrideActions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> softDeleteTTL;
        private @Nullable Input<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.softDeleteTTL = defaults.softDeleteTTL;
    	      this.subscriptionStateOverrideActions = defaults.subscriptionStateOverrideActions;
        }

        public Builder setSoftDeleteTTL(@Nullable Input<String> softDeleteTTL) {
            this.softDeleteTTL = softDeleteTTL;
            return this;
        }

        public Builder setSoftDeleteTTL(@Nullable String softDeleteTTL) {
            this.softDeleteTTL = Input.ofNullable(softDeleteTTL);
            return this;
        }

        public Builder setSubscriptionStateOverrideActions(@Nullable Input<List<SubscriptionStateOverrideActionArgs>> subscriptionStateOverrideActions) {
            this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
            return this;
        }

        public Builder setSubscriptionStateOverrideActions(@Nullable List<SubscriptionStateOverrideActionArgs> subscriptionStateOverrideActions) {
            this.subscriptionStateOverrideActions = Input.ofNullable(subscriptionStateOverrideActions);
            return this;
        }
        public ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs build() {
            return new ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs(softDeleteTTL, subscriptionStateOverrideActions);
        }
    }
}
