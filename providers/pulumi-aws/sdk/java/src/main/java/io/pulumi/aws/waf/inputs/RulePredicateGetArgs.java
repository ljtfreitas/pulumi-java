// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.waf.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RulePredicateGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulePredicateGetArgs Empty = new RulePredicateGetArgs();

    /**
     * A unique identifier for a predicate in the rule, such as Byte Match Set ID or IPSet ID.
     * 
     */
    @Import(name="dataId", required=true)
      private final Output<String> dataId;

    public Output<String> getDataId() {
        return this.dataId;
    }

    /**
     * Set this to `false` if you want to allow, block, or count requests
     * based on the settings in the specified `waf_byte_match_set`, `waf_ipset`, `aws.waf.SizeConstraintSet`, `aws.waf.SqlInjectionMatchSet` or `aws.waf.XssMatchSet`.
     * For example, if an IPSet includes the IP address `192.0.2.44`, AWS WAF will allow or block requests based on that IP address.
     * If set to `true`, AWS WAF will allow, block, or count requests based on all IP addresses except `192.0.2.44`.
     * 
     */
    @Import(name="negated", required=true)
      private final Output<Boolean> negated;

    public Output<Boolean> getNegated() {
        return this.negated;
    }

    /**
     * The type of predicate in a rule. Valid values: `ByteMatch`, `GeoMatch`, `IPMatch`, `RegexMatch`, `SizeConstraint`, `SqlInjectionMatch`, or `XssMatch`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public RulePredicateGetArgs(
        Output<String> dataId,
        Output<Boolean> negated,
        Output<String> type) {
        this.dataId = Objects.requireNonNull(dataId, "expected parameter 'dataId' to be non-null");
        this.negated = Objects.requireNonNull(negated, "expected parameter 'negated' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RulePredicateGetArgs() {
        this.dataId = Output.empty();
        this.negated = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulePredicateGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataId;
        private Output<Boolean> negated;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RulePredicateGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataId = defaults.dataId;
    	      this.negated = defaults.negated;
    	      this.type = defaults.type;
        }

        public Builder dataId(Output<String> dataId) {
            this.dataId = Objects.requireNonNull(dataId);
            return this;
        }

        public Builder dataId(String dataId) {
            this.dataId = Output.of(Objects.requireNonNull(dataId));
            return this;
        }

        public Builder negated(Output<Boolean> negated) {
            this.negated = Objects.requireNonNull(negated);
            return this;
        }

        public Builder negated(Boolean negated) {
            this.negated = Output.of(Objects.requireNonNull(negated));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public RulePredicateGetArgs build() {
            return new RulePredicateGetArgs(dataId, negated, type);
        }
    }
}
