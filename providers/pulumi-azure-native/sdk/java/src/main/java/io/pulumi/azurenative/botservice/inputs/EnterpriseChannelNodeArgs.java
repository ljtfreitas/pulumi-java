// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.enums.EnterpriseChannelNodeState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties specific to an Enterprise Channel Node.
 * 
 */
public final class EnterpriseChannelNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnterpriseChannelNodeArgs Empty = new EnterpriseChannelNodeArgs();

    /**
     * The location of the Enterprise Channel Node.
     * 
     */
    @InputImport(name="azureLocation", required=true)
    private final Input<String> azureLocation;

    public Input<String> getAzureLocation() {
        return this.azureLocation;
    }

    /**
     * The sku of the Enterprise Channel Node.
     * 
     */
    @InputImport(name="azureSku", required=true)
    private final Input<String> azureSku;

    public Input<String> getAzureSku() {
        return this.azureSku;
    }

    /**
     * The name of the Enterprise Channel Node.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * The current state of the Enterprise Channel Node.
     * 
     */
    @InputImport(name="state")
    private final @Nullable Input<Either<String,EnterpriseChannelNodeState>> state;

    public Input<Either<String,EnterpriseChannelNodeState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public EnterpriseChannelNodeArgs(
        Input<String> azureLocation,
        Input<String> azureSku,
        Input<String> name,
        @Nullable Input<Either<String,EnterpriseChannelNodeState>> state) {
        this.azureLocation = Objects.requireNonNull(azureLocation, "expected parameter 'azureLocation' to be non-null");
        this.azureSku = Objects.requireNonNull(azureSku, "expected parameter 'azureSku' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.state = state;
    }

    private EnterpriseChannelNodeArgs() {
        this.azureLocation = Input.empty();
        this.azureSku = Input.empty();
        this.name = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnterpriseChannelNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> azureLocation;
        private Input<String> azureSku;
        private Input<String> name;
        private @Nullable Input<Either<String,EnterpriseChannelNodeState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(EnterpriseChannelNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureLocation = defaults.azureLocation;
    	      this.azureSku = defaults.azureSku;
    	      this.name = defaults.name;
    	      this.state = defaults.state;
        }

        public Builder setAzureLocation(Input<String> azureLocation) {
            this.azureLocation = Objects.requireNonNull(azureLocation);
            return this;
        }

        public Builder setAzureLocation(String azureLocation) {
            this.azureLocation = Input.of(Objects.requireNonNull(azureLocation));
            return this;
        }

        public Builder setAzureSku(Input<String> azureSku) {
            this.azureSku = Objects.requireNonNull(azureSku);
            return this;
        }

        public Builder setAzureSku(String azureSku) {
            this.azureSku = Input.of(Objects.requireNonNull(azureSku));
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,EnterpriseChannelNodeState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,EnterpriseChannelNodeState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public EnterpriseChannelNodeArgs build() {
            return new EnterpriseChannelNodeArgs(azureLocation, azureSku, name, state);
        }
    }
}
