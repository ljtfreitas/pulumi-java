// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Dataproc job status.
 * 
 */
public final class JobStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobStatusResponse Empty = new JobStatusResponse();

    /**
     * Optional. Output only. Job state details, such as an error description if the state is ERROR.
     * 
     */
    @Import(name="details", required=true)
      private final String details;

    public String getDetails() {
        return this.details;
    }

    /**
     * A state message specifying the overall job state.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * The time when this state was entered.
     * 
     */
    @Import(name="stateStartTime", required=true)
      private final String stateStartTime;

    public String getStateStartTime() {
        return this.stateStartTime;
    }

    /**
     * Additional state information, which includes status reported by the agent.
     * 
     */
    @Import(name="substate", required=true)
      private final String substate;

    public String getSubstate() {
        return this.substate;
    }

    public JobStatusResponse(
        String details,
        String state,
        String stateStartTime,
        String substate) {
        this.details = Objects.requireNonNull(details, "expected parameter 'details' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateStartTime = Objects.requireNonNull(stateStartTime, "expected parameter 'stateStartTime' to be non-null");
        this.substate = Objects.requireNonNull(substate, "expected parameter 'substate' to be non-null");
    }

    private JobStatusResponse() {
        this.details = null;
        this.state = null;
        this.stateStartTime = null;
        this.substate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String details;
        private String state;
        private String stateStartTime;
        private String substate;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.state = defaults.state;
    	      this.stateStartTime = defaults.stateStartTime;
    	      this.substate = defaults.substate;
        }

        public Builder details(String details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder stateStartTime(String stateStartTime) {
            this.stateStartTime = Objects.requireNonNull(stateStartTime);
            return this;
        }

        public Builder substate(String substate) {
            this.substate = Objects.requireNonNull(substate);
            return this;
        }
        public JobStatusResponse build() {
            return new JobStatusResponse(details, state, stateStartTime, substate);
        }
    }
}
