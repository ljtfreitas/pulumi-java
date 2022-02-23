// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLExcludedRuleArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebACLRuleGroupReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLRuleGroupReferenceStatementArgs Empty = new WebACLRuleGroupReferenceStatementArgs();

    @InputImport(name="arn", required=true)
        private final Input<String> arn;

    public Input<String> getArn() {
        return this.arn;
    }

    @InputImport(name="excludedRules")
        private final @Nullable Input<List<WebACLExcludedRuleArgs>> excludedRules;

    public Input<List<WebACLExcludedRuleArgs>> getExcludedRules() {
        return this.excludedRules == null ? Input.empty() : this.excludedRules;
    }

    public WebACLRuleGroupReferenceStatementArgs(
        Input<String> arn,
        @Nullable Input<List<WebACLExcludedRuleArgs>> excludedRules) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.excludedRules = excludedRules;
    }

    private WebACLRuleGroupReferenceStatementArgs() {
        this.arn = Input.empty();
        this.excludedRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRuleGroupReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> arn;
        private @Nullable Input<List<WebACLExcludedRuleArgs>> excludedRules;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRuleGroupReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.excludedRules = defaults.excludedRules;
        }

        public Builder setArn(Input<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Input.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder setExcludedRules(@Nullable Input<List<WebACLExcludedRuleArgs>> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }

        public Builder setExcludedRules(@Nullable List<WebACLExcludedRuleArgs> excludedRules) {
            this.excludedRules = Input.ofNullable(excludedRules);
            return this;
        }
        public WebACLRuleGroupReferenceStatementArgs build() {
            return new WebACLRuleGroupReferenceStatementArgs(arn, excludedRules);
        }
    }
}
