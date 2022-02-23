// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.outputs;

import io.pulumi.azurenative.devtestlab.outputs.LinuxOsInfoResponse;
import io.pulumi.azurenative.devtestlab.outputs.WindowsOsInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CustomImagePropertiesFromVmResponse {
    /**
     * The Linux OS information of the VM.
     * 
     */
    private final @Nullable LinuxOsInfoResponse linuxOsInfo;
    /**
     * The source vm identifier.
     * 
     */
    private final @Nullable String sourceVmId;
    /**
     * The Windows OS information of the VM.
     * 
     */
    private final @Nullable WindowsOsInfoResponse windowsOsInfo;

    @OutputCustomType.Constructor({"linuxOsInfo","sourceVmId","windowsOsInfo"})
    private CustomImagePropertiesFromVmResponse(
        @Nullable LinuxOsInfoResponse linuxOsInfo,
        @Nullable String sourceVmId,
        @Nullable WindowsOsInfoResponse windowsOsInfo) {
        this.linuxOsInfo = linuxOsInfo;
        this.sourceVmId = sourceVmId;
        this.windowsOsInfo = windowsOsInfo;
    }

    /**
     * The Linux OS information of the VM.
     * 
     */
    public Optional<LinuxOsInfoResponse> getLinuxOsInfo() {
        return Optional.ofNullable(this.linuxOsInfo);
    }
    /**
     * The source vm identifier.
     * 
     */
    public Optional<String> getSourceVmId() {
        return Optional.ofNullable(this.sourceVmId);
    }
    /**
     * The Windows OS information of the VM.
     * 
     */
    public Optional<WindowsOsInfoResponse> getWindowsOsInfo() {
        return Optional.ofNullable(this.windowsOsInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomImagePropertiesFromVmResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LinuxOsInfoResponse linuxOsInfo;
        private @Nullable String sourceVmId;
        private @Nullable WindowsOsInfoResponse windowsOsInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomImagePropertiesFromVmResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linuxOsInfo = defaults.linuxOsInfo;
    	      this.sourceVmId = defaults.sourceVmId;
    	      this.windowsOsInfo = defaults.windowsOsInfo;
        }

        public Builder setLinuxOsInfo(@Nullable LinuxOsInfoResponse linuxOsInfo) {
            this.linuxOsInfo = linuxOsInfo;
            return this;
        }

        public Builder setSourceVmId(@Nullable String sourceVmId) {
            this.sourceVmId = sourceVmId;
            return this;
        }

        public Builder setWindowsOsInfo(@Nullable WindowsOsInfoResponse windowsOsInfo) {
            this.windowsOsInfo = windowsOsInfo;
            return this;
        }
        public CustomImagePropertiesFromVmResponse build() {
            return new CustomImagePropertiesFromVmResponse(linuxOsInfo, sourceVmId, windowsOsInfo);
        }
    }
}
