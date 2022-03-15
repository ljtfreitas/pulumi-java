// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.azurenative.hdinsight.outputs.AutoscaleResponse;
import io.pulumi.azurenative.hdinsight.outputs.DataDisksGroupsResponse;
import io.pulumi.azurenative.hdinsight.outputs.HardwareProfileResponse;
import io.pulumi.azurenative.hdinsight.outputs.OsProfileResponse;
import io.pulumi.azurenative.hdinsight.outputs.ScriptActionResponse;
import io.pulumi.azurenative.hdinsight.outputs.VirtualNetworkProfileResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RoleResponse {
    /**
     * The autoscale configurations.
     * 
     */
    private final @Nullable AutoscaleResponse autoscaleConfiguration;
    /**
     * The data disks groups for the role.
     * 
     */
    private final @Nullable List<DataDisksGroupsResponse> dataDisksGroups;
    /**
     * Indicates whether encrypt the data disks.
     * 
     */
    private final @Nullable Boolean encryptDataDisks;
    /**
     * The hardware profile.
     * 
     */
    private final @Nullable HardwareProfileResponse hardwareProfile;
    /**
     * The minimum instance count of the cluster.
     * 
     */
    private final @Nullable Integer minInstanceCount;
    /**
     * The name of the role.
     * 
     */
    private final @Nullable String name;
    /**
     * The operating system profile.
     * 
     */
    private final @Nullable OsProfileResponse osProfile;
    /**
     * The list of script actions on the role.
     * 
     */
    private final @Nullable List<ScriptActionResponse> scriptActions;
    /**
     * The instance count of the cluster.
     * 
     */
    private final @Nullable Integer targetInstanceCount;
    /**
     * The name of the virtual machine group.
     * 
     */
    private final @Nullable String vMGroupName;
    /**
     * The virtual network profile.
     * 
     */
    private final @Nullable VirtualNetworkProfileResponse virtualNetworkProfile;

    @CustomType.Constructor
    private RoleResponse(
        @CustomType.Parameter("autoscaleConfiguration") @Nullable AutoscaleResponse autoscaleConfiguration,
        @CustomType.Parameter("dataDisksGroups") @Nullable List<DataDisksGroupsResponse> dataDisksGroups,
        @CustomType.Parameter("encryptDataDisks") @Nullable Boolean encryptDataDisks,
        @CustomType.Parameter("hardwareProfile") @Nullable HardwareProfileResponse hardwareProfile,
        @CustomType.Parameter("minInstanceCount") @Nullable Integer minInstanceCount,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("osProfile") @Nullable OsProfileResponse osProfile,
        @CustomType.Parameter("scriptActions") @Nullable List<ScriptActionResponse> scriptActions,
        @CustomType.Parameter("targetInstanceCount") @Nullable Integer targetInstanceCount,
        @CustomType.Parameter("vMGroupName") @Nullable String vMGroupName,
        @CustomType.Parameter("virtualNetworkProfile") @Nullable VirtualNetworkProfileResponse virtualNetworkProfile) {
        this.autoscaleConfiguration = autoscaleConfiguration;
        this.dataDisksGroups = dataDisksGroups;
        this.encryptDataDisks = encryptDataDisks;
        this.hardwareProfile = hardwareProfile;
        this.minInstanceCount = minInstanceCount;
        this.name = name;
        this.osProfile = osProfile;
        this.scriptActions = scriptActions;
        this.targetInstanceCount = targetInstanceCount;
        this.vMGroupName = vMGroupName;
        this.virtualNetworkProfile = virtualNetworkProfile;
    }

    /**
     * The autoscale configurations.
     * 
    */
    public Optional<AutoscaleResponse> getAutoscaleConfiguration() {
        return Optional.ofNullable(this.autoscaleConfiguration);
    }
    /**
     * The data disks groups for the role.
     * 
    */
    public List<DataDisksGroupsResponse> getDataDisksGroups() {
        return this.dataDisksGroups == null ? List.of() : this.dataDisksGroups;
    }
    /**
     * Indicates whether encrypt the data disks.
     * 
    */
    public Optional<Boolean> getEncryptDataDisks() {
        return Optional.ofNullable(this.encryptDataDisks);
    }
    /**
     * The hardware profile.
     * 
    */
    public Optional<HardwareProfileResponse> getHardwareProfile() {
        return Optional.ofNullable(this.hardwareProfile);
    }
    /**
     * The minimum instance count of the cluster.
     * 
    */
    public Optional<Integer> getMinInstanceCount() {
        return Optional.ofNullable(this.minInstanceCount);
    }
    /**
     * The name of the role.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The operating system profile.
     * 
    */
    public Optional<OsProfileResponse> getOsProfile() {
        return Optional.ofNullable(this.osProfile);
    }
    /**
     * The list of script actions on the role.
     * 
    */
    public List<ScriptActionResponse> getScriptActions() {
        return this.scriptActions == null ? List.of() : this.scriptActions;
    }
    /**
     * The instance count of the cluster.
     * 
    */
    public Optional<Integer> getTargetInstanceCount() {
        return Optional.ofNullable(this.targetInstanceCount);
    }
    /**
     * The name of the virtual machine group.
     * 
    */
    public Optional<String> getVMGroupName() {
        return Optional.ofNullable(this.vMGroupName);
    }
    /**
     * The virtual network profile.
     * 
    */
    public Optional<VirtualNetworkProfileResponse> getVirtualNetworkProfile() {
        return Optional.ofNullable(this.virtualNetworkProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AutoscaleResponse autoscaleConfiguration;
        private @Nullable List<DataDisksGroupsResponse> dataDisksGroups;
        private @Nullable Boolean encryptDataDisks;
        private @Nullable HardwareProfileResponse hardwareProfile;
        private @Nullable Integer minInstanceCount;
        private @Nullable String name;
        private @Nullable OsProfileResponse osProfile;
        private @Nullable List<ScriptActionResponse> scriptActions;
        private @Nullable Integer targetInstanceCount;
        private @Nullable String vMGroupName;
        private @Nullable VirtualNetworkProfileResponse virtualNetworkProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleConfiguration = defaults.autoscaleConfiguration;
    	      this.dataDisksGroups = defaults.dataDisksGroups;
    	      this.encryptDataDisks = defaults.encryptDataDisks;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.minInstanceCount = defaults.minInstanceCount;
    	      this.name = defaults.name;
    	      this.osProfile = defaults.osProfile;
    	      this.scriptActions = defaults.scriptActions;
    	      this.targetInstanceCount = defaults.targetInstanceCount;
    	      this.vMGroupName = defaults.vMGroupName;
    	      this.virtualNetworkProfile = defaults.virtualNetworkProfile;
        }

        public Builder autoscaleConfiguration(@Nullable AutoscaleResponse autoscaleConfiguration) {
            this.autoscaleConfiguration = autoscaleConfiguration;
            return this;
        }

        public Builder dataDisksGroups(@Nullable List<DataDisksGroupsResponse> dataDisksGroups) {
            this.dataDisksGroups = dataDisksGroups;
            return this;
        }

        public Builder encryptDataDisks(@Nullable Boolean encryptDataDisks) {
            this.encryptDataDisks = encryptDataDisks;
            return this;
        }

        public Builder hardwareProfile(@Nullable HardwareProfileResponse hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }

        public Builder minInstanceCount(@Nullable Integer minInstanceCount) {
            this.minInstanceCount = minInstanceCount;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder osProfile(@Nullable OsProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder scriptActions(@Nullable List<ScriptActionResponse> scriptActions) {
            this.scriptActions = scriptActions;
            return this;
        }

        public Builder targetInstanceCount(@Nullable Integer targetInstanceCount) {
            this.targetInstanceCount = targetInstanceCount;
            return this;
        }

        public Builder vMGroupName(@Nullable String vMGroupName) {
            this.vMGroupName = vMGroupName;
            return this;
        }

        public Builder virtualNetworkProfile(@Nullable VirtualNetworkProfileResponse virtualNetworkProfile) {
            this.virtualNetworkProfile = virtualNetworkProfile;
            return this;
        }
        public RoleResponse build() {
            return new RoleResponse(autoscaleConfiguration, dataDisksGroups, encryptDataDisks, hardwareProfile, minInstanceCount, name, osProfile, scriptActions, targetInstanceCount, vMGroupName, virtualNetworkProfile);
        }
    }
}
