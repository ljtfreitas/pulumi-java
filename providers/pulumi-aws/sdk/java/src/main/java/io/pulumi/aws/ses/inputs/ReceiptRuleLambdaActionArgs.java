// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ses.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReceiptRuleLambdaActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReceiptRuleLambdaActionArgs Empty = new ReceiptRuleLambdaActionArgs();

    /**
     * The ARN of the Lambda function to invoke
     * 
     */
    @InputImport(name="functionArn", required=true)
    private final Input<String> functionArn;

    public Input<String> getFunctionArn() {
        return this.functionArn;
    }

    /**
     * `Event` or `RequestResponse`
     * 
     */
    @InputImport(name="invocationType")
    private final @Nullable Input<String> invocationType;

    public Input<String> getInvocationType() {
        return this.invocationType == null ? Input.empty() : this.invocationType;
    }

    /**
     * The position of the action in the receipt rule
     * 
     */
    @InputImport(name="position", required=true)
    private final Input<Integer> position;

    public Input<Integer> getPosition() {
        return this.position;
    }

    /**
     * The ARN of an SNS topic to notify
     * 
     */
    @InputImport(name="topicArn")
    private final @Nullable Input<String> topicArn;

    public Input<String> getTopicArn() {
        return this.topicArn == null ? Input.empty() : this.topicArn;
    }

    public ReceiptRuleLambdaActionArgs(
        Input<String> functionArn,
        @Nullable Input<String> invocationType,
        Input<Integer> position,
        @Nullable Input<String> topicArn) {
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
        this.invocationType = invocationType;
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
        this.topicArn = topicArn;
    }

    private ReceiptRuleLambdaActionArgs() {
        this.functionArn = Input.empty();
        this.invocationType = Input.empty();
        this.position = Input.empty();
        this.topicArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReceiptRuleLambdaActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> functionArn;
        private @Nullable Input<String> invocationType;
        private Input<Integer> position;
        private @Nullable Input<String> topicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ReceiptRuleLambdaActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
    	      this.invocationType = defaults.invocationType;
    	      this.position = defaults.position;
    	      this.topicArn = defaults.topicArn;
        }

        public Builder setFunctionArn(Input<String> functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }

        public Builder setFunctionArn(String functionArn) {
            this.functionArn = Input.of(Objects.requireNonNull(functionArn));
            return this;
        }

        public Builder setInvocationType(@Nullable Input<String> invocationType) {
            this.invocationType = invocationType;
            return this;
        }

        public Builder setInvocationType(@Nullable String invocationType) {
            this.invocationType = Input.ofNullable(invocationType);
            return this;
        }

        public Builder setPosition(Input<Integer> position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }

        public Builder setPosition(Integer position) {
            this.position = Input.of(Objects.requireNonNull(position));
            return this;
        }

        public Builder setTopicArn(@Nullable Input<String> topicArn) {
            this.topicArn = topicArn;
            return this;
        }

        public Builder setTopicArn(@Nullable String topicArn) {
            this.topicArn = Input.ofNullable(topicArn);
            return this;
        }
        public ReceiptRuleLambdaActionArgs build() {
            return new ReceiptRuleLambdaActionArgs(functionArn, invocationType, position, topicArn);
        }
    }
}
