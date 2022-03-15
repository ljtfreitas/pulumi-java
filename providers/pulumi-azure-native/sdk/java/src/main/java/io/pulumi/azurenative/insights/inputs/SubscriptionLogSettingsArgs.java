// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Part of Subscription diagnostic setting. Specifies the settings for a particular log.
 * 
 */
public final class SubscriptionLogSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubscriptionLogSettingsArgs Empty = new SubscriptionLogSettingsArgs();

    /**
     * Name of a Subscription Diagnostic Log category for a resource type this setting is applied to.
     * 
     */
    @Import(name="category")
      private final @Nullable Output<String> category;

    public Output<String> getCategory() {
        return this.category == null ? Output.empty() : this.category;
    }

    /**
     * a value indicating whether this log is enabled.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled;
    }

    public SubscriptionLogSettingsArgs(
        @Nullable Output<String> category,
        Output<Boolean> enabled) {
        this.category = category;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
    }

    private SubscriptionLogSettingsArgs() {
        this.category = Output.empty();
        this.enabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionLogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> category;
        private Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionLogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
        }

        public Builder category(@Nullable Output<String> category) {
            this.category = category;
            return this;
        }

        public Builder category(@Nullable String category) {
            this.category = Output.ofNullable(category);
            return this;
        }

        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public SubscriptionLogSettingsArgs build() {
            return new SubscriptionLogSettingsArgs(category, enabled);
        }
    }
}
