// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="dnsName")
      private final @Nullable Output<String> dnsName;

    public Output<String> getDnsName() {
        return this.dnsName == null ? Output.empty() : this.dnsName;
    }

    /**
     * IP addresses of the file system endpoint.
     * 
     */
    @Import(name="ipAddresses")
      private final @Nullable Output<List<String>> ipAddresses;

    public Output<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Output.empty() : this.ipAddresses;
    }

    public OntapFileSystemEndpointInterclusterArgs(
        @Nullable Output<String> dnsName,
        @Nullable Output<List<String>> ipAddresses) {
        this.dnsName = dnsName;
        this.ipAddresses = ipAddresses;
    }

    private OntapFileSystemEndpointInterclusterArgs() {
        this.dnsName = Output.empty();
        this.ipAddresses = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapFileSystemEndpointInterclusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dnsName;
        private @Nullable Output<List<String>> ipAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapFileSystemEndpointInterclusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dnsName = defaults.dnsName;
    	      this.ipAddresses = defaults.ipAddresses;
        }

        public Builder dnsName(@Nullable Output<String> dnsName) {
            this.dnsName = dnsName;
            return this;
        }

        public Builder dnsName(@Nullable String dnsName) {
            this.dnsName = Output.ofNullable(dnsName);
            return this;
        }

        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }

        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Output.ofNullable(ipAddresses);
            return this;
        }
        public OntapFileSystemEndpointInterclusterArgs build() {
            return new OntapFileSystemEndpointInterclusterArgs(dnsName, ipAddresses);
        }
    }
}
