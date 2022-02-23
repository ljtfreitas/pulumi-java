// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.EndpointDeploymentConfigGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointState extends io.pulumi.resources.ResourceArgs {

    public static final EndpointState Empty = new EndpointState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this endpoint.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * The deployment configuration for an endpoint, which contains the desired deployment strategy and rollback configurations. See Deployment Config.
     * 
     */
    @InputImport(name="deploymentConfig")
    private final @Nullable Input<EndpointDeploymentConfigGetArgs> deploymentConfig;

    public Input<EndpointDeploymentConfigGetArgs> getDeploymentConfig() {
        return this.deploymentConfig == null ? Input.empty() : this.deploymentConfig;
    }

    /**
     * The name of the endpoint configuration to use.
     * 
     */
    @InputImport(name="endpointConfigName")
    private final @Nullable Input<String> endpointConfigName;

    public Input<String> getEndpointConfigName() {
        return this.endpointConfigName == null ? Input.empty() : this.endpointConfigName;
    }

    /**
     * The name of the endpoint.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    public EndpointState(
        @Nullable Input<String> arn,
        @Nullable Input<EndpointDeploymentConfigGetArgs> deploymentConfig,
        @Nullable Input<String> endpointConfigName,
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.deploymentConfig = deploymentConfig;
        this.endpointConfigName = endpointConfigName;
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private EndpointState() {
        this.arn = Input.empty();
        this.deploymentConfig = Input.empty();
        this.endpointConfigName = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<EndpointDeploymentConfigGetArgs> deploymentConfig;
        private @Nullable Input<String> endpointConfigName;
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.deploymentConfig = defaults.deploymentConfig;
    	      this.endpointConfigName = defaults.endpointConfigName;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDeploymentConfig(@Nullable Input<EndpointDeploymentConfigGetArgs> deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }

        public Builder setDeploymentConfig(@Nullable EndpointDeploymentConfigGetArgs deploymentConfig) {
            this.deploymentConfig = Input.ofNullable(deploymentConfig);
            return this;
        }

        public Builder setEndpointConfigName(@Nullable Input<String> endpointConfigName) {
            this.endpointConfigName = endpointConfigName;
            return this;
        }

        public Builder setEndpointConfigName(@Nullable String endpointConfigName) {
            this.endpointConfigName = Input.ofNullable(endpointConfigName);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }
        public EndpointState build() {
            return new EndpointState(arn, deploymentConfig, endpointConfigName, name, tags, tagsAll);
        }
    }
}
