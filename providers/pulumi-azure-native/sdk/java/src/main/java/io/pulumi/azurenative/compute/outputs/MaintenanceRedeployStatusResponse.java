// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MaintenanceRedeployStatusResponse {
    /**
     * True, if customer is allowed to perform Maintenance.
     * 
     */
    private final @Nullable Boolean isCustomerInitiatedMaintenanceAllowed;
    /**
     * Message returned for the last Maintenance Operation.
     * 
     */
    private final @Nullable String lastOperationMessage;
    /**
     * The Last Maintenance Operation Result Code.
     * 
     */
    private final @Nullable String lastOperationResultCode;
    /**
     * End Time for the Maintenance Window.
     * 
     */
    private final @Nullable String maintenanceWindowEndTime;
    /**
     * Start Time for the Maintenance Window.
     * 
     */
    private final @Nullable String maintenanceWindowStartTime;
    /**
     * End Time for the Pre Maintenance Window.
     * 
     */
    private final @Nullable String preMaintenanceWindowEndTime;
    /**
     * Start Time for the Pre Maintenance Window.
     * 
     */
    private final @Nullable String preMaintenanceWindowStartTime;

    @OutputCustomType.Constructor({"isCustomerInitiatedMaintenanceAllowed","lastOperationMessage","lastOperationResultCode","maintenanceWindowEndTime","maintenanceWindowStartTime","preMaintenanceWindowEndTime","preMaintenanceWindowStartTime"})
    private MaintenanceRedeployStatusResponse(
        @Nullable Boolean isCustomerInitiatedMaintenanceAllowed,
        @Nullable String lastOperationMessage,
        @Nullable String lastOperationResultCode,
        @Nullable String maintenanceWindowEndTime,
        @Nullable String maintenanceWindowStartTime,
        @Nullable String preMaintenanceWindowEndTime,
        @Nullable String preMaintenanceWindowStartTime) {
        this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
        this.lastOperationMessage = lastOperationMessage;
        this.lastOperationResultCode = lastOperationResultCode;
        this.maintenanceWindowEndTime = maintenanceWindowEndTime;
        this.maintenanceWindowStartTime = maintenanceWindowStartTime;
        this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
        this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
    }

    /**
     * True, if customer is allowed to perform Maintenance.
     * 
     */
    public Optional<Boolean> getIsCustomerInitiatedMaintenanceAllowed() {
        return Optional.ofNullable(this.isCustomerInitiatedMaintenanceAllowed);
    }
    /**
     * Message returned for the last Maintenance Operation.
     * 
     */
    public Optional<String> getLastOperationMessage() {
        return Optional.ofNullable(this.lastOperationMessage);
    }
    /**
     * The Last Maintenance Operation Result Code.
     * 
     */
    public Optional<String> getLastOperationResultCode() {
        return Optional.ofNullable(this.lastOperationResultCode);
    }
    /**
     * End Time for the Maintenance Window.
     * 
     */
    public Optional<String> getMaintenanceWindowEndTime() {
        return Optional.ofNullable(this.maintenanceWindowEndTime);
    }
    /**
     * Start Time for the Maintenance Window.
     * 
     */
    public Optional<String> getMaintenanceWindowStartTime() {
        return Optional.ofNullable(this.maintenanceWindowStartTime);
    }
    /**
     * End Time for the Pre Maintenance Window.
     * 
     */
    public Optional<String> getPreMaintenanceWindowEndTime() {
        return Optional.ofNullable(this.preMaintenanceWindowEndTime);
    }
    /**
     * Start Time for the Pre Maintenance Window.
     * 
     */
    public Optional<String> getPreMaintenanceWindowStartTime() {
        return Optional.ofNullable(this.preMaintenanceWindowStartTime);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceRedeployStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isCustomerInitiatedMaintenanceAllowed;
        private @Nullable String lastOperationMessage;
        private @Nullable String lastOperationResultCode;
        private @Nullable String maintenanceWindowEndTime;
        private @Nullable String maintenanceWindowStartTime;
        private @Nullable String preMaintenanceWindowEndTime;
        private @Nullable String preMaintenanceWindowStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(MaintenanceRedeployStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCustomerInitiatedMaintenanceAllowed = defaults.isCustomerInitiatedMaintenanceAllowed;
    	      this.lastOperationMessage = defaults.lastOperationMessage;
    	      this.lastOperationResultCode = defaults.lastOperationResultCode;
    	      this.maintenanceWindowEndTime = defaults.maintenanceWindowEndTime;
    	      this.maintenanceWindowStartTime = defaults.maintenanceWindowStartTime;
    	      this.preMaintenanceWindowEndTime = defaults.preMaintenanceWindowEndTime;
    	      this.preMaintenanceWindowStartTime = defaults.preMaintenanceWindowStartTime;
        }

        public Builder setIsCustomerInitiatedMaintenanceAllowed(@Nullable Boolean isCustomerInitiatedMaintenanceAllowed) {
            this.isCustomerInitiatedMaintenanceAllowed = isCustomerInitiatedMaintenanceAllowed;
            return this;
        }

        public Builder setLastOperationMessage(@Nullable String lastOperationMessage) {
            this.lastOperationMessage = lastOperationMessage;
            return this;
        }

        public Builder setLastOperationResultCode(@Nullable String lastOperationResultCode) {
            this.lastOperationResultCode = lastOperationResultCode;
            return this;
        }

        public Builder setMaintenanceWindowEndTime(@Nullable String maintenanceWindowEndTime) {
            this.maintenanceWindowEndTime = maintenanceWindowEndTime;
            return this;
        }

        public Builder setMaintenanceWindowStartTime(@Nullable String maintenanceWindowStartTime) {
            this.maintenanceWindowStartTime = maintenanceWindowStartTime;
            return this;
        }

        public Builder setPreMaintenanceWindowEndTime(@Nullable String preMaintenanceWindowEndTime) {
            this.preMaintenanceWindowEndTime = preMaintenanceWindowEndTime;
            return this;
        }

        public Builder setPreMaintenanceWindowStartTime(@Nullable String preMaintenanceWindowStartTime) {
            this.preMaintenanceWindowStartTime = preMaintenanceWindowStartTime;
            return this;
        }
        public MaintenanceRedeployStatusResponse build() {
            return new MaintenanceRedeployStatusResponse(isCustomerInitiatedMaintenanceAllowed, lastOperationMessage, lastOperationResultCode, maintenanceWindowEndTime, maintenanceWindowStartTime, preMaintenanceWindowEndTime, preMaintenanceWindowStartTime);
        }
    }
}
