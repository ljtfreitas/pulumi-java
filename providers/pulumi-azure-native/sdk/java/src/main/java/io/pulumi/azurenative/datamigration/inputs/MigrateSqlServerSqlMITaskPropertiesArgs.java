// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateSqlServerSqlMITaskInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for task that migrates SQL Server databases to Azure SQL Database Managed Instance
 * 
 */
public final class MigrateSqlServerSqlMITaskPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MigrateSqlServerSqlMITaskPropertiesArgs Empty = new MigrateSqlServerSqlMITaskPropertiesArgs();

    /**
     * Task input
     * 
     */
    @InputImport(name="input")
        private final @Nullable Input<MigrateSqlServerSqlMITaskInputArgs> input;

    public Input<MigrateSqlServerSqlMITaskInputArgs> getInput() {
        return this.input == null ? Input.empty() : this.input;
    }

    /**
     * Task type.
     * Expected value is 'Migrate.SqlServer.AzureSqlDbMI'.
     * 
     */
    @InputImport(name="taskType", required=true)
        private final Input<String> taskType;

    public Input<String> getTaskType() {
        return this.taskType;
    }

    public MigrateSqlServerSqlMITaskPropertiesArgs(
        @Nullable Input<MigrateSqlServerSqlMITaskInputArgs> input,
        Input<String> taskType) {
        this.input = input;
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private MigrateSqlServerSqlMITaskPropertiesArgs() {
        this.input = Input.empty();
        this.taskType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<MigrateSqlServerSqlMITaskInputArgs> input;
        private Input<String> taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.input = defaults.input;
    	      this.taskType = defaults.taskType;
        }

        public Builder setInput(@Nullable Input<MigrateSqlServerSqlMITaskInputArgs> input) {
            this.input = input;
            return this;
        }

        public Builder setInput(@Nullable MigrateSqlServerSqlMITaskInputArgs input) {
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
        public MigrateSqlServerSqlMITaskPropertiesArgs build() {
            return new MigrateSqlServerSqlMITaskPropertiesArgs(input, taskType);
        }
    }
}
