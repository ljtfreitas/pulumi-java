// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.azurenative.devtestlab.inputs.ArtifactParameterPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of an artifact.
 * 
 */
public final class ArtifactInstallPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArtifactInstallPropertiesResponse Empty = new ArtifactInstallPropertiesResponse();

    /**
     * The artifact's identifier.
     * 
     */
    @InputImport(name="artifactId")
    private final @Nullable String artifactId;

    public Optional<String> getArtifactId() {
        return this.artifactId == null ? Optional.empty() : Optional.ofNullable(this.artifactId);
    }

    /**
     * The artifact's title.
     * 
     */
    @InputImport(name="artifactTitle")
    private final @Nullable String artifactTitle;

    public Optional<String> getArtifactTitle() {
        return this.artifactTitle == null ? Optional.empty() : Optional.ofNullable(this.artifactTitle);
    }

    /**
     * The status message from the deployment.
     * 
     */
    @InputImport(name="deploymentStatusMessage")
    private final @Nullable String deploymentStatusMessage;

    public Optional<String> getDeploymentStatusMessage() {
        return this.deploymentStatusMessage == null ? Optional.empty() : Optional.ofNullable(this.deploymentStatusMessage);
    }

    /**
     * The time that the artifact starts to install on the virtual machine.
     * 
     */
    @InputImport(name="installTime")
    private final @Nullable String installTime;

    public Optional<String> getInstallTime() {
        return this.installTime == null ? Optional.empty() : Optional.ofNullable(this.installTime);
    }

    /**
     * The parameters of the artifact.
     * 
     */
    @InputImport(name="parameters")
    private final @Nullable List<ArtifactParameterPropertiesResponse> parameters;

    public List<ArtifactParameterPropertiesResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    /**
     * The status of the artifact.
     * 
     */
    @InputImport(name="status")
    private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * The status message from the virtual machine extension.
     * 
     */
    @InputImport(name="vmExtensionStatusMessage")
    private final @Nullable String vmExtensionStatusMessage;

    public Optional<String> getVmExtensionStatusMessage() {
        return this.vmExtensionStatusMessage == null ? Optional.empty() : Optional.ofNullable(this.vmExtensionStatusMessage);
    }

    public ArtifactInstallPropertiesResponse(
        @Nullable String artifactId,
        @Nullable String artifactTitle,
        @Nullable String deploymentStatusMessage,
        @Nullable String installTime,
        @Nullable List<ArtifactParameterPropertiesResponse> parameters,
        @Nullable String status,
        @Nullable String vmExtensionStatusMessage) {
        this.artifactId = artifactId;
        this.artifactTitle = artifactTitle;
        this.deploymentStatusMessage = deploymentStatusMessage;
        this.installTime = installTime;
        this.parameters = parameters;
        this.status = status;
        this.vmExtensionStatusMessage = vmExtensionStatusMessage;
    }

    private ArtifactInstallPropertiesResponse() {
        this.artifactId = null;
        this.artifactTitle = null;
        this.deploymentStatusMessage = null;
        this.installTime = null;
        this.parameters = List.of();
        this.status = null;
        this.vmExtensionStatusMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArtifactInstallPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String artifactId;
        private @Nullable String artifactTitle;
        private @Nullable String deploymentStatusMessage;
        private @Nullable String installTime;
        private @Nullable List<ArtifactParameterPropertiesResponse> parameters;
        private @Nullable String status;
        private @Nullable String vmExtensionStatusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(ArtifactInstallPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactId = defaults.artifactId;
    	      this.artifactTitle = defaults.artifactTitle;
    	      this.deploymentStatusMessage = defaults.deploymentStatusMessage;
    	      this.installTime = defaults.installTime;
    	      this.parameters = defaults.parameters;
    	      this.status = defaults.status;
    	      this.vmExtensionStatusMessage = defaults.vmExtensionStatusMessage;
        }

        public Builder setArtifactId(@Nullable String artifactId) {
            this.artifactId = artifactId;
            return this;
        }

        public Builder setArtifactTitle(@Nullable String artifactTitle) {
            this.artifactTitle = artifactTitle;
            return this;
        }

        public Builder setDeploymentStatusMessage(@Nullable String deploymentStatusMessage) {
            this.deploymentStatusMessage = deploymentStatusMessage;
            return this;
        }

        public Builder setInstallTime(@Nullable String installTime) {
            this.installTime = installTime;
            return this;
        }

        public Builder setParameters(@Nullable List<ArtifactParameterPropertiesResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setVmExtensionStatusMessage(@Nullable String vmExtensionStatusMessage) {
            this.vmExtensionStatusMessage = vmExtensionStatusMessage;
            return this;
        }

        public ArtifactInstallPropertiesResponse build() {
            return new ArtifactInstallPropertiesResponse(artifactId, artifactTitle, deploymentStatusMessage, installTime, parameters, status, vmExtensionStatusMessage);
        }
    }
}
