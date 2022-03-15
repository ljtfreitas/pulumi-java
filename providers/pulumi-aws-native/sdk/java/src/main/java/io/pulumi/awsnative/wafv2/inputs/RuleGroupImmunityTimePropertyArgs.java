// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class RuleGroupImmunityTimePropertyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupImmunityTimePropertyArgs Empty = new RuleGroupImmunityTimePropertyArgs();

    @Import(name="immunityTime", required=true)
      private final Output<Integer> immunityTime;

    public Output<Integer> getImmunityTime() {
        return this.immunityTime;
    }

    public RuleGroupImmunityTimePropertyArgs(Output<Integer> immunityTime) {
        this.immunityTime = Objects.requireNonNull(immunityTime, "expected parameter 'immunityTime' to be non-null");
    }

    private RuleGroupImmunityTimePropertyArgs() {
        this.immunityTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupImmunityTimePropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> immunityTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupImmunityTimePropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immunityTime = defaults.immunityTime;
        }

        public Builder immunityTime(Output<Integer> immunityTime) {
            this.immunityTime = Objects.requireNonNull(immunityTime);
            return this;
        }

        public Builder immunityTime(Integer immunityTime) {
            this.immunityTime = Output.of(Objects.requireNonNull(immunityTime));
            return this;
        }
        public RuleGroupImmunityTimePropertyArgs build() {
            return new RuleGroupImmunityTimePropertyArgs(immunityTime);
        }
    }
}
