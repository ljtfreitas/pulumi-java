// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.LinuxOsInfoArgs;
import io.pulumi.azurenative.devtestlab.inputs.WindowsOsInfoArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties for creating a custom image from a virtual machine.
 * 
 */
public final class CustomImagePropertiesFromVmArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomImagePropertiesFromVmArgs Empty = new CustomImagePropertiesFromVmArgs();

    /**
     * The Linux OS information of the VM.
     * 
     */
    @InputImport(name="linuxOsInfo")
    private final @Nullable Input<LinuxOsInfoArgs> linuxOsInfo;

    public Input<LinuxOsInfoArgs> getLinuxOsInfo() {
        return this.linuxOsInfo == null ? Input.empty() : this.linuxOsInfo;
    }

    /**
     * The source vm identifier.
     * 
     */
    @InputImport(name="sourceVmId")
    private final @Nullable Input<String> sourceVmId;

    public Input<String> getSourceVmId() {
        return this.sourceVmId == null ? Input.empty() : this.sourceVmId;
    }

    /**
     * The Windows OS information of the VM.
     * 
     */
    @InputImport(name="windowsOsInfo")
    private final @Nullable Input<WindowsOsInfoArgs> windowsOsInfo;

    public Input<WindowsOsInfoArgs> getWindowsOsInfo() {
        return this.windowsOsInfo == null ? Input.empty() : this.windowsOsInfo;
    }

    public CustomImagePropertiesFromVmArgs(
        @Nullable Input<LinuxOsInfoArgs> linuxOsInfo,
        @Nullable Input<String> sourceVmId,
        @Nullable Input<WindowsOsInfoArgs> windowsOsInfo) {
        this.linuxOsInfo = linuxOsInfo;
        this.sourceVmId = sourceVmId;
        this.windowsOsInfo = windowsOsInfo;
    }

    private CustomImagePropertiesFromVmArgs() {
        this.linuxOsInfo = Input.empty();
        this.sourceVmId = Input.empty();
        this.windowsOsInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesFromVmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LinuxOsInfoArgs> linuxOsInfo;
        private @Nullable Input<String> sourceVmId;
        private @Nullable Input<WindowsOsInfoArgs> windowsOsInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesFromVmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxOsInfo = defaults.linuxOsInfo;
    	      this.sourceVmId = defaults.sourceVmId;
    	      this.windowsOsInfo = defaults.windowsOsInfo;
        }

        public Builder setLinuxOsInfo(@Nullable Input<LinuxOsInfoArgs> linuxOsInfo) {
            this.linuxOsInfo = linuxOsInfo;
            return this;
        }

        public Builder setLinuxOsInfo(@Nullable LinuxOsInfoArgs linuxOsInfo) {
            this.linuxOsInfo = Input.ofNullable(linuxOsInfo);
            return this;
        }

        public Builder setSourceVmId(@Nullable Input<String> sourceVmId) {
            this.sourceVmId = sourceVmId;
            return this;
        }

        public Builder setSourceVmId(@Nullable String sourceVmId) {
            this.sourceVmId = Input.ofNullable(sourceVmId);
            return this;
        }

        public Builder setWindowsOsInfo(@Nullable Input<WindowsOsInfoArgs> windowsOsInfo) {
            this.windowsOsInfo = windowsOsInfo;
            return this;
        }

        public Builder setWindowsOsInfo(@Nullable WindowsOsInfoArgs windowsOsInfo) {
            this.windowsOsInfo = Input.ofNullable(windowsOsInfo);
            return this;
        }

        public CustomImagePropertiesFromVmArgs build() {
            return new CustomImagePropertiesFromVmArgs(linuxOsInfo, sourceVmId, windowsOsInfo);
        }
    }
}
