// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Webhook notification of an autoscale event.
 * 
 */
public final class WebhookNotificationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebhookNotificationArgs Empty = new WebhookNotificationArgs();

    /**
     * a property bag of settings. This value can be empty.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * the service address to receive the notification.
     * 
     */
    @InputImport(name="serviceUri")
        private final @Nullable Input<String> serviceUri;

    public Input<String> getServiceUri() {
        return this.serviceUri == null ? Input.empty() : this.serviceUri;
    }

    public WebhookNotificationArgs(
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<String> serviceUri) {
        this.properties = properties;
        this.serviceUri = serviceUri;
    }

    private WebhookNotificationArgs() {
        this.properties = Input.empty();
        this.serviceUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebhookNotificationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<String> serviceUri;

        public Builder() {
    	      // Empty
        }

        public Builder(WebhookNotificationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.serviceUri = defaults.serviceUri;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setServiceUri(@Nullable Input<String> serviceUri) {
            this.serviceUri = serviceUri;
            return this;
        }

        public Builder setServiceUri(@Nullable String serviceUri) {
            this.serviceUri = Input.ofNullable(serviceUri);
            return this;
        }
        public WebhookNotificationArgs build() {
            return new WebhookNotificationArgs(properties, serviceUri);
        }
    }
}
