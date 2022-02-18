// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IpAddressResponse {
    /**
     * The address.
     * 
     */
    private final @Nullable String address;

    @OutputCustomType.Constructor({"address"})
    private IpAddressResponse(@Nullable String address) {
        this.address = address;
    }

    /**
     * The address.
     * 
     */
    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpAddressResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;

        public Builder() {
    	      // Empty
        }

        public Builder(IpAddressResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public IpAddressResponse build() {
            return new IpAddressResponse(address);
        }
    }
}
