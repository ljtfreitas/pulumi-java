// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.enums.EnvironmentApiProxyType;
import io.pulumi.googlenative.apigee_v1.enums.EnvironmentDeploymentType;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleCloudApigeeV1PropertiesArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentArgs Empty = new EnvironmentArgs();

    /**
     * Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
     * 
     */
    @InputImport(name="apiProxyType")
      private final @Nullable Input<EnvironmentApiProxyType> apiProxyType;

    public Input<EnvironmentApiProxyType> getApiProxyType() {
        return this.apiProxyType == null ? Input.empty() : this.apiProxyType;
    }

    /**
     * Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
     * 
     */
    @InputImport(name="deploymentType")
      private final @Nullable Input<EnvironmentDeploymentType> deploymentType;

    public Input<EnvironmentDeploymentType> getDeploymentType() {
        return this.deploymentType == null ? Input.empty() : this.deploymentType;
    }

    /**
     * Optional. Description of the environment.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Optional. Display name for this environment.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="organizationId", required=true)
      private final Input<String> organizationId;

    public Input<String> getOrganizationId() {
        return this.organizationId;
    }

    /**
     * Optional. Key-value pairs that may be used for customizing the environment.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<GoogleCloudApigeeV1PropertiesArgs> properties;

    public Input<GoogleCloudApigeeV1PropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public EnvironmentArgs(
        @Nullable Input<EnvironmentApiProxyType> apiProxyType,
        @Nullable Input<EnvironmentDeploymentType> deploymentType,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        @Nullable Input<String> name,
        Input<String> organizationId,
        @Nullable Input<GoogleCloudApigeeV1PropertiesArgs> properties) {
        this.apiProxyType = apiProxyType;
        this.deploymentType = deploymentType;
        this.description = description;
        this.displayName = displayName;
        this.name = name;
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
        this.properties = properties;
    }

    private EnvironmentArgs() {
        this.apiProxyType = Input.empty();
        this.deploymentType = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
        this.organizationId = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EnvironmentApiProxyType> apiProxyType;
        private @Nullable Input<EnvironmentDeploymentType> deploymentType;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> name;
        private Input<String> organizationId;
        private @Nullable Input<GoogleCloudApigeeV1PropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProxyType = defaults.apiProxyType;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
    	      this.organizationId = defaults.organizationId;
    	      this.properties = defaults.properties;
        }

        public Builder setApiProxyType(@Nullable Input<EnvironmentApiProxyType> apiProxyType) {
            this.apiProxyType = apiProxyType;
            return this;
        }

        public Builder setApiProxyType(@Nullable EnvironmentApiProxyType apiProxyType) {
            this.apiProxyType = Input.ofNullable(apiProxyType);
            return this;
        }

        public Builder setDeploymentType(@Nullable Input<EnvironmentDeploymentType> deploymentType) {
            this.deploymentType = deploymentType;
            return this;
        }

        public Builder setDeploymentType(@Nullable EnvironmentDeploymentType deploymentType) {
            this.deploymentType = Input.ofNullable(deploymentType);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
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

        public Builder setOrganizationId(Input<String> organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }

        public Builder setOrganizationId(String organizationId) {
            this.organizationId = Input.of(Objects.requireNonNull(organizationId));
            return this;
        }

        public Builder setProperties(@Nullable Input<GoogleCloudApigeeV1PropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable GoogleCloudApigeeV1PropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public EnvironmentArgs build() {
            return new EnvironmentArgs(apiProxyType, deploymentType, description, displayName, name, organizationId, properties);
        }
    }
}
