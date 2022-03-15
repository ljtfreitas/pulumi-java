// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupScope;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRuleGroupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRuleGroupArgs Empty = new GetRuleGroupArgs();

    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    @Import(name="scope", required=true)
      private final RuleGroupScope scope;

    public RuleGroupScope getScope() {
        return this.scope;
    }

    public GetRuleGroupArgs(
        String id,
        String name,
        RuleGroupScope scope) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetRuleGroupArgs() {
        this.id = null;
        this.name = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRuleGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private RuleGroupScope scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRuleGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder scope(RuleGroupScope scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetRuleGroupArgs build() {
            return new GetRuleGroupArgs(id, name, scope);
        }
    }
}
