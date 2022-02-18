// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Configurations for provisioning the cluster with HTTP proxy servers.
 * 
 */
public final class ManagedClusterHTTPProxyConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedClusterHTTPProxyConfigArgs Empty = new ManagedClusterHTTPProxyConfigArgs();

    /**
     * HTTP proxy server endpoint to use.
     * 
     */
    @InputImport(name="httpProxy")
    private final @Nullable Input<String> httpProxy;

    public Input<String> getHttpProxy() {
        return this.httpProxy == null ? Input.empty() : this.httpProxy;
    }

    /**
     * HTTPS proxy server endpoint to use.
     * 
     */
    @InputImport(name="httpsProxy")
    private final @Nullable Input<String> httpsProxy;

    public Input<String> getHttpsProxy() {
        return this.httpsProxy == null ? Input.empty() : this.httpsProxy;
    }

    /**
     * Endpoints that should not go through proxy.
     * 
     */
    @InputImport(name="noProxy")
    private final @Nullable Input<List<String>> noProxy;

    public Input<List<String>> getNoProxy() {
        return this.noProxy == null ? Input.empty() : this.noProxy;
    }

    /**
     * Alternative CA cert to use for connecting to proxy servers.
     * 
     */
    @InputImport(name="trustedCa")
    private final @Nullable Input<String> trustedCa;

    public Input<String> getTrustedCa() {
        return this.trustedCa == null ? Input.empty() : this.trustedCa;
    }

    public ManagedClusterHTTPProxyConfigArgs(
        @Nullable Input<String> httpProxy,
        @Nullable Input<String> httpsProxy,
        @Nullable Input<List<String>> noProxy,
        @Nullable Input<String> trustedCa) {
        this.httpProxy = httpProxy;
        this.httpsProxy = httpsProxy;
        this.noProxy = noProxy;
        this.trustedCa = trustedCa;
    }

    private ManagedClusterHTTPProxyConfigArgs() {
        this.httpProxy = Input.empty();
        this.httpsProxy = Input.empty();
        this.noProxy = Input.empty();
        this.trustedCa = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterHTTPProxyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> httpProxy;
        private @Nullable Input<String> httpsProxy;
        private @Nullable Input<List<String>> noProxy;
        private @Nullable Input<String> trustedCa;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterHTTPProxyConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpProxy = defaults.httpProxy;
    	      this.httpsProxy = defaults.httpsProxy;
    	      this.noProxy = defaults.noProxy;
    	      this.trustedCa = defaults.trustedCa;
        }

        public Builder setHttpProxy(@Nullable Input<String> httpProxy) {
            this.httpProxy = httpProxy;
            return this;
        }

        public Builder setHttpProxy(@Nullable String httpProxy) {
            this.httpProxy = Input.ofNullable(httpProxy);
            return this;
        }

        public Builder setHttpsProxy(@Nullable Input<String> httpsProxy) {
            this.httpsProxy = httpsProxy;
            return this;
        }

        public Builder setHttpsProxy(@Nullable String httpsProxy) {
            this.httpsProxy = Input.ofNullable(httpsProxy);
            return this;
        }

        public Builder setNoProxy(@Nullable Input<List<String>> noProxy) {
            this.noProxy = noProxy;
            return this;
        }

        public Builder setNoProxy(@Nullable List<String> noProxy) {
            this.noProxy = Input.ofNullable(noProxy);
            return this;
        }

        public Builder setTrustedCa(@Nullable Input<String> trustedCa) {
            this.trustedCa = trustedCa;
            return this;
        }

        public Builder setTrustedCa(@Nullable String trustedCa) {
            this.trustedCa = Input.ofNullable(trustedCa);
            return this;
        }

        public ManagedClusterHTTPProxyConfigArgs build() {
            return new ManagedClusterHTTPProxyConfigArgs(httpProxy, httpsProxy, noProxy, trustedCa);
        }
    }
}
