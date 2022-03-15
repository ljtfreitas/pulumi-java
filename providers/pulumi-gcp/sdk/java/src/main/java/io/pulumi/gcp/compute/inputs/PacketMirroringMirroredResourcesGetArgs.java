// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesInstanceGetArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesSubnetworkGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringMirroredResourcesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourcesGetArgs Empty = new PacketMirroringMirroredResourcesGetArgs();

    /**
     * All the listed instances will be mirrored.  Specify at most 50.
     * Structure is documented below.
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<PacketMirroringMirroredResourcesInstanceGetArgs>> instances;

    public Output<List<PacketMirroringMirroredResourcesInstanceGetArgs>> getInstances() {
        return this.instances == null ? Output.empty() : this.instances;
    }

    /**
     * All instances in one of these subnetworks will be mirrored.
     * Structure is documented below.
     * 
     */
    @Import(name="subnetworks")
      private final @Nullable Output<List<PacketMirroringMirroredResourcesSubnetworkGetArgs>> subnetworks;

    public Output<List<PacketMirroringMirroredResourcesSubnetworkGetArgs>> getSubnetworks() {
        return this.subnetworks == null ? Output.empty() : this.subnetworks;
    }

    /**
     * All instances with these tags will be mirrored.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public PacketMirroringMirroredResourcesGetArgs(
        @Nullable Output<List<PacketMirroringMirroredResourcesInstanceGetArgs>> instances,
        @Nullable Output<List<PacketMirroringMirroredResourcesSubnetworkGetArgs>> subnetworks,
        @Nullable Output<List<String>> tags) {
        this.instances = instances;
        this.subnetworks = subnetworks;
        this.tags = tags;
    }

    private PacketMirroringMirroredResourcesGetArgs() {
        this.instances = Output.empty();
        this.subnetworks = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourcesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PacketMirroringMirroredResourcesInstanceGetArgs>> instances;
        private @Nullable Output<List<PacketMirroringMirroredResourcesSubnetworkGetArgs>> subnetworks;
        private @Nullable Output<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourcesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tags = defaults.tags;
        }

        public Builder instances(@Nullable Output<List<PacketMirroringMirroredResourcesInstanceGetArgs>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder instances(@Nullable List<PacketMirroringMirroredResourcesInstanceGetArgs> instances) {
            this.instances = Output.ofNullable(instances);
            return this;
        }

        public Builder subnetworks(@Nullable Output<List<PacketMirroringMirroredResourcesSubnetworkGetArgs>> subnetworks) {
            this.subnetworks = subnetworks;
            return this;
        }

        public Builder subnetworks(@Nullable List<PacketMirroringMirroredResourcesSubnetworkGetArgs> subnetworks) {
            this.subnetworks = Output.ofNullable(subnetworks);
            return this;
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public PacketMirroringMirroredResourcesGetArgs build() {
            return new PacketMirroringMirroredResourcesGetArgs(instances, subnetworks, tags);
        }
    }
}
