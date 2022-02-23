// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs Empty = new DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs();

    /**
     * The name of the container repository where the output container image is stored. This name is prefixed by the repository location.
     * 
     */
    @InputImport(name="repositoryName", required=true)
    private final Input<String> repositoryName;

    public Input<String> getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * The service in which this image is registered. Valid values: `ECR`.
     * 
     */
    @InputImport(name="service", required=true)
    private final Input<String> service;

    public Input<String> getService() {
        return this.service;
    }

    public DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs(
        Input<String> repositoryName,
        Input<String> service) {
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs() {
        this.repositoryName = Input.empty();
        this.service = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> repositoryName;
        private Input<String> service;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder setRepositoryName(Input<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }

        public Builder setRepositoryName(String repositoryName) {
            this.repositoryName = Input.of(Objects.requireNonNull(repositoryName));
            return this;
        }

        public Builder setService(Input<String> service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public Builder setService(String service) {
            this.service = Input.of(Objects.requireNonNull(service));
            return this;
        }
        public DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs build() {
            return new DistributionConfigurationDistributionContainerDistributionConfigurationTargetRepositoryGetArgs(repositoryName, service);
        }
    }
}