// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OntapFileSystemEndpointInterclusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final OntapFileSystemEndpointInterclusterArgs Empty = new OntapFileSystemEndpointInterclusterArgs();

    /**
     * The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
     * 
     */
    @InputImport(name="dnsName")
    private final @Nullable Input<String> dnsName;

    public Input<String> getDnsName() {
        return this.dnsName == null ? Input.empty() : this.dnsName;
    }

    /**
     * IP addresses of the file system endpoint.
     * 
     */
    @InputImport(name="ipAddresses")
    private final @Nullable Input<List<String>> ipAddresses;

    public Input<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Input.empty() : this.ipAddresses;
    }

    public OntapFileSystemEndpointInterclusterArgs(
        @Nullable Input<String> dnsName,
        @Nullable Input<List<String>> ipAddresses) {
        this.dnsName = dnsName;
        this.ipAddresses = ipAddresses;
    }

    private OntapFileSystemEndpointInterclusterArgs() {
        this.dnsName = Input.empty();
        this.ipAddresses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemEndpointInterclusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> dnsName;
        private @Nullable Input<List<String>> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemEndpointInterclusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsName = defaults.dnsName;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder setDnsName(@Nullable Input<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder setDnsName(@Nullable String dnsName) {
            this.dnsName = Input.ofNullable(dnsName);
            return this;
        }

        public Builder setIpAddresses(@Nullable Input<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder setIpAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Input.ofNullable(ipAddresses);
            return this;
        }
        public OntapFileSystemEndpointInterclusterArgs build() {
            return new OntapFileSystemEndpointInterclusterArgs(dnsName, ipAddresses);
        }
    }
}
