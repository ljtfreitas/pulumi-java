// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.inputs;

import io.pulumi.aws.fsx.inputs.OpenZfsVolumeNfsExportsClientConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class OpenZfsVolumeNfsExportsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OpenZfsVolumeNfsExportsGetArgs Empty = new OpenZfsVolumeNfsExportsGetArgs();

    /**
     * - A list of configuration objects that contain the client and options for mounting the OpenZFS file system. Maximum of 25 items. See Client Configurations Below.
     * 
     */
    @Import(name="clientConfigurations", required=true)
      private final Output<List<OpenZfsVolumeNfsExportsClientConfigurationGetArgs>> clientConfigurations;

    public Output<List<OpenZfsVolumeNfsExportsClientConfigurationGetArgs>> getClientConfigurations() {
        return this.clientConfigurations;
    }

    public OpenZfsVolumeNfsExportsGetArgs(Output<List<OpenZfsVolumeNfsExportsClientConfigurationGetArgs>> clientConfigurations) {
        this.clientConfigurations = Objects.requireNonNull(clientConfigurations, "expected parameter 'clientConfigurations' to be non-null");
    }

    private OpenZfsVolumeNfsExportsGetArgs() {
        this.clientConfigurations = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenZfsVolumeNfsExportsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<OpenZfsVolumeNfsExportsClientConfigurationGetArgs>> clientConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenZfsVolumeNfsExportsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientConfigurations = defaults.clientConfigurations;
        }

        public Builder clientConfigurations(Output<List<OpenZfsVolumeNfsExportsClientConfigurationGetArgs>> clientConfigurations) {
            this.clientConfigurations = Objects.requireNonNull(clientConfigurations);
            return this;
        }

        public Builder clientConfigurations(List<OpenZfsVolumeNfsExportsClientConfigurationGetArgs> clientConfigurations) {
            this.clientConfigurations = Output.of(Objects.requireNonNull(clientConfigurations));
            return this;
        }
        public OpenZfsVolumeNfsExportsGetArgs build() {
            return new OpenZfsVolumeNfsExportsGetArgs(clientConfigurations);
        }
    }
}
