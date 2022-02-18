// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.inputs.LogRulesResponse;
import io.pulumi.azurenative.logz.inputs.SystemDataResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the properties for a TagRules resource.
 * 
 */
public final class MonitoringTagRulesPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MonitoringTagRulesPropertiesResponse Empty = new MonitoringTagRulesPropertiesResponse();

    /**
     * Set of rules for sending logs for the Monitor resource.
     * 
     */
    @InputImport(name="logRules")
    private final @Nullable LogRulesResponse logRules;

    public Optional<LogRulesResponse> getLogRules() {
        return this.logRules == null ? Optional.empty() : Optional.ofNullable(this.logRules);
    }

    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
     */
    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @InputImport(name="systemData", required=true)
    private final SystemDataResponse systemData;

    public SystemDataResponse getSystemData() {
        return this.systemData;
    }

    public MonitoringTagRulesPropertiesResponse(
        @Nullable LogRulesResponse logRules,
        String provisioningState,
        SystemDataResponse systemData) {
        this.logRules = logRules;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.systemData = Objects.requireNonNull(systemData, "expected parameter 'systemData' to be non-null");
    }

    private MonitoringTagRulesPropertiesResponse() {
        this.logRules = null;
        this.provisioningState = null;
        this.systemData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitoringTagRulesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LogRulesResponse logRules;
        private String provisioningState;
        private SystemDataResponse systemData;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitoringTagRulesPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logRules = defaults.logRules;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
        }

        public Builder setLogRules(@Nullable LogRulesResponse logRules) {
            this.logRules = logRules;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public MonitoringTagRulesPropertiesResponse build() {
            return new MonitoringTagRulesPropertiesResponse(logRules, provisioningState, systemData);
        }
    }
}
