// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.MigrateSyncCompleteCommandInputResponse;
import io.pulumi.azurenative.datamigration.outputs.MigrateSyncCompleteCommandOutputResponse;
import io.pulumi.azurenative.datamigration.outputs.ODataErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MigrateSyncCompleteCommandPropertiesResponse {
    /**
     * Command type.
     * Expected value is 'Migrate.Sync.Complete.Database'.
     * 
     */
    private final String commandType;
    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    private final List<ODataErrorResponse> errors;
    /**
     * Command input
     * 
     */
    private final @Nullable MigrateSyncCompleteCommandInputResponse input;
    /**
     * Command output. This is ignored if submitted.
     * 
     */
    private final MigrateSyncCompleteCommandOutputResponse output;
    /**
     * The state of the command. This is ignored if submitted.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"commandType","errors","input","output","state"})
    private MigrateSyncCompleteCommandPropertiesResponse(
        String commandType,
        List<ODataErrorResponse> errors,
        @Nullable MigrateSyncCompleteCommandInputResponse input,
        MigrateSyncCompleteCommandOutputResponse output,
        String state) {
        this.commandType = Objects.requireNonNull(commandType);
        this.errors = Objects.requireNonNull(errors);
        this.input = input;
        this.output = Objects.requireNonNull(output);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * Command type.
     * Expected value is 'Migrate.Sync.Complete.Database'.
     * 
     */
    public String getCommandType() {
        return this.commandType;
    }
    /**
     * Array of errors. This is ignored if submitted.
     * 
     */
    public List<ODataErrorResponse> getErrors() {
        return this.errors;
    }
    /**
     * Command input
     * 
     */
    public Optional<MigrateSyncCompleteCommandInputResponse> getInput() {
        return Optional.ofNullable(this.input);
    }
    /**
     * Command output. This is ignored if submitted.
     * 
     */
    public MigrateSyncCompleteCommandOutputResponse getOutput() {
        return this.output;
    }
    /**
     * The state of the command. This is ignored if submitted.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSyncCompleteCommandPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commandType;
        private List<ODataErrorResponse> errors;
        private @Nullable MigrateSyncCompleteCommandInputResponse input;
        private MigrateSyncCompleteCommandOutputResponse output;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSyncCompleteCommandPropertiesResponse defaults) {
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

        public Builder setInput(@Nullable MigrateSyncCompleteCommandInputResponse input) {
            this.input = input;
            return this;
        }

        public Builder setOutput(MigrateSyncCompleteCommandOutputResponse output) {
            this.output = Objects.requireNonNull(output);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public MigrateSyncCompleteCommandPropertiesResponse build() {
            return new MigrateSyncCompleteCommandPropertiesResponse(commandType, errors, input, output, state);
        }
    }
}
