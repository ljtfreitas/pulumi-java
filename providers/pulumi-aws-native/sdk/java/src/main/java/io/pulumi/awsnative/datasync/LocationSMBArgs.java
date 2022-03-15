// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.inputs.LocationSMBMountOptionsArgs;
import io.pulumi.awsnative.datasync.inputs.LocationSMBTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationSMBArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationSMBArgs Empty = new LocationSMBArgs();

    /**
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * 
     */
    @Import(name="agentArns", required=true)
      private final Output<List<String>> agentArns;

    public Output<List<String>> getAgentArns() {
        return this.agentArns;
    }

    /**
     * The name of the Windows domain that the SMB server belongs to.
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    @Import(name="mountOptions")
      private final @Nullable Output<LocationSMBMountOptionsArgs> mountOptions;

    public Output<LocationSMBMountOptionsArgs> getMountOptions() {
        return this.mountOptions == null ? Output.empty() : this.mountOptions;
    }

    /**
     * The password of the user who can mount the share and has the permissions to access files and folders in the SMB share.
     * 
     */
    @Import(name="password", required=true)
      private final Output<String> password;

    public Output<String> getPassword() {
        return this.password;
    }

    /**
     * The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server.
     * 
     */
    @Import(name="serverHostname", required=true)
      private final Output<String> serverHostname;

    public Output<String> getServerHostname() {
        return this.serverHostname;
    }

    /**
     * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to the SMB destination
     * 
     */
    @Import(name="subdirectory", required=true)
      private final Output<String> subdirectory;

    public Output<String> getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<LocationSMBTagArgs>> tags;

    public Output<List<LocationSMBTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * 
     */
    @Import(name="user", required=true)
      private final Output<String> user;

    public Output<String> getUser() {
        return this.user;
    }

    public LocationSMBArgs(
        Output<List<String>> agentArns,
        @Nullable Output<String> domain,
        @Nullable Output<LocationSMBMountOptionsArgs> mountOptions,
        Output<String> password,
        Output<String> serverHostname,
        Output<String> subdirectory,
        @Nullable Output<List<LocationSMBTagArgs>> tags,
        Output<String> user) {
        this.agentArns = Objects.requireNonNull(agentArns, "expected parameter 'agentArns' to be non-null");
        this.domain = domain;
        this.mountOptions = mountOptions;
        this.password = Objects.requireNonNull(password, "expected parameter 'password' to be non-null");
        this.serverHostname = Objects.requireNonNull(serverHostname, "expected parameter 'serverHostname' to be non-null");
        this.subdirectory = Objects.requireNonNull(subdirectory, "expected parameter 'subdirectory' to be non-null");
        this.tags = tags;
        this.user = Objects.requireNonNull(user, "expected parameter 'user' to be non-null");
    }

    private LocationSMBArgs() {
        this.agentArns = Output.empty();
        this.domain = Output.empty();
        this.mountOptions = Output.empty();
        this.password = Output.empty();
        this.serverHostname = Output.empty();
        this.subdirectory = Output.empty();
        this.tags = Output.empty();
        this.user = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationSMBArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> agentArns;
        private @Nullable Output<String> domain;
        private @Nullable Output<LocationSMBMountOptionsArgs> mountOptions;
        private Output<String> password;
        private Output<String> serverHostname;
        private Output<String> subdirectory;
        private @Nullable Output<List<LocationSMBTagArgs>> tags;
        private Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationSMBArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentArns = defaults.agentArns;
    	      this.domain = defaults.domain;
    	      this.mountOptions = defaults.mountOptions;
    	      this.password = defaults.password;
    	      this.serverHostname = defaults.serverHostname;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
    	      this.user = defaults.user;
        }

        public Builder agentArns(Output<List<String>> agentArns) {
            this.agentArns = Objects.requireNonNull(agentArns);
            return this;
        }

        public Builder agentArns(List<String> agentArns) {
            this.agentArns = Output.of(Objects.requireNonNull(agentArns));
            return this;
        }

        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }

        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
            return this;
        }

        public Builder mountOptions(@Nullable Output<LocationSMBMountOptionsArgs> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(@Nullable LocationSMBMountOptionsArgs mountOptions) {
            this.mountOptions = Output.ofNullable(mountOptions);
            return this;
        }

        public Builder password(Output<String> password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }

        public Builder password(String password) {
            this.password = Output.of(Objects.requireNonNull(password));
            return this;
        }

        public Builder serverHostname(Output<String> serverHostname) {
            this.serverHostname = Objects.requireNonNull(serverHostname);
            return this;
        }

        public Builder serverHostname(String serverHostname) {
            this.serverHostname = Output.of(Objects.requireNonNull(serverHostname));
            return this;
        }

        public Builder subdirectory(Output<String> subdirectory) {
            this.subdirectory = Objects.requireNonNull(subdirectory);
            return this;
        }

        public Builder subdirectory(String subdirectory) {
            this.subdirectory = Output.of(Objects.requireNonNull(subdirectory));
            return this;
        }

        public Builder tags(@Nullable Output<List<LocationSMBTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<LocationSMBTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder user(Output<String> user) {
            this.user = Objects.requireNonNull(user);
            return this;
        }

        public Builder user(String user) {
            this.user = Output.of(Objects.requireNonNull(user));
            return this;
        }
        public LocationSMBArgs build() {
            return new LocationSMBArgs(agentArns, domain, mountOptions, password, serverHostname, subdirectory, tags, user);
        }
    }
}
