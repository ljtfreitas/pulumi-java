// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccountThrottleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccountThrottleSettingsArgs Empty = new AccountThrottleSettingsArgs();

    /**
     * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
     * 
     */
    @Import(name="burstLimit")
      private final @Nullable Output<Integer> burstLimit;

    public Output<Integer> getBurstLimit() {
        return this.burstLimit == null ? Output.empty() : this.burstLimit;
    }

    /**
     * The number of times API Gateway allows the API to be called per second on average (RPS).
     * 
     */
    @Import(name="rateLimit")
      private final @Nullable Output<Double> rateLimit;

    public Output<Double> getRateLimit() {
        return this.rateLimit == null ? Output.empty() : this.rateLimit;
    }

    public AccountThrottleSettingsArgs(
        @Nullable Output<Integer> burstLimit,
        @Nullable Output<Double> rateLimit) {
        this.burstLimit = burstLimit;
        this.rateLimit = rateLimit;
    }

    private AccountThrottleSettingsArgs() {
        this.burstLimit = Output.empty();
        this.rateLimit = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountThrottleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> burstLimit;
        private @Nullable Output<Double> rateLimit;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountThrottleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.burstLimit = defaults.burstLimit;
    	      this.rateLimit = defaults.rateLimit;
        }

        public Builder burstLimit(@Nullable Output<Integer> burstLimit) {
            this.burstLimit = burstLimit;
            return this;
        }

        public Builder burstLimit(@Nullable Integer burstLimit) {
            this.burstLimit = Output.ofNullable(burstLimit);
            return this;
        }

        public Builder rateLimit(@Nullable Output<Double> rateLimit) {
            this.rateLimit = rateLimit;
            return this;
        }

        public Builder rateLimit(@Nullable Double rateLimit) {
            this.rateLimit = Output.ofNullable(rateLimit);
            return this;
        }
        public AccountThrottleSettingsArgs build() {
            return new AccountThrottleSettingsArgs(burstLimit, rateLimit);
        }
    }
}
