// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The status of a cluster and its instances.
 * 
 */
public final class ClusterStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterStatusResponse Empty = new ClusterStatusResponse();

    /**
     * Optional details of cluster's state.
     * 
     */
    @Import(name="detail", required=true)
      private final String detail;

    public String getDetail() {
        return this.detail;
    }

    /**
     * The cluster's state.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String getState() {
        return this.state;
    }

    /**
     * Time when this state was entered (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="stateStartTime", required=true)
      private final String stateStartTime;

    public String getStateStartTime() {
        return this.stateStartTime;
    }

    /**
     * Additional state information that includes status reported by the agent.
     * 
     */
    @Import(name="substate", required=true)
      private final String substate;

    public String getSubstate() {
        return this.substate;
    }

    public ClusterStatusResponse(
        String detail,
        String state,
        String stateStartTime,
        String substate) {
        this.detail = Objects.requireNonNull(detail, "expected parameter 'detail' to be non-null");
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.stateStartTime = Objects.requireNonNull(stateStartTime, "expected parameter 'stateStartTime' to be non-null");
        this.substate = Objects.requireNonNull(substate, "expected parameter 'substate' to be non-null");
    }

    private ClusterStatusResponse() {
        this.detail = null;
        this.state = null;
        this.stateStartTime = null;
        this.substate = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String detail;
        private String state;
        private String stateStartTime;
        private String substate;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.detail = defaults.detail;
    	      this.state = defaults.state;
    	      this.stateStartTime = defaults.stateStartTime;
    	      this.substate = defaults.substate;
        }

        public Builder detail(String detail) {
            this.detail = Objects.requireNonNull(detail);
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
        public ClusterStatusResponse build() {
            return new ClusterStatusResponse(detail, state, stateStartTime, substate);
        }
    }
}
