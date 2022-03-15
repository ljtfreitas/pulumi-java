// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.azurenative.migrate.inputs.DatabaseProjectSummaryResponse;
import io.pulumi.azurenative.migrate.inputs.ServersProjectSummaryResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class for migrate project properties.
 * 
 */
public final class MigrateProjectPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MigrateProjectPropertiesResponse Empty = new MigrateProjectPropertiesResponse();

    /**
     * Gets the last time the project summary was refreshed.
     * 
     */
    @Import(name="lastSummaryRefreshedTime", required=true)
      private final String lastSummaryRefreshedTime;

    public String getLastSummaryRefreshedTime() {
        return this.lastSummaryRefreshedTime;
    }

    /**
     * Provisioning state of the migrate project.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * Gets the refresh summary state.
     * 
     */
    @Import(name="refreshSummaryState", required=true)
      private final String refreshSummaryState;

    public String getRefreshSummaryState() {
        return this.refreshSummaryState;
    }

    /**
     * Gets or sets the list of tools registered with the migrate project.
     * 
     */
    @Import(name="registeredTools")
      private final @Nullable List<String> registeredTools;

    public List<String> getRegisteredTools() {
        return this.registeredTools == null ? List.of() : this.registeredTools;
    }

    /**
     * Gets the summary of the migrate project.
     * 
     */
    @Import(name="summary", required=true)
      private final Map<String,Either<DatabaseProjectSummaryResponse,ServersProjectSummaryResponse>> summary;

    public Map<String,Either<DatabaseProjectSummaryResponse,ServersProjectSummaryResponse>> getSummary() {
        return this.summary;
    }

    public MigrateProjectPropertiesResponse(
        String lastSummaryRefreshedTime,
        @Nullable String provisioningState,
        String refreshSummaryState,
        @Nullable List<String> registeredTools,
        Map<String,Either<DatabaseProjectSummaryResponse,ServersProjectSummaryResponse>> summary) {
        this.lastSummaryRefreshedTime = Objects.requireNonNull(lastSummaryRefreshedTime, "expected parameter 'lastSummaryRefreshedTime' to be non-null");
        this.provisioningState = provisioningState;
        this.refreshSummaryState = Objects.requireNonNull(refreshSummaryState, "expected parameter 'refreshSummaryState' to be non-null");
        this.registeredTools = registeredTools;
        this.summary = Objects.requireNonNull(summary, "expected parameter 'summary' to be non-null");
    }

    private MigrateProjectPropertiesResponse() {
        this.lastSummaryRefreshedTime = null;
        this.provisioningState = null;
        this.refreshSummaryState = null;
        this.registeredTools = List.of();
        this.summary = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrateProjectPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastSummaryRefreshedTime;
        private @Nullable String provisioningState;
        private String refreshSummaryState;
        private @Nullable List<String> registeredTools;
        private Map<String,Either<DatabaseProjectSummaryResponse,ServersProjectSummaryResponse>> summary;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrateProjectPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastSummaryRefreshedTime = defaults.lastSummaryRefreshedTime;
    	      this.provisioningState = defaults.provisioningState;
    	      this.refreshSummaryState = defaults.refreshSummaryState;
    	      this.registeredTools = defaults.registeredTools;
    	      this.summary = defaults.summary;
        }

        public Builder lastSummaryRefreshedTime(String lastSummaryRefreshedTime) {
            this.lastSummaryRefreshedTime = Objects.requireNonNull(lastSummaryRefreshedTime);
            return this;
        }

        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder refreshSummaryState(String refreshSummaryState) {
            this.refreshSummaryState = Objects.requireNonNull(refreshSummaryState);
            return this;
        }

        public Builder registeredTools(@Nullable List<String> registeredTools) {
            this.registeredTools = registeredTools;
            return this;
        }

        public Builder summary(Map<String,Either<DatabaseProjectSummaryResponse,ServersProjectSummaryResponse>> summary) {
            this.summary = Objects.requireNonNull(summary);
            return this;
        }
        public MigrateProjectPropertiesResponse build() {
            return new MigrateProjectPropertiesResponse(lastSummaryRefreshedTime, provisioningState, refreshSummaryState, registeredTools, summary);
        }
    }
}
