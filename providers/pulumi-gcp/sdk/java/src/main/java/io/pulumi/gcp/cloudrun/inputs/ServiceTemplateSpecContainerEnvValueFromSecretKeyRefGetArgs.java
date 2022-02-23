// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs Empty = new ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs();

    /**
     * The Cloud Secret Manager secret version.
     * Can be 'latest' for the latest value or an integer for a specific version.
     * 
     */
    @InputImport(name="key", required=true)
        private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    /**
     * Volume's name.
     * 
     */
    @InputImport(name="name", required=true)
        private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs(
        Input<String> key,
        Input<String> name) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs() {
        this.key = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.name = defaults.name;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
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
        public ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs build() {
            return new ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs(key, name);
        }
    }
}
