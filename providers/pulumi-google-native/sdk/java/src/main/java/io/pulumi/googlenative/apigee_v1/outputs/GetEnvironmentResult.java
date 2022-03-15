// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigee_v1.outputs.GoogleCloudApigeeV1PropertiesResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEnvironmentResult {
    /**
     * Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
     * 
     */
    private final String apiProxyType;
    /**
     * Creation time of this environment as milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
     * 
     */
    private final String deploymentType;
    /**
     * Optional. Description of the environment.
     * 
     */
    private final String description;
    /**
     * Optional. Display name for this environment.
     * 
     */
    private final String displayName;
    /**
     * Last modification time of this environment as milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
     * 
     */
    private final String name;
    /**
     * Optional. Key-value pairs that may be used for customizing the environment.
     * 
     */
    private final GoogleCloudApigeeV1PropertiesResponse properties;
    /**
     * State of the environment. Values other than ACTIVE means the resource is not ready to use.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetEnvironmentResult(
        @CustomType.Parameter("apiProxyType") String apiProxyType,
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("deploymentType") String deploymentType,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") GoogleCloudApigeeV1PropertiesResponse properties,
        @CustomType.Parameter("state") String state) {
        this.apiProxyType = apiProxyType;
        this.createdAt = createdAt;
        this.deploymentType = deploymentType;
        this.description = description;
        this.displayName = displayName;
        this.lastModifiedAt = lastModifiedAt;
        this.name = name;
        this.properties = properties;
        this.state = state;
    }

    /**
     * Optional. API Proxy type supported by the environment. The type can be set when creating the Environment and cannot be changed.
     * 
    */
    public String getApiProxyType() {
        return this.apiProxyType;
    }
    /**
     * Creation time of this environment as milliseconds since epoch.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Optional. Deployment type supported by the environment. The deployment type can be set when creating the environment and cannot be changed. When you enable archive deployment, you will be **prevented from performing** a [subset of actions](/apigee/docs/api-platform/local-development/overview#prevented-actions) within the environment, including: * Managing the deployment of API proxy or shared flow revisions * Creating, updating, or deleting resource files * Creating, updating, or deleting target servers
     * 
    */
    public String getDeploymentType() {
        return this.deploymentType;
    }
    /**
     * Optional. Description of the environment.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Optional. Display name for this environment.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Last modification time of this environment as milliseconds since epoch.
     * 
    */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Name of the environment. Values must match the regular expression `^[.\\p{Alnum}-_]{1,255}$`
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Key-value pairs that may be used for customizing the environment.
     * 
    */
    public GoogleCloudApigeeV1PropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * State of the environment. Values other than ACTIVE means the resource is not ready to use.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiProxyType;
        private String createdAt;
        private String deploymentType;
        private String description;
        private String displayName;
        private String lastModifiedAt;
        private String name;
        private GoogleCloudApigeeV1PropertiesResponse properties;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiProxyType = defaults.apiProxyType;
    	      this.createdAt = defaults.createdAt;
    	      this.deploymentType = defaults.deploymentType;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.state = defaults.state;
        }

        public Builder apiProxyType(String apiProxyType) {
            this.apiProxyType = Objects.requireNonNull(apiProxyType);
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder deploymentType(String deploymentType) {
            this.deploymentType = Objects.requireNonNull(deploymentType);
            return this;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder properties(GoogleCloudApigeeV1PropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(apiProxyType, createdAt, deploymentType, description, displayName, lastModifiedAt, name, properties, state);
        }
    }
}
