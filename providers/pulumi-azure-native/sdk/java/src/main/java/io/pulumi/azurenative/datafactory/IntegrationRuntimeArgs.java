// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.datafactory.inputs.ManagedIntegrationRuntimeArgs;
import io.pulumi.azurenative.datafactory.inputs.SelfHostedIntegrationRuntimeArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationRuntimeArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeArgs Empty = new IntegrationRuntimeArgs();

    /**
     * The factory name.
     * 
     */
    @InputImport(name="factoryName", required=true)
    private final Input<String> factoryName;

    public Input<String> getFactoryName() {
        return this.factoryName;
    }

    /**
     * The integration runtime name.
     * 
     */
    @InputImport(name="integrationRuntimeName")
    private final @Nullable Input<String> integrationRuntimeName;

    public Input<String> getIntegrationRuntimeName() {
        return this.integrationRuntimeName == null ? Input.empty() : this.integrationRuntimeName;
    }

    /**
     * Integration runtime properties.
     * 
     */
    @InputImport(name="properties", required=true)
    private final Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties;

    public Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> getProperties() {
        return this.properties;
    }

    /**
     * The resource group name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public IntegrationRuntimeArgs(
        Input<String> factoryName,
        @Nullable Input<String> integrationRuntimeName,
        Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties,
        Input<String> resourceGroupName) {
        this.factoryName = Objects.requireNonNull(factoryName, "expected parameter 'factoryName' to be non-null");
        this.integrationRuntimeName = integrationRuntimeName;
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private IntegrationRuntimeArgs() {
        this.factoryName = Input.empty();
        this.integrationRuntimeName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> factoryName;
        private @Nullable Input<String> integrationRuntimeName;
        private Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.factoryName = defaults.factoryName;
    	      this.integrationRuntimeName = defaults.integrationRuntimeName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setFactoryName(Input<String> factoryName) {
            this.factoryName = Objects.requireNonNull(factoryName);
            return this;
        }

        public Builder setFactoryName(String factoryName) {
            this.factoryName = Input.of(Objects.requireNonNull(factoryName));
            return this;
        }

        public Builder setIntegrationRuntimeName(@Nullable Input<String> integrationRuntimeName) {
            this.integrationRuntimeName = integrationRuntimeName;
            return this;
        }

        public Builder setIntegrationRuntimeName(@Nullable String integrationRuntimeName) {
            this.integrationRuntimeName = Input.ofNullable(integrationRuntimeName);
            return this;
        }

        public Builder setProperties(Input<Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs>> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(Either<ManagedIntegrationRuntimeArgs,SelfHostedIntegrationRuntimeArgs> properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public IntegrationRuntimeArgs build() {
            return new IntegrationRuntimeArgs(factoryName, integrationRuntimeName, properties, resourceGroupName);
        }
    }
}
