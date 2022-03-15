// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * HostAlias holds the mapping between IP and hostnames that will be injected as an entry in the pod's hosts file.
 * 
 */
public final class HostAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final HostAliasArgs Empty = new HostAliasArgs();

    /**
     * Hostnames for the above IP address.
     * 
     */
    @Import(name="hostnames")
      private final @Nullable Output<List<String>> hostnames;

    public Output<List<String>> getHostnames() {
        return this.hostnames == null ? Output.empty() : this.hostnames;
    }

    /**
     * IP address of the host file entry.
     * 
     */
    @Import(name="ip")
      private final @Nullable Output<String> ip;

    public Output<String> getIp() {
        return this.ip == null ? Output.empty() : this.ip;
    }

    public HostAliasArgs(
        @Nullable Output<List<String>> hostnames,
        @Nullable Output<String> ip) {
        this.hostnames = hostnames;
        this.ip = ip;
    }

    private HostAliasArgs() {
        this.hostnames = Output.empty();
        this.ip = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> hostnames;
        private @Nullable Output<String> ip;

        public Builder() {
    	      // Empty
        }

        public Builder(HostAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostnames = defaults.hostnames;
    	      this.ip = defaults.ip;
        }

        public Builder hostnames(@Nullable Output<List<String>> hostnames) {
            this.hostnames = hostnames;
            return this;
        }

        public Builder hostnames(@Nullable List<String> hostnames) {
            this.hostnames = Output.ofNullable(hostnames);
            return this;
        }

        public Builder ip(@Nullable Output<String> ip) {
            this.ip = ip;
            return this;
        }

        public Builder ip(@Nullable String ip) {
            this.ip = Output.ofNullable(ip);
            return this;
        }
        public HostAliasArgs build() {
            return new HostAliasArgs(hostnames, ip);
        }
    }
}
