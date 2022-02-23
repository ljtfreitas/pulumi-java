// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GeoReplicationStatsResponse {
    /**
     * A boolean flag which indicates whether or not account failover is supported for the account.
     * 
     */
    private final Boolean canFailover;
    /**
     * All primary writes preceding this UTC date/time value are guaranteed to be available for read operations. Primary writes following this point in time may or may not be available for reads. Element may be default value if value of LastSyncTime is not available, this can happen if secondary is offline or we are in bootstrap.
     * 
     */
    private final String lastSyncTime;
    /**
     * The status of the secondary location. Possible values are: - Live: Indicates that the secondary location is active and operational. - Bootstrap: Indicates initial synchronization from the primary location to the secondary location is in progress.This typically occurs when replication is first enabled. - Unavailable: Indicates that the secondary location is temporarily unavailable.
     * 
     */
    private final String status;

    @OutputCustomType.Constructor({"canFailover","lastSyncTime","status"})
    private GeoReplicationStatsResponse(
        Boolean canFailover,
        String lastSyncTime,
        String status) {
        this.canFailover = Objects.requireNonNull(canFailover);
        this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
        this.status = Objects.requireNonNull(status);
    }

    /**
     * A boolean flag which indicates whether or not account failover is supported for the account.
     * 
     */
    public Boolean getCanFailover() {
        return this.canFailover;
    }
    /**
     * All primary writes preceding this UTC date/time value are guaranteed to be available for read operations. Primary writes following this point in time may or may not be available for reads. Element may be default value if value of LastSyncTime is not available, this can happen if secondary is offline or we are in bootstrap.
     * 
     */
    public String getLastSyncTime() {
        return this.lastSyncTime;
    }
    /**
     * The status of the secondary location. Possible values are: - Live: Indicates that the secondary location is active and operational. - Bootstrap: Indicates initial synchronization from the primary location to the secondary location is in progress.This typically occurs when replication is first enabled. - Unavailable: Indicates that the secondary location is temporarily unavailable.
     * 
     */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GeoReplicationStatsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean canFailover;
        private String lastSyncTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(GeoReplicationStatsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canFailover = defaults.canFailover;
    	      this.lastSyncTime = defaults.lastSyncTime;
    	      this.status = defaults.status;
        }

        public Builder setCanFailover(Boolean canFailover) {
            this.canFailover = Objects.requireNonNull(canFailover);
            return this;
        }

        public Builder setLastSyncTime(String lastSyncTime) {
            this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GeoReplicationStatsResponse build() {
            return new GeoReplicationStatsResponse(canFailover, lastSyncTime, status);
        }
    }
}
