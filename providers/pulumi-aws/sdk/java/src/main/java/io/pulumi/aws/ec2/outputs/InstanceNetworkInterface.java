// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class InstanceNetworkInterface {
    /**
     * Whether or not to delete the network interface on instance termination. Defaults to `false`. Currently, the only valid value is `false`, as this is only supported when creating new network interfaces when launching an instance.
     * 
     */
    private final @Nullable Boolean deleteOnTermination;
    /**
     * Integer index of the network interface attachment. Limited by instance type.
     * 
     */
    private final Integer deviceIndex;
    /**
     * ID of the network interface to attach.
     * 
     */
    private final String networkInterfaceId;

    @OutputCustomType.Constructor({"deleteOnTermination","deviceIndex","networkInterfaceId"})
    private InstanceNetworkInterface(
        @Nullable Boolean deleteOnTermination,
        Integer deviceIndex,
        String networkInterfaceId) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceIndex = Objects.requireNonNull(deviceIndex);
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
    }

    /**
     * Whether or not to delete the network interface on instance termination. Defaults to `false`. Currently, the only valid value is `false`, as this is only supported when creating new network interfaces when launching an instance.
     * 
     */
    public Optional<Boolean> getDeleteOnTermination() {
        return Optional.ofNullable(this.deleteOnTermination);
    }
    /**
     * Integer index of the network interface attachment. Limited by instance type.
     * 
     */
    public Integer getDeviceIndex() {
        return this.deviceIndex;
    }
    /**
     * ID of the network interface to attach.
     * 
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterface defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean deleteOnTermination;
        private Integer deviceIndex;
        private String networkInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterface defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public InstanceNetworkInterface build() {
            return new InstanceNetworkInterface(deleteOnTermination, deviceIndex, networkInterfaceId);
        }
    }
}
