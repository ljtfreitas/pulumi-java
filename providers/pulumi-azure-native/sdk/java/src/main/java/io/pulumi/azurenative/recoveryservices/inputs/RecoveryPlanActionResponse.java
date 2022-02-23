// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanAutomationRunbookActionDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanManualActionDetailsResponse;
import io.pulumi.azurenative.recoveryservices.inputs.RecoveryPlanScriptActionDetailsResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Recovery plan action details.
 * 
 */
public final class RecoveryPlanActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final RecoveryPlanActionResponse Empty = new RecoveryPlanActionResponse();

    /**
     * The action name.
     * 
     */
    @InputImport(name="actionName", required=true)
        private final String actionName;

    public String getActionName() {
        return this.actionName;
    }

    /**
     * The custom details.
     * 
     */
    @InputImport(name="customDetails", required=true)
        private final Object customDetails;

    public Object getCustomDetails() {
        return this.customDetails;
    }

    /**
     * The list of failover directions.
     * 
     */
    @InputImport(name="failoverDirections", required=true)
        private final List<String> failoverDirections;

    public List<String> getFailoverDirections() {
        return this.failoverDirections;
    }

    /**
     * The list of failover types.
     * 
     */
    @InputImport(name="failoverTypes", required=true)
        private final List<String> failoverTypes;

    public List<String> getFailoverTypes() {
        return this.failoverTypes;
    }

    public RecoveryPlanActionResponse(
        String actionName,
        Object customDetails,
        List<String> failoverDirections,
        List<String> failoverTypes) {
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
        this.customDetails = Objects.requireNonNull(customDetails, "expected parameter 'customDetails' to be non-null");
        this.failoverDirections = Objects.requireNonNull(failoverDirections, "expected parameter 'failoverDirections' to be non-null");
        this.failoverTypes = Objects.requireNonNull(failoverTypes, "expected parameter 'failoverTypes' to be non-null");
    }

    private RecoveryPlanActionResponse() {
        this.actionName = null;
        this.customDetails = null;
        this.failoverDirections = List.of();
        this.failoverTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String actionName;
        private Object customDetails;
        private List<String> failoverDirections;
        private List<String> failoverTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.customDetails = defaults.customDetails;
    	      this.failoverDirections = defaults.failoverDirections;
    	      this.failoverTypes = defaults.failoverTypes;
        }

        public Builder setActionName(String actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }

        public Builder setCustomDetails(Object customDetails) {
            this.customDetails = Objects.requireNonNull(customDetails);
            return this;
        }

        public Builder setFailoverDirections(List<String> failoverDirections) {
            this.failoverDirections = Objects.requireNonNull(failoverDirections);
            return this;
        }

        public Builder setFailoverTypes(List<String> failoverTypes) {
            this.failoverTypes = Objects.requireNonNull(failoverTypes);
            return this;
        }
        public RecoveryPlanActionResponse build() {
            return new RecoveryPlanActionResponse(actionName, customDetails, failoverDirections, failoverTypes);
        }
    }
}
