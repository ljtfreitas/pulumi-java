// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.enums.PossibleOperationsDirections;
import io.pulumi.azurenative.recoveryservices.enums.ReplicationProtectedItemOperation;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Recovery plan action details.
 * 
 */
public final class RecoveryPlanActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final RecoveryPlanActionArgs Empty = new RecoveryPlanActionArgs();

    /**
     * The action name.
     * 
     */
    @InputImport(name="actionName", required=true)
        private final Input<String> actionName;

    public Input<String> getActionName() {
        return this.actionName;
    }

    /**
     * The list of failover directions.
     * 
     */
    @InputImport(name="failoverDirections", required=true)
        private final Input<List<Either<String,PossibleOperationsDirections>>> failoverDirections;

    public Input<List<Either<String,PossibleOperationsDirections>>> getFailoverDirections() {
        return this.failoverDirections;
    }

    /**
     * The list of failover types.
     * 
     */
    @InputImport(name="failoverTypes", required=true)
        private final Input<List<Either<String,ReplicationProtectedItemOperation>>> failoverTypes;

    public Input<List<Either<String,ReplicationProtectedItemOperation>>> getFailoverTypes() {
        return this.failoverTypes;
    }

    public RecoveryPlanActionArgs(
        Input<String> actionName,
        Input<List<Either<String,PossibleOperationsDirections>>> failoverDirections,
        Input<List<Either<String,ReplicationProtectedItemOperation>>> failoverTypes) {
        this.actionName = Objects.requireNonNull(actionName, "expected parameter 'actionName' to be non-null");
        this.failoverDirections = Objects.requireNonNull(failoverDirections, "expected parameter 'failoverDirections' to be non-null");
        this.failoverTypes = Objects.requireNonNull(failoverTypes, "expected parameter 'failoverTypes' to be non-null");
    }

    private RecoveryPlanActionArgs() {
        this.actionName = Input.empty();
        this.failoverDirections = Input.empty();
        this.failoverTypes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecoveryPlanActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> actionName;
        private Input<List<Either<String,PossibleOperationsDirections>>> failoverDirections;
        private Input<List<Either<String,ReplicationProtectedItemOperation>>> failoverTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(RecoveryPlanActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionName = defaults.actionName;
    	      this.failoverDirections = defaults.failoverDirections;
    	      this.failoverTypes = defaults.failoverTypes;
        }

        public Builder setActionName(Input<String> actionName) {
            this.actionName = Objects.requireNonNull(actionName);
            return this;
        }

        public Builder setActionName(String actionName) {
            this.actionName = Input.of(Objects.requireNonNull(actionName));
            return this;
        }

        public Builder setFailoverDirections(Input<List<Either<String,PossibleOperationsDirections>>> failoverDirections) {
            this.failoverDirections = Objects.requireNonNull(failoverDirections);
            return this;
        }

        public Builder setFailoverDirections(List<Either<String,PossibleOperationsDirections>> failoverDirections) {
            this.failoverDirections = Input.of(Objects.requireNonNull(failoverDirections));
            return this;
        }

        public Builder setFailoverTypes(Input<List<Either<String,ReplicationProtectedItemOperation>>> failoverTypes) {
            this.failoverTypes = Objects.requireNonNull(failoverTypes);
            return this;
        }

        public Builder setFailoverTypes(List<Either<String,ReplicationProtectedItemOperation>> failoverTypes) {
            this.failoverTypes = Input.of(Objects.requireNonNull(failoverTypes));
            return this;
        }
        public RecoveryPlanActionArgs build() {
            return new RecoveryPlanActionArgs(actionName, failoverDirections, failoverTypes);
        }
    }
}
