// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.aws.elasticsearch.inputs.GetDomainAutoTuneOptionMaintenanceSchedule;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDomainAutoTuneOption extends io.pulumi.resources.InvokeArgs {

    public static final GetDomainAutoTuneOption Empty = new GetDomainAutoTuneOption();

    /**
     * The Auto-Tune desired state for the domain.
     * 
     */
    @InputImport(name="desiredState", required=true)
    private final String desiredState;

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * A list of the nested configurations for the Auto-Tune maintenance windows of the domain.
     * 
     */
    @InputImport(name="maintenanceSchedules", required=true)
    private final List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules;

    public List<GetDomainAutoTuneOptionMaintenanceSchedule> getMaintenanceSchedules() {
        return this.maintenanceSchedules;
    }

    /**
     * Whether the domain is set to roll back to default Auto-Tune settings when disabling Auto-Tune.
     * 
     */
    @InputImport(name="rollbackOnDisable", required=true)
    private final String rollbackOnDisable;

    public String getRollbackOnDisable() {
        return this.rollbackOnDisable;
    }

    public GetDomainAutoTuneOption(
        String desiredState,
        List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules,
        String rollbackOnDisable) {
        this.desiredState = Objects.requireNonNull(desiredState, "expected parameter 'desiredState' to be non-null");
        this.maintenanceSchedules = Objects.requireNonNull(maintenanceSchedules, "expected parameter 'maintenanceSchedules' to be non-null");
        this.rollbackOnDisable = Objects.requireNonNull(rollbackOnDisable, "expected parameter 'rollbackOnDisable' to be non-null");
    }

    private GetDomainAutoTuneOption() {
        this.desiredState = null;
        this.maintenanceSchedules = List.of();
        this.rollbackOnDisable = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainAutoTuneOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String desiredState;
        private List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules;
        private String rollbackOnDisable;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainAutoTuneOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.desiredState = defaults.desiredState;
    	      this.maintenanceSchedules = defaults.maintenanceSchedules;
    	      this.rollbackOnDisable = defaults.rollbackOnDisable;
        }

        public Builder setDesiredState(String desiredState) {
            this.desiredState = Objects.requireNonNull(desiredState);
            return this;
        }

        public Builder setMaintenanceSchedules(List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules) {
            this.maintenanceSchedules = Objects.requireNonNull(maintenanceSchedules);
            return this;
        }

        public Builder setRollbackOnDisable(String rollbackOnDisable) {
            this.rollbackOnDisable = Objects.requireNonNull(rollbackOnDisable);
            return this;
        }
        public GetDomainAutoTuneOption build() {
            return new GetDomainAutoTuneOption(desiredState, maintenanceSchedules, rollbackOnDisable);
        }
    }
}
