// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.compute.outputs.ImageStorageProfileResponse;
import io.pulumi.azurenative.compute.outputs.SubResourceResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageResult {
    /**
     * The extended location of the Image.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
     * 
     */
    private final @Nullable String hyperVGeneration;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * The provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The source virtual machine from which Image is created.
     * 
     */
    private final @Nullable SubResourceResponse sourceVirtualMachine;
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    private final @Nullable ImageStorageProfileResponse storageProfile;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetImageResult(
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("hyperVGeneration") @Nullable String hyperVGeneration,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sourceVirtualMachine") @Nullable SubResourceResponse sourceVirtualMachine,
        @CustomType.Parameter("storageProfile") @Nullable ImageStorageProfileResponse storageProfile,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.extendedLocation = extendedLocation;
        this.hyperVGeneration = hyperVGeneration;
        this.id = id;
        this.location = location;
        this.name = name;
        this.provisioningState = provisioningState;
        this.sourceVirtualMachine = sourceVirtualMachine;
        this.storageProfile = storageProfile;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The extended location of the Image.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Specifies the HyperVGenerationType of the VirtualMachine created from the image. From API Version 2019-03-01 if the image source is a blob, then we need the user to specify the value, if the source is managed resource like disk or snapshot, we may require the user to specify the property if we cannot deduce it from the source managed resource.
     * 
    */
    public Optional<String> getHyperVGeneration() {
        return Optional.ofNullable(this.hyperVGeneration);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The source virtual machine from which Image is created.
     * 
    */
    public Optional<SubResourceResponse> getSourceVirtualMachine() {
        return Optional.ofNullable(this.sourceVirtualMachine);
    }
    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
    */
    public Optional<ImageStorageProfileResponse> getStorageProfile() {
        return Optional.ofNullable(this.storageProfile);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ExtendedLocationResponse extendedLocation;
        private @Nullable String hyperVGeneration;
        private String id;
        private String location;
        private String name;
        private String provisioningState;
        private @Nullable SubResourceResponse sourceVirtualMachine;
        private @Nullable ImageStorageProfileResponse storageProfile;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.hyperVGeneration = defaults.hyperVGeneration;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sourceVirtualMachine = defaults.sourceVirtualMachine;
    	      this.storageProfile = defaults.storageProfile;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder hyperVGeneration(@Nullable String hyperVGeneration) {
            this.hyperVGeneration = hyperVGeneration;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder sourceVirtualMachine(@Nullable SubResourceResponse sourceVirtualMachine) {
            this.sourceVirtualMachine = sourceVirtualMachine;
            return this;
        }

        public Builder storageProfile(@Nullable ImageStorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetImageResult build() {
            return new GetImageResult(extendedLocation, hyperVGeneration, id, location, name, provisioningState, sourceVirtualMachine, storageProfile, tags, type);
        }
    }
}
