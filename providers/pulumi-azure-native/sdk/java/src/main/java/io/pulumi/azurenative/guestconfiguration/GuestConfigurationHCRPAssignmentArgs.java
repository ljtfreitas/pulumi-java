// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration;

import io.pulumi.azurenative.guestconfiguration.inputs.GuestConfigurationAssignmentPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestConfigurationHCRPAssignmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestConfigurationHCRPAssignmentArgs Empty = new GuestConfigurationHCRPAssignmentArgs();

    /**
     * Name of the guest configuration assignment.
     * 
     */
    @InputImport(name="guestConfigurationAssignmentName")
    private final @Nullable Input<String> guestConfigurationAssignmentName;

    public Input<String> getGuestConfigurationAssignmentName() {
        return this.guestConfigurationAssignmentName == null ? Input.empty() : this.guestConfigurationAssignmentName;
    }

    /**
     * Region where the VM is located.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the ARC machine.
     * 
     */
    @InputImport(name="machineName", required=true)
    private final Input<String> machineName;

    public Input<String> getMachineName() {
        return this.machineName;
    }

    /**
     * Name of the guest configuration assignment.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Properties of the Guest configuration assignment.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<GuestConfigurationAssignmentPropertiesArgs> properties;

    public Input<GuestConfigurationAssignmentPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GuestConfigurationHCRPAssignmentArgs(
        @Nullable Input<String> guestConfigurationAssignmentName,
        @Nullable Input<String> location,
        Input<String> machineName,
        @Nullable Input<String> name,
        @Nullable Input<GuestConfigurationAssignmentPropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.guestConfigurationAssignmentName = guestConfigurationAssignmentName;
        this.location = location;
        this.machineName = Objects.requireNonNull(machineName, "expected parameter 'machineName' to be non-null");
        this.name = name;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GuestConfigurationHCRPAssignmentArgs() {
        this.guestConfigurationAssignmentName = Input.empty();
        this.location = Input.empty();
        this.machineName = Input.empty();
        this.name = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestConfigurationHCRPAssignmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> guestConfigurationAssignmentName;
        private @Nullable Input<String> location;
        private Input<String> machineName;
        private @Nullable Input<String> name;
        private @Nullable Input<GuestConfigurationAssignmentPropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestConfigurationHCRPAssignmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.guestConfigurationAssignmentName = defaults.guestConfigurationAssignmentName;
    	      this.location = defaults.location;
    	      this.machineName = defaults.machineName;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setGuestConfigurationAssignmentName(@Nullable Input<String> guestConfigurationAssignmentName) {
            this.guestConfigurationAssignmentName = guestConfigurationAssignmentName;
            return this;
        }

        public Builder setGuestConfigurationAssignmentName(@Nullable String guestConfigurationAssignmentName) {
            this.guestConfigurationAssignmentName = Input.ofNullable(guestConfigurationAssignmentName);
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

        public Builder setMachineName(Input<String> machineName) {
            this.machineName = Objects.requireNonNull(machineName);
            return this;
        }

        public Builder setMachineName(String machineName) {
            this.machineName = Input.of(Objects.requireNonNull(machineName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProperties(@Nullable Input<GuestConfigurationAssignmentPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable GuestConfigurationAssignmentPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
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

        public GuestConfigurationHCRPAssignmentArgs build() {
            return new GuestConfigurationHCRPAssignmentArgs(guestConfigurationAssignmentName, location, machineName, name, properties, resourceGroupName);
        }
    }
}
