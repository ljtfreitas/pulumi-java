// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.DomainAutoTuneOptionsMaintenanceScheduleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainAutoTuneOptionsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainAutoTuneOptionsGetArgs Empty = new DomainAutoTuneOptionsGetArgs();

    /**
     * The Auto-Tune desired state for the domain. Valid values: `ENABLED` or `DISABLED`.
     * 
     */
    @InputImport(name="desiredState", required=true)
    private final Input<String> desiredState;

    public Input<String> getDesiredState() {
        return this.desiredState;
    }

    /**
     * Configuration block for Auto-Tune maintenance windows. Can be specified multiple times for each maintenance window. Detailed below.
     * 
     */
    @InputImport(name="maintenanceSchedules")
    private final @Nullable Input<List<DomainAutoTuneOptionsMaintenanceScheduleGetArgs>> maintenanceSchedules;

    public Input<List<DomainAutoTuneOptionsMaintenanceScheduleGetArgs>> getMaintenanceSchedules() {
        return this.maintenanceSchedules == null ? Input.empty() : this.maintenanceSchedules;
    }

    /**
     * Whether to roll back to default Auto-Tune settings when disabling Auto-Tune. Valid values: `DEFAULT_ROLLBACK` or `NO_ROLLBACK`.
     * 
     */
    @InputImport(name="rollbackOnDisable")
    private final @Nullable Input<String> rollbackOnDisable;

    public Input<String> getRollbackOnDisable() {
        return this.rollbackOnDisable == null ? Input.empty() : this.rollbackOnDisable;
    }

    public DomainAutoTuneOptionsGetArgs(
        Input<String> desiredState,
        @Nullable Input<List<DomainAutoTuneOptionsMaintenanceScheduleGetArgs>> maintenanceSchedules,
        @Nullable Input<String> rollbackOnDisable) {
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.maintenanceSchedules = maintenanceSchedules;
        this.rollbackOnDisable = rollbackOnDisable;
    }

    private DomainAutoTuneOptionsGetArgs() {
        this.desiredState = Input.empty();
        this.maintenanceSchedules = Input.empty();
        this.rollbackOnDisable = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainAutoTuneOptionsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> desiredState;
        private @Nullable Input<List<DomainAutoTuneOptionsMaintenanceScheduleGetArgs>> maintenanceSchedules;
        private @Nullable Input<String> rollbackOnDisable;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainAutoTuneOptionsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.maintenanceSchedules = defaults.maintenanceSchedules;
    	      this.rollbackOnDisable = defaults.rollbackOnDisable;
        }

        public Builder setDesiredState(Input<String> desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder setDesiredState(String desiredState) {
            this.desiredState = Input.of(Objects.requireNonNull(desiredState));
            return this;
        }

        public Builder setMaintenanceSchedules(@Nullable Input<List<DomainAutoTuneOptionsMaintenanceScheduleGetArgs>> maintenanceSchedules) {
            this.maintenanceSchedules = maintenanceSchedules;
            return this;
        }

        public Builder setMaintenanceSchedules(@Nullable List<DomainAutoTuneOptionsMaintenanceScheduleGetArgs> maintenanceSchedules) {
            this.maintenanceSchedules = Input.ofNullable(maintenanceSchedules);
            return this;
        }

        public Builder setRollbackOnDisable(@Nullable Input<String> rollbackOnDisable) {
            this.rollbackOnDisable = rollbackOnDisable;
            return this;
        }

        public Builder setRollbackOnDisable(@Nullable String rollbackOnDisable) {
            this.rollbackOnDisable = Input.ofNullable(rollbackOnDisable);
            return this;
        }
        public DomainAutoTuneOptionsGetArgs build() {
            return new DomainAutoTuneOptionsGetArgs(desiredState, maintenanceSchedules, rollbackOnDisable);
        }
    }
}
