// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNatAddressResult {
    /**
     * The static IPV4 address.
     * 
     */
    private final String ipAddress;
    /**
     * Resource ID of the NAT address.
     * 
     */
    private final String name;
    /**
     * State of the nat address.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetNatAddressResult(
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("state") String state) {
        this.ipAddress = ipAddress;
        this.name = name;
        this.state = state;
    }

    /**
     * The static IPV4 address.
     * 
    */
    public String getIpAddress() {
        return this.ipAddress;
    }
    /**
     * Resource ID of the NAT address.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * State of the nat address.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatAddressResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ipAddress;
        private String name;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatAddressResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ipAddress = defaults.ipAddress;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetNatAddressResult build() {
            return new GetNatAddressResult(ipAddress, name, state);
        }
    }
}
