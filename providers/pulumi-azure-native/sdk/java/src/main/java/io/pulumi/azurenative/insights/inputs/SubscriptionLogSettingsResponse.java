// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Part of Subscription diagnostic setting. Specifies the settings for a particular log.
 * 
 */
public final class SubscriptionLogSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SubscriptionLogSettingsResponse Empty = new SubscriptionLogSettingsResponse();

    /**
     * Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    @InputImport(name="category")
    private final @Nullable String category;

    public Optional<String> getCategory() {
        return this.category == null ? Optional.empty() : Optional.ofNullable(this.category);
    }

    /**
     * a value indicating whether this log is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    public SubscriptionLogSettingsResponse(
        @Nullable String category,
        Boolean enabled) {
        this.category = category;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private SubscriptionLogSettingsResponse() {
        this.category = null;
        this.enabled = null;
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
