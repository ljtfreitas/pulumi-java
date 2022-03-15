// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.gameservices_v1.enums.RuleAction;
import io.pulumi.googlenative.gameservices_v1.inputs.ConditionArgs;
import io.pulumi.googlenative.gameservices_v1.inputs.LogConfigArgs;
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
    @Import(name="action")
      private final @Nullable Output<RuleAction> action;

    public Output<RuleAction> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * Additional restrictions that must be met. All conditions must pass for the rule to match.
     * 
     */
    @Import(name="conditions")
      private final @Nullable Output<List<ConditionArgs>> conditions;

    public Output<List<ConditionArgs>> getConditions() {
        return this.conditions == null ? Output.empty() : this.conditions;
    }

    /**
     * Human-readable description of the rule.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
     * 
     */
    @Import(name="in")
      private final @Nullable Output<List<String>> in;

    public Output<List<String>> getIn() {
        return this.in == null ? Output.empty() : this.in;
    }

    /**
     * The config returned to callers of CheckPolicy for any entries that match the LOG action.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<List<LogConfigArgs>> logConfig;

    public Output<List<LogConfigArgs>> getLogConfig() {
        return this.logConfig == null ? Output.empty() : this.logConfig;
    }

    /**
     * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at in the Local IAM documentation (see go/local-iam#features).
     * 
     */
    @Import(name="notIn")
      private final @Nullable Output<List<String>> notIn;

    public Output<List<String>> getNotIn() {
        return this.notIn == null ? Output.empty() : this.notIn;
    }

    /**
     * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<List<String>> permissions;

    public Output<List<String>> getPermissions() {
        return this.permissions == null ? Output.empty() : this.permissions;
    }

    public RuleArgs(
        @Nullable Output<RuleAction> action,
        @Nullable Output<List<ConditionArgs>> conditions,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> in,
        @Nullable Output<List<LogConfigArgs>> logConfig,
        @Nullable Output<List<String>> notIn,
        @Nullable Output<List<String>> permissions) {
        this.action = action;
        this.conditions = conditions;
        this.description = description;
        this.in = in;
        this.logConfig = logConfig;
        this.notIn = notIn;
        this.permissions = permissions;
    }

    private RuleArgs() {
        this.action = Output.empty();
        this.conditions = Output.empty();
        this.description = Output.empty();
        this.in = Output.empty();
        this.logConfig = Output.empty();
        this.notIn = Output.empty();
        this.permissions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuleAction> action;
        private @Nullable Output<List<ConditionArgs>> conditions;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> in;
        private @Nullable Output<List<LogConfigArgs>> logConfig;
        private @Nullable Output<List<String>> notIn;
        private @Nullable Output<List<String>> permissions;

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

        public Builder action(@Nullable Output<RuleAction> action) {
            this.action = action;
            return this;
        }

        public Builder action(@Nullable RuleAction action) {
            this.action = Output.ofNullable(action);
            return this;
        }

        public Builder conditions(@Nullable Output<List<ConditionArgs>> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder conditions(@Nullable List<ConditionArgs> conditions) {
            this.conditions = Output.ofNullable(conditions);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder in(@Nullable Output<List<String>> in) {
            this.in = in;
            return this;
        }

        public Builder in(@Nullable List<String> in) {
            this.in = Output.ofNullable(in);
            return this;
        }

        public Builder logConfig(@Nullable Output<List<LogConfigArgs>> logConfig) {
            this.logConfig = logConfig;
            return this;
        }

        public Builder logConfig(@Nullable List<LogConfigArgs> logConfig) {
            this.logConfig = Output.ofNullable(logConfig);
            return this;
        }

        public Builder notIn(@Nullable Output<List<String>> notIn) {
            this.notIn = notIn;
            return this;
        }

        public Builder notIn(@Nullable List<String> notIn) {
            this.notIn = Output.ofNullable(notIn);
            return this;
        }

        public Builder permissions(@Nullable Output<List<String>> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(@Nullable List<String> permissions) {
            this.permissions = Output.ofNullable(permissions);
            return this;
        }
        public RuleArgs build() {
            return new RuleArgs(action, conditions, description, in, logConfig, notIn, permissions);
        }
    }
}
