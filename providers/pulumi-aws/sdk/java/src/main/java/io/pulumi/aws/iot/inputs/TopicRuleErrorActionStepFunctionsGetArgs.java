// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TopicRuleErrorActionStepFunctionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionStepFunctionsGetArgs Empty = new TopicRuleErrorActionStepFunctionsGetArgs();

    /**
     * The prefix used to generate, along with a UUID, the unique state machine execution name.
     * 
     */
    @InputImport(name="executionNamePrefix")
    private final @Nullable Input<String> executionNamePrefix;

    public Input<String> getExecutionNamePrefix() {
        return this.executionNamePrefix == null ? Input.empty() : this.executionNamePrefix;
    }

    /**
     * The ARN of the IAM role that grants access to start execution of the state machine.
     * 
     */
    @InputImport(name="roleArn", required=true)
    private final Input<String> roleArn;

    public Input<String> getRoleArn() {
        return this.roleArn;
    }

    /**
     * The name of the Step Functions state machine whose execution will be started.
     * 
     */
    @InputImport(name="stateMachineName", required=true)
    private final Input<String> stateMachineName;

    public Input<String> getStateMachineName() {
        return this.stateMachineName;
    }

    public TopicRuleErrorActionStepFunctionsGetArgs(
        @Nullable Input<String> executionNamePrefix,
        Input<String> roleArn,
        Input<String> stateMachineName) {
        this.executionNamePrefix = executionNamePrefix;
        this.roleArn = Objects.requireNonNull(roleArn, "expected parameter 'roleArn' to be non-null");
        this.stateMachineName = Objects.requireNonNull(stateMachineName, "expected parameter 'stateMachineName' to be non-null");
    }

    private TopicRuleErrorActionStepFunctionsGetArgs() {
        this.executionNamePrefix = Input.empty();
        this.roleArn = Input.empty();
        this.stateMachineName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionStepFunctionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> executionNamePrefix;
        private Input<String> roleArn;
        private Input<String> stateMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionStepFunctionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionNamePrefix = defaults.executionNamePrefix;
    	      this.roleArn = defaults.roleArn;
    	      this.stateMachineName = defaults.stateMachineName;
        }

        public Builder setExecutionNamePrefix(@Nullable Input<String> executionNamePrefix) {
            this.executionNamePrefix = executionNamePrefix;
            return this;
        }

        public Builder setExecutionNamePrefix(@Nullable String executionNamePrefix) {
            this.executionNamePrefix = Input.ofNullable(executionNamePrefix);
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

        public Builder setStateMachineName(Input<String> stateMachineName) {
            this.stateMachineName = Objects.requireNonNull(stateMachineName);
            return this;
        }

        public Builder setStateMachineName(String stateMachineName) {
            this.stateMachineName = Input.of(Objects.requireNonNull(stateMachineName));
            return this;
        }
        public TopicRuleErrorActionStepFunctionsGetArgs build() {
            return new TopicRuleErrorActionStepFunctionsGetArgs(executionNamePrefix, roleArn, stateMachineName);
        }
    }
}
