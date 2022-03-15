// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.SubscriptionStateOverrideActionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications extends io.pulumi.resources.InvokeArgs {

    public static final ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications Empty = new ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications();

    @Import(name="softDeleteTTL")
      private final @Nullable String softDeleteTTL;

    public Optional<String> getSoftDeleteTTL() {
        return this.softDeleteTTL == null ? Optional.empty() : Optional.ofNullable(this.softDeleteTTL);
    }

    @Import(name="subscriptionStateOverrideActions")
      private final @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions;

    public List<SubscriptionStateOverrideActionResponse> getSubscriptionStateOverrideActions() {
        return this.subscriptionStateOverrideActions == null ? List.of() : this.subscriptionStateOverrideActions;
    }

    public ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications(
        @Nullable String softDeleteTTL,
        @Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions) {
        this.softDeleteTTL = softDeleteTTL;
        this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
    }

    private ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications() {
        this.softDeleteTTL = null;
        this.subscriptionStateOverrideActions = List.of();
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

        public Builder softDeleteTTL(@Nullable String softDeleteTTL) {
            this.softDeleteTTL = softDeleteTTL;
            return this;
        }

        public Builder subscriptionStateOverrideActions(@Nullable List<SubscriptionStateOverrideActionResponse> subscriptionStateOverrideActions) {
            this.subscriptionStateOverrideActions = subscriptionStateOverrideActions;
            return this;
        }
        public ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications build() {
            return new ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications(softDeleteTTL, subscriptionStateOverrideActions);
        }
    }
}
