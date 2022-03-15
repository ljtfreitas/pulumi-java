// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.datasync;

import io.pulumi.awsnative.datasync.inputs.LocationNFSMountOptionsArgs;
import io.pulumi.awsnative.datasync.inputs.LocationNFSOnPremConfigArgs;
import io.pulumi.awsnative.datasync.inputs.LocationNFSTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocationNFSArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocationNFSArgs Empty = new LocationNFSArgs();

    @Import(name="mountOptions")
      private final @Nullable Output<LocationNFSMountOptionsArgs> mountOptions;

    public Output<LocationNFSMountOptionsArgs> getMountOptions() {
        return this.mountOptions == null ? Output.empty() : this.mountOptions;
    }

    @Import(name="onPremConfig", required=true)
      private final Output<LocationNFSOnPremConfigArgs> onPremConfig;

    public Output<LocationNFSOnPremConfigArgs> getOnPremConfig() {
        return this.onPremConfig;
    }

    /**
     * The name of the NFS server. This value is the IP address or DNS name of the NFS server.
     * 
     */
    @Import(name="serverHostname", required=true)
      private final Output<String> serverHostname;

    public Output<String> getServerHostname() {
        return this.serverHostname;
    }

    /**
     * The subdirectory in the NFS file system that is used to read data from the NFS source location or write data to the NFS destination.
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
      private final @Nullable Output<List<LocationNFSTagArgs>> tags;

    public Output<List<LocationNFSTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public LocationNFSArgs(
        @Nullable Output<LocationNFSMountOptionsArgs> mountOptions,
        Output<LocationNFSOnPremConfigArgs> onPremConfig,
        Output<String> serverHostname,
        Output<String> subdirectory,
        @Nullable Output<List<LocationNFSTagArgs>> tags) {
        this.mountOptions = mountOptions;
        this.onPremConfig = Objects.requireNonNull(onPremConfig, "expected parameter 'onPremConfig' to be non-null");
        this.serverHostname = Objects.requireNonNull(serverHostname, "expected parameter 'serverHostname' to be non-null");
        this.subdirectory = Objects.requireNonNull(subdirectory, "expected parameter 'subdirectory' to be non-null");
        this.tags = tags;
    }

    private LocationNFSArgs() {
        this.mountOptions = Output.empty();
        this.onPremConfig = Output.empty();
        this.serverHostname = Output.empty();
        this.subdirectory = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationNFSArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<LocationNFSMountOptionsArgs> mountOptions;
        private Output<LocationNFSOnPremConfigArgs> onPremConfig;
        private Output<String> serverHostname;
        private Output<String> subdirectory;
        private @Nullable Output<List<LocationNFSTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LocationNFSArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mountOptions = defaults.mountOptions;
    	      this.onPremConfig = defaults.onPremConfig;
    	      this.serverHostname = defaults.serverHostname;
    	      this.subdirectory = defaults.subdirectory;
    	      this.tags = defaults.tags;
        }

        public Builder mountOptions(@Nullable Output<LocationNFSMountOptionsArgs> mountOptions) {
            this.mountOptions = mountOptions;
            return this;
        }

        public Builder mountOptions(@Nullable LocationNFSMountOptionsArgs mountOptions) {
            this.mountOptions = Output.ofNullable(mountOptions);
            return this;
        }

        public Builder onPremConfig(Output<LocationNFSOnPremConfigArgs> onPremConfig) {
            this.onPremConfig = Objects.requireNonNull(onPremConfig);
            return this;
        }

        public Builder onPremConfig(LocationNFSOnPremConfigArgs onPremConfig) {
            this.onPremConfig = Output.of(Objects.requireNonNull(onPremConfig));
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

        public Builder tags(@Nullable Output<List<LocationNFSTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<LocationNFSTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public LocationNFSArgs build() {
            return new LocationNFSArgs(mountOptions, onPremConfig, serverHostname, subdirectory, tags);
        }
    }
}
