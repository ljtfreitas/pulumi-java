// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HsmState extends io.pulumi.resources.ResourceArgs {

    public static final HsmState Empty = new HsmState();

    /**
     * The IDs of AZ in which HSM module will be located. Do not use together with subnet_id.
     * 
     */
    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    /**
     * The ID of Cloud HSM v2 cluster to which HSM will be added.
     * 
     */
    @InputImport(name="clusterId")
    private final @Nullable Input<String> clusterId;

    public Input<String> getClusterId() {
        return this.clusterId == null ? Input.empty() : this.clusterId;
    }

    /**
     * The id of the ENI interface allocated for HSM module.
     * 
     */
    @InputImport(name="hsmEniId")
    private final @Nullable Input<String> hsmEniId;

    public Input<String> getHsmEniId() {
        return this.hsmEniId == null ? Input.empty() : this.hsmEniId;
    }

    /**
     * The id of the HSM module.
     * 
     */
    @InputImport(name="hsmId")
    private final @Nullable Input<String> hsmId;

    public Input<String> getHsmId() {
        return this.hsmId == null ? Input.empty() : this.hsmId;
    }

    /**
     * The state of the HSM module.
     * 
     */
    @InputImport(name="hsmState")
    private final @Nullable Input<String> hsmState;

    public Input<String> getHsmState() {
        return this.hsmState == null ? Input.empty() : this.hsmState;
    }

    /**
     * The IP address of HSM module. Must be within the CIDR of selected subnet.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    /**
     * The ID of subnet in which HSM module will be located.
     * 
     */
    @InputImport(name="subnetId")
    private final @Nullable Input<String> subnetId;

    public Input<String> getSubnetId() {
        return this.subnetId == null ? Input.empty() : this.subnetId;
    }

    public HsmState(
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> clusterId,
        @Nullable Input<String> hsmEniId,
        @Nullable Input<String> hsmId,
        @Nullable Input<String> hsmState,
        @Nullable Input<String> ipAddress,
        @Nullable Input<String> subnetId) {
        this.availabilityZone = availabilityZone;
        this.clusterId = clusterId;
        this.hsmEniId = hsmEniId;
        this.hsmId = hsmId;
        this.hsmState = hsmState;
        this.ipAddress = ipAddress;
        this.subnetId = subnetId;
    }

    private HsmState() {
        this.availabilityZone = Input.empty();
        this.clusterId = Input.empty();
        this.hsmEniId = Input.empty();
        this.hsmId = Input.empty();
        this.hsmState = Input.empty();
        this.ipAddress = Input.empty();
        this.subnetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HsmState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> clusterId;
        private @Nullable Input<String> hsmEniId;
        private @Nullable Input<String> hsmId;
        private @Nullable Input<String> hsmState;
        private @Nullable Input<String> ipAddress;
        private @Nullable Input<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(HsmState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.clusterId = defaults.clusterId;
    	      this.hsmEniId = defaults.hsmEniId;
    	      this.hsmId = defaults.hsmId;
    	      this.hsmState = defaults.hsmState;
    	      this.ipAddress = defaults.ipAddress;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setClusterId(@Nullable Input<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder setClusterId(@Nullable String clusterId) {
            this.clusterId = Input.ofNullable(clusterId);
            return this;
        }

        public Builder setHsmEniId(@Nullable Input<String> hsmEniId) {
            this.hsmEniId = hsmEniId;
            return this;
        }

        public Builder setHsmEniId(@Nullable String hsmEniId) {
            this.hsmEniId = Input.ofNullable(hsmEniId);
            return this;
        }

        public Builder setHsmId(@Nullable Input<String> hsmId) {
            this.hsmId = hsmId;
            return this;
        }

        public Builder setHsmId(@Nullable String hsmId) {
            this.hsmId = Input.ofNullable(hsmId);
            return this;
        }

        public Builder setHsmState(@Nullable Input<String> hsmState) {
            this.hsmState = hsmState;
            return this;
        }

        public Builder setHsmState(@Nullable String hsmState) {
            this.hsmState = Input.ofNullable(hsmState);
            return this;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public Builder setSubnetId(@Nullable Input<String> subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = Input.ofNullable(subnetId);
            return this;
        }
        public HsmState build() {
            return new HsmState(availabilityZone, clusterId, hsmEniId, hsmId, hsmState, ipAddress, subnetId);
        }
    }
}
