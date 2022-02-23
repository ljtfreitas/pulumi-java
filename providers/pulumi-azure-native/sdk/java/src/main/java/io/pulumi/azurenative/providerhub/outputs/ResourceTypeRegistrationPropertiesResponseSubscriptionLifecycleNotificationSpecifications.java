// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.SubscriptionStateOverrideActionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications {
    private final @Nullable String softDeleteTTL;
    private final @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions;

    @OutputCustomType.Constructor({"softDeleteTTL","subscriptionStateOverrideActions"})
    private ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications(
        @Nullable String softDeleteTTL,
        @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions) {
        this.softDeleteTTL = softDeleteTTL;
        this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
    }

    public Optional<String> getSoftDeleteTTL() {
        return Optional.ofNullable(this.softDeleteTTL);
    }
    public List<SubscriptionStateOverrideActionResponse> getSubscriptionStateOverrideActions() {
        return this.subscriptionStateOverrideActions == null ? List.of() : this.subscriptionStateOverrideActions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String softDeleteTTL;
        private @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.softDeleteTTL = defaults.softDeleteTTL;
    	      this.subscriptionStateOverrideActions = defaults.subscriptionStateOverrideActions;
        }

        public Builder setSoftDeleteTTL(@Nullable String softDeleteTTL) {
            this.softDeleteTTL = softDeleteTTL;
            return this;
        }

        public Builder setSubscriptionStateOverrideActions(@Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions) {
            this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
            return this;
        }
        public ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications build() {
            return new ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications(softDeleteTTL, subscriptionStateOverrideActions);
        }
    }
}
