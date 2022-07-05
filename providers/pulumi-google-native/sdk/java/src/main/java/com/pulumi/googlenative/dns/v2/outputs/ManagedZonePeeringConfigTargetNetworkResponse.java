// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ManagedZonePeeringConfigTargetNetworkResponse {
    /**
     * @return The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
     * 
     */
    private final String deactivateTime;
    private final String kind;
    /**
     * @return The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    private final String networkUrl;

    @CustomType.Constructor
    private ManagedZonePeeringConfigTargetNetworkResponse(
        @CustomType.Parameter("deactivateTime") String deactivateTime,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("networkUrl") String networkUrl) {
        this.deactivateTime = deactivateTime;
        this.kind = kind;
        this.networkUrl = networkUrl;
    }

    /**
     * @return The time at which the zone was deactivated, in RFC 3339 date-time format. An empty string indicates that the peering connection is active. The producer network can deactivate a zone. The zone is automatically deactivated if the producer network that the zone targeted is deleted. Output only.
     * 
     */
    public String deactivateTime() {
        return this.deactivateTime;
    }
    public String kind() {
        return this.kind;
    }
    /**
     * @return The fully qualified URL of the VPC network to forward queries to. This should be formatted like https://www.googleapis.com/compute/v1/projects/{project}/global/networks/{network}
     * 
     */
    public String networkUrl() {
        return this.networkUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePeeringConfigTargetNetworkResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deactivateTime;
        private String kind;
        private String networkUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePeeringConfigTargetNetworkResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deactivateTime = defaults.deactivateTime;
    	      this.kind = defaults.kind;
    	      this.networkUrl = defaults.networkUrl;
        }

        public Builder deactivateTime(String deactivateTime) {
            this.deactivateTime = Objects.requireNonNull(deactivateTime);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder networkUrl(String networkUrl) {
            this.networkUrl = Objects.requireNonNull(networkUrl);
            return this;
        }        public ManagedZonePeeringConfigTargetNetworkResponse build() {
            return new ManagedZonePeeringConfigTargetNetworkResponse(deactivateTime, kind, networkUrl);
        }
    }
}
