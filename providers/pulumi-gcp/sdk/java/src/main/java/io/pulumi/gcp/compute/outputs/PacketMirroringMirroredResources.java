// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.compute.outputs.PacketMirroringMirroredResourcesInstance;
import io.pulumi.gcp.compute.outputs.PacketMirroringMirroredResourcesSubnetwork;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class PacketMirroringMirroredResources {
    /**
     * All the listed instances will be mirrored.  Specify at most 50.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<PacketMirroringMirroredResourcesInstance> instances;
    /**
     * All instances in one of these subnetworks will be mirrored.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<PacketMirroringMirroredResourcesSubnetwork> subnetworks;
    /**
     * All instances with these tags will be mirrored.
     * 
     */
    private final @Nullable List<String> tags;

    @OutputCustomType.Constructor({"instances","subnetworks","tags"})
    private PacketMirroringMirroredResources(
        @Nullable List<PacketMirroringMirroredResourcesInstance> instances,
        @Nullable List<PacketMirroringMirroredResourcesSubnetwork> subnetworks,
        @Nullable List<String> tags) {
        this.instances = instances;
        this.subnetworks = subnetworks;
        this.tags = tags;
    }

    /**
     * All the listed instances will be mirrored.  Specify at most 50.
     * Structure is documented below.
     * 
     */
    public List<PacketMirroringMirroredResourcesInstance> getInstances() {
        return this.instances == null ? List.of() : this.instances;
    }
    /**
     * All instances in one of these subnetworks will be mirrored.
     * Structure is documented below.
     * 
     */
    public List<PacketMirroringMirroredResourcesSubnetwork> getSubnetworks() {
        return this.subnetworks == null ? List.of() : this.subnetworks;
    }
    /**
     * All instances with these tags will be mirrored.
     * 
     */
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PacketMirroringMirroredResources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<PacketMirroringMirroredResourcesInstance> instances;
        private @Nullable List<PacketMirroringMirroredResourcesSubnetwork> subnetworks;
        private @Nullable List<String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(PacketMirroringMirroredResources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instances = defaults.instances;
    	      this.subnetworks = defaults.subnetworks;
    	      this.tags = defaults.tags;
        }

        public Builder setInstances(@Nullable List<PacketMirroringMirroredResourcesInstance> instances) {
            this.instances = instances;
            return this;
        }

        public Builder setSubnetworks(@Nullable List<PacketMirroringMirroredResourcesSubnetwork> subnetworks) {
            this.subnetworks = subnetworks;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }
        public PacketMirroringMirroredResources build() {
            return new PacketMirroringMirroredResources(instances, subnetworks, tags);
        }
    }
}
