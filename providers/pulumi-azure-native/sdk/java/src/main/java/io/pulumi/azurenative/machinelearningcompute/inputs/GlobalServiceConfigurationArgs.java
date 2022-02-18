// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.inputs.AutoScaleConfigurationArgs;
import io.pulumi.azurenative.machinelearningcompute.inputs.ServiceAuthConfigurationArgs;
import io.pulumi.azurenative.machinelearningcompute.inputs.SslConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Global configuration for services in the cluster.
 * 
 */
public final class GlobalServiceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final GlobalServiceConfigurationArgs Empty = new GlobalServiceConfigurationArgs();

    /**
     * The auto-scale configuration
     * 
     */
    @InputImport(name="autoScale")
    private final @Nullable Input<AutoScaleConfigurationArgs> autoScale;

    public Input<AutoScaleConfigurationArgs> getAutoScale() {
        return this.autoScale == null ? Input.empty() : this.autoScale;
    }

    /**
     * The configuration ETag for updates.
     * 
     */
    @InputImport(name="etag")
    private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * Optional global authorization keys for all user services deployed in cluster. These are used if the service does not have auth keys.
     * 
     */
    @InputImport(name="serviceAuth")
    private final @Nullable Input<ServiceAuthConfigurationArgs> serviceAuth;

    public Input<ServiceAuthConfigurationArgs> getServiceAuth() {
        return this.serviceAuth == null ? Input.empty() : this.serviceAuth;
    }

    /**
     * The SSL configuration properties
     * 
     */
    @InputImport(name="ssl")
    private final @Nullable Input<SslConfigurationArgs> ssl;

    public Input<SslConfigurationArgs> getSsl() {
        return this.ssl == null ? Input.empty() : this.ssl;
    }

    public GlobalServiceConfigurationArgs(
        @Nullable Input<AutoScaleConfigurationArgs> autoScale,
        @Nullable Input<String> etag,
        @Nullable Input<ServiceAuthConfigurationArgs> serviceAuth,
        @Nullable Input<SslConfigurationArgs> ssl) {
        this.autoScale = autoScale;
        this.etag = etag;
        this.serviceAuth = serviceAuth;
        this.ssl = ssl;
    }

    private GlobalServiceConfigurationArgs() {
        this.autoScale = Input.empty();
        this.etag = Input.empty();
        this.serviceAuth = Input.empty();
        this.ssl = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalServiceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AutoScaleConfigurationArgs> autoScale;
        private @Nullable Input<String> etag;
        private @Nullable Input<ServiceAuthConfigurationArgs> serviceAuth;
        private @Nullable Input<SslConfigurationArgs> ssl;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalServiceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScale = defaults.autoScale;
    	      this.etag = defaults.etag;
    	      this.serviceAuth = defaults.serviceAuth;
    	      this.ssl = defaults.ssl;
        }

        public Builder setAutoScale(@Nullable Input<AutoScaleConfigurationArgs> autoScale) {
            this.autoScale = autoScale;
            return this;
        }

        public Builder setAutoScale(@Nullable AutoScaleConfigurationArgs autoScale) {
            this.autoScale = Input.ofNullable(autoScale);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setServiceAuth(@Nullable Input<ServiceAuthConfigurationArgs> serviceAuth) {
            this.serviceAuth = serviceAuth;
            return this;
        }

        public Builder setServiceAuth(@Nullable ServiceAuthConfigurationArgs serviceAuth) {
            this.serviceAuth = Input.ofNullable(serviceAuth);
            return this;
        }

        public Builder setSsl(@Nullable Input<SslConfigurationArgs> ssl) {
            this.ssl = ssl;
            return this;
        }

        public Builder setSsl(@Nullable SslConfigurationArgs ssl) {
            this.ssl = Input.ofNullable(ssl);
            return this;
        }

        public GlobalServiceConfigurationArgs build() {
            return new GlobalServiceConfigurationArgs(autoScale, etag, serviceAuth, ssl);
        }
    }
}
