// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Additional information on Azure Sql specific protected item.
 * 
 */
public final class AzureSqlProtectedItemExtendedInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureSqlProtectedItemExtendedInfoArgs Empty = new AzureSqlProtectedItemExtendedInfoArgs();

    /**
     * The oldest backup copy available for this item in the service.
     * 
     */
    @InputImport(name="oldestRecoveryPoint")
    private final @Nullable Input<String> oldestRecoveryPoint;

    public Input<String> getOldestRecoveryPoint() {
        return this.oldestRecoveryPoint == null ? Input.empty() : this.oldestRecoveryPoint;
    }

    /**
     * State of the backup policy associated with this backup item.
     * 
     */
    @InputImport(name="policyState")
    private final @Nullable Input<String> policyState;

    public Input<String> getPolicyState() {
        return this.policyState == null ? Input.empty() : this.policyState;
    }

    /**
     * Number of available backup copies associated with this backup item.
     * 
     */
    @InputImport(name="recoveryPointCount")
    private final @Nullable Input<Integer> recoveryPointCount;

    public Input<Integer> getRecoveryPointCount() {
        return this.recoveryPointCount == null ? Input.empty() : this.recoveryPointCount;
    }

    public AzureSqlProtectedItemExtendedInfoArgs(
        @Nullable Input<String> oldestRecoveryPoint,
        @Nullable Input<String> policyState,
        @Nullable Input<Integer> recoveryPointCount) {
        this.oldestRecoveryPoint = oldestRecoveryPoint;
        this.policyState = policyState;
        this.recoveryPointCount = recoveryPointCount;
    }

    private AzureSqlProtectedItemExtendedInfoArgs() {
        this.oldestRecoveryPoint = Input.empty();
        this.policyState = Input.empty();
        this.recoveryPointCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureSqlProtectedItemExtendedInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> oldestRecoveryPoint;
        private @Nullable Input<String> policyState;
        private @Nullable Input<Integer> recoveryPointCount;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureSqlProtectedItemExtendedInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oldestRecoveryPoint = defaults.oldestRecoveryPoint;
    	      this.policyState = defaults.policyState;
    	      this.recoveryPointCount = defaults.recoveryPointCount;
        }

        public Builder setOldestRecoveryPoint(@Nullable Input<String> oldestRecoveryPoint) {
            this.oldestRecoveryPoint = oldestRecoveryPoint;
            return this;
        }

        public Builder setOldestRecoveryPoint(@Nullable String oldestRecoveryPoint) {
            this.oldestRecoveryPoint = Input.ofNullable(oldestRecoveryPoint);
            return this;
        }

        public Builder setPolicyState(@Nullable Input<String> policyState) {
            this.policyState = policyState;
            return this;
        }

        public Builder setPolicyState(@Nullable String policyState) {
            this.policyState = Input.ofNullable(policyState);
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Input<Integer> recoveryPointCount) {
            this.recoveryPointCount = recoveryPointCount;
            return this;
        }

        public Builder setRecoveryPointCount(@Nullable Integer recoveryPointCount) {
            this.recoveryPointCount = Input.ofNullable(recoveryPointCount);
            return this;
        }

        public AzureSqlProtectedItemExtendedInfoArgs build() {
            return new AzureSqlProtectedItemExtendedInfoArgs(oldestRecoveryPoint, policyState, recoveryPointCount);
        }
    }
}
