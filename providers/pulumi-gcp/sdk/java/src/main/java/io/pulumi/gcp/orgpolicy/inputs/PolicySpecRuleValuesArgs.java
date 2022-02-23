// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.orgpolicy.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicySpecRuleValuesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicySpecRuleValuesArgs Empty = new PolicySpecRuleValuesArgs();

    /**
     * List of values allowed at this resource.
     * 
     */
    @InputImport(name="allowedValues")
        private final @Nullable Input<List<String>> allowedValues;

    public Input<List<String>> getAllowedValues() {
        return this.allowedValues == null ? Input.empty() : this.allowedValues;
    }

    /**
     * List of values denied at this resource.
     * 
     */
    @InputImport(name="deniedValues")
        private final @Nullable Input<List<String>> deniedValues;

    public Input<List<String>> getDeniedValues() {
        return this.deniedValues == null ? Input.empty() : this.deniedValues;
    }

    public PolicySpecRuleValuesArgs(
        @Nullable Input<List<String>> allowedValues,
        @Nullable Input<List<String>> deniedValues) {
        this.allowedValues = allowedValues;
        this.deniedValues = deniedValues;
    }

    private PolicySpecRuleValuesArgs() {
        this.allowedValues = Input.empty();
        this.deniedValues = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySpecRuleValuesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedValues;
        private @Nullable Input<List<String>> deniedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySpecRuleValuesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.deniedValues = defaults.deniedValues;
        }

        public Builder setAllowedValues(@Nullable Input<List<String>> allowedValues) {
            this.allowedValues = allowedValues;
            return this;
        }

        public Builder setAllowedValues(@Nullable List<String> allowedValues) {
            this.allowedValues = Input.ofNullable(allowedValues);
            return this;
        }

        public Builder setDeniedValues(@Nullable Input<List<String>> deniedValues) {
            this.deniedValues = deniedValues;
            return this;
        }

        public Builder setDeniedValues(@Nullable List<String> deniedValues) {
            this.deniedValues = Input.ofNullable(deniedValues);
            return this;
        }
        public PolicySpecRuleValuesArgs build() {
            return new PolicySpecRuleValuesArgs(allowedValues, deniedValues);
        }
    }
}
