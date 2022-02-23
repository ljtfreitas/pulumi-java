// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class DeploymentResponse {
    /**
     * Address of the runtime element hosting this deployment.
     * 
     */
    private final String address;
    /**
     * Configuration used to create this deployment.
     * 
     */
    private final String config;
    /**
     * Beginning of the lifetime of this deployment.
     * 
     */
    private final String deployTime;
    /**
     * Platform hosting this deployment.
     * 
     */
    private final String platform;
    /**
     * Resource URI for the artifact being deployed taken from the deployable field with the same name.
     * 
     */
    private final List<String> resourceUri;
    /**
     * End of the lifetime of this deployment.
     * 
     */
    private final String undeployTime;
    /**
     * Identity of the user that triggered this deployment.
     * 
     */
    private final String userEmail;

    @OutputCustomType.Constructor({"address","config","deployTime","platform","resourceUri","undeployTime","userEmail"})
    private DeploymentResponse(
        String address,
        String config,
        String deployTime,
        String platform,
        List<String> resourceUri,
        String undeployTime,
        String userEmail) {
        this.address = Objects.requireNonNull(address);
        this.config = Objects.requireNonNull(config);
        this.deployTime = Objects.requireNonNull(deployTime);
        this.platform = Objects.requireNonNull(platform);
        this.resourceUri = Objects.requireNonNull(resourceUri);
        this.undeployTime = Objects.requireNonNull(undeployTime);
        this.userEmail = Objects.requireNonNull(userEmail);
    }

    /**
     * Address of the runtime element hosting this deployment.
     * 
     */
    public String getAddress() {
        return this.address;
    }
    /**
     * Configuration used to create this deployment.
     * 
     */
    public String getConfig() {
        return this.config;
    }
    /**
     * Beginning of the lifetime of this deployment.
     * 
     */
    public String getDeployTime() {
        return this.deployTime;
    }
    /**
     * Platform hosting this deployment.
     * 
     */
    public String getPlatform() {
        return this.platform;
    }
    /**
     * Resource URI for the artifact being deployed taken from the deployable field with the same name.
     * 
     */
    public List<String> getResourceUri() {
        return this.resourceUri;
    }
    /**
     * End of the lifetime of this deployment.
     * 
     */
    public String getUndeployTime() {
        return this.undeployTime;
    }
    /**
     * Identity of the user that triggered this deployment.
     * 
     */
    public String getUserEmail() {
        return this.userEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String config;
        private String deployTime;
        private String platform;
        private List<String> resourceUri;
        private String undeployTime;
        private String userEmail;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.config = defaults.config;
    	      this.deployTime = defaults.deployTime;
    	      this.platform = defaults.platform;
    	      this.resourceUri = defaults.resourceUri;
    	      this.undeployTime = defaults.undeployTime;
    	      this.userEmail = defaults.userEmail;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setConfig(String config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setDeployTime(String deployTime) {
            this.deployTime = Objects.requireNonNull(deployTime);
            return this;
        }

        public Builder setPlatform(String platform) {
            this.platform = Objects.requireNonNull(platform);
            return this;
        }

        public Builder setResourceUri(List<String> resourceUri) {
            this.resourceUri = Objects.requireNonNull(resourceUri);
            return this;
        }

        public Builder setUndeployTime(String undeployTime) {
            this.undeployTime = Objects.requireNonNull(undeployTime);
            return this;
        }

        public Builder setUserEmail(String userEmail) {
            this.userEmail = Objects.requireNonNull(userEmail);
            return this;
        }
        public DeploymentResponse build() {
            return new DeploymentResponse(address, config, deployTime, platform, resourceUri, undeployTime, userEmail);
        }
    }
}
