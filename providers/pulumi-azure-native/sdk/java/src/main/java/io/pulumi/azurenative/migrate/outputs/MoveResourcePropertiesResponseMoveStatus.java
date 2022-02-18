// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.azurenative.migrate.outputs.JobStatusResponse;
import io.pulumi.azurenative.migrate.outputs.MoveResourceErrorResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class MoveResourcePropertiesResponseMoveStatus {
    /**
     * An error response from the azure resource mover service.
     * 
     */
    private final @Nullable MoveResourceErrorResponse errors;
    /**
     * Defines the job status.
     * 
     */
    private final @Nullable JobStatusResponse jobStatus;
    /**
     * Defines the MoveResource states.
     * 
     */
    private final String moveState;

    @OutputCustomType.Constructor({"errors","jobStatus","moveState"})
    private MoveResourcePropertiesResponseMoveStatus(
        @Nullable MoveResourceErrorResponse errors,
        @Nullable JobStatusResponse jobStatus,
        String moveState) {
        this.errors = errors;
        this.jobStatus = jobStatus;
        this.moveState = Objects.requireNonNull(moveState);
    }

    /**
     * An error response from the azure resource mover service.
     * 
     */
    public Optional<MoveResourceErrorResponse> getErrors() {
        return Optional.ofNullable(this.errors);
    }
    /**
     * Defines the job status.
     * 
     */
    public Optional<JobStatusResponse> getJobStatus() {
        return Optional.ofNullable(this.jobStatus);
    }
    /**
     * Defines the MoveResource states.
     * 
     */
    public String getMoveState() {
        return this.moveState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MoveResourcePropertiesResponseMoveStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MoveResourceErrorResponse errors;
        private @Nullable JobStatusResponse jobStatus;
        private String moveState;

        public Builder() {
    	      // Empty
        }

        public Builder(MoveResourcePropertiesResponseMoveStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.errors = defaults.errors;
    	      this.jobStatus = defaults.jobStatus;
    	      this.moveState = defaults.moveState;
        }

        public Builder setErrors(@Nullable MoveResourceErrorResponse errors) {
            this.errors = errors;
            return this;
        }

        public Builder setJobStatus(@Nullable JobStatusResponse jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        public Builder setMoveState(String moveState) {
            this.moveState = Objects.requireNonNull(moveState);
            return this;
        }

        public MoveResourcePropertiesResponseMoveStatus build() {
            return new MoveResourcePropertiesResponseMoveStatus(errors, jobStatus, moveState);
        }
    }
}
