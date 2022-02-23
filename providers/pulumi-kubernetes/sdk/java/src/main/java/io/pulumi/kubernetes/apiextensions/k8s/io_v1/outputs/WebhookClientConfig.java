// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1.outputs.ServiceReference;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WebhookClientConfig {
    /**
     * caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    private final @Nullable String caBundle;
    /**
     * service is a reference to the service for this webhook. Either service or url must be specified.
     * 
     * If the webhook is running within the cluster, then you should use `service`.
     * 
     */
    private final @Nullable ServiceReference service;
    /**
     * url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
     * 
     * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
     * 
     * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
     * 
     * The scheme must be "https"; the URL must begin with "https://".
     * 
     * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
     * 
     * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
     * 
     */
    private final @Nullable String url;

    @OutputCustomType.Constructor({"caBundle","service","url"})
    private WebhookClientConfig(
        @Nullable String caBundle,
        @Nullable ServiceReference service,
        @Nullable String url) {
        this.caBundle = caBundle;
        this.service = service;
        this.url = url;
    }

    /**
     * caBundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate. If unspecified, system trust roots on the apiserver are used.
     * 
     */
    public Optional<String> getCaBundle() {
        return Optional.ofNullable(this.caBundle);
    }
    /**
     * service is a reference to the service for this webhook. Either service or url must be specified.
     * 
     * If the webhook is running within the cluster, then you should use `service`.
     * 
     */
    public Optional<ServiceReference> getService() {
        return Optional.ofNullable(this.service);
    }
    /**
     * url gives the location of the webhook, in standard URL form (`scheme://host:port/path`). Exactly one of `url` or `service` must be specified.
     * 
     * The `host` should not refer to a service running in the cluster; use the `service` field instead. The host might be resolved via external DNS in some apiservers (e.g., `kube-apiserver` cannot resolve in-cluster DNS as that would be a layering violation). `host` may also be an IP address.
     * 
     * Please note that using `localhost` or `127.0.0.1` as a `host` is risky unless you take great care to run this webhook on all hosts which run an apiserver which might need to make calls to this webhook. Such installs are likely to be non-portable, i.e., not easy to turn up in a new cluster.
     * 
     * The scheme must be "https"; the URL must begin with "https://".
     * 
     * A path is optional, and if present may be any string permissible in a URL. You may use the path to pass an arbitrary string to the webhook, for example, a cluster identifier.
     * 
     * Attempting to use a user or basic auth e.g. "user:password@" is not allowed. Fragments ("#...") and query parameters ("?...") are not allowed, either.
     * 
     */
    public Optional<String> getUrl() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookClientConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String caBundle;
        private @Nullable ServiceReference service;
        private @Nullable String url;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookClientConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.caBundle = defaults.caBundle;
    	      this.service = defaults.service;
    	      this.url = defaults.url;
        }

        public Builder setCaBundle(@Nullable String caBundle) {
            this.caBundle = caBundle;
            return this;
        }

        public Builder setService(@Nullable ServiceReference service) {
            this.service = service;
            return this;
        }

        public Builder setUrl(@Nullable String url) {
            this.url = url;
            return this;
        }
        public WebhookClientConfig build() {
            return new WebhookClientConfig(caBundle, service, url);
        }
    }
}
