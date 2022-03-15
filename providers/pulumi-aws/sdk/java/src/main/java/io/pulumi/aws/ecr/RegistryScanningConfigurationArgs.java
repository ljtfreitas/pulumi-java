// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr;

import io.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryScanningConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegistryScanningConfigurationArgs Empty = new RegistryScanningConfigurationArgs();

    /**
     * One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<RegistryScanningConfigurationRuleArgs>> rules;

    public Output<List<RegistryScanningConfigurationRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
     * 
     */
    @Import(name="scanType", required=true)
      private final Output<String> scanType;

    public Output<String> getScanType() {
        return this.scanType;
    }

    public RegistryScanningConfigurationArgs(
        @Nullable Output<List<RegistryScanningConfigurationRuleArgs>> rules,
        Output<String> scanType) {
        this.rules = rules;
        this.scanType = Objects.requireNonNull(scanType, "expected parameter 'scanType' to be non-null");
    }

    private RegistryScanningConfigurationArgs() {
        this.rules = Output.empty();
        this.scanType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryScanningConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RegistryScanningConfigurationRuleArgs>> rules;
        private Output<String> scanType;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryScanningConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
    	      this.scanType = defaults.scanType;
        }

        public Builder rules(@Nullable Output<List<RegistryScanningConfigurationRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<RegistryScanningConfigurationRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }

        public Builder scanType(Output<String> scanType) {
            this.scanType = Objects.requireNonNull(scanType);
            return this;
        }

        public Builder scanType(String scanType) {
            this.scanType = Output.of(Objects.requireNonNull(scanType));
            return this;
        }
        public RegistryScanningConfigurationArgs build() {
            return new RegistryScanningConfigurationArgs(rules, scanType);
        }
    }
}
