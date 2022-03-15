// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="httpProxy")
      private final @Nullable Output<String> httpProxy;

    public Output<String> getHttpProxy() {
        return this.httpProxy == null ? Output.empty() : this.httpProxy;
    }

    /**
     * HTTPS proxy server endpoint to use.
     * 
     */
    @Import(name="httpsProxy")
      private final @Nullable Output<String> httpsProxy;

    public Output<String> getHttpsProxy() {
        return this.httpsProxy == null ? Output.empty() : this.httpsProxy;
    }

    /**
     * Endpoints that should not go through proxy.
     * 
     */
    @Import(name="noProxy")
      private final @Nullable Output<List<String>> noProxy;

    public Output<List<String>> getNoProxy() {
        return this.noProxy == null ? Output.empty() : this.noProxy;
    }

    /**
     * Alternative CA cert to use for connecting to proxy servers.
     * 
     */
    @Import(name="trustedCa")
      private final @Nullable Output<String> trustedCa;

    public Output<String> getTrustedCa() {
        return this.trustedCa == null ? Output.empty() : this.trustedCa;
    }

    public ManagedClusterHTTPProxyConfigArgs(
        @Nullable Output<String> httpProxy,
        @Nullable Output<String> httpsProxy,
        @Nullable Output<List<String>> noProxy,
        @Nullable Output<String> trustedCa) {
        this.httpProxy = httpProxy;
        this.httpsProxy = httpsProxy;
        this.noProxy = noProxy;
        this.trustedCa = trustedCa;
    }

    private ManagedClusterHTTPProxyConfigArgs() {
        this.httpProxy = Output.empty();
        this.httpsProxy = Output.empty();
        this.noProxy = Output.empty();
        this.trustedCa = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterHTTPProxyConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> httpProxy;
        private @Nullable Output<String> httpsProxy;
        private @Nullable Output<List<String>> noProxy;
        private @Nullable Output<String> trustedCa;

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

        public Builder httpProxy(@Nullable Output<String> httpProxy) {
            this.httpProxy = httpProxy;
            return this;
        }

        public Builder httpProxy(@Nullable String httpProxy) {
            this.httpProxy = Output.ofNullable(httpProxy);
            return this;
        }

        public Builder httpsProxy(@Nullable Output<String> httpsProxy) {
            this.httpsProxy = httpsProxy;
            return this;
        }

        public Builder httpsProxy(@Nullable String httpsProxy) {
            this.httpsProxy = Output.ofNullable(httpsProxy);
            return this;
        }

        public Builder noProxy(@Nullable Output<List<String>> noProxy) {
            this.noProxy = noProxy;
            return this;
        }

        public Builder noProxy(@Nullable List<String> noProxy) {
            this.noProxy = Output.ofNullable(noProxy);
            return this;
        }

        public Builder trustedCa(@Nullable Output<String> trustedCa) {
            this.trustedCa = trustedCa;
            return this;
        }

        public Builder trustedCa(@Nullable String trustedCa) {
            this.trustedCa = Output.ofNullable(trustedCa);
            return this;
        }
        public ManagedClusterHTTPProxyConfigArgs build() {
            return new ManagedClusterHTTPProxyConfigArgs(httpProxy, httpsProxy, noProxy, trustedCa);
        }
    }
}
