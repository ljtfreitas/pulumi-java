// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.enums.JobValidationMode;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configuration to attach Rulesets to the job
 * 
 */
public final class JobValidationConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobValidationConfigurationArgs Empty = new JobValidationConfigurationArgs();

    /**
     * Arn of the Ruleset
     * 
     */
    @Import(name="rulesetArn", required=true)
      private final Output<String> rulesetArn;

    public Output<String> getRulesetArn() {
        return this.rulesetArn;
    }

    @Import(name="validationMode")
      private final @Nullable Output<JobValidationMode> validationMode;

    public Output<JobValidationMode> getValidationMode() {
        return this.validationMode == null ? Output.empty() : this.validationMode;
    }

    public JobValidationConfigurationArgs(
        Output<String> rulesetArn,
        @Nullable Output<JobValidationMode> validationMode) {
        this.rulesetArn = Objects.requireNonNull(rulesetArn, "expected parameter 'rulesetArn' to be non-null");
        this.validationMode = validationMode;
    }

    private JobValidationConfigurationArgs() {
        this.rulesetArn = Output.empty();
        this.validationMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobValidationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> rulesetArn;
        private @Nullable Output<JobValidationMode> validationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(JobValidationConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rulesetArn = defaults.rulesetArn;
    	      this.validationMode = defaults.validationMode;
        }

        public Builder rulesetArn(Output<String> rulesetArn) {
            this.rulesetArn = Objects.requireNonNull(rulesetArn);
            return this;
        }

        public Builder rulesetArn(String rulesetArn) {
            this.rulesetArn = Output.of(Objects.requireNonNull(rulesetArn));
            return this;
        }

        public Builder validationMode(@Nullable Output<JobValidationMode> validationMode) {
            this.validationMode = validationMode;
            return this;
        }

        public Builder validationMode(@Nullable JobValidationMode validationMode) {
            this.validationMode = Output.ofNullable(validationMode);
            return this;
        }
        public JobValidationConfigurationArgs build() {
            return new JobValidationConfigurationArgs(rulesetArn, validationMode);
        }
    }
}
