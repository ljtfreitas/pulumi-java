// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ConnectToTargetAzureDbForMySqlTaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to Azure Database for MySQL and target server requirements
 * 
 */
public final class ConnectToTargetAzureDbForMySqlTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetAzureDbForMySqlTaskPropertiesArgs Empty = new ConnectToTargetAzureDbForMySqlTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
    private final @Nullable Input<ConnectToTargetAzureDbForMySqlTaskInputArgs> input;

    public Input<ConnectToTargetAzureDbForMySqlTaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ConnectToTarget.AzureDbForMySql'.
     * 
     */
    @InputImport(name="taskType", required=true)
    private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public ConnectToTargetAzureDbForMySqlTaskPropertiesArgs(
        @Nullable Input<ConnectToTargetAzureDbForMySqlTaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ConnectToTargetAzureDbForMySqlTaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForMySqlTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectToTargetAzureDbForMySqlTaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForMySqlTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder setInput(@Nullable Input<ConnectToTargetAzureDbForMySqlTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable ConnectToTargetAzureDbForMySqlTaskInputArgs input) {
            this.input = Input.ofNullable(input);
            return this;
        }

        public Builder setTaskType(Input<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder setTaskType(String taskType) {
            this.taskType = Input.of(Objects.requireNonNull(taskType));
            return this;
        }

        public ConnectToTargetAzureDbForMySqlTaskPropertiesArgs build() {
            return new ConnectToTargetAzureDbForMySqlTaskPropertiesArgs(input, taskType);
        }
    }
}
