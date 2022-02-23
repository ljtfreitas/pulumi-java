// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotcoredeviceadvisor.outputs;

import io.pulumi.awsnative.iotcoredeviceadvisor.outputs.SuiteDefinitionDeviceUnderTest;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SuiteDefinitionConfigurationProperties {
    private final String devicePermissionRoleArn;
    private final @Nullable List<SuiteDefinitionDeviceUnderTest> devices;
    private final @Nullable Boolean intendedForQualification;
    private final String rootGroup;
    private final @Nullable String suiteDefinitionName;

    @OutputCustomType.Constructor({"devicePermissionRoleArn","devices","intendedForQualification","rootGroup","suiteDefinitionName"})
    private SuiteDefinitionConfigurationProperties(
        String devicePermissionRoleArn,
        @Nullable List<SuiteDefinitionDeviceUnderTest> devices,
        @Nullable Boolean intendedForQualification,
        String rootGroup,
        @Nullable String suiteDefinitionName) {
        this.devicePermissionRoleArn = Objects.requireNonNull(devicePermissionRoleArn);
        this.devices = devices;
        this.intendedForQualification = intendedForQualification;
        this.rootGroup = Objects.requireNonNull(rootGroup);
        this.suiteDefinitionName = suiteDefinitionName;
    }

    public String getDevicePermissionRoleArn() {
        return this.devicePermissionRoleArn;
    }
    public List<SuiteDefinitionDeviceUnderTest> getDevices() {
        return this.devices == null ? List.of() : this.devices;
    }
    public Optional<Boolean> getIntendedForQualification() {
        return Optional.ofNullable(this.intendedForQualification);
    }
    public String getRootGroup() {
        return this.rootGroup;
    }
    public Optional<String> getSuiteDefinitionName() {
        return Optional.ofNullable(this.suiteDefinitionName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SuiteDefinitionConfigurationProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String devicePermissionRoleArn;
        private @Nullable List<SuiteDefinitionDeviceUnderTest> devices;
        private @Nullable Boolean intendedForQualification;
        private String rootGroup;
        private @Nullable String suiteDefinitionName;

        public Builder() {
    	      // Empty
        }

        public Builder(SuiteDefinitionConfigurationProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devicePermissionRoleArn = defaults.devicePermissionRoleArn;
    	      this.devices = defaults.devices;
    	      this.intendedForQualification = defaults.intendedForQualification;
    	      this.rootGroup = defaults.rootGroup;
    	      this.suiteDefinitionName = defaults.suiteDefinitionName;
        }

        public Builder setDevicePermissionRoleArn(String devicePermissionRoleArn) {
            this.devicePermissionRoleArn = Objects.requireNonNull(devicePermissionRoleArn);
            return this;
        }

        public Builder setDevices(@Nullable List<SuiteDefinitionDeviceUnderTest> devices) {
            this.devices = devices;
            return this;
        }

        public Builder setIntendedForQualification(@Nullable Boolean intendedForQualification) {
            this.intendedForQualification = intendedForQualification;
            return this;
        }

        public Builder setRootGroup(String rootGroup) {
            this.rootGroup = Objects.requireNonNull(rootGroup);
            return this;
        }

        public Builder setSuiteDefinitionName(@Nullable String suiteDefinitionName) {
            this.suiteDefinitionName = suiteDefinitionName;
            return this;
        }
        public SuiteDefinitionConfigurationProperties build() {
            return new SuiteDefinitionConfigurationProperties(devicePermissionRoleArn, devices, intendedForQualification, rootGroup, suiteDefinitionName);
        }
    }
}
