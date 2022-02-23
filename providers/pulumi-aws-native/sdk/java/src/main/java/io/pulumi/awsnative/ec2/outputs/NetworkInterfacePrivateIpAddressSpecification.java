// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class NetworkInterfacePrivateIpAddressSpecification {
    private final Boolean primary;
    private final String privateIpAddress;

    @OutputCustomType.Constructor({"primary","privateIpAddress"})
    private NetworkInterfacePrivateIpAddressSpecification(
        Boolean primary,
        String privateIpAddress) {
        this.primary = Objects.requireNonNull(primary);
        this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
    }

    public Boolean getPrimary() {
        return this.primary;
    }
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfacePrivateIpAddressSpecification defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean primary;
        private String privateIpAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfacePrivateIpAddressSpecification defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primary = defaults.primary;
    	      this.privateIpAddress = defaults.privateIpAddress;
        }

        public Builder setPrimary(Boolean primary) {
            this.primary = Objects.requireNonNull(primary);
            return this;
        }

        public Builder setPrivateIpAddress(String privateIpAddress) {
            this.privateIpAddress = Objects.requireNonNull(privateIpAddress);
            return this;
        }
        public NetworkInterfacePrivateIpAddressSpecification build() {
            return new NetworkInterfacePrivateIpAddressSpecification(primary, privateIpAddress);
        }
    }
}
