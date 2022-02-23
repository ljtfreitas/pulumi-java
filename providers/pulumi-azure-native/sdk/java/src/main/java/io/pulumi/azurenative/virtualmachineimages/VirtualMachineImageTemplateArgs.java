// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages;

import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateFileCustomizerArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateIdentityArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateManagedImageDistributorArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateManagedImageSourceArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplatePlatformImageSourceArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplatePowerShellCustomizerArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateRestartCustomizerArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateSharedImageDistributorArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateSharedImageVersionSourceArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateShellCustomizerArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateVhdDistributorArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateVmProfileArgs;
import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateWindowsUpdateCustomizerArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineImageTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineImageTemplateArgs Empty = new VirtualMachineImageTemplateArgs();

    /**
     * Maximum duration to wait while building the image template. Omit or specify 0 to use the default (4 hours).
     * 
     */
    @InputImport(name="buildTimeoutInMinutes")
        private final @Nullable Input<Integer> buildTimeoutInMinutes;

    public Input<Integer> getBuildTimeoutInMinutes() {
        return this.buildTimeoutInMinutes == null ? Input.empty() : this.buildTimeoutInMinutes;
    }

    /**
     * Specifies the properties used to describe the customization steps of the image, like Image source etc
     * 
     */
    @InputImport(name="customize")
        private final @Nullable Input<List<Object>> customize;

    public Input<List<Object>> getCustomize() {
        return this.customize == null ? Input.empty() : this.customize;
    }

    /**
     * The distribution targets where the image output needs to go to.
     * 
     */
    @InputImport(name="distribute", required=true)
        private final Input<List<Object>> distribute;

    public Input<List<Object>> getDistribute() {
        return this.distribute;
    }

    /**
     * The identity of the image template, if configured.
     * 
     */
    @InputImport(name="identity", required=true)
        private final Input<ImageTemplateIdentityArgs> identity;

    public Input<ImageTemplateIdentityArgs> getIdentity() {
        return this.identity;
    }

    /**
     * The name of the image Template
     * 
     */
    @InputImport(name="imageTemplateName")
        private final @Nullable Input<String> imageTemplateName;

    public Input<String> getImageTemplateName() {
        return this.imageTemplateName == null ? Input.empty() : this.imageTemplateName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Specifies the properties used to describe the source image.
     * 
     */
    @InputImport(name="source", required=true)
        private final Input<Object> source;

    public Input<Object> getSource() {
        return this.source;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Describes how virtual machine is set up to build images
     * 
     */
    @InputImport(name="vmProfile")
        private final @Nullable Input<ImageTemplateVmProfileArgs> vmProfile;

    public Input<ImageTemplateVmProfileArgs> getVmProfile() {
        return this.vmProfile == null ? Input.empty() : this.vmProfile;
    }

    public VirtualMachineImageTemplateArgs(
        @Nullable Input<Integer> buildTimeoutInMinutes,
        @Nullable Input<List<Object>> customize,
        Input<List<Object>> distribute,
        Input<ImageTemplateIdentityArgs> identity,
        @Nullable Input<String> imageTemplateName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        Input<Object> source,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<ImageTemplateVmProfileArgs> vmProfile) {
        this.buildTimeoutInMinutes = buildTimeoutInMinutes == null ? Input.ofNullable(0) : buildTimeoutInMinutes;
        this.customize = customize;
        this.distribute = Objects.requireNonNull(distribute, "expected parameter 'distribute' to be non-null");
        this.identity = Objects.requireNonNull(identity, "expected parameter 'identity' to be non-null");
        this.imageTemplateName = imageTemplateName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.source = Objects.requireNonNull(source, "expected parameter 'source' to be non-null");
        this.tags = tags;
        this.vmProfile = vmProfile;
    }

    private VirtualMachineImageTemplateArgs() {
        this.buildTimeoutInMinutes = Input.empty();
        this.customize = Input.empty();
        this.distribute = Input.empty();
        this.identity = Input.empty();
        this.imageTemplateName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.source = Input.empty();
        this.tags = Input.empty();
        this.vmProfile = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineImageTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> buildTimeoutInMinutes;
        private @Nullable Input<List<Object>> customize;
        private Input<List<Object>> distribute;
        private Input<ImageTemplateIdentityArgs> identity;
        private @Nullable Input<String> imageTemplateName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private Input<Object> source;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<ImageTemplateVmProfileArgs> vmProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineImageTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buildTimeoutInMinutes = defaults.buildTimeoutInMinutes;
    	      this.customize = defaults.customize;
    	      this.distribute = defaults.distribute;
    	      this.identity = defaults.identity;
    	      this.imageTemplateName = defaults.imageTemplateName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.source = defaults.source;
    	      this.tags = defaults.tags;
    	      this.vmProfile = defaults.vmProfile;
        }

        public Builder setBuildTimeoutInMinutes(@Nullable Input<Integer> buildTimeoutInMinutes) {
            this.buildTimeoutInMinutes = buildTimeoutInMinutes;
            return this;
        }

        public Builder setBuildTimeoutInMinutes(@Nullable Integer buildTimeoutInMinutes) {
            this.buildTimeoutInMinutes = Input.ofNullable(buildTimeoutInMinutes);
            return this;
        }

        public Builder setCustomize(@Nullable Input<List<Object>> customize) {
            this.customize = customize;
            return this;
        }

        public Builder setCustomize(@Nullable List<Object> customize) {
            this.customize = Input.ofNullable(customize);
            return this;
        }

        public Builder setDistribute(Input<List<Object>> distribute) {
            this.distribute = Objects.requireNonNull(distribute);
            return this;
        }

        public Builder setDistribute(List<Object> distribute) {
            this.distribute = Input.of(Objects.requireNonNull(distribute));
            return this;
        }

        public Builder setIdentity(Input<ImageTemplateIdentityArgs> identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }

        public Builder setIdentity(ImageTemplateIdentityArgs identity) {
            this.identity = Input.of(Objects.requireNonNull(identity));
            return this;
        }

        public Builder setImageTemplateName(@Nullable Input<String> imageTemplateName) {
            this.imageTemplateName = imageTemplateName;
            return this;
        }

        public Builder setImageTemplateName(@Nullable String imageTemplateName) {
            this.imageTemplateName = Input.ofNullable(imageTemplateName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSource(Input<Object> source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }

        public Builder setSource(Object source) {
            this.source = Input.of(Objects.requireNonNull(source));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVmProfile(@Nullable Input<ImageTemplateVmProfileArgs> vmProfile) {
            this.vmProfile = vmProfile;
            return this;
        }

        public Builder setVmProfile(@Nullable ImageTemplateVmProfileArgs vmProfile) {
            this.vmProfile = Input.ofNullable(vmProfile);
            return this;
        }
        public VirtualMachineImageTemplateArgs build() {
            return new VirtualMachineImageTemplateArgs(buildTimeoutInMinutes, customize, distribute, identity, imageTemplateName, location, resourceGroupName, source, tags, vmProfile);
        }
    }
}
