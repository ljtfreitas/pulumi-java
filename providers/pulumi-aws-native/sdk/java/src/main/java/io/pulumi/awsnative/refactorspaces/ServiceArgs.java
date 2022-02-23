// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces;

import io.pulumi.awsnative.refactorspaces.enums.ServiceEndpointType;
import io.pulumi.awsnative.refactorspaces.inputs.ServiceLambdaEndpointInputArgs;
import io.pulumi.awsnative.refactorspaces.inputs.ServiceTagArgs;
import io.pulumi.awsnative.refactorspaces.inputs.ServiceUrlEndpointInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    @InputImport(name="applicationIdentifier", required=true)
        private final Input<String> applicationIdentifier;

    public Input<String> getApplicationIdentifier() {
        return this.applicationIdentifier;
    }

    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="endpointType")
        private final @Nullable Input<ServiceEndpointType> endpointType;

    public Input<ServiceEndpointType> getEndpointType() {
        return this.endpointType == null ? Input.empty() : this.endpointType;
    }

    @InputImport(name="environmentIdentifier", required=true)
        private final Input<String> environmentIdentifier;

    public Input<String> getEnvironmentIdentifier() {
        return this.environmentIdentifier;
    }

    @InputImport(name="lambdaEndpoint")
        private final @Nullable Input<ServiceLambdaEndpointInputArgs> lambdaEndpoint;

    public Input<ServiceLambdaEndpointInputArgs> getLambdaEndpoint() {
        return this.lambdaEndpoint == null ? Input.empty() : this.lambdaEndpoint;
    }

    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Metadata that you can assign to help organize the frameworks that you create. Each tag is a key-value pair.
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<List<ServiceTagArgs>> tags;

    public Input<List<ServiceTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="urlEndpoint")
        private final @Nullable Input<ServiceUrlEndpointInputArgs> urlEndpoint;

    public Input<ServiceUrlEndpointInputArgs> getUrlEndpoint() {
        return this.urlEndpoint == null ? Input.empty() : this.urlEndpoint;
    }

    @InputImport(name="vpcId")
        private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public ServiceArgs(
        Input<String> applicationIdentifier,
        @Nullable Input<String> description,
        @Nullable Input<ServiceEndpointType> endpointType,
        Input<String> environmentIdentifier,
        @Nullable Input<ServiceLambdaEndpointInputArgs> lambdaEndpoint,
        @Nullable Input<String> name,
        @Nullable Input<List<ServiceTagArgs>> tags,
        @Nullable Input<ServiceUrlEndpointInputArgs> urlEndpoint,
        @Nullable Input<String> vpcId) {
        this.applicationIdentifier = Objects.requireNonNull(applicationIdentifier, "expected parameter 'applicationIdentifier' to be non-null");
        this.description = description;
        this.endpointType = endpointType;
        this.environmentIdentifier = Objects.requireNonNull(environmentIdentifier, "expected parameter 'environmentIdentifier' to be non-null");
        this.lambdaEndpoint = lambdaEndpoint;
        this.name = name;
        this.tags = tags;
        this.urlEndpoint = urlEndpoint;
        this.vpcId = vpcId;
    }

    private ServiceArgs() {
        this.applicationIdentifier = Input.empty();
        this.description = Input.empty();
        this.endpointType = Input.empty();
        this.environmentIdentifier = Input.empty();
        this.lambdaEndpoint = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
        this.urlEndpoint = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> applicationIdentifier;
        private @Nullable Input<String> description;
        private @Nullable Input<ServiceEndpointType> endpointType;
        private Input<String> environmentIdentifier;
        private @Nullable Input<ServiceLambdaEndpointInputArgs> lambdaEndpoint;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ServiceTagArgs>> tags;
        private @Nullable Input<ServiceUrlEndpointInputArgs> urlEndpoint;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationIdentifier = defaults.applicationIdentifier;
    	      this.description = defaults.description;
    	      this.endpointType = defaults.endpointType;
    	      this.environmentIdentifier = defaults.environmentIdentifier;
    	      this.lambdaEndpoint = defaults.lambdaEndpoint;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.urlEndpoint = defaults.urlEndpoint;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setApplicationIdentifier(Input<String> applicationIdentifier) {
            this.applicationIdentifier = Objects.requireNonNull(applicationIdentifier);
            return this;
        }

        public Builder setApplicationIdentifier(String applicationIdentifier) {
            this.applicationIdentifier = Input.of(Objects.requireNonNull(applicationIdentifier));
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

        public Builder setEndpointType(@Nullable Input<ServiceEndpointType> endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        public Builder setEndpointType(@Nullable ServiceEndpointType endpointType) {
            this.endpointType = Input.ofNullable(endpointType);
            return this;
        }

        public Builder setEnvironmentIdentifier(Input<String> environmentIdentifier) {
            this.environmentIdentifier = Objects.requireNonNull(environmentIdentifier);
            return this;
        }

        public Builder setEnvironmentIdentifier(String environmentIdentifier) {
            this.environmentIdentifier = Input.of(Objects.requireNonNull(environmentIdentifier));
            return this;
        }

        public Builder setLambdaEndpoint(@Nullable Input<ServiceLambdaEndpointInputArgs> lambdaEndpoint) {
            this.lambdaEndpoint = lambdaEndpoint;
            return this;
        }

        public Builder setLambdaEndpoint(@Nullable ServiceLambdaEndpointInputArgs lambdaEndpoint) {
            this.lambdaEndpoint = Input.ofNullable(lambdaEndpoint);
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

        public Builder setTags(@Nullable Input<List<ServiceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ServiceTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setUrlEndpoint(@Nullable Input<ServiceUrlEndpointInputArgs> urlEndpoint) {
            this.urlEndpoint = urlEndpoint;
            return this;
        }

        public Builder setUrlEndpoint(@Nullable ServiceUrlEndpointInputArgs urlEndpoint) {
            this.urlEndpoint = Input.ofNullable(urlEndpoint);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public ServiceArgs build() {
            return new ServiceArgs(applicationIdentifier, description, endpointType, environmentIdentifier, lambdaEndpoint, name, tags, urlEndpoint, vpcId);
        }
    }
}
