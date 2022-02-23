// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeliveryStreamHttpEndpointConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamHttpEndpointConfigurationArgs Empty = new DeliveryStreamHttpEndpointConfigurationArgs();

    @InputImport(name="accessKey")
        private final @Nullable Input<String> accessKey;

    public Input<String> getAccessKey() {
        return this.accessKey == null ? Input.empty() : this.accessKey;
    }

    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="url", required=true)
        private final Input<String> url;

    public Input<String> getUrl() {
        return this.url;
    }

    public DeliveryStreamHttpEndpointConfigurationArgs(
        @Nullable Input<String> accessKey,
        @Nullable Input<String> name,
        Input<String> url) {
        this.accessKey = accessKey;
        this.name = name;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
    }

    private DeliveryStreamHttpEndpointConfigurationArgs() {
        this.accessKey = Input.empty();
        this.name = Input.empty();
        this.url = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamHttpEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessKey;
        private @Nullable Input<String> name;
        private Input<String> url;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamHttpEndpointConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKey = defaults.accessKey;
    	      this.name = defaults.name;
    	      this.url = defaults.url;
        }

        public Builder setAccessKey(@Nullable Input<String> accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder setAccessKey(@Nullable String accessKey) {
            this.accessKey = Input.ofNullable(accessKey);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setUrl(Input<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Input.of(Objects.requireNonNull(url));
            return this;
        }
        public DeliveryStreamHttpEndpointConfigurationArgs build() {
            return new DeliveryStreamHttpEndpointConfigurationArgs(accessKey, name, url);
        }
    }
}
