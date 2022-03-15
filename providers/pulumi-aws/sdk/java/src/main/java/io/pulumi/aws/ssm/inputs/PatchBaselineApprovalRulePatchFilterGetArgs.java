// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ssm.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class PatchBaselineApprovalRulePatchFilterGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchBaselineApprovalRulePatchFilterGetArgs Empty = new PatchBaselineApprovalRulePatchFilterGetArgs();

    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    @Import(name="values", required=true)
      private final Output<List<String>> values;

    public Output<List<String>> getValues() {
        return this.values;
    }

    public PatchBaselineApprovalRulePatchFilterGetArgs(
        Output<String> key,
        Output<List<String>> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private PatchBaselineApprovalRulePatchFilterGetArgs() {
        this.key = Output.empty();
        this.values = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchBaselineApprovalRulePatchFilterGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<List<String>> values;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchBaselineApprovalRulePatchFilterGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder values(Output<List<String>> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }

        public Builder values(List<String> values) {
            this.values = Output.of(Objects.requireNonNull(values));
            return this;
        }
        public PatchBaselineApprovalRulePatchFilterGetArgs build() {
            return new PatchBaselineApprovalRulePatchFilterGetArgs(key, values);
        }
    }
}
