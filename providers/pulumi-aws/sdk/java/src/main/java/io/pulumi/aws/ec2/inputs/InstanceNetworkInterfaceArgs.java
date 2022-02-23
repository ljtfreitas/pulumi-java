// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceNetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceNetworkInterfaceArgs Empty = new InstanceNetworkInterfaceArgs();

    /**
     * Whether or not to delete the network interface on instance termination. Defaults to `false`. Currently, the only valid value is `false`, as this is only supported when creating new network interfaces when launching an instance.
     * 
     */
    @InputImport(name="deleteOnTermination")
    private final @Nullable Input<Boolean> deleteOnTermination;

    public Input<Boolean> getDeleteOnTermination() {
        return this.deleteOnTermination == null ? Input.empty() : this.deleteOnTermination;
    }

    /**
     * Integer index of the network interface attachment. Limited by instance type.
     * 
     */
    @InputImport(name="deviceIndex", required=true)
    private final Input<Integer> deviceIndex;

    public Input<Integer> getDeviceIndex() {
        return this.deviceIndex;
    }

    /**
     * ID of the network interface to attach.
     * 
     */
    @InputImport(name="networkInterfaceId", required=true)
    private final Input<String> networkInterfaceId;

    public Input<String> getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public InstanceNetworkInterfaceArgs(
        @Nullable Input<Boolean> deleteOnTermination,
        Input<Integer> deviceIndex,
        Input<String> networkInterfaceId) {
        this.deleteOnTermination = deleteOnTermination;
        this.deviceIndex = Objects.requireNonNull(deviceIndex, "expected parameter 'deviceIndex' to be non-null");
        this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId, "expected parameter 'networkInterfaceId' to be non-null");
    }

    private InstanceNetworkInterfaceArgs() {
        this.deleteOnTermination = Input.empty();
        this.deviceIndex = Input.empty();
        this.networkInterfaceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceNetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> deleteOnTermination;
        private Input<Integer> deviceIndex;
        private Input<String> networkInterfaceId;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceNetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOnTermination = defaults.deleteOnTermination;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
        }

        public Builder setDeleteOnTermination(@Nullable Input<Boolean> deleteOnTermination) {
            this.deleteOnTermination = deleteOnTermination;
            return this;
        }

        public Builder setDeleteOnTermination(@Nullable Boolean deleteOnTermination) {
            this.deleteOnTermination = Input.ofNullable(deleteOnTermination);
            return this;
        }

        public Builder setDeviceIndex(Input<Integer> deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }

        public Builder setDeviceIndex(Integer deviceIndex) {
            this.deviceIndex = Input.of(Objects.requireNonNull(deviceIndex));
            return this;
        }

        public Builder setNetworkInterfaceId(Input<String> networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }

        public Builder setNetworkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Input.of(Objects.requireNonNull(networkInterfaceId));
            return this;
        }
        public InstanceNetworkInterfaceArgs build() {
            return new InstanceNetworkInterfaceArgs(deleteOnTermination, deviceIndex, networkInterfaceId);
        }
    }
}
