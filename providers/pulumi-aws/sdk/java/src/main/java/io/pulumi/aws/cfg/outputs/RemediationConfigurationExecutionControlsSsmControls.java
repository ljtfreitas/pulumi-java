// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cfg.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RemediationConfigurationExecutionControlsSsmControls {
    /**
     * Maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that specific rule. The default value is 10%.
     * 
     */
    private final @Nullable Integer concurrentExecutionRatePercentage;
    /**
     * Percentage of errors that are allowed before SSM stops running automations on non-compliant resources for that specific rule. The default is 50%.
     * 
     */
    private final @Nullable Integer errorPercentage;

    @CustomType.Constructor
    private RemediationConfigurationExecutionControlsSsmControls(
        @CustomType.Parameter("concurrentExecutionRatePercentage") @Nullable Integer concurrentExecutionRatePercentage,
        @CustomType.Parameter("errorPercentage") @Nullable Integer errorPercentage) {
        this.concurrentExecutionRatePercentage = concurrentExecutionRatePercentage;
        this.errorPercentage = errorPercentage;
    }

    /**
     * Maximum percentage of remediation actions allowed to run in parallel on the non-compliant resources for that specific rule. The default value is 10%.
     * 
    */
    public Optional<Integer> getConcurrentExecutionRatePercentage() {
        return Optional.ofNullable(this.concurrentExecutionRatePercentage);
    }
    /**
     * Percentage of errors that are allowed before SSM stops running automations on non-compliant resources for that specific rule. The default is 50%.
     * 
    */
    public Optional<Integer> getErrorPercentage() {
        return Optional.ofNullable(this.errorPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemediationConfigurationExecutionControlsSsmControls defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer concurrentExecutionRatePercentage;
        private @Nullable Integer errorPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(RemediationConfigurationExecutionControlsSsmControls defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.concurrentExecutionRatePercentage = defaults.concurrentExecutionRatePercentage;
    	      this.errorPercentage = defaults.errorPercentage;
        }

        public Builder concurrentExecutionRatePercentage(@Nullable Integer concurrentExecutionRatePercentage) {
            this.concurrentExecutionRatePercentage = concurrentExecutionRatePercentage;
            return this;
        }

        public Builder errorPercentage(@Nullable Integer errorPercentage) {
            this.errorPercentage = errorPercentage;
            return this;
        }
        public RemediationConfigurationExecutionControlsSsmControls build() {
            return new RemediationConfigurationExecutionControlsSsmControls(concurrentExecutionRatePercentage, errorPercentage);
        }
    }
}
