// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigqueryreservation_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.bigqueryreservation_v1.outputs.StatusResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetCapacityCommitmentResult {
    /**
     * The end of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    private final String commitmentEndTime;
    /**
     * The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    private final String commitmentStartTime;
    /**
     * For FAILED commitment plan, provides the reason of failure.
     * 
     */
    private final StatusResponse failureStatus;
    /**
     * The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123`
     * 
     */
    private final String name;
    /**
     * Capacity commitment commitment plan.
     * 
     */
    private final String plan;
    /**
     * The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for ANNUAL and TRIAL commitments.
     * 
     */
    private final String renewalPlan;
    /**
     * Number of slots in this commitment.
     * 
     */
    private final String slotCount;
    /**
     * State of the commitment.
     * 
     */
    private final String state;

    @OutputCustomType.Constructor({"commitmentEndTime","commitmentStartTime","failureStatus","name","plan","renewalPlan","slotCount","state"})
    private GetCapacityCommitmentResult(
        String commitmentEndTime,
        String commitmentStartTime,
        StatusResponse failureStatus,
        String name,
        String plan,
        String renewalPlan,
        String slotCount,
        String state) {
        this.commitmentEndTime = Objects.requireNonNull(commitmentEndTime);
        this.commitmentStartTime = Objects.requireNonNull(commitmentStartTime);
        this.failureStatus = Objects.requireNonNull(failureStatus);
        this.name = Objects.requireNonNull(name);
        this.plan = Objects.requireNonNull(plan);
        this.renewalPlan = Objects.requireNonNull(renewalPlan);
        this.slotCount = Objects.requireNonNull(slotCount);
        this.state = Objects.requireNonNull(state);
    }

    /**
     * The end of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    public String getCommitmentEndTime() {
        return this.commitmentEndTime;
    }
    /**
     * The start of the current commitment period. It is applicable only for ACTIVE capacity commitments.
     * 
     */
    public String getCommitmentStartTime() {
        return this.commitmentStartTime;
    }
    /**
     * For FAILED commitment plan, provides the reason of failure.
     * 
     */
    public StatusResponse getFailureStatus() {
        return this.failureStatus;
    }
    /**
     * The resource name of the capacity commitment, e.g., `projects/myproject/locations/US/capacityCommitments/123`
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Capacity commitment commitment plan.
     * 
     */
    public String getPlan() {
        return this.plan;
    }
    /**
     * The plan this capacity commitment is converted to after commitment_end_time passes. Once the plan is changed, committed period is extended according to commitment plan. Only applicable for ANNUAL and TRIAL commitments.
     * 
     */
    public String getRenewalPlan() {
        return this.renewalPlan;
    }
    /**
     * Number of slots in this commitment.
     * 
     */
    public String getSlotCount() {
        return this.slotCount;
    }
    /**
     * State of the commitment.
     * 
     */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapacityCommitmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String commitmentEndTime;
        private String commitmentStartTime;
        private StatusResponse failureStatus;
        private String name;
        private String plan;
        private String renewalPlan;
        private String slotCount;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapacityCommitmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commitmentEndTime = defaults.commitmentEndTime;
    	      this.commitmentStartTime = defaults.commitmentStartTime;
    	      this.failureStatus = defaults.failureStatus;
    	      this.name = defaults.name;
    	      this.plan = defaults.plan;
    	      this.renewalPlan = defaults.renewalPlan;
    	      this.slotCount = defaults.slotCount;
    	      this.state = defaults.state;
        }

        public Builder setCommitmentEndTime(String commitmentEndTime) {
            this.commitmentEndTime = Objects.requireNonNull(commitmentEndTime);
            return this;
        }

        public Builder setCommitmentStartTime(String commitmentStartTime) {
            this.commitmentStartTime = Objects.requireNonNull(commitmentStartTime);
            return this;
        }

        public Builder setFailureStatus(StatusResponse failureStatus) {
            this.failureStatus = Objects.requireNonNull(failureStatus);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPlan(String plan) {
            this.plan = Objects.requireNonNull(plan);
            return this;
        }

        public Builder setRenewalPlan(String renewalPlan) {
            this.renewalPlan = Objects.requireNonNull(renewalPlan);
            return this;
        }

        public Builder setSlotCount(String slotCount) {
            this.slotCount = Objects.requireNonNull(slotCount);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetCapacityCommitmentResult build() {
            return new GetCapacityCommitmentResult(commitmentEndTime, commitmentStartTime, failureStatus, name, plan, renewalPlan, slotCount, state);
        }
    }
}
