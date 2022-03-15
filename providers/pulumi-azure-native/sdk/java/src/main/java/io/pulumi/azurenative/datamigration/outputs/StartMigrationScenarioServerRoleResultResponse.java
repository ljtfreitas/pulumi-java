// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.azurenative.datamigration.outputs.ReportableExceptionResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StartMigrationScenarioServerRoleResultResponse {
    /**
     * Migration exceptions and warnings.
     * 
     */
    private final List<ReportableExceptionResponse> exceptionsAndWarnings;
    /**
     * Name of server role.
     * 
     */
    private final String name;
    /**
     * Current state of migration
     * 
     */
    private final String state;

    @CustomType.Constructor
    private StartMigrationScenarioServerRoleResultResponse(
        @CustomType.Parameter("exceptionsAndWarnings") List<ReportableExceptionResponse> exceptionsAndWarnings,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state) {
        this.exceptionsAndWarnings = exceptionsAndWarnings;
        this.name = name;
        this.state = state;
    }

    /**
     * Migration exceptions and warnings.
     * 
    */
    public List<ReportableExceptionResponse> getExceptionsAndWarnings() {
        return this.exceptionsAndWarnings;
    }
    /**
     * Name of server role.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Current state of migration
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StartMigrationScenarioServerRoleResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ReportableExceptionResponse> exceptionsAndWarnings;
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(StartMigrationScenarioServerRoleResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exceptionsAndWarnings = defaults.exceptionsAndWarnings;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder exceptionsAndWarnings(List<ReportableExceptionResponse> exceptionsAndWarnings) {
            this.exceptionsAndWarnings = Objects.requireNonNull(exceptionsAndWarnings);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public StartMigrationScenarioServerRoleResultResponse build() {
            return new StartMigrationScenarioServerRoleResultResponse(exceptionsAndWarnings, name, state);
        }
    }
}
