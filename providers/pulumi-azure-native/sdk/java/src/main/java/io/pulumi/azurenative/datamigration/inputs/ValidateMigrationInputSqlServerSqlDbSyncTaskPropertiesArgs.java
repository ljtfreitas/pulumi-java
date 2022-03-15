// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ValidateSyncMigrationInputSqlServerTaskInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for task that validates migration input for SQL to Azure SQL DB sync migrations
 * 
 */
public final class ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs Empty = new ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<ValidateSyncMigrationInputSqlServerTaskInputArgs> input;

    public Output<ValidateSyncMigrationInputSqlServerTaskInputArgs> getInput() {
        return this.input == null ? Output.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'ValidateMigrationInput.SqlServer.SqlDb.Sync'.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> getTaskType() {
        return this.taskType;
    }

    public ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs(
        @Nullable Output<ValidateSyncMigrationInputSqlServerTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs() {
        this.input = Output.empty();
        this.taskType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ValidateSyncMigrationInputSqlServerTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<ValidateSyncMigrationInputSqlServerTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable ValidateSyncMigrationInputSqlServerTaskInputArgs input) {
            this.input = Output.ofNullable(input);
            return this;
        }

        public Builder taskType(Output<String> taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }

        public Builder taskType(String taskType) {
            this.taskType = Output.of(Objects.requireNonNull(taskType));
            return this;
        }
        public ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs build() {
            return new ValidateMigrationInputSqlServerSqlDbSyncTaskPropertiesArgs(input, taskType);
        }
    }
}
