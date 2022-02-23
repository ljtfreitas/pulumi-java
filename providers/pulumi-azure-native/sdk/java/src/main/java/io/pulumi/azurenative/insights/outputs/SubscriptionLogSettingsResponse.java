// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SubscriptionLogSettingsResponse {
    /**
     * Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    private final @Nullable String category;
    /**
     * a value indicating whether this log is enabled.
     * 
     */
    private final Boolean enabled;

    @OutputCustomType.Constructor({"category","enabled"})
    private SubscriptionLogSettingsResponse(
        @Nullable String category,
        Boolean enabled) {
        this.category = category;
        this.enabled = Objects.requireNonNull(enabled);
    }

    /**
     * Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    /**
     * a value indicating whether this log is enabled.
     * 
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionLogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionLogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public SubscriptionLogSettingsResponse build() {
            return new SubscriptionLogSettingsResponse(category, enabled);
        }
    }
}
