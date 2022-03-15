// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleStopActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleStopActionArgs Empty = new ReceiptRuleStopActionArgs();

    /**
     * The position of the action in the receipt rule
     * 
     */
    @Import(name="position", required=true)
      private final Output<Integer> position;

    public Output<Integer> getPosition() {
        return this.position;
    }

    /**
     * The scope to apply
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @Import(name="topicArn")
      private final @Nullable Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn == null ? Output.empty() : this.topicArn;
    }

    public ReceiptRuleStopActionArgs(
        Output<Integer> position,
        Output<String> scope,
        @Nullable Output<String> topicArn) {
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.topicArn = topicArn;
    }

    private ReceiptRuleStopActionArgs() {
        this.position = Output.empty();
        this.scope = Output.empty();
        this.topicArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleStopActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> position;
        private Output<String> scope;
        private @Nullable Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleStopActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.position = defaults.position;
    	      this.scope = defaults.scope;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder position(Output<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder position(Integer position) {
            this.position = Output.of(Objects.requireNonNull(position));
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

        public Builder topicArn(@Nullable Output<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        public Builder topicArn(@Nullable String topicArn) {
            this.topicArn = Output.ofNullable(topicArn);
            return this;
        }
        public ReceiptRuleStopActionArgs build() {
            return new ReceiptRuleStopActionArgs(position, scope, topicArn);
        }
    }
}
