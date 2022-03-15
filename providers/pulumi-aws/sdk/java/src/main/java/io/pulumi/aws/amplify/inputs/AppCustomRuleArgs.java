// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppCustomRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppCustomRuleArgs Empty = new AppCustomRuleArgs();

    /**
     * The condition for a URL rewrite or redirect rule, such as a country code.
     * 
     */
    @Import(name="condition")
      private final @Nullable Output<String> condition;

    public Output<String> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * The source pattern for a URL rewrite or redirect rule.
     * 
     */
    @Import(name="source", required=true)
      private final Output<String> source;

    public Output<String> getSource() {
        return this.source;
    }

    /**
     * The status code for a URL rewrite or redirect rule. Valid values: `200`, `301`, `302`, `404`, `404-200`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * The target pattern for a URL rewrite or redirect rule.
     * 
     */
    @Import(name="target", required=true)
      private final Output<String> target;

    public Output<String> getTarget() {
        return this.target;
    }

    public AppCustomRuleArgs(
        @Nullable Output<String> condition,
        Output<String> source,
        @Nullable Output<String> status,
        Output<String> target) {
        this.condition = condition;
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.status = status;
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private AppCustomRuleArgs() {
        this.condition = Output.empty();
        this.source = Output.empty();
        this.status = Output.empty();
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppCustomRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> condition;
        private Output<String> source;
        private @Nullable Output<String> status;
        private Output<String> target;

        public Builder() {
    	      // Empty
        }

        public Builder(AppCustomRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.source = defaults.source;
    	      this.status = defaults.status;
    	      this.target = defaults.target;
        }

        public Builder condition(@Nullable Output<String> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable String condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder source(Output<String> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder source(String source) {
            this.source = Output.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }

        public Builder target(Output<String> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }

        public Builder target(String target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }
        public AppCustomRuleArgs build() {
            return new AppCustomRuleArgs(condition, source, status, target);
        }
    }
}
