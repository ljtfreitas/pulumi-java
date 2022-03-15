// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.inputs;

import io.pulumi.awsnative.iotanalytics.inputs.DatasetLateDataRuleConfiguration;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetLateDataRule extends io.pulumi.resources.InvokeArgs {

    public static final DatasetLateDataRule Empty = new DatasetLateDataRule();

    @Import(name="ruleConfiguration", required=true)
      private final DatasetLateDataRuleConfiguration ruleConfiguration;

    public DatasetLateDataRuleConfiguration getRuleConfiguration() {
        return this.ruleConfiguration;
    }

    @Import(name="ruleName")
      private final @Nullable String ruleName;

    public Optional<String> getRuleName() {
        return this.ruleName == null ? Optional.empty() : Optional.ofNullable(this.ruleName);
    }

    public DatasetLateDataRule(
        DatasetLateDataRuleConfiguration ruleConfiguration,
        @Nullable String ruleName) {
        this.ruleConfiguration = Objects.requireNonNull(ruleConfiguration, "expected parameter 'ruleConfiguration' to be non-null");
        this.ruleName = ruleName;
    }

    private DatasetLateDataRule() {
        this.ruleConfiguration = null;
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetLateDataRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetLateDataRuleConfiguration ruleConfiguration;
        private @Nullable String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetLateDataRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleConfiguration = defaults.ruleConfiguration;
    	      this.ruleName = defaults.ruleName;
        }

        public Builder ruleConfiguration(DatasetLateDataRuleConfiguration ruleConfiguration) {
            this.ruleConfiguration = Objects.requireNonNull(ruleConfiguration);
            return this;
        }

        public Builder ruleName(@Nullable String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public DatasetLateDataRule build() {
            return new DatasetLateDataRule(ruleConfiguration, ruleName);
        }
    }
}
