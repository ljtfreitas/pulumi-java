// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleWorkmailActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleWorkmailActionArgs Empty = new ReceiptRuleWorkmailActionArgs();

    /**
     * The ARN of the WorkMail organization
     * 
     */
    @Import(name="organizationArn", required=true)
      private final Output<String> organizationArn;

    public Output<String> getOrganizationArn() {
        return this.organizationArn;
    }

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
     * The ARN of an SNS topic to notify
     * 
     */
    @Import(name="topicArn")
      private final @Nullable Output<String> topicArn;

    public Output<String> getTopicArn() {
        return this.topicArn == null ? Output.empty() : this.topicArn;
    }

    public ReceiptRuleWorkmailActionArgs(
        Output<String> organizationArn,
        Output<Integer> position,
        @Nullable Output<String> topicArn) {
        this.organizationArn = Objects.requireNonNull(organizationArn, "expected parameter 'organizationArn' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.topicArn = topicArn;
    }

    private ReceiptRuleWorkmailActionArgs() {
        this.organizationArn = Output.empty();
        this.position = Output.empty();
        this.topicArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleWorkmailActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> organizationArn;
        private Output<Integer> position;
        private @Nullable Output<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleWorkmailActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.organizationArn = defaults.organizationArn;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder organizationArn(Output<String> organizationArn) {
            this.organizationArn = Objects.requireNonNull(organizationArn);
            return this;
        }

        public Builder organizationArn(String organizationArn) {
            this.organizationArn = Output.of(Objects.requireNonNull(organizationArn));
            return this;
        }

        public Builder position(Output<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder position(Integer position) {
            this.position = Output.of(Objects.requireNonNull(position));
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
        public ReceiptRuleWorkmailActionArgs build() {
            return new ReceiptRuleWorkmailActionArgs(organizationArn, position, topicArn);
        }
    }
}
