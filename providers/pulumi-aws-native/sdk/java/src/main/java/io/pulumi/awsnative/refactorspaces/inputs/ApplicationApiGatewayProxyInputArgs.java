// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.inputs;

import io.pulumi.awsnative.refactorspaces.enums.ApplicationApiGatewayEndpointType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationApiGatewayProxyInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationApiGatewayProxyInputArgs Empty = new ApplicationApiGatewayProxyInputArgs();

    @InputImport(name="endpointType")
        private final @Nullable Input<ApplicationApiGatewayEndpointType> endpointType;

    public Input<ApplicationApiGatewayEndpointType> getEndpointType() {
        return this.endpointType == null ? Input.empty() : this.endpointType;
    }

    @InputImport(name="stageName")
        private final @Nullable Input<String> stageName;

    public Input<String> getStageName() {
        return this.stageName == null ? Input.empty() : this.stageName;
    }

    public ApplicationApiGatewayProxyInputArgs(
        @Nullable Input<ApplicationApiGatewayEndpointType> endpointType,
        @Nullable Input<String> stageName) {
        this.endpointType = endpointType;
        this.stageName = stageName;
    }

    private ApplicationApiGatewayProxyInputArgs() {
        this.endpointType = Input.empty();
        this.stageName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApiGatewayProxyInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationApiGatewayEndpointType> endpointType;
        private @Nullable Input<String> stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApiGatewayProxyInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.stageName = defaults.stageName;
        }

        public Builder setEndpointType(@Nullable Input<ApplicationApiGatewayEndpointType> endpointType) {
            this.endpointType = endpointType;
            return this;
        }

        public Builder setEndpointType(@Nullable ApplicationApiGatewayEndpointType endpointType) {
            this.endpointType = Input.ofNullable(endpointType);
            return this;
        }

        public Builder setStageName(@Nullable Input<String> stageName) {
            this.stageName = stageName;
            return this;
        }

        public Builder setStageName(@Nullable String stageName) {
            this.stageName = Input.ofNullable(stageName);
            return this;
        }
        public ApplicationApiGatewayProxyInputArgs build() {
            return new ApplicationApiGatewayProxyInputArgs(endpointType, stageName);
        }
    }
}
