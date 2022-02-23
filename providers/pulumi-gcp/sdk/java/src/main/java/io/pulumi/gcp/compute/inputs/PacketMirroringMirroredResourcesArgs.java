// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesInstanceArgs;
import io.pulumi.gcp.compute.inputs.PacketMirroringMirroredResourcesSubnetworkArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PacketMirroringMirroredResourcesArgs extends io.pulumi.resources.ResourceArgs {

    public static final PacketMirroringMirroredResourcesArgs Empty = new PacketMirroringMirroredResourcesArgs();

    /**
     * All the listed instances will be mirrored.  Specify at most 50.
     * Structure is documented below.
     * 
     */
    @InputImport(name="instances")
        private final @Nullable Input<List<PacketMirroringMirroredResourcesInstanceArgs>> instances;

    public Input<List<PacketMirroringMirroredResourcesInstanceArgs>> getInstances() {
        return this.instances == null ? Input.empty() : this.instances;
    }

    /**
     * All instances in one of these subnetworks will be mirrored.
     * Structure is documented below.
     * 
     */
    @InputImport(name="subnetworks")
        private final @Nullable Input<List<PacketMirroringMirroredResourcesSubnetworkArgs>> subnetworks;

    public Input<List<PacketMirroringMirroredResourcesSubnetworkArgs>> getSubnetworks() {
        return this.subnetworks == null ? Input.empty() : this.subnetworks;
    }

    /**
     * All instances with these tags will be mirrored.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<String>> tags;

    public Input<List<String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public PacketMirroringMirroredResourcesArgs(
        @Nullable Input<List<PacketMirroringMirroredResourcesInstanceArgs>> instances,
        @Nullable Input<List<PacketMirroringMirroredResourcesSubnetworkArgs>> subnetworks,
        @Nullable Input<List<String>> tags) {
        this.instances = instances;
        this.subnetworks = subnetworks;
        this.tags = tags;
    }

    private PacketMirroringMirroredResourcesArgs() {
        this.instances = Input.empty();
        this.subnetworks = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<PacketMirroringMirroredResourcesInstanceArgs>> instances;
        private @Nullable Input<List<PacketMirroringMirroredResourcesSubnetworkArgs>> subnetworks;
        private @Nullable Input<List<String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tags = defaults.tags;
        }

        public Builder setInstances(@Nullable Input<List<PacketMirroringMirroredResourcesInstanceArgs>> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setInstances(@Nullable List<PacketMirroringMirroredResourcesInstanceArgs> instances) {
            this.instances = Input.ofNullable(instances);
            return this;
        }

        public Builder setSubnetworks(@Nullable Input<List<PacketMirroringMirroredResourcesSubnetworkArgs>> subnetworks) {
            this.subnetworks = subnetworks;
            return this;
        }

        public Builder setSubnetworks(@Nullable List<PacketMirroringMirroredResourcesSubnetworkArgs> subnetworks) {
            this.subnetworks = Input.ofNullable(subnetworks);
            return this;
        }

        public Builder setTags(@Nullable Input<List<String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public PacketMirroringMirroredResourcesArgs build() {
            return new PacketMirroringMirroredResourcesArgs(instances, subnetworks, tags);
        }
    }
}
