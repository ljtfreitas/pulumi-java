// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GlobalNetworkEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalNetworkEndpointArgs Empty = new GlobalNetworkEndpointArgs();

    /**
     * Fully qualified domain name of network endpoint.
     * This can only be specified when network_endpoint_type of the NEG is INTERNET_FQDN_PORT.
     * 
     */
    @Import(name="fqdn")
      private final @Nullable Output<String> fqdn;

    public Output<String> fqdn() {
        return this.fqdn == null ? Codegen.empty() : this.fqdn;
    }

    /**
     * The global network endpoint group this endpoint is part of.
     * 
     */
    @Import(name="globalNetworkEndpointGroup", required=true)
      private final Output<String> globalNetworkEndpointGroup;

    public Output<String> globalNetworkEndpointGroup() {
        return this.globalNetworkEndpointGroup;
    }

    /**
     * IPv4 address external endpoint.
     * 
     */
    @Import(name="ipAddress")
      private final @Nullable Output<String> ipAddress;

    public Output<String> ipAddress() {
        return this.ipAddress == null ? Codegen.empty() : this.ipAddress;
    }

    /**
     * Port number of the external endpoint.
     * 
     */
    @Import(name="port", required=true)
      private final Output<Integer> port;

    public Output<Integer> port() {
        return this.port;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public GlobalNetworkEndpointArgs(
        @Nullable Output<String> fqdn,
        Output<String> globalNetworkEndpointGroup,
        @Nullable Output<String> ipAddress,
        Output<Integer> port,
        @Nullable Output<String> project) {
        this.fqdn = fqdn;
        this.globalNetworkEndpointGroup = Objects.requireNonNull(globalNetworkEndpointGroup, "expected parameter 'globalNetworkEndpointGroup' to be non-null");
        this.ipAddress = ipAddress;
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
        this.project = project;
    }

    private GlobalNetworkEndpointArgs() {
        this.fqdn = Codegen.empty();
        this.globalNetworkEndpointGroup = Codegen.empty();
        this.ipAddress = Codegen.empty();
        this.port = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalNetworkEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fqdn;
        private Output<String> globalNetworkEndpointGroup;
        private @Nullable Output<String> ipAddress;
        private Output<Integer> port;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalNetworkEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fqdn = defaults.fqdn;
    	      this.globalNetworkEndpointGroup = defaults.globalNetworkEndpointGroup;
    	      this.ipAddress = defaults.ipAddress;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
        }

        public Builder fqdn(@Nullable Output<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }
        public Builder fqdn(@Nullable String fqdn) {
            this.fqdn = Codegen.ofNullable(fqdn);
            return this;
        }
        public Builder globalNetworkEndpointGroup(Output<String> globalNetworkEndpointGroup) {
            this.globalNetworkEndpointGroup = Objects.requireNonNull(globalNetworkEndpointGroup);
            return this;
        }
        public Builder globalNetworkEndpointGroup(String globalNetworkEndpointGroup) {
            this.globalNetworkEndpointGroup = Output.of(Objects.requireNonNull(globalNetworkEndpointGroup));
            return this;
        }
        public Builder ipAddress(@Nullable Output<String> ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }
        public Builder ipAddress(@Nullable String ipAddress) {
            this.ipAddress = Codegen.ofNullable(ipAddress);
            return this;
        }
        public Builder port(Output<Integer> port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Output.of(Objects.requireNonNull(port));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public GlobalNetworkEndpointArgs build() {
            return new GlobalNetworkEndpointArgs(fqdn, globalNetworkEndpointGroup, ipAddress, port, project);
        }
    }
}
