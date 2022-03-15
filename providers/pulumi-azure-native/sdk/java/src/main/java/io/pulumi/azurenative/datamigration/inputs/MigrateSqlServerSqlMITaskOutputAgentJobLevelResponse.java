// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse Empty = new MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse();

    /**
     * Migration end time
     * 
     */
    @Import(name="endedOn", required=true)
      private final String endedOn;

    public String getEndedOn() {
        return this.endedOn;
    }

    /**
     * Migration errors and warnings per job
     * 
     */
    @Import(name="exceptionsAndWarnings", required=true)
      private final List<ReportableExceptionResponse> exceptionsAndWarnings;

    public List<ReportableExceptionResponse> getExceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The state of the original Agent Job.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * Migration progress message
     * 
     */
    @Import(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * Agent Job name.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Result type
     * Expected value is 'AgentJobLevelOutput'.
     * 
     */
    @Import(name="resultType", required=true)
      private final String resultType;

    public String getResultType() {
        return this.resultType;
    }

    /**
     * Migration start time
     * 
     */
    @Import(name="startedOn", required=true)
      private final String startedOn;

    public String getStartedOn() {
        return this.startedOn;
    }

    /**
     * Current state of migration
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    public MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse(
        String endedOn,
        List<ReportableExceptionResponse> exceptionsAndWarnings,
        String id,
        Boolean isEnabled,
        String message,
        String name,
        String resultType,
        String startedOn,
        String state) {
        this.endedOn = Objects.requireNonNull(endedOn, "expected parameter 'endedOn' to be non-null");
        this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings, "expected parameter 'exceptionsAndWarnings' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resultType = Objects.requireNonNull(resultType, "expected parameter 'resultType' to be non-null");
        this.startedOn = Objects.requireNonNull(startedOn, "expected parameter 'startedOn' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse() {
        this.endedOn = null;
        this.exceptionsAndWarnings = List.of();
        this.id = null;
        this.isEnabled = null;
        this.message = null;
        this.name = null;
        this.resultType = null;
        this.startedOn = null;
        this.state = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endedOn;
        private List<ReportableExceptionResponse> exceptionsAndWarnings;
        private String id;
        private Boolean isEnabled;
        private String message;
        private String name;
        private String resultType;
        private String startedOn;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endedOn = defaults.endedOn;
    	      this.exceptionsAndWarnings = defaults.exceptionsAndWarnings;
    	      this.id = defaults.id;
    	      this.isEnabled = defaults.isEnabled;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.resultType = defaults.resultType;
    	      this.startedOn = defaults.startedOn;
    	      this.state = defaults.state;
        }

        public Builder endedOn(String endedOn) {
            this.endedOn = Objects.requireNonNull(endedOn);
            return this;
        }

        public Builder exceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resultType(String resultType) {
            this.resultType = Objects.requireNonNull(resultType);
            return this;
        }

        public Builder startedOn(String startedOn) {
            this.startedOn = Objects.requireNonNull(startedOn);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse build() {
            return new MigrateSqlServerSqlMITaskOutputAgentJobLevelResponse(endedOn, exceptionsAndWarnings, id, isEnabled, message, name, resultType, startedOn, state);
        }
    }
}
