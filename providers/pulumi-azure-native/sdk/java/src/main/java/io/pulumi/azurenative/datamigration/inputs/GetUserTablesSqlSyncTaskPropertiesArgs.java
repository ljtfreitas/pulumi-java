// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.GetUserTablesSqlSyncTaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that collects user tables for the given list of databases
 * 
 */
public final class GetUserTablesSqlSyncTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final GetUserTablesSqlSyncTaskPropertiesArgs Empty = new GetUserTablesSqlSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
    private final @Nullable Input<GetUserTablesSqlSyncTaskInputArgs> input;

    public Input<GetUserTablesSqlSyncTaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'GetUserTables.AzureSqlDb.Sync'.
     * 
     */
    @InputImport(name="taskType", required=true)
    private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public GetUserTablesSqlSyncTaskPropertiesArgs(
        @Nullable Input<GetUserTablesSqlSyncTaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private GetUserTablesSqlSyncTaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<GetUserTablesSqlSyncTaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlSyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder setInput(@Nullable Input<GetUserTablesSqlSyncTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable GetUserTablesSqlSyncTaskInputArgs input) {
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

        public GetUserTablesSqlSyncTaskPropertiesArgs build() {
            return new GetUserTablesSqlSyncTaskPropertiesArgs(input, taskType);
        }
    }
}
