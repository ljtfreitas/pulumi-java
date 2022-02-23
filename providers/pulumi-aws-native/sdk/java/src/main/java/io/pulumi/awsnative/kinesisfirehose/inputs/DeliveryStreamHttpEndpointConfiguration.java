// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamHttpEndpointConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamHttpEndpointConfiguration Empty = new DeliveryStreamHttpEndpointConfiguration();

    @InputImport(name="accessKey")
        private final @Nullable String accessKey;

    public Optional<String> getAccessKey() {
        return this.accessKey == null ? Optional.empty() : Optional.ofNullable(this.accessKey);
    }

    @InputImport(name="name")
        private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="url", required=true)
        private final String url;

    public String getUrl() {
        return this.url;
    }

    public DeliveryStreamHttpEndpointConfiguration(
        @Nullable String accessKey,
        @Nullable String name,
        String url) {
        this.accessKey = accessKey;
        this.name = name;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private DeliveryStreamHttpEndpointConfiguration() {
        this.accessKey = null;
        this.name = null;
        this.url = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHttpEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String accessKey;
        private @Nullable String name;
        private String url;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHttpEndpointConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder setAccessKey(@Nullable String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public DeliveryStreamHttpEndpointConfiguration build() {
            return new DeliveryStreamHttpEndpointConfiguration(accessKey, name, url);
        }
    }
}
