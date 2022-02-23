// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionSnsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionSnsGetArgs Empty = new TopicRuleErrorActionSnsGetArgs();

    /**
     * The message format of the message to publish. Accepted values are "JSON" and "RAW".
     * 
     */
    @InputImport(name="messageFormat")
    private final @Nullable Input<String> messageFormat;

    public Input<String> getMessageFormat() {
        return this.messageFormat == null ? Input.empty() : this.messageFormat;
    }

    /**
     * The ARN of the IAM role that grants access.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The ARN of the SNS topic.
     * 
     */
    @InputImport(name="targetArn", required=true)
    private final Input<String> targetArn;

    public Input<String> getTargetArn() {
        return this.targetArn;
    }

    public TopicRuleErrorActionSnsGetArgs(
        @Nullable Input<String> messageFormat,
        Input<String> roleArn,
        Input<String> targetArn) {
        this.messageFormat = messageFormat;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private TopicRuleErrorActionSnsGetArgs() {
        this.messageFormat = Input.empty();
        this.roleArn = Input.empty();
        this.targetArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionSnsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> messageFormat;
        private Input<String> roleArn;
        private Input<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionSnsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.messageFormat = defaults.messageFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder setMessageFormat(@Nullable Input<String> messageFormat) {
            this.messageFormat = messageFormat;
            return this;
        }

        public Builder setMessageFormat(@Nullable String messageFormat) {
            this.messageFormat = Input.ofNullable(messageFormat);
            return this;
        }

        public Builder setRoleArn(Input<String> roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Input.of(Objects.requireNonNull(roleArn));
            return this;
        }

        public Builder setTargetArn(Input<String> targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }

        public Builder setTargetArn(String targetArn) {
            this.targetArn = Input.of(Objects.requireNonNull(targetArn));
            return this;
        }
        public TopicRuleErrorActionSnsGetArgs build() {
            return new TopicRuleErrorActionSnsGetArgs(messageFormat, roleArn, targetArn);
        }
    }
}
