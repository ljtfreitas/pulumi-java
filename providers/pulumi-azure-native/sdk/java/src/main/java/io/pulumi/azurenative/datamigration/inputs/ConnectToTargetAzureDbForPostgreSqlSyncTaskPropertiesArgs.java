// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ConnectToTargetAzureDbForPostgreSqlSyncTaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that validates connection to Azure Database For PostgreSQL server and target server requirements for online migration
 * 
 */
public final class ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs Empty = new ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
    private final @Nullable Input<ConnectToTargetAzureDbForPostgreSqlSyncTaskInputArgs> input;

    public Input<ConnectToTargetAzureDbForPostgreSqlSyncTaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ConnectToTarget.AzureDbForPostgreSql.Sync'.
     * 
     */
    @InputImport(name="taskType", required=true)
    private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs(
        @Nullable Input<ConnectToTargetAzureDbForPostgreSqlSyncTaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ConnectToTargetAzureDbForPostgreSqlSyncTaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder setInput(@Nullable Input<ConnectToTargetAzureDbForPostgreSqlSyncTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable ConnectToTargetAzureDbForPostgreSqlSyncTaskInputArgs input) {
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

        public ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs build() {
            return new ConnectToTargetAzureDbForPostgreSqlSyncTaskPropertiesArgs(input, taskType);
        }
    }
}
