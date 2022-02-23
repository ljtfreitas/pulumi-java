// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandInputResponse;
import io.pulumi.azurenative.datamigration.inputs.MigrateMISyncCompleteCommandOutputResponse;
import io.pulumi.azurenative.datamigration.inputs.ODataErrorResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties for the command that completes online migration for an Azure SQL Database Managed Instance.
 * 
 */
public final class MigrateMISyncCompleteCommandPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateMISyncCompleteCommandPropertiesResponse Empty = new MigrateMISyncCompleteCommandPropertiesResponse();

    /**
     * Command type.
     * Expected value is 'Migrate.SqlServer.AzureDbSqlMi.Complete'.
     * 
     */
    @InputImport(name="commandType", required=true)
        private final String commandType;

    public String getCommandType() {
        return this.commandType;
    }

    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    @InputImport(name="errors", required=true)
        private final List<ODataErrorResponse> errors;

    public List<ODataErrorResponse> getErrors() {
        return this.errors;
    }

    /**
     * Command input
     * 
     */
    @InputImport(name="input")
        private final @Nullable MigrateMISyncCompleteCommandInputResponse input;

    public Optional<MigrateMISyncCompleteCommandInputResponse> getInput() {
        return this.input == null ? Optional.empty() : Optional.ofNullable(this.input);
    }

    /**
     * Command output. This is ignored if submitted.
     * 
     */
    @InputImport(name="output", required=true)
        private final MigrateMISyncCompleteCommandOutputResponse output;

    public MigrateMISyncCompleteCommandOutputResponse getOutput() {
        return this.output;
    }

    /**
     * The state of the command. This is ignored if submitted.
     * 
     */
    @InputImport(name="state", required=true)
        private final String state;

    public String getState() {
        return this.state;
    }

    public MigrateMISyncCompleteCommandPropertiesResponse(
        String commandType,
        List<ODataErrorResponse> errors,
        @Nullable MigrateMISyncCompleteCommandInputResponse input,
        MigrateMISyncCompleteCommandOutputResponse output,
        String state) {
        this.commandType = Objects.requireNonNull(commandType, "expected parameter 'commandType' to be non-null");
        this.errors = Objects.requireNonNull(errors, "expected parameter 'errors' to be non-null");
        this.input = input;
        this.output = Objects.requireNonNull(output, "expected parameter 'output' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private MigrateMISyncCompleteCommandPropertiesResponse() {
        this.commandType = null;
        this.errors = List.of();
        this.input = null;
        this.output = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateMISyncCompleteCommandPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commandType;
        private List<ODataErrorResponse> errors;
        private @Nullable MigrateMISyncCompleteCommandInputResponse input;
        private MigrateMISyncCompleteCommandOutputResponse output;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateMISyncCompleteCommandPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commandType = defaults.commandType;
    	      this.errors = defaults.errors;
    	      this.input = defaults.input;
    	      this.output = defaults.output;
    	      this.state = defaults.state;
        }

        public Builder setCommandType(String commandType) {
            this.commandType = Objects.requireNonNull(commandType);
            return this;
        }

        public Builder setErrors(List<ODataErrorResponse> errors) {
            this.errors = Objects.requireNonNull(errors);
            return this;
        }

        public Builder setInput(@Nullable MigrateMISyncCompleteCommandInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder setOutput(MigrateMISyncCompleteCommandOutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public MigrateMISyncCompleteCommandPropertiesResponse build() {
            return new MigrateMISyncCompleteCommandPropertiesResponse(commandType, errors, input, output, state);
        }
    }
}
