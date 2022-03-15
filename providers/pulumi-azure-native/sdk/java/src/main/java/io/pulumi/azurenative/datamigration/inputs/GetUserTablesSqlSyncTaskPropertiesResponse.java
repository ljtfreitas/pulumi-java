// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.GetUserTablesSqlSyncTaskInputResponse;
import io.pulumi.azurenative.datamigration.inputs.GetUserTablesSqlSyncTaskOutputResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateSyncCompleteCommandPropertiesResponse;
import io.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the task that collects user tables for the given list of databases
 * 
 */
public final class GetUserTablesSqlSyncTaskPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final GetUserTablesSqlSyncTaskPropertiesResponse Empty = new GetUserTablesSqlSyncTaskPropertiesResponse();

    /**
     * Array of command properties.
     * 
     */
    @Import(name="commands", required=true)
      private final List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;

    public List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> getCommands() {
        return this.commands;
    }

    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    @Import(name="errors", required=true)
      private final List<ODataErrorResponse> errors;

    public List<ODataErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Task input
     * 
     */
    @Import(name="input")
      private final @Nullable GetUserTablesSqlSyncTaskInputResponse input;

    public Optional<GetUserTablesSqlSyncTaskInputResponse> getInput() {
        return this.input == null ? Optional.empty() : Optional.ofNullable(this.input);
    }

    /**
     * Task output. This is ignored if submitted.
     * 
     */
    @Import(name="output", required=true)
      private final List<GetUserTablesSqlSyncTaskOutputResponse> output;

    public List<GetUserTablesSqlSyncTaskOutputResponse> getOutput() {
        return this.output;
    }

    /**
     * The state of the task. This is ignored if submitted.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Task type.
     * Expected value is 'GetUserTables.AzureSqlDb.Sync'.
     * 
     */
    @Import(name="taskType", required=true)
      private final String taskType;

    public String getTaskType() {
        return this.taskType;
    }

    public GetUserTablesSqlSyncTaskPropertiesResponse(
        List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands,
        List<ODataErrorResponse> errors,
        @Nullable GetUserTablesSqlSyncTaskInputResponse input,
        List<GetUserTablesSqlSyncTaskOutputResponse> output,
        String state,
        String taskType) {
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.input = input;
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.taskType = Objects.requireNonNull(taskType, "expected parameter 'taskType' to be non-null");
    }

    private GetUserTablesSqlSyncTaskPropertiesResponse() {
        this.commands = List.of();
        this.errors = List.of();
        this.input = null;
        this.output = List.of();
        this.state = null;
        this.taskType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserTablesSqlSyncTaskPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands;
        private List<ODataErrorResponse> errors;
        private @Nullable GetUserTablesSqlSyncTaskInputResponse input;
        private List<GetUserTablesSqlSyncTaskOutputResponse> output;
        private String state;
        private String taskType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserTablesSqlSyncTaskPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commands = defaults.commands;
    	      this.errors = defaults.errors;
    	      this.input = defaults.input;
    	      this.output = defaults.output;
    	      this.state = defaults.state;
    	      this.taskType = defaults.taskType;
        }

        public Builder commands(List<Either<MigrateMISyncCompleteCommandPropertiesResponse,MigrateSyncCompleteCommandPropertiesResponse>> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder errors(List<ODataErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder input(@Nullable GetUserTablesSqlSyncTaskInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder output(List<GetUserTablesSqlSyncTaskOutputResponse> output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder taskType(String taskType) {
            this.taskType = Objects.requireNonNull(taskType);
            return this;
        }
        public GetUserTablesSqlSyncTaskPropertiesResponse build() {
            return new GetUserTablesSqlSyncTaskPropertiesResponse(commands, errors, input, output, state, taskType);
        }
    }
}
