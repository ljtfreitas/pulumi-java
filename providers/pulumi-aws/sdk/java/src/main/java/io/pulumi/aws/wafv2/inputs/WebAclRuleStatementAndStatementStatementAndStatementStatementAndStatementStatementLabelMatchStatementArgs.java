// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs Empty = new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs();

    /**
     * The string to match against.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Specify whether you want to match using the label name or just the namespace. Valid values are `LABEL` or `NAMESPACE`.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs(
        Output<String> key,
        Output<String> scope) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs() {
        this.key = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs build() {
            return new WebAclRuleStatementAndStatementStatementAndStatementStatementAndStatementStatementLabelMatchStatementArgs(key, scope);
        }
    }
}
