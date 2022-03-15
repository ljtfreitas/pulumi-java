// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses;

import io.pulumi.aws.ses.inputs.ConfigurationSetDeliveryOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationSetArgs Empty = new ConfigurationSetArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="deliveryOptions")
      private final @Nullable Output<ConfigurationSetDeliveryOptionsArgs> deliveryOptions;

    public Output<ConfigurationSetDeliveryOptionsArgs> getDeliveryOptions() {
        return this.deliveryOptions == null ? Output.empty() : this.deliveryOptions;
    }

    /**
     * Name of the configuration set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Whether or not Amazon SES publishes reputation metrics for the configuration set, such as bounce and complaint rates, to Amazon CloudWatch. The default value is `false`.
     * 
     */
    @Import(name="reputationMetricsEnabled")
      private final @Nullable Output<Boolean> reputationMetricsEnabled;

    public Output<Boolean> getReputationMetricsEnabled() {
        return this.reputationMetricsEnabled == null ? Output.empty() : this.reputationMetricsEnabled;
    }

    /**
     * Whether email sending is enabled or disabled for the configuration set. The default value is `true`.
     * 
     */
    @Import(name="sendingEnabled")
      private final @Nullable Output<Boolean> sendingEnabled;

    public Output<Boolean> getSendingEnabled() {
        return this.sendingEnabled == null ? Output.empty() : this.sendingEnabled;
    }

    public ConfigurationSetArgs(
        @Nullable Output<ConfigurationSetDeliveryOptionsArgs> deliveryOptions,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> reputationMetricsEnabled,
        @Nullable Output<Boolean> sendingEnabled) {
        this.deliveryOptions = deliveryOptions;
        this.name = name;
        this.reputationMetricsEnabled = reputationMetricsEnabled;
        this.sendingEnabled = sendingEnabled;
    }

    private ConfigurationSetArgs() {
        this.deliveryOptions = Output.empty();
        this.name = Output.empty();
        this.reputationMetricsEnabled = Output.empty();
        this.sendingEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ConfigurationSetDeliveryOptionsArgs> deliveryOptions;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> reputationMetricsEnabled;
        private @Nullable Output<Boolean> sendingEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deliveryOptions = defaults.deliveryOptions;
    	      this.name = defaults.name;
    	      this.reputationMetricsEnabled = defaults.reputationMetricsEnabled;
    	      this.sendingEnabled = defaults.sendingEnabled;
        }

        public Builder deliveryOptions(@Nullable Output<ConfigurationSetDeliveryOptionsArgs> deliveryOptions) {
            this.deliveryOptions = deliveryOptions;
            return this;
        }

        public Builder deliveryOptions(@Nullable ConfigurationSetDeliveryOptionsArgs deliveryOptions) {
            this.deliveryOptions = Output.ofNullable(deliveryOptions);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder reputationMetricsEnabled(@Nullable Output<Boolean> reputationMetricsEnabled) {
            this.reputationMetricsEnabled = reputationMetricsEnabled;
            return this;
        }

        public Builder reputationMetricsEnabled(@Nullable Boolean reputationMetricsEnabled) {
            this.reputationMetricsEnabled = Output.ofNullable(reputationMetricsEnabled);
            return this;
        }

        public Builder sendingEnabled(@Nullable Output<Boolean> sendingEnabled) {
            this.sendingEnabled = sendingEnabled;
            return this;
        }

        public Builder sendingEnabled(@Nullable Boolean sendingEnabled) {
            this.sendingEnabled = Output.ofNullable(sendingEnabled);
            return this;
        }
        public ConfigurationSetArgs build() {
            return new ConfigurationSetArgs(deliveryOptions, name, reputationMetricsEnabled, sendingEnabled);
        }
    }
}
