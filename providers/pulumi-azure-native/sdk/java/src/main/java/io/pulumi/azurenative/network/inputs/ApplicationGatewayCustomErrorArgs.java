// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewayCustomErrorStatusCode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Customer error of an application gateway.
 * 
 */
public final class ApplicationGatewayCustomErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayCustomErrorArgs Empty = new ApplicationGatewayCustomErrorArgs();

    /**
     * Error page URL of the application gateway customer error.
     * 
     */
    @InputImport(name="customErrorPageUrl")
    private final @Nullable Input<String> customErrorPageUrl;

    public Input<String> getCustomErrorPageUrl() {
        return this.customErrorPageUrl == null ? Input.empty() : this.customErrorPageUrl;
    }

    /**
     * Status code of the application gateway customer error.
     * 
     */
    @InputImport(name="statusCode")
    private final @Nullable Input<Either<String,ApplicationGatewayCustomErrorStatusCode>> statusCode;

    public Input<Either<String,ApplicationGatewayCustomErrorStatusCode>> getStatusCode() {
        return this.statusCode == null ? Input.empty() : this.statusCode;
    }

    public ApplicationGatewayCustomErrorArgs(
        @Nullable Input<String> customErrorPageUrl,
        @Nullable Input<Either<String,ApplicationGatewayCustomErrorStatusCode>> statusCode) {
        this.customErrorPageUrl = customErrorPageUrl;
        this.statusCode = statusCode;
    }

    private ApplicationGatewayCustomErrorArgs() {
        this.customErrorPageUrl = Input.empty();
        this.statusCode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayCustomErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customErrorPageUrl;
        private @Nullable Input<Either<String,ApplicationGatewayCustomErrorStatusCode>> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayCustomErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customErrorPageUrl = defaults.customErrorPageUrl;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder setCustomErrorPageUrl(@Nullable Input<String> customErrorPageUrl) {
            this.customErrorPageUrl = customErrorPageUrl;
            return this;
        }

        public Builder setCustomErrorPageUrl(@Nullable String customErrorPageUrl) {
            this.customErrorPageUrl = Input.ofNullable(customErrorPageUrl);
            return this;
        }

        public Builder setStatusCode(@Nullable Input<Either<String,ApplicationGatewayCustomErrorStatusCode>> statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public Builder setStatusCode(@Nullable Either<String,ApplicationGatewayCustomErrorStatusCode> statusCode) {
            this.statusCode = Input.ofNullable(statusCode);
            return this;
        }

        public ApplicationGatewayCustomErrorArgs build() {
            return new ApplicationGatewayCustomErrorArgs(customErrorPageUrl, statusCode);
        }
    }
}
