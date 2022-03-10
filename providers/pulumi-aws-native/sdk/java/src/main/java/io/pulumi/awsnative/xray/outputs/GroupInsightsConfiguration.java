// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupInsightsConfiguration {
    /**
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * 
     */
    private final @Nullable Boolean insightsEnabled;
    /**
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.
     * 
     */
    private final @Nullable Boolean notificationsEnabled;

    @OutputCustomType.Constructor
    private GroupInsightsConfiguration(
        @OutputCustomType.Parameter("insightsEnabled") @Nullable Boolean insightsEnabled,
        @OutputCustomType.Parameter("notificationsEnabled") @Nullable Boolean notificationsEnabled) {
        this.insightsEnabled = insightsEnabled;
        this.notificationsEnabled = notificationsEnabled;
    }

    /**
     * Set the InsightsEnabled value to true to enable insights or false to disable insights.
     * 
    */
    public Optional<Boolean> getInsightsEnabled() {
        return Optional.ofNullable(this.insightsEnabled);
    }
    /**
     * Set the NotificationsEnabled value to true to enable insights notifications. Notifications can only be enabled on a group with InsightsEnabled set to true.
     * 
    */
    public Optional<Boolean> getNotificationsEnabled() {
        return Optional.ofNullable(this.notificationsEnabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupInsightsConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean insightsEnabled;
        private @Nullable Boolean notificationsEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupInsightsConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insightsEnabled = defaults.insightsEnabled;
    	      this.notificationsEnabled = defaults.notificationsEnabled;
        }

        public Builder setInsightsEnabled(@Nullable Boolean insightsEnabled) {
            this.insightsEnabled = insightsEnabled;
            return this;
        }

        public Builder setNotificationsEnabled(@Nullable Boolean notificationsEnabled) {
            this.notificationsEnabled = notificationsEnabled;
            return this;
        }
        public GroupInsightsConfiguration build() {
            return new GroupInsightsConfiguration(insightsEnabled, notificationsEnabled);
        }
    }
}
