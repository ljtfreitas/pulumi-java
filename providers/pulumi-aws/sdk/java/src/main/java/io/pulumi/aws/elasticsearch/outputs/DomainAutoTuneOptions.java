// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.aws.elasticsearch.outputs.DomainAutoTuneOptionsMaintenanceSchedule;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainAutoTuneOptions {
    /**
     * The Auto-Tune desired state for the domain. Valid values: `ENABLED` or `DISABLED`.
     * 
     */
    private final String desiredState;
    /**
     * Configuration block for Auto-Tune maintenance windows. Can be specified multiple times for each maintenance window. Detailed below.
     * 
     */
    private final @Nullable List<DomainAutoTuneOptionsMaintenanceSchedule> maintenanceSchedules;
    /**
     * Whether to roll back to default Auto-Tune settings when disabling Auto-Tune. Valid values: `DEFAULT_ROLLBACK` or `NO_ROLLBACK`.
     * 
     */
    private final @Nullable String rollbackOnDisable;

    @CustomType.Constructor
    private DomainAutoTuneOptions(
        @CustomType.Parameter("desiredState") String desiredState,
        @CustomType.Parameter("maintenanceSchedules") @Nullable List<DomainAutoTuneOptionsMaintenanceSchedule> maintenanceSchedules,
        @CustomType.Parameter("rollbackOnDisable") @Nullable String rollbackOnDisable) {
        this.desiredState = desiredState;
        this.maintenanceSchedules = maintenanceSchedules;
        this.rollbackOnDisable = rollbackOnDisable;
    }

    /**
     * The Auto-Tune desired state for the domain. Valid values: `ENABLED` or `DISABLED`.
     * 
    */
    public String getDesiredState() {
        return this.desiredState;
    }
    /**
     * Configuration block for Auto-Tune maintenance windows. Can be specified multiple times for each maintenance window. Detailed below.
     * 
    */
    public List<DomainAutoTuneOptionsMaintenanceSchedule> getMaintenanceSchedules() {
        return this.maintenanceSchedules == null ? List.of() : this.maintenanceSchedules;
    }
    /**
     * Whether to roll back to default Auto-Tune settings when disabling Auto-Tune. Valid values: `DEFAULT_ROLLBACK` or `NO_ROLLBACK`.
     * 
    */
    public Optional<String> getRollbackOnDisable() {
        return Optional.ofNullable(this.rollbackOnDisable);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAutoTuneOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String desiredState;
        private @Nullable List<DomainAutoTuneOptionsMaintenanceSchedule> maintenanceSchedules;
        private @Nullable String rollbackOnDisable;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAutoTuneOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.maintenanceSchedules = defaults.maintenanceSchedules;
    	      this.rollbackOnDisable = defaults.rollbackOnDisable;
        }

        public Builder desiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder maintenanceSchedules(@Nullable List<DomainAutoTuneOptionsMaintenanceSchedule> maintenanceSchedules) {
            this.maintenanceSchedules = maintenanceSchedules;
            return this;
        }

        public Builder rollbackOnDisable(@Nullable String rollbackOnDisable) {
            this.rollbackOnDisable = rollbackOnDisable;
            return this;
        }
        public DomainAutoTuneOptions build() {
            return new DomainAutoTuneOptions(desiredState, maintenanceSchedules, rollbackOnDisable);
        }
    }
}
