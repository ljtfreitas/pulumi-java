// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the IP address of the network interface.
 * 
 */
public final class IpAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpAddressArgs Empty = new IpAddressArgs();

    /**
     * Specifies the IP address of the network interface.
     * 
     */
    @InputImport(name="ipAddress")
    private final @Nullable Input<String> ipAddress;

    public Input<String> getIpAddress() {
        return this.ipAddress == null ? Input.empty() : this.ipAddress;
    }

    public IpAddressArgs(@Nullable Input<String> ipAddress) {
        this.ipAddress = ipAddress;
    }

    private IpAddressArgs() {
        this.ipAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> ipAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
        }

        public Builder setIpAddress(@Nullable Input<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public Builder setIpAddress(@Nullable String ipAddress) {
            this.ipAddress = Input.ofNullable(ipAddress);
            return this;
        }

        public IpAddressArgs build() {
            return new IpAddressArgs(ipAddress);
        }
    }
}
