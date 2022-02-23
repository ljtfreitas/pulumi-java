// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs;
import java.util.Objects;


public final class ServiceTemplateSpecContainerEnvValueFromGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTemplateSpecContainerEnvValueFromGetArgs Empty = new ServiceTemplateSpecContainerEnvValueFromGetArgs();

    /**
     * Selects a key (version) of a secret in Secret Manager.
     * Structure is documented below.
     * 
     */
    @InputImport(name="secretKeyRef", required=true)
        private final Input<ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs> secretKeyRef;

    public Input<ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs> getSecretKeyRef() {
        return this.secretKeyRef;
    }

    public ServiceTemplateSpecContainerEnvValueFromGetArgs(Input<ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs> secretKeyRef) {
        this.secretKeyRef = Objects.requireNonNull(secretKeyRef, "expected parameter 'secretKeyRef' to be non-null");
    }

    private ServiceTemplateSpecContainerEnvValueFromGetArgs() {
        this.secretKeyRef = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTemplateSpecContainerEnvValueFromGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs> secretKeyRef;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTemplateSpecContainerEnvValueFromGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.secretKeyRef = defaults.secretKeyRef;
        }

        public Builder setSecretKeyRef(Input<ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs> secretKeyRef) {
            this.secretKeyRef = Objects.requireNonNull(secretKeyRef);
            return this;
        }

        public Builder setSecretKeyRef(ServiceTemplateSpecContainerEnvValueFromSecretKeyRefGetArgs secretKeyRef) {
            this.secretKeyRef = Input.of(Objects.requireNonNull(secretKeyRef));
            return this;
        }
        public ServiceTemplateSpecContainerEnvValueFromGetArgs build() {
            return new ServiceTemplateSpecContainerEnvValueFromGetArgs(secretKeyRef);
        }
    }
}
