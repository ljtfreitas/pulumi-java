// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LifecycleConfigResponse {
    /**
     * Optional. The time when cluster will be auto-deleted (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    private final String autoDeleteTime;
    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    private final String autoDeleteTtl;
    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    private final String idleDeleteTtl;
    /**
     * The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    private final String idleStartTime;

    @OutputCustomType.Constructor({"autoDeleteTime","autoDeleteTtl","idleDeleteTtl","idleStartTime"})
    private LifecycleConfigResponse(
        String autoDeleteTime,
        String autoDeleteTtl,
        String idleDeleteTtl,
        String idleStartTime) {
        this.autoDeleteTime = Objects.requireNonNull(autoDeleteTime);
        this.autoDeleteTtl = Objects.requireNonNull(autoDeleteTtl);
        this.idleDeleteTtl = Objects.requireNonNull(idleDeleteTtl);
        this.idleStartTime = Objects.requireNonNull(idleStartTime);
    }

    /**
     * Optional. The time when cluster will be auto-deleted (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public String getAutoDeleteTime() {
        return this.autoDeleteTime;
    }
    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public String getAutoDeleteTtl() {
        return this.autoDeleteTtl;
    }
    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public String getIdleDeleteTtl() {
        return this.idleDeleteTtl;
    }
    /**
     * The time when cluster became idle (most recent job finished) and became eligible for deletion due to idleness (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    public String getIdleStartTime() {
        return this.idleStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoDeleteTime;
        private String autoDeleteTtl;
        private String idleDeleteTtl;
        private String idleStartTime;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteTime = defaults.autoDeleteTime;
    	      this.autoDeleteTtl = defaults.autoDeleteTtl;
    	      this.idleDeleteTtl = defaults.idleDeleteTtl;
    	      this.idleStartTime = defaults.idleStartTime;
        }

        public Builder setAutoDeleteTime(String autoDeleteTime) {
            this.autoDeleteTime = Objects.requireNonNull(autoDeleteTime);
            return this;
        }

        public Builder setAutoDeleteTtl(String autoDeleteTtl) {
            this.autoDeleteTtl = Objects.requireNonNull(autoDeleteTtl);
            return this;
        }

        public Builder setIdleDeleteTtl(String idleDeleteTtl) {
            this.idleDeleteTtl = Objects.requireNonNull(idleDeleteTtl);
            return this;
        }

        public Builder setIdleStartTime(String idleStartTime) {
            this.idleStartTime = Objects.requireNonNull(idleStartTime);
            return this;
        }
        public LifecycleConfigResponse build() {
            return new LifecycleConfigResponse(autoDeleteTime, autoDeleteTtl, idleDeleteTtl, idleStartTime);
        }
    }
}
