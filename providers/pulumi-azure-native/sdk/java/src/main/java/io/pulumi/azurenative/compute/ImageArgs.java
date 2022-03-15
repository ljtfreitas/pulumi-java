// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.enums.HyperVGenerationTypes;
import io.pulumi.azurenative.compute.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.compute.inputs.ImageStorageProfileArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImageArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImageArgs Empty = new ImageArgs();

    /**
     * The extended location of the Image.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Output.empty() : this.extendedLocation;
    }

    /**
     * Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
     * 
     */
    @Import(name="hyperVGeneration")
      private final @Nullable Output<Either<String,HyperVGenerationTypes>> hyperVGeneration;

    public Output<Either<String,HyperVGenerationTypes>> getHyperVGeneration() {
        return this.hyperVGeneration == null ? Output.empty() : this.hyperVGeneration;
    }

    /**
     * The name of the image.
     * 
     */
    @Import(name="imageName")
      private final @Nullable Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName == null ? Output.empty() : this.imageName;
    }

    /**
     * Resource location
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The source virtual machine from which Image is created.
     * 
     */
    @Import(name="sourceVirtualMachine")
      private final @Nullable Output<SubResourceArgs> sourceVirtualMachine;

    public Output<SubResourceArgs> getSourceVirtualMachine() {
        return this.sourceVirtualMachine == null ? Output.empty() : this.sourceVirtualMachine;
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @Import(name="storageProfile")
      private final @Nullable Output<ImageStorageProfileArgs> storageProfile;

    public Output<ImageStorageProfileArgs> getStorageProfile() {
        return this.storageProfile == null ? Output.empty() : this.storageProfile;
    }

    /**
     * Resource tags
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ImageArgs(
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<Either<String,HyperVGenerationTypes>> hyperVGeneration,
        @Nullable Output<String> imageName,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<SubResourceArgs> sourceVirtualMachine,
        @Nullable Output<ImageStorageProfileArgs> storageProfile,
        @Nullable Output<Map<String,String>> tags) {
        this.extendedLocation = extendedLocation;
        this.hyperVGeneration = hyperVGeneration;
        this.imageName = imageName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sourceVirtualMachine = sourceVirtualMachine;
        this.storageProfile = storageProfile;
        this.tags = tags;
    }

    private ImageArgs() {
        this.extendedLocation = Output.empty();
        this.hyperVGeneration = Output.empty();
        this.imageName = Output.empty();
        this.location = Output.empty();
        this.resourceGroupName = Output.empty();
        this.sourceVirtualMachine = Output.empty();
        this.storageProfile = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<Either<String,HyperVGenerationTypes>> hyperVGeneration;
        private @Nullable Output<String> imageName;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<SubResourceArgs> sourceVirtualMachine;
        private @Nullable Output<ImageStorageProfileArgs> storageProfile;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.hyperVGeneration = defaults.hyperVGeneration;
    	      this.imageName = defaults.imageName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sourceVirtualMachine = defaults.sourceVirtualMachine;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Output.ofNullable(extendedLocation);
            return this;
        }

        public Builder hyperVGeneration(@Nullable Output<Either<String,HyperVGenerationTypes>> hyperVGeneration) {
            this.hyperVGeneration = hyperVGeneration;
            return this;
        }

        public Builder hyperVGeneration(@Nullable Either<String,HyperVGenerationTypes> hyperVGeneration) {
            this.hyperVGeneration = Output.ofNullable(hyperVGeneration);
            return this;
        }

        public Builder imageName(@Nullable Output<String> imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder imageName(@Nullable String imageName) {
            this.imageName = Output.ofNullable(imageName);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder sourceVirtualMachine(@Nullable Output<SubResourceArgs> sourceVirtualMachine) {
            this.sourceVirtualMachine = sourceVirtualMachine;
            return this;
        }

        public Builder sourceVirtualMachine(@Nullable SubResourceArgs sourceVirtualMachine) {
            this.sourceVirtualMachine = Output.ofNullable(sourceVirtualMachine);
            return this;
        }

        public Builder storageProfile(@Nullable Output<ImageStorageProfileArgs> storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder storageProfile(@Nullable ImageStorageProfileArgs storageProfile) {
            this.storageProfile = Output.ofNullable(storageProfile);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public ImageArgs build() {
            return new ImageArgs(extendedLocation, hyperVGeneration, imageName, location, resourceGroupName, sourceVirtualMachine, storageProfile, tags);
        }
    }
}
