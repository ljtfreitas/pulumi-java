// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementRuleGroupReferenceStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRuleGroupReferenceStatementArgs Empty = new WebAclRuleStatementRuleGroupReferenceStatementArgs();

    /**
     * The Amazon Resource Name (ARN) of the `aws.wafv2.RuleGroup` resource.
     * 
     */
    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> getArn() {
        return this.arn;
    }

    /**
     * The `rules` whose actions are set to `COUNT` by the web ACL, regardless of the action that is set on the rule. See Excluded Rule below for details.
     * 
     */
    @Import(name="excludedRules")
      private final @Nullable Output<List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs>> excludedRules;

    public Output<List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs>> getExcludedRules() {
        return this.excludedRules == null ? Output.empty() : this.excludedRules;
    }

    public WebAclRuleStatementRuleGroupReferenceStatementArgs(
        Output<String> arn,
        @Nullable Output<List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs>> excludedRules) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.excludedRules = excludedRules;
    }

    private WebAclRuleStatementRuleGroupReferenceStatementArgs() {
        this.arn = Output.empty();
        this.excludedRules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementRuleGroupReferenceStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;
        private @Nullable Output<List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs>> excludedRules;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementRuleGroupReferenceStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.excludedRules = defaults.excludedRules;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }

        public Builder excludedRules(@Nullable Output<List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs>> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }

        public Builder excludedRules(@Nullable List<WebAclRuleStatementRuleGroupReferenceStatementExcludedRuleArgs> excludedRules) {
            this.excludedRules = Output.ofNullable(excludedRules);
            return this;
        }
        public WebAclRuleStatementRuleGroupReferenceStatementArgs build() {
            return new WebAclRuleStatementRuleGroupReferenceStatementArgs(arn, excludedRules);
        }
    }
}
