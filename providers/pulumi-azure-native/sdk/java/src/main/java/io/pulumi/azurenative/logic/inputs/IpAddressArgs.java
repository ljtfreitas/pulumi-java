// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The ip address.
 * 
 */
public final class IpAddressArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpAddressArgs Empty = new IpAddressArgs();

    /**
     * The address.
     * 
     */
    @InputImport(name="address")
        private final @Nullable Input<String> address;

    public Input<String> getAddress() {
        return this.address == null ? Input.empty() : this.address;
    }

    public IpAddressArgs(@Nullable Input<String> address) {
        this.address = address;
    }

    private IpAddressArgs() {
        this.address = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> address;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        public Builder setAddress(@Nullable Input<String> address) {
            this.address = address;
            return this;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = Input.ofNullable(address);
            return this;
        }
        public IpAddressArgs build() {
            return new IpAddressArgs(address);
        }
    }
}
