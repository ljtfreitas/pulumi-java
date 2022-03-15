// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlDbTaskInputArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for the task that migrates on-prem SQL Server databases to Azure SQL Database
 * 
 */
public final class MigrateSqlServerSqlDbTaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlDbTaskPropertiesArgs Empty = new MigrateSqlServerSqlDbTaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable Output<MigrateSqlServerSqlDbTaskInputArgs> input;

    public Output<MigrateSqlServerSqlDbTaskInputArgs> getInput() {
        return this.input == null ? Output.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'Migrate.SqlServer.SqlDb'.
     * 
     */
    @Import(name="taskType", required=true)
      private final Output<String> taskType;

    public Output<String> getTaskType() {
        return this.taskType;
    }

    public MigrateSqlServerSqlDbTaskPropertiesArgs(
        @Nullable Output<MigrateSqlServerSqlDbTaskInputArgs> input,
        Output<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private MigrateSqlServerSqlDbTaskPropertiesArgs() {
        this.input = Output.empty();
        this.taskType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlDbTaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MigrateSqlServerSqlDbTaskInputArgs> input;
        private Output<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlDbTaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder input(@Nullable Output<MigrateSqlServerSqlDbTaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder input(@Nullable MigrateSqlServerSqlDbTaskInputArgs input) {
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
        public MigrateSqlServerSqlDbTaskPropertiesArgs build() {
            return new MigrateSqlServerSqlDbTaskPropertiesArgs(input, taskType);
        }
    }
}
