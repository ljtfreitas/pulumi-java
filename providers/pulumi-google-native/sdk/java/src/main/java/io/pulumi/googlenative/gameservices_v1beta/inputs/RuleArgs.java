// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1beta.enums.RuleAction;
import io.pulumi.googlenative.gameservices_v1beta.inputs.ConditionArgs;
import io.pulumi.googlenative.gameservices_v1beta.inputs.LogConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule to be applied in a Policy.
 * 
 */
public final class RuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleArgs Empty = new RuleArgs();

    /**
     * Required
     * 
     */
    @InputImport(name="action")
      private final @Nullable Input<RuleAction> action;

    public Input<RuleAction> getAction() {
        return this.action == null ? Input.empty() : this.action;
    }

    /**
     * Additional restrictions that must be met. All conditions must pass for the rule to match.
     * 
     */
    @InputImport(name="conditions")
      private final @Nullable Input<List<ConditionArgs>> conditions;

    public Input<List<ConditionArgs>> getConditions() {
        return this.conditions == null ? Input.empty() : this.conditions;
    }

    /**
     * Human-readable description of the rule.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
     * 
     */
    @InputImport(name="in")
      private final @Nullable Input<List<String>> in;

    public Input<List<String>> getIn() {
        return this.in == null ? Input.empty() : this.in;
    }

    /**
     * The config returned to callers of CheckPolicy for any entries that match the LOG action.
     * 
     */
    @InputImport(name="logConfig")
      private final @Nullable Input<List<LogConfigArgs>> logConfig;

    public Input<List<LogConfigArgs>> getLogConfig() {
        return this.logConfig == null ? Input.empty() : this.logConfig;
    }

    /**
     * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at in the Local IAM documentation (see go/local-iam#features).
     * 
     */
    @InputImport(name="notIn")
      private final @Nullable Input<List<String>> notIn;

    public Input<List<String>> getNotIn() {
        return this.notIn == null ? Input.empty() : this.notIn;
    }

    /**
     * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
     * 
     */
    @InputImport(name="permissions")
      private final @Nullable Input<List<String>> permissions;

    public Input<List<String>> getPermissions() {
        return this.permissions == null ? Input.empty() : this.permissions;
    }

    public RuleArgs(
        @Nullable Input<RuleAction> action,
        @Nullable Input<List<ConditionArgs>> conditions,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> in,
        @Nullable Input<List<LogConfigArgs>> logConfig,
        @Nullable Input<List<String>> notIn,
        @Nullable Input<List<String>> permissions) {
        this.action = action;
        this.conditions = conditions;
        this.description = description;
        this.in = in;
        this.logConfig = logConfig;
        this.notIn = notIn;
        this.permissions = permissions;
    }

    private RuleArgs() {
        this.action = Input.empty();
        this.conditions = Input.empty();
        this.description = Input.empty();
        this.in = Input.empty();
        this.logConfig = Input.empty();
        this.notIn = Input.empty();
        this.permissions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleAction> action;
        private @Nullable Input<List<ConditionArgs>> conditions;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> in;
        private @Nullable Input<List<LogConfigArgs>> logConfig;
        private @Nullable Input<List<String>> notIn;
        private @Nullable Input<List<String>> permissions;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.conditions = defaults.conditions;
    	      this.description = defaults.description;
    	      this.in = defaults.in;
    	      this.logConfig = defaults.logConfig;
    	      this.notIn = defaults.notIn;
    	      this.permissions = defaults.permissions;
        }

        public Builder setAction(@Nullable Input<RuleAction> action) {
            this.action = action;
            return this;
        }

        public Builder setAction(@Nullable RuleAction action) {
            this.action = Input.ofNullable(action);
            return this;
        }

        public Builder setConditions(@Nullable Input<List<ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setConditions(@Nullable List<ConditionArgs> conditions) {
            this.conditions = Input.ofNullable(conditions);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIn(@Nullable Input<List<String>> in) {
            this.in = in;
            return this;
        }

        public Builder setIn(@Nullable List<String> in) {
            this.in = Input.ofNullable(in);
            return this;
        }

        public Builder setLogConfig(@Nullable Input<List<LogConfigArgs>> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder setLogConfig(@Nullable List<LogConfigArgs> logConfig) {
            this.logConfig = Input.ofNullable(logConfig);
            return this;
        }

        public Builder setNotIn(@Nullable Input<List<String>> notIn) {
            this.notIn = notIn;
            return this;
        }

        public Builder setNotIn(@Nullable List<String> notIn) {
            this.notIn = Input.ofNullable(notIn);
            return this;
        }

        public Builder setPermissions(@Nullable Input<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder setPermissions(@Nullable List<String> permissions) {
            this.permissions = Input.ofNullable(permissions);
            return this;
        }
        public RuleArgs build() {
            return new RuleArgs(action, conditions, description, in, logConfig, notIn, permissions);
        }
    }
}
