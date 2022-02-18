// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hanaonazure.inputs;

import io.pulumi.azurenative.hanaonazure.inputs.IpAddressResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the network settings for the HANA instance disks.
 * 
 */
public final class NetworkProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final NetworkProfileResponse Empty = new NetworkProfileResponse();

    /**
     * Specifies the circuit id for connecting to express route.
     * 
     */
    @InputImport(name="circuitId", required=true)
    private final String circuitId;

    public String getCircuitId() {
        return this.circuitId;
    }

    /**
     * Specifies the network interfaces for the HANA instance.
     * 
     */
    @InputImport(name="networkInterfaces")
    private final @Nullable List<IpAddressResponse> networkInterfaces;

    public List<IpAddressResponse> getNetworkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }

    public NetworkProfileResponse(
        String circuitId,
        @Nullable List<IpAddressResponse> networkInterfaces) {
        this.circuitId = Objects.requireNonNull(circuitId, "expected parameter 'circuitId' to be non-null");
        this.networkInterfaces = networkInterfaces;
    }

    private NetworkProfileResponse() {
        this.circuitId = null;
        this.networkInterfaces = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String circuitId;
        private @Nullable List<IpAddressResponse> networkInterfaces;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.circuitId = defaults.circuitId;
    	      this.networkInterfaces = defaults.networkInterfaces;
        }

        public Builder setCircuitId(String circuitId) {
            this.circuitId = Objects.requireNonNull(circuitId);
            return this;
        }

        public Builder setNetworkInterfaces(@Nullable List<IpAddressResponse> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public NetworkProfileResponse build() {
            return new NetworkProfileResponse(circuitId, networkInterfaces);
        }
    }
}
