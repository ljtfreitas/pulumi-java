// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.vmmigration_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * ReplicationSync contain information about the last replica sync to the cloud.
 * 
 */
public final class ReplicationSyncResponse extends io.pulumi.resources.InvokeArgs {

    public static final ReplicationSyncResponse Empty = new ReplicationSyncResponse();

    /**
     * The most updated snapshot created time in the source that finished replication.
     * 
     */
    @Import(name="lastSyncTime", required=true)
      private final String lastSyncTime;

    public String getLastSyncTime() {
        return this.lastSyncTime;
    }

    public ReplicationSyncResponse(String lastSyncTime) {
        this.lastSyncTime = Objects.requireNonNull(lastSyncTime, "expected parameter 'lastSyncTime' to be non-null");
    }

    private ReplicationSyncResponse() {
        this.lastSyncTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationSyncResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastSyncTime;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationSyncResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastSyncTime = defaults.lastSyncTime;
        }

        public Builder lastSyncTime(String lastSyncTime) {
            this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
            return this;
        }
        public ReplicationSyncResponse build() {
            return new ReplicationSyncResponse(lastSyncTime);
        }
    }
}
