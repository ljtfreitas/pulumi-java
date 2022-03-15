// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OntapFileSystemEndpointManagement {
    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    private final @Nullable String dnsName;
    /**
     * IP addresses of the file system endpoint.
     * 
     */
    private final @Nullable List<String> ipAddresses;

    @CustomType.Constructor
    private OntapFileSystemEndpointManagement(
        @CustomType.Parameter("dnsName") @Nullable String dnsName,
        @CustomType.Parameter("ipAddresses") @Nullable List<String> ipAddresses) {
        this.dnsName = dnsName;
        this.ipAddresses = ipAddresses;
    }

    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
    */
    public Optional<String> getDnsName() {
        return Optional.ofNullable(this.dnsName);
    }
    /**
     * IP addresses of the file system endpoint.
     * 
    */
    public List<String> getIpAddresses() {
        return this.ipAddresses == null ? List.of() : this.ipAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemEndpointManagement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dnsName;
        private @Nullable List<String> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemEndpointManagement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsName = defaults.dnsName;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public OntapFileSystemEndpointManagement build() {
            return new OntapFileSystemEndpointManagement(dnsName, ipAddresses);
        }
    }
}
