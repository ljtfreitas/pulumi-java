// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.awsnative.iotwireless.inputs.TaskDefinitionLoRaWANGatewayVersion;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TaskDefinitionLoRaWANUpdateGatewayTaskCreate extends io.pulumi.resources.InvokeArgs {

    public static final TaskDefinitionLoRaWANUpdateGatewayTaskCreate Empty = new TaskDefinitionLoRaWANUpdateGatewayTaskCreate();

    @InputImport(name="currentVersion")
        private final @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion;

    public Optional<TaskDefinitionLoRaWANGatewayVersion> getCurrentVersion() {
        return this.currentVersion == null ? Optional.empty() : Optional.ofNullable(this.currentVersion);
    }

    @InputImport(name="sigKeyCrc")
        private final @Nullable Integer sigKeyCrc;

    public Optional<Integer> getSigKeyCrc() {
        return this.sigKeyCrc == null ? Optional.empty() : Optional.ofNullable(this.sigKeyCrc);
    }

    @InputImport(name="updateSignature")
        private final @Nullable String updateSignature;

    public Optional<String> getUpdateSignature() {
        return this.updateSignature == null ? Optional.empty() : Optional.ofNullable(this.updateSignature);
    }

    @InputImport(name="updateVersion")
        private final @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion;

    public Optional<TaskDefinitionLoRaWANGatewayVersion> getUpdateVersion() {
        return this.updateVersion == null ? Optional.empty() : Optional.ofNullable(this.updateVersion);
    }

    public TaskDefinitionLoRaWANUpdateGatewayTaskCreate(
        @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion,
        @Nullable Integer sigKeyCrc,
        @Nullable String updateSignature,
        @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion) {
        this.currentVersion = currentVersion;
        this.sigKeyCrc = sigKeyCrc;
        this.updateSignature = updateSignature;
        this.updateVersion = updateVersion;
    }

    private TaskDefinitionLoRaWANUpdateGatewayTaskCreate() {
        this.currentVersion = null;
        this.sigKeyCrc = null;
        this.updateSignature = null;
        this.updateVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionLoRaWANUpdateGatewayTaskCreate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion;
        private @Nullable Integer sigKeyCrc;
        private @Nullable String updateSignature;
        private @Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionLoRaWANUpdateGatewayTaskCreate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.currentVersion = defaults.currentVersion;
    	      this.sigKeyCrc = defaults.sigKeyCrc;
    	      this.updateSignature = defaults.updateSignature;
    	      this.updateVersion = defaults.updateVersion;
        }

        public Builder setCurrentVersion(@Nullable TaskDefinitionLoRaWANGatewayVersion currentVersion) {
            this.currentVersion = currentVersion;
            return this;
        }

        public Builder setSigKeyCrc(@Nullable Integer sigKeyCrc) {
            this.sigKeyCrc = sigKeyCrc;
            return this;
        }

        public Builder setUpdateSignature(@Nullable String updateSignature) {
            this.updateSignature = updateSignature;
            return this;
        }

        public Builder setUpdateVersion(@Nullable TaskDefinitionLoRaWANGatewayVersion updateVersion) {
            this.updateVersion = updateVersion;
            return this;
        }
        public TaskDefinitionLoRaWANUpdateGatewayTaskCreate build() {
            return new TaskDefinitionLoRaWANUpdateGatewayTaskCreate(currentVersion, sigKeyCrc, updateSignature, updateVersion);
        }
    }
}
